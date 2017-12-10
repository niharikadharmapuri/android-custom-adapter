package com.example.niharika.mixed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import static com.example.niharika.mixed.MainActivity.CarBrand;
import static com.example.niharika.mixed.MainActivity.CarId;

public class LongClickFullImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_long_click_full_image);


        // get intent
        Intent intent = getIntent();

        // Store the image id in variable position
        final int position = intent.getExtras().getInt("id");

        // attaching the adapter with the full image view of the car
        CustomGrid customAdapter = new CustomGrid(this, CarBrand, CarId);
        //finding the image view from the xml file
        ImageView imageView = (ImageView) findViewById(R.id.full_image_view1);
        //set the image view with the car picture
        imageView.setImageResource(customAdapter.CarId1[position]);


}

    }
