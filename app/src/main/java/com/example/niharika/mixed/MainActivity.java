package com.example.niharika.mixed;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int pos;//global variable to store CarIds
    String str;

   //Array storing Car brands
   public static String [] CarBrand={
           "Porshe", "Mercedes", "Nissan", "Audi", "Ford",
           "Toyota", "KIA", "Jaguar", "BMW", "Dodge",
           "Lamborghini", "Lexus", "Maserati", "Infiniti", "Honda"
   };

   //Array storing CarIds
    public  static int [] CarId={
            R.drawable.car1, R.drawable.car2, R.drawable.car3, R.drawable.car4, R.drawable.car5,
            R.drawable.car6, R.drawable.car7, R.drawable.car8, R.drawable.car9, R.drawable.car10,
            R.drawable.car11, R.drawable.car12, R.drawable.car13, R.drawable.car14, R.drawable.car15
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //registering for Context Menu
        AdapterView gv = (AdapterView) findViewById(R.id.grid);
        registerForContextMenu(gv);


        //setting the adapter and passing it the GridView
        CustomGrid adapter = new CustomGrid(MainActivity.this, CarBrand, CarId);
        GridView grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);

        // Short click on the car should take us to the expanded image
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int i, long id) {

                // Intent to open FullImageActivity
                Intent intent = new Intent(getApplicationContext(), FullImageActivity.class);
                // passing CarId index as an extra
                intent.putExtra("id", i);
                startActivity(intent);
            }
        });


        grid.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
             pos=i;// storing position "i" in variable pos
                return false;
            }
        });

    }


    // Create Context Menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }

    // Process clicks on Context Menu Items
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        // //setting the adapter and passing it the GridView
        CustomGrid adapter = new CustomGrid(MainActivity.this, CarBrand, CarId);
        GridView grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);

        switch (item.getItemId()) {

            //when the user clicks on item CarPicture
            case R.id.picture_guide:

                Intent intent = new Intent(getApplicationContext(), LongClickFullImage.class);
                // passing array index
                intent.putExtra("id", pos);
                startActivity(intent);
                return true;
            //when the user clicks on item Website
            case R.id.web_guide:
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                // passing array index
                //intent.putExtra("id", pos);
                if(CarBrand[pos]=="Porshe"){
                    intent1.setData(Uri.parse("https://www.porsche.com/"));
                }

                if(CarBrand[pos]=="Mercedes"){
                    intent1.setData(Uri.parse("https://www.mercedes-benz.com/en/"));
                }

                if(CarBrand[pos]=="Nissan"){
                    intent1.setData(Uri.parse("https://www.nissanusa.com/"));
                }
                if(CarBrand[pos]=="Audi"){
                    intent1.setData(Uri.parse("https://www.audi.com/en.html"));
                }
                if(CarBrand[pos]=="Ford"){
                    intent1.setData(Uri.parse("https://www.ford.com/"));
                }
                if(CarBrand[pos]=="Toyota"){
                intent1.setData(Uri.parse("https://www.toyota.com/"));
                }
                if(CarBrand[pos]=="KIA"){
                    intent1.setData(Uri.parse("https://www.kia.com/us/en/home"));
                }
                if(CarBrand[pos]=="Jaguar"){
                intent1.setData(Uri.parse("https://www.jaguarusa.com/index.html"));
                }
                if(CarBrand[pos]=="BMW"){
                intent1.setData(Uri.parse("https://www.bmwusa.com/"));
                 }
                if(CarBrand[pos]=="Dodge"){
                intent1.setData(Uri.parse("https://www.dodge.com/"));
                 }
                if(CarBrand[pos]=="Lamborghini"){
                intent1.setData(Uri.parse("https://www.lamborghini.com/en-en/"));
                }
                if(CarBrand[pos]=="Lexus"){
                intent1.setData(Uri.parse("http://www.lexus.com/"));
                }

                if(CarBrand[pos]=="Maserati"){
                    intent1.setData(Uri.parse("https://www.maserati.com/maserati/international/en"));
                }
                if(CarBrand[pos]=="Infiniti"){
                    intent1.setData(Uri.parse("https://www.infinitiusa.com/"));
                }
                if(CarBrand[pos]=="Honda"){
                    intent1.setData(Uri.parse("http://www.honda.com/"));
                }
                startActivity(intent1);
                return true;


                //when the user clicks on item  DealersInfo
            case R.id.dealer_guide:
                Intent intent3 = new Intent(getApplicationContext(), DealerList.class);
                //Based on the car brand, you are given list of that specific brand dealer list
                intent3.putExtra("id1",CarBrand[pos]);
                startActivity(intent3);
                return true;

            default:
                return false;
        }
    }

}
