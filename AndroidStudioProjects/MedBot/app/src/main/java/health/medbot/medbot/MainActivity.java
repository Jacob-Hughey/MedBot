package health.medbot.medbot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickSearch(View view) {
        Intent intent = new Intent(getBaseContext(), ViewPatientActivity.class);
        intent.putExtra("pid", 1);
        startActivity(intent);
    }

    public void clickNewPatient(View view) {

    }
}
