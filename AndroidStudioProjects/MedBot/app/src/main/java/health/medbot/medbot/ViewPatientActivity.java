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

        pid = getIntent().getIntExtra("pid", -1);
        System.out.println("pid=" + pid);
        Patient patient = Patient.getPatient(pid);
        loadPatientData(patient);
    }

    public void newVisit(View view) {
        //TOOD: open new visit activity
    }

    public void editPatient(View view) {
        Intent intent = new Intent(getBaseContext(), NewPatientActivity.class);
        intent.putExtra("pid", pid);
        startActivity(intent);
    }

    private void loadPatientData(Patient patient) {
        TextView name = findViewById(R.id.name);
        name.setText(patient.getName());

        TextView sexAndAge = findViewById(R.id.sexAndAge);
        sexAndAge.setText(patient.getSexName() + ", " + patient.getYearsOld());

        TextView location = findViewById(R.id.location);
        location.setText(patient.getLocation());

        TextView heightAndWeight = findViewById(R.id.heightAndWeight);
        heightAndWeight.setText(patient.getHeight() + " cm, " + patient.getWeight() + " kg");

        TextView isSexuallyActive = findViewById(R.id.sexuallyActive);
        isSexuallyActive.setText(patient.sexActive ? " IS Sexually Active" : "NOT Sexually Active");

        TextView notes = findViewById(R.id.notes);
        notes.setText(patient.getNotes());
    }
}
