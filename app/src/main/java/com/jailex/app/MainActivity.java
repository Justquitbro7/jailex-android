package com.jailex.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button statusButton = findViewById(R.id.statusButton);

        if (statusButton != null) {
            statusButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "Jailex Bot: All Systems Operational", Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}
