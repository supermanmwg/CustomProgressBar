package com.customprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.customprogressbar.customviews.CustomProgressBar;

public class MainActivity extends AppCompatActivity {
    private CustomProgressBar mCustomProgressBar;
    private Button mControl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCustomProgressBar = (CustomProgressBar) findViewById(R.id.custom_progressBar);
        mControl = (Button) findViewById(R.id.control);
        mControl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mCustomProgressBar.getVisibility() == View.VISIBLE) {
                    mCustomProgressBar.setVisibility(View.GONE);
                } else {
                    mCustomProgressBar.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
