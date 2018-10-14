package health.medbot.medbot;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * For CRUD operations
 *
 * Created by brandon on 10/13/18.
 */

@Dao
public interface DaoAccess {

    @Insert
    public void insertPatient(Patient p);

    @Query("SELECT * FROM patient")
    LiveData<List<Patient>> getAll();

    @Query("SELECT pid FROM patient")
    public int getpID();

    @Query("SELECT * from patient where pid = :pid")
    public Patient getPatient(int pid);
}
