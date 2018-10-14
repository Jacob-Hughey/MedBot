package health.medbot.medbot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class NewPatientActivity extends AppCompatActivity {

    private int pid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_patient);

        int pid = getIntent().getIntExtra("pid", 0);
        this.pid = pid;

        if (pid != 0) {
            Patient patient = Patient.getPatient(pid);
            loadFromPatient(patient);
        }
    }

    private void loadFromPatient(Patient patient) {
        return;
        /*
        CheckBox isUrgentView = findViewById(R.id.isUrgent);
        EditText nameView = findViewById(R.id.name);
        EditText locationView = findViewById(R.id.location);
        EditText dobView = findViewById(R.id.dob);
        RadioGroup sexView = findViewById(R.id.sexRadio);
        RadioButton selectedSexView = findViewById(sexView.getCheckedRadioButtonId());
        EditText heightView = findViewById(R.id.height);
        EditText weightView = findViewById(R.id.weight);
        RadioGroup sexuallyActiveView = findViewById(R.id.sexuallyActive);
        RadioButton selectedSexuallyActiveView = findViewById(sexuallyActiveView.getCheckedRadioButtonId());
        EditText notes = findViewById(R.id.notes);
        */
        //isUrgentView.setChecked(patient.);
    }

    public void SaveRecord(View view) {
        CheckBox isUrgentView = findViewById(R.id.isUrgent);
        EditText nameView = findViewById(R.id.name);
        EditText locationView = findViewById(R.id.location);
        EditText dobView = findViewById(R.id.dob);
        RadioGroup sexView = findViewById(R.id.sexRadio);
        RadioButton selectedSexView = findViewById(sexView.getCheckedRadioButtonId());
        EditText heightView = findViewById(R.id.height);
        EditText weightView = findViewById(R.id.weight);
        RadioGroup sexuallyActiveView = findViewById(R.id.sexuallyActive);
        RadioButton selectedSexuallyActiveView = findViewById(sexuallyActiveView.getCheckedRadioButtonId());
        EditText notes = findViewById(R.id.notes);

        //char sexChar = Character.toLowerCase(selectedSexView.getText().charAt(0));
        //boolean sexuallyActive = Character.toLowerCase(selectedSexuallyActiveView.getText().charAt(0)) == 'y';
        char sexChar = 'o';
        boolean sexuallyActive = false;

        //make patient pojo
        Patient patient = new Patient(pid, nameView.getText().toString(), locationView.getText().toString(), dobView.getText().toString(),
                sexChar, Double.parseDouble(heightView.getText().toString()), Double.parseDouble(weightView.getText().toString()),
                sexuallyActive, false, isUrgentView.isChecked(), notes.getText().toString()
                );

        //put in db
        if (pid == 0) {
            pid = (int)MainActivity.db.userDao().insertPatient(patient);
            patient.pid = pid;
        }
        else {
            MainActivity.db.userDao().updatePatient(patient);
        }

        //load view of patient in new activity
        Intent intent = new Intent(getBaseContext(), ViewPatientActivity.class);
        intent.putExtra("pid", patient.getpId());
        startActivity(intent);
    }
}
