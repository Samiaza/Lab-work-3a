package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    final private Random random = new Random();
    private Toast toastVain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.textView).setOnClickListener(this);
        findViewById(R.id.buttonToReverser).setOnClickListener(this);
        findViewById(R.id.buttonToManualCounter).setOnClickListener(this);
        findViewById(R.id.buttonToAutoCounter).setOnClickListener(this);
        findViewById(R.id.buttonToConverter).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.textView:
                if (this.toastVain != null) this.toastVain.cancel();
                this.toastVain = Toast.makeText(getApplicationContext(), "you're trying in vain",
                        Toast.LENGTH_SHORT);
                this.toastVain.setGravity(Gravity.TOP, this.random.nextInt(20),
                        200 + this.random.nextInt(20));
                this.toastVain.show();
                break;
            case R.id.buttonToReverser:
                startActivity(new Intent(this, ReverserActivity.class));
                break;
            case R.id.buttonToManualCounter:
                startActivity(new Intent(this, CounterActivity.class));
                break;
            case R.id.buttonToAutoCounter:
                startActivity(new Intent(this, TimerActivity.class));
                break;
            case R.id.buttonToConverter:
                startActivity(new Intent(this, ConverterActivity.class));
                break;
            default:
                break;
        }
    }
}