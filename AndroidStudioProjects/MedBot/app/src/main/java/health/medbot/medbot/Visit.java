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
    public int pID;

    @ColumnInfo(name = "admin_id")
    public int adminID;

    @ColumnInfo(name = "visit_date")
    public String vDate;

    @ColumnInfo(name = "notes")
    public String notes;

    @ColumnInfo(name = "height")
    public double height;

    @ColumnInfo(name = "weight")
    public double weight;

    @ColumnInfo(name = "sexually_active")
    public boolean sexActive;

    @ColumnInfo(name = "patient_symptoms")
    public String symptoms;

    @ColumnInfo(name = "is_chronic")
    public boolean isChronic;

    @ColumnInfo(name = "urgent_status")
    public boolean urgentStat;

    //TODO: Add search functionality by name

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
                 boolean sxActv, String symp, boolean chron, boolean uSat) {
        this.pID = pID;
        this.adminID = adminID;
        this.vDate = d;
        this.notes = nts;
        this.height = height;
        this.weight = weight;
        this.sexActive = sxActv;
        this.symptoms = symp;
        this.isChronic = chron;
        this.urgentStat = uSat;
    }

    public Visit() {}

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

    public boolean getIsChronic() {
        return this.isChronic;
    }

    public boolean geturgentStatus() {
        return this.urgentStat;
    }

    public void updatePatient(Patient p) {
        p.setWeight(this.weight);
        p.setSexActive(this.sexActive);
        p.setChronConditions(this.isChronic);
        p.setUrgentStatus(this.urgentStat);
    }
}
