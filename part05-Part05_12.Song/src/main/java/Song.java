
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public boolean equals(Object compared) {
        //if the variables are located in the same position, they are equal
        if(this == compared){
            return true;
        }
        //if the compared object is not of a type Song, the objects are not equal
        if(!(compared instanceof Song)){
            return false;
        }
        //convert object into a Song object
        Song comparedSong = (Song) compared;
        //compare the values of the object variables are equal
        if(this.artist.equals(comparedSong.artist) &&
           this.name.equals(comparedSong.name) &&
           this.durationInSeconds == comparedSong.durationInSeconds){
           return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}
