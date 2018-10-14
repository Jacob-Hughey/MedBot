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
    public int pid;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "location")
    public String location;

    @ColumnInfo(name = "DOB")
    public String dob;

    @ColumnInfo(name = "sex")
    public char sex;

    @ColumnInfo(name = "height")
    public double height;

    @ColumnInfo(name = "weight")
    public double weight;

    @ColumnInfo(name = "sexually_active")
    public boolean sexActive;

    @ColumnInfo(name = "has_chronic_conditions")
    public boolean chronConditions;

    @ColumnInfo(name = "urgent_status")
    public boolean urgentStatus;

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
    public Patient(int pID, String name, String location, String dob, char sex, double height, double weight,
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

    public String getDob() {
        return this.dob;
    }


    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public boolean getSexActive() {
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

    public void setSex(char sex) {
        this.sex = sex;
    }

    public static Patient getPatient(int pid) {
       return MainActivity.db.userDao().getPatient(pid);
    }

    public String getSexName() {
        switch (Character.toLowerCase(sex)) {
            case 'f': return "Female";
            case 'm': return "Male";
            default: return "Other";
        }
    }

    public int getYearsOld() {
        //Date bornDate = new Date(dob);
        //return new Date().getYear() - bornDate.getYear();
        return 0; //TODO: implement this
    }
}
