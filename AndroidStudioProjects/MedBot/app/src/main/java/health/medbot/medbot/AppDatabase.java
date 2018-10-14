package health.medbot.medbot;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by brandon on 10/13/18.
 */

@Database(entities = {Patient.class, Visit.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DaoAccess userDao();
}
