package health.medbot.medbot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

public class ViewVisitActivity extends AppCompatActivity {

    private int vid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_visit);
    }

    @Override
    protected void onResume() {
        super.onResume();
        vid = getIntent().getIntExtra("vid", -1);
        Visit visit = MainActivity.db.userDao().getVisit(vid);
        loadVisitData(visit);
    }

    private void loadVisitData(Visit visit) {
        EditText dateView = findViewById(R.id.date);
        EditText heightView = findViewById(R.id.height);
        EditText weightView = findViewById(R.id.weight);
        //TODO: get sexually active status
        EditText symptomsView = findViewById(R.id.symptoms);
        EditText notesView = findViewById(R.id.notes);
        CheckBox isUrgentView = findViewById(R.id.isUrgent);

        dateView.setText(visit.getvDate());
        heightView.setText(Double.toString(visit.getHeight()));
        weightView.setText(Double.toString(visit.getWeight()));
        symptomsView.setText(visit.getSymptoms());
        notesView.setText(visit.getNotes());
        isUrgentView.setChecked(visit.geturgentStatus());
    }
}
