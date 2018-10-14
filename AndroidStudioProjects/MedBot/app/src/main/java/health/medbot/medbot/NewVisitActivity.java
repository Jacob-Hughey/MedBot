package health.medbot.medbot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class NewVisitActivity extends AppCompatActivity {

    private int pid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_visit);
    }

    @Override
    protected  void onResume() {
        super.onResume();
        pid = getIntent().getIntExtra("pid", 0);
    }

    public void saveVisit(View view) {
        EditText dateView = findViewById(R.id.date);
        EditText heightView = findViewById(R.id.height);
        EditText weightView = findViewById(R.id.weight);
        //TODO: get sexually active status
        EditText symptomsView = findViewById(R.id.symptoms);
        EditText notesView = findViewById(R.id.notes);
        CheckBox isUrgentView = findViewById(R.id.isUrgent);

        Visit visit = new Visit(pid, 0, dateView.getText().toString(), notesView.getText().toString(),
                Double.parseDouble(heightView.getText().toString()), Double.parseDouble(weightView.getText().toString()),
                false, symptomsView.getText().toString(), false, isUrgentView.isChecked());

        int visitId = (int) MainActivity.db.userDao().insertVisit(visit);

        //update patient profile with new stuff
        Patient patient = Patient.getPatient(pid);
        visit.updatePatient(patient);
        MainActivity.db.userDao().updatePatient(patient);

        Intent intent = new Intent(getBaseContext(), ViewVisitActivity.class);
        intent.putExtra("vid", visitId);
        startActivity(intent);
    }
}
