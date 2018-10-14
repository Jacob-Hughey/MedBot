package health.medbot.medbot;

import android.content.Context;
import android.database.Cursor;
import android.support.test.InstrumentationRegistry;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * Created by brandon on 10/14/18.
 */

public class DataBaseTester {

    private Context context;

    @Before
    public void setUp() {
        context = InstrumentationRegistry.getContext();
    }
    @Test
            public void testData() {
        TestAdapter mDbHelper = new TestAdapter(context);
        try {
            mDbHelper.createDatabase();
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        try {
            mDbHelper.open();
        } catch(Exception e) {
            e.printStackTrace();
            fail();
        }

        Cursor testdata = mDbHelper.getTestData();

        mDbHelper.close();
    }
}
