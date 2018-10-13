package health.medbot.medbot;
import java.util.Date;

/**
 * File: Patient.java
 *
 * Created by Brandon Adame Gachuz on 10/13/18.
 */

public class Patient {

    private int pId;
    private String name;
    private String location;
    private Date dob;
    private char sex;
    private double height;
    private double weight;
    private boolean sexActive;
    private boolean chronConditions;

    /**
     * Constructor to insert a user to the database.
     *
     * @param name String
     * @param location String
     * @param dob Date object
     * @param sex Char
     * @param height Double
     * @param weight Double
     * @param sexActive Boolean
     * @param chronConditions Boolean
     */
    public Patient(int pID, String name, String location, Date dob, char sex, double height, double weight,
                 boolean sexActive, boolean chronConditions) {
        this.pId = pID;
        this.name = name;
        this.location = location;
        this.dob = dob;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.sexActive = sexActive;
        this.chronConditions = chronConditions;
    }

    /**
     * NULL constructor
     */
    public Patient(){}

    public int getpId() {
        return this.pId;
    }

    public String getName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }

    public Date getDob() {
        return this.dob;
    }

    public char getSex() {
        return this.sex;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public boolean getsexActive() {
        return this.sexActive;
    }

    public boolean getchronConditions() {
        return this.chronConditions;
    }

    public void setName(String nName) {
        this.name = nName;
    }

    public void setLocation(String nLocation) {
        this.location = nLocation;
    }

    public void setHeight(double nHeight) {
        this.height = nHeight;
    }

    public void setWeight(double nWeight) {
        this.weight = nWeight;
    }

    public void setSexActive(boolean nCondition) {
        this.sexActive = nCondition;
    }

    public void setChronConditions(boolean nChron) {
        this.chronConditions = nChron;
    }
}
