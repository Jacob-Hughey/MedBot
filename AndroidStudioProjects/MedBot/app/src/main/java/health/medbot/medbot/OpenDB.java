package health.medbot.medbot;


import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/**
 *
 * Created by brandon on 10/14/18.
 */

public class OpenDB {

    public OpenDB() {}

    private static String DB_PATH =
            "/data/data/medbot/src/main/assets/please_dont_delete_this_data";

    public SQLiteDatabase openDB() throws SQLiteException {
        SQLiteDatabase db = SQLiteDatabase.openDatabase(DB_PATH, null, SQLiteDatabase.OPEN_READWRITE);
        return db;
    }

    public static void main(String[] args) {

//        OpenDB db = new OpenDB();

        System.out.println("DB is open: ");
    }

}
