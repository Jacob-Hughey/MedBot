package health.medbot.medbot;
import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.Date;

/**
 * File: Patient.java
 *
 * Created by Brandon Adame Gachuz on 10/13/18.
 */

@Entity(tableName = "Patient")
public class Patient {

    @NonNull
    @PrimaryKey(autoGenerate = true)
    private int pid;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "location")
    private String location;

    @ColumnInfo(name = "DOB")
    private Date dob;

    @ColumnInfo(name = "sex")
    private char sex;

    @ColumnInfo(name = "height")
    private double height;

    @ColumnInfo(name = "weight")
    private double weight;

    @ColumnInfo(name = "sexualy_active")
    private boolean sexActive;

    @ColumnInfo(name = "has_chronic_conditions")
    private boolean chronConditions;

    @ColumnInfo(name = "urgent_status")
    private boolean urgentStatus;

    /**
     * Constructor to define a user
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
                 boolean sexActive, boolean chronConditions, boolean uStat) {
        this.pid = pID;
        this.name = name;
        this.location = location;
        this.dob = dob;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.sexActive = sexActive;
        this.chronConditions = chronConditions;
        this.urgentStatus = uStat;
    }

    /**
     * NULL constructor
     */
    public Patient() {}

    public int getpId() {
        return this.pid;
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

    public boolean getUrgentStatus() {
        return this.urgentStatus;
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

    public void setUrgentStatus(boolean stat) {
        this.urgentStatus = stat;
    }

    public static Patient getPatient(int patientId) {
        //TODO: return a real patient
        return new Patient(patientId, "fake name", "fake location", new Date(), 'o', 50.2, 55521, false, false, false);
    }
}
