package com.jailex.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button statusButton = findViewById(R.id.statusButton);
        final TextView statusLabel = findViewById(R.id.statusLabel);

        if (statusButton != null) {
            statusButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    statusLabel.setText("SYSTEM STATUS: CONNECTING...");
                    Toast.makeText(MainActivity.this, "JAILEX BOT INITIALIZED", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
