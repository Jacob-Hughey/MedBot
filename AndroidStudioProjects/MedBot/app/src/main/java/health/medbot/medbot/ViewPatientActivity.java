package health.medbot.medbot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ViewPatientActivity extends AppCompatActivity {

    private int pid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_patient);
    }

    @Override
    protected void onResume() {
        super.onResume();

        pid = getIntent().getIntExtra("pid", -1);
        Patient patient = Patient.getPatient(pid);
        loadPatientData(patient);
    }

    public void newVisit(View view) {
        Intent intent = new Intent(getBaseContext(), NewVisitActivity.class);
        intent.putExtra("pid", pid);
        startActivity(intent);
    }

    public void editPatient(View view) {
        Intent intent = new Intent(getBaseContext(), NewPatientActivity.class);
        intent.putExtra("pid", pid);
        startActivity(intent);
    }

    private void loadPatientData(Patient patient) {
        TextView name = findViewById(R.id.name);
        TextView sexAndAge = findViewById(R.id.sexAndAge);
        TextView location = findViewById(R.id.location);
        TextView heightAndWeight = findViewById(R.id.heightAndWeight);
        TextView isSexuallyActive = findViewById(R.id.sexuallyActive);
        TextView notes = findViewById(R.id.notes);

        name.setText(patient.getName());
        sexAndAge.setText(patient.getSexName() + ", " + patient.getDob());
        location.setText(patient.getLocation());
        heightAndWeight.setText(patient.getHeight() + " cm, " + patient.getWeight() + " kg");
        isSexuallyActive.setText(patient.sexActive ? " IS Sexually Active" : "NOT Sexually Active");
        notes.setText(patient.getNotes());
    }
}
