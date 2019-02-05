package com.android.androidjetpacktutorial;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.androidjetpacktutorial.ui.start.StartFragment;
import com.android.androidjetpacktutorial.ui.start.StartViewModel;

public class StartActivity extends AppCompatActivity {

    public StartViewModel mViewModel;
    public TextView appleNumber;
    public Button appleBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);
        mViewModel = ViewModelProviders.of(this).get(StartViewModel.class);
        appleNumber = findViewById(R.id.apple_number);

        appleBt = findViewById(R.id.bt_apple);
        appleBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseApple(v);
            }
        });
    }

    private void showApple() {
        int apple = mViewModel.getApple();
        String qtdApple = String.valueOf(apple);
        appleNumber.setText(qtdApple);
    }

    public void increaseApple(View v) {
        mViewModel.increaseAppleCounter();
        showApple();
    }

    protected void onResume() {
        super.onResume();
        showApple();
    }
}
