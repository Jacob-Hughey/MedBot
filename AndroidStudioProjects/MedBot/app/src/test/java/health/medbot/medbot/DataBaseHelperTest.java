package health.medbot.medbot;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.ArrayList;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class DataBaseHelperTest {

    private static Context c;

    public void onCreate () {
        DataBaseHelperTest.c = MedBot.getAppContext();
        DataBaseHelper dbh = new DataBaseHelper(c);
    }
;

    @Test
    public void query1_is_correct() {
        ArrayList<String> result = new ArrayList<String>();

    }
}