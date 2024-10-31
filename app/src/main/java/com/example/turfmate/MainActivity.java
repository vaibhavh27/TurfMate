package com.example.turfmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void opencardview1(View view) {
        startActivity(new Intent(this,cardview1.class));
    }

    public void opencardview_2(View view) {
        startActivity(new Intent(this,cardview_2.class));
    }

    public void opencardview3(View view) {
        startActivity(new Intent(this,cardview3.class));
    }

    public void opencardview4(View view) {
        startActivity(new Intent(this,cardview4.class));

    }



}