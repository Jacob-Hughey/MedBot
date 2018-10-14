package health.medbot.medbot;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * File: Visit.java
 *
 * This file pertains to when a volunteer visits a patient for a basic medical check-up.
 *
 * The volunteer will be able update the following:
 *  - Height
 *  - Weight
 *  - Any chronic conditions
 *  - Patient location
 *
 * Created by Brandon Adame Gachuz on 10/13/18.
 */

@Entity(tableName = "visit")
public class Visit {

    @PrimaryKey(autoGenerate = true)
    public int visitID;

    @ColumnInfo(name = "pid")
    private int pID;

    @ColumnInfo(name = "admin_id")
    private int adminID;

    @ColumnInfo(name = "visit_date")
    private String vDate;

    @ColumnInfo(name = "notes")
    private String notes;

    @ColumnInfo(name = "height")
    private double height;

    @ColumnInfo(name = "weight")
    private double weight;

    @ColumnInfo(name = "sexually_active")
    private boolean sexActive;

    @ColumnInfo(name = "patient_symptoms")
    private String symptoms;

    //TODO: Add search functionality by name, save visit to database

    /**
     *
     * @param pID
     * @param adminID
     * @param d
     * @param nts
     * @param height
     * @param weight
     * @param sxActv
     */
    public Visit(int pID, int adminID, String d, String nts, double height, double weight,
                 boolean sxActv, String symp) {
        this.pID = pID;
        this.adminID = adminID;
        this.vDate = d;
        this.notes = nts;
        this.height = height;
        this.weight = weight;
        this.sexActive = sxActv;
        this.symptoms = symp;
    }

    public Visit(Patient p) {

    }

    public String getNotes() {
        return this.notes;
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

    public int getAdminID() {
        return this.adminID;
    }

    public String getvDate() {
        return this.vDate;
    }

    public String getSymptoms() {
        return this.symptoms;
    }

    public void updatePatient() {

    }
}
