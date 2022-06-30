package com.example.a651j;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button start = findViewById(R.id.start);
        TextView tv_service = findViewById(R.id.tv_service);
        Button stop = findViewById(R.id.stop);

        start.setOnClickListener(view -> {
            Intent intent = new Intent(this, MyIntentService.class);
            startService(intent);
            tv_service.setText("Running");

        });
        stop.setOnClickListener(view -> {
            MyIntentService.stopService();
            tv_service.setText("Stop");
        });
    }
}