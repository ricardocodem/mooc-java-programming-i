
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String name = scan.nextLine();

        ArrayList<Team> records = readRecordsFromFile(file);
        if (!ifTeamExist(name, records)) {
            System.out.println("Games: 0");
            System.out.println("Wins: 0");
            System.out.println("Losses: 0");
        } else {
            for (Team each : records) {
                if (each.getName().equals(name)) {
                    System.out.println("Games: " + each.getGames());
                    System.out.println("Wins: " + each.getWins());
                    System.out.println("Losses: " + each.getLosses());
                    break;
                }
            }
        }
    }

    public static ArrayList<Team> readRecordsFromFile(String file) {
        ArrayList<Team> teams = new ArrayList<>();

        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                String[] parts = line.split(",");

                String teamOneName = parts[0];
                String teamTwoName = parts[1];
                int teamOneScore = Integer.valueOf(parts[2]);
                int teamTwoScore = Integer.valueOf(parts[3]);

                if (!ifTeamExist(teamOneName, teams)) {
                    teams.add(new Team(teamOneName));
                }
                if (!ifTeamExist(teamTwoName, teams)) {
                    teams.add(new Team(teamTwoName));
                }
                if (teamOneScore > teamTwoScore) {
                    results(teamOneName, teamTwoName, teams);
                } else {
                    results(teamTwoName, teamOneName, teams);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return teams;
    }

    public static boolean ifTeamExist(String newTeam, ArrayList<Team> teams) {
        for (Team each : teams) {
            if (each.getName().equals(newTeam)) {
                return true;
            }
        }
        return false;
    }

    public static void results(String winningTeam, String losingTeam, ArrayList<Team> teams) {
        for (Team each : teams) {
            if (each.getName().equals(winningTeam)) {
                each.addWins();
            }

            if (each.getName().equals(losingTeam)) {
                each.addLoss();
            }

        }
    }
}
