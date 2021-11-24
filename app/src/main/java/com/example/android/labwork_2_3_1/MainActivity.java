package com.example.android.labwork_2_3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radioGroup = findViewById(R.id.radioGroup1);
        ImageView imageView = findViewById(R.id.imageView);

        radioGroup.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radio1:
                        imageView.setImageResource(R.color.green);
                        break;

                    case R.id.radio2:
                        imageView.setImageResource(R.color.blue);
                        break;

                    case R.id.radio3:
                        imageView.setImageResource(R.mipmap.ic_launcher);
                        break;

                    default:
                        break;
                }
            }
        });
    }
}