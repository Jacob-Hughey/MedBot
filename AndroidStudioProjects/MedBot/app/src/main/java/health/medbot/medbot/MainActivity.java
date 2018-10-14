package health.medbot.medbot;

import android.content.Intent;
import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    public static AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "cheezits").allowMainThreadQueries().build();

    }

    public void clickSearch(View view) {
        Intent intent = new Intent(getBaseContext(), ViewPatientActivity.class);
        intent.putExtra("pid", 1);
        startActivity(intent);
    }

    public void clickNewPatient(View view) {
        db.userDao().insertPatient(new Patient(0, "bluezah", "test", "other", 'a', 25, 521, false, false ,false));
    }
}
