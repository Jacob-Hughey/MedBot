package health.medbot.medbot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewPatientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_patient);

        int pid = getIntent().getIntExtra("pid", -1);
        Patient patient = Patient.getPatient(pid);
        loadPatientData(patient);
    }

    private void loadPatientData(Patient patient) {
        TextView name = findViewById(R.id.name);
        name.setText(patient.getName());
    }
}
