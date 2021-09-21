/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class Birds {

    private String name;
    private String nameLatin;
    private int observation;

    public Birds(String name, String nameLatin) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.observation = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getNameLatin() {
        return this.nameLatin;
    }
    public void increaseObservation(){
        this.observation ++;
    }
    @Override
    public String toString(){
        return this.name+"("+this.nameLatin+"): "+this.observation+" observations";
    }
}
