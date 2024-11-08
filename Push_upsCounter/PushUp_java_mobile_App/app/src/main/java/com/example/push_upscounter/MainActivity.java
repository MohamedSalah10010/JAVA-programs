package com.example.push_upscounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    private TextView textView;
    private Sensor proximitySensor;
    private SensorManager sensorManager;
    private Boolean isProximitySensorAvailable;
    private ImageView image_up;
    private ImageView image_down;
    private int counter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView= findViewById(R.id.textView);
        image_down= findViewById(R.id.image_down);
        image_up=findViewById(R.id.image_up);
        sensorManager= (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        if (sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY) != null)
        {
            proximitySensor= sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
            isProximitySensorAvailable=true;
        }
        else {
            textView.setText("Light isn't found");
            isProximitySensorAvailable=false;
        }
        textView.setText(counter +" push-ups");

        image_up.setVisibility(View.VISIBLE);
        image_down.setVisibility(View.INVISIBLE);

    }



    @Override
    public void onSensorChanged(SensorEvent event) {
        textView.setText(counter +" push-ups");

        if (event.values[0] == 0 ) {
            image_up.setVisibility(View.INVISIBLE);
            image_down.setVisibility(View.VISIBLE);
            textView.setText(++counter + " Push Ups");

        }else
        {
            image_up.setVisibility(View.VISIBLE);
            image_down.setVisibility(View.INVISIBLE);
            textView.setText(counter + " Push Ups");
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (isProximitySensorAvailable)
            sensorManager.registerListener(this, proximitySensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (isProximitySensorAvailable)
            sensorManager.unregisterListener(this);
    }

}