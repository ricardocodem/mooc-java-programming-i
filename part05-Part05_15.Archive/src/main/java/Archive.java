/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class Archive {

    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }

    @Override
    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Archive, the objects are not equal
        if (!(compared instanceof Archive)) {
            return false;
        }

        // convert the object to a Archive object
        Archive comparedArchive = (Archive) compared;

        // if the values of the object variables are equal, the objects are, too
        return this.identifier.equals(comparedArchive.identifier);
    }
}
