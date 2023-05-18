package sg.edu.rp.c346.id20033909.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button m1;
    Button m2;
    Button m3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m1 = findViewById(R.id.module1);
        m2 = findViewById(R.id.module2);
        m3 = findViewById(R.id.module3);

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, moduleDisplay.class);
                intent.putExtra("moduleCode", "C346");
                intent.putExtra("moduleName", "Android Programming");
                intent.putExtra("academicYear", "2020");
                intent.putExtra("semester", "1");
                intent.putExtra("moduleCredit", "4");
                intent.putExtra("venue", "W66M");
                startActivity(intent);
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, moduleDisplay.class);
                intent.putExtra("moduleCode", "C349");
                intent.putExtra("moduleName", "iPad Programming");
                intent.putExtra("academicYear", "2020");
                intent.putExtra("semester", "1");
                intent.putExtra("moduleCredit", "4");
                intent.putExtra("venue", "E63A");
                startActivity(intent);

            }
        });

        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, moduleDisplay.class);
                intent.putExtra("moduleCode", "C206");
                intent.putExtra("moduleName", "Software Development Process");
                intent.putExtra("academicYear", "2020");
                intent.putExtra("semester", "1");
                intent.putExtra("moduleCredit", "4");
                intent.putExtra("venue", "W65D");
                startActivity(intent);

            }
        });

    }
}