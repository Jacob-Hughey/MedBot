package health.medbot.medbot;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * For CRUD operations
 *
 * Created by brandon on 10/13/18.
 */

@Dao
public interface DaoAccess {

    @Insert
    long insertPatient(Patient p);

    @Update
    void updatePatient(Patient p);

    @Query("SELECT * FROM patient")
    List<Patient> getAll();

    @Query("SELECT * from patient where pid = :pid")
    Patient getPatient(int pid);

    @Query("select weight from patient where pid = :pid")
    double getWeight(int pid);

    @Query("select height from patient where pid = :pid")
    double getHeight(int pid);

    @Query("select name from patient where pid = :pid")
    String getName(int pid);

    @Query("select urgent_status from patient where pid = :pid")
    boolean geturgentStatus(int pid);

    @Query("select notes from visit where pid = :pid")
    String getNotes(int pid);

    @Query("select patient_symptoms from visit where pid = :pid")
    String getSymptoms(int pid);
}
