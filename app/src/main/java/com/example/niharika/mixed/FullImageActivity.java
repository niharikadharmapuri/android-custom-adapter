package com.example.niharika.mixed;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import static com.example.niharika.mixed.MainActivity.CarBrand;
import static com.example.niharika.mixed.MainActivity.CarId;


// This Activity is related to the expanded Image of the car

public class FullImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);

        // get intent
        Intent intent = getIntent();

        // Store the image id in variable position
        final int position = intent.getExtras().getInt("id");

        // attaching the adapter with the full image view of the car
        CustomGrid customAdapter = new CustomGrid(this, CarBrand, CarId);

        ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
        imageView.setImageResource(customAdapter.CarId1[position]);



        //when clicked on the expanded car image, you should be taken to respective website
        ImageView img= (ImageView) findViewById(R.id.full_image_view);
        img.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);


                if(CarBrand[position]=="Porshe"){
                    intent.setData(Uri.parse("https://www.porsche.com/"));
                }
                if(CarBrand[position]=="Mercedes"){
                    intent.setData(Uri.parse("https://www.mercedes-benz.com/en/"));
                }
                if(CarBrand[position]=="Nissan"){
                    intent.setData(Uri.parse("https://www.nissanusa.com/"));
                }
                if(CarBrand[position]=="Audi"){
                    intent.setData(Uri.parse("https://www.audi.com/en.html"));
                }
                if(CarBrand[position]=="Ford"){
                    intent.setData(Uri.parse("https://www.ford.com/"));
                }
                if(CarBrand[position]=="Toyota"){
                    intent.setData(Uri.parse("https://www.toyota.com/"));
                }
                if(CarBrand[position]=="KIA"){
                    intent.setData(Uri.parse("https://www.kia.com/us/en/home"));
                }
                if(CarBrand[position]=="Jaguar"){
                    intent.setData(Uri.parse("https://www.jaguarusa.com/index.html"));
                }
                if(CarBrand[position]=="BMW"){
                    intent.setData(Uri.parse("https://www.bmwusa.com/"));
                }
                if(CarBrand[position]=="Dodge"){
                    intent.setData(Uri.parse("https://www.dodge.com/"));
                }
                if(CarBrand[position]=="Lamborghini"){
                    intent.setData(Uri.parse("https://www.lamborghini.com/en-en/"));
                }
                if(CarBrand[position]=="Lexus"){
                    intent.setData(Uri.parse("http://www.lexus.com/"));
                }
                if(CarBrand[position]=="Maserati"){
                    intent.setData(Uri.parse("https://www.maserati.com/maserati/international/en"));
                }
                if(CarBrand[position]=="Infiniti"){
                    intent.setData(Uri.parse("https://www.infinitiusa.com/"));
                }
                if(CarBrand[position]=="Honda"){
                    intent.setData(Uri.parse("http://www.honda.com/"));
                }


                startActivity(intent);
            }
        });




    }
}
