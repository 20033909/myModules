package sg.edu.rp.c346.id20033909.mymodules;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class moduleDisplay extends AppCompatActivity {
    TextView displayTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_display);

        displayTv = findViewById(R.id.display);

        Intent intentReceived = getIntent();
        String moduleCode = intentReceived.getStringExtra("moduleCode");
        String moduleName = intentReceived.getStringExtra("moduleName");
        String academicYear = intentReceived.getStringExtra("academicYear");
        String semester = intentReceived.getStringExtra("semester");
        String moduleCredit = intentReceived.getStringExtra("moduleCredit");
        String venue = intentReceived.getStringExtra("venue");

        displayTv.setText("Module Code: "+moduleCode+"\nModule Name: "+moduleName+"\nAcademic Year"
        +academicYear+"\nSemester: "+semester+"\nModule Credit: "+moduleCredit+"\nvenue: "+venue);


    }
}