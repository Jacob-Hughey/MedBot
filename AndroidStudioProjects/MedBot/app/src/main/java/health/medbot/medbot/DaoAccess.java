package health.medbot.medbot;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * For CRUD operations
 *
 * Created by brandon on 10/13/18.
 */

@Dao
public interface DaoAccess {

    @Query("SELECT * FROM patient")
    List<Patient> getAll();

    @Query("SELECT pid FROM patient")
    int getpID();


}
