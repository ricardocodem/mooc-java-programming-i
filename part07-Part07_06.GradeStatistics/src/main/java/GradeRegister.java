
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ricardo
 */
public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();

    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public double averageOfPoints() {
        if (this.points.isEmpty()) {
            return -1;
        }
        int sum = 0;
        for (int grade : this.points) {
            sum += grade;
        }
        return 1.0 * sum / this.points.size();
    }

    public double passingPointAverage() {
        int index = 0;
        int sum = 0;
        int count = 0;
        while (index < this.points.size()) {
            if (this.points.get(index) >= 50) {
                sum += this.points.get(index);
                count++;
            }
            index++;
        }
        return 1.0 * sum / count;
    }

    public double passPercentage() {
        int index = 0;
        int sum = 0;
        int count = 0;
        while (index < this.points.size()) {
            if (this.points.get(index) >= 50) {
                sum += this.points.get(index);
                count++;
            }
            index++;
        }
        return 100.0 * count / this.points.size();
    }

    public static int pointsToGrade(int points) {
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else if (points >= 90) {
            grade = 5;
        }
        return grade;
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
    }

}
