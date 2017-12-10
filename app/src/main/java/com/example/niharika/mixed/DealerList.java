package com.example.niharika.mixed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;


// This class contains different dealers information
public class DealerList extends AppCompatActivity {
ListView listView;
    String[] val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_dealer_list);

        String[] values =  {
                "Dealers of Porshe",

                "Dealer1:",
                "Premier Porshe dealer",
                "2300 SKOKIE VALLEY RD, HIGHLAND PARK",

                "Dealer2:",
                "Loeber Motors",
                "7101 North Lincoln Avenue,Lincolnwood, IL 60712",

                "Dealer3:",
                "Bavarian Motors",
                "27 May St, Chicago, IL 60607"

        };
        String[] values1 =  {
                "Dealers of Mercedes Benz",

                "Dealer1:"
                ,"Mercedes Benz of Chicago",
                "949 NORTH ELSTON AVENUE, SUITE 2 CHICAGO, IL, 60642 ",

                "Dealer2:",
                 "Mercedes Benz of Hoffmann Estates",
                " 1000 West Golf Road • Hoffman Estates, IL 60169 ",

                "Dealer3:",
                "Greater Chicago Motors",
                "1850 N Elston Ave, Chicago, IL 60642"

        };
        String[] values2 = {
                "Dealers of Nissan ",

                "Dealer1:",
                "Berman Nissan of Chicago",
                " 3456 N Kedzie Ave, Chicago, IL 60618",

                "Dealer2:",
                "Western Avenue Nissan",
                "7410 S Western Ave, Chicago, IL 60636",

                "Dealer3:",
                "The Autobarn Nissan of Ecanston",
                "1012 Chicago Ave, IL 60202"
        };
        String[] values3 =  {
                "Dealers of Audi",

                "Dealer1:",
                "Fletcher Jones Audi",
                "1523 W North Ave, Chicago, IL 60642",

                "Dealer2:",
                "Greater Chicago Motors",
                "1850 N Elston Ave, Chicago, IL 60642",

                "Dealer3:",
                "High Quality Auto Sales",
                "4201 S Kedzie Ave, Chicago, Il 60632"
        };
        String[] values4 =  {
                "Dealers of Ford",

                "Dealer1:",
                "Fox Ford Lincoln",
                "2501 N Elston Ave, Chicago, IL 60647",

                "Dealer2:",
                "Metro Ford Sales and Service",
                "6455 S Western Ave, Chicago, IL 60636",

                "Dealer3:",
                "McCarthy Ford",
                "11400 S Pulaski Rd, Chicago, IL 60655"
        };
        String[] values5 = {
                "Dealers of Toyota",
                "Dealer1:",
                "Chicago Northside Toyota",
                " 5625 North Broadway, Chicago, IL 60660",

                "Dealer2:",
                "Midtown Toyota",
                "2700 N Cicero Ave, Chicago, IL 60639",

                "Dealer3:",
                "Oak Lawn Toyota",
                "4320 95th St, Oak Lawn, IL 60453"
        };
        String[] values6 = {
                "Dealers of KIA",
                "Dealer1:",
                "Evergreen Kia",
                "9205 S Western Ave, Chicago, IL 60643",

                "Dealer2:",
                "Grossinger Kia",
                "6750 Lincoln Ave, Lincolnwood, IL 60712",

                "Dealer3:",
                "Berwyn Kia",
                "7050 Ogden Ave, Berwyn, IL 60402"
        };
        String[] values7 =  {
                "Dealers of Jaguar",

                "Dealer1:",
                "Howard Orloff Jaguar",
                "1924 N Paulina St, Chicago, IL 60622",

                "Greater Chicago Motors",
                "1850 N Elston Ave, Chicago, IL 60642",

                "Dealer3:",
                "Howard Oroloff Jaguar",
                "1924 N Paulina St, Chicago, Il 60622"
        };
        String[] values8 =  {
                "Dealers of  BMW",

                "Dealer1:",
                "Perillo BMW",
                "1035 N Clark St, Chicago, IL 60610",

                "Dealer2:",
                "Elmhurst BMW",
                "466 W Lake St, Elmhurst, IL 60126",

                "Dealer3:",
                "West End Auto Inc",
                "148 N Cicero Ave"
        };
        String[] values9 =  {
                "Dealers of Dodge",

                "Dealer1:",
                "South Chicago Dodge Chrysler Jeep",
                "7340 S Western Ave, Chicago, IL 60636",

                "Dealer2:",
                "Napleton's Northwestern Chrysler Jeep Dodge Ram",
                "5950 N Western Ave, Chicago, IL 60659",

                "Dealer3:",
                "Midway Dodge",
                "4747 S pulaski Rd, Chicago, IL 60632"
        };
        String[] values10 = {
                "Dealers of Lamborghini",
                "Dealer1:",
                "Chicago Motor Cars",
                "27W110 North Ave, West Chicago, IL 60185",

                "Dealer2:",
                "Global Luxury Imports",
                "101 Tower Dr, Burr Ridge, IL 60527",

                "Dealer3:",
                "Perillo Downers Grove",
                "330 Odgen Ave, Downers Grove, Il 60515"
        };
        String[] values11 =  {
                "Dealers of Lexus",

                "Dealer1:",
                "McGrath Lexus of Chicago",
                "1250 W Division St, Chicago, IL 60642",

                "Dealer2:",
                "McGrath Lexus of Westmont",
                " 500 E Ogden Ave, Westmont, IL 60559",

                "Dealer3:",
                "Lexus of Orland",
                "8300 W 159 St, Orland Park, IL 60462"
        };
        String[] values12 = {
                "Dealers of Maserati",

                "Dealer1:",
                "MASERATI OF CHICAGO",
                " 834 N Rush St, Chicago, IL 60611",

                "Dealer2:",
                "Fields Maserati",
                "80 Green Bay Rd, Winnetka, IL 60093",

                "Dealer3:",
                "Zeigler Maserati",
                "210 W Gold Rd, Schuamburg, Il 60195"
        };
        String[] values13 =  {
                "Dealers of Infiniti",

                "Dealer1:",
                "Berman INFINITI Chicago",
                "640 N LaSalle Dr, Chicago, IL 60654",

                "Dealer2:",
                "INFINITI Of Clarendon Hills",
                " 415 E Ogden Ave, Clarendon Hills, IL 60514",

                "Dealer3:",
                "Fields INFINITI Glencoe",
                "2100 Frontage Rd, Glencoe, IL 60022"
        };
        String[] values14 =  {
                "Dealers of Honda",

                "Dealer1:",
                "Honda City Chicago",
                "4950 S Pulaski Rd, Chicago, IL 60632",

                "Dealer2:",
                "McGrath City Honda",
                " 6720 W Grand Ave, Chicago, IL 60707",

                "Dealer3:",
                "Continental Honda",
                "5901 S La Grange Road, Countryside, IL 60525"
        };

        // get intent
        Intent intent = getIntent();

        String carDealer=intent.getStringExtra("id1");

       // Bundle bd = getIntent().getExtras();

        // Store the image id in variable position
        String [] val= values;

       // Bundle bd= intent.getExtras();
        //final ListView listView = (ListView) findViewById(R.id.list);
       //if(bd.getString("id1") == null) {
          //  String carDealer = (String) bd.getString("id1");


            if (carDealer.equals("Porshe")) {
                val = values;

            }
            if (carDealer.equals("Mercedes")) {
                val = values1;

            }
            if (carDealer.equals("Nissan") ){
                val = values2;

            }
            if (carDealer.equals("Audi")) {
                val = values3;

            }
            if (carDealer.equals("Ford")) {
                val = values4;

            }
            if (carDealer.equals("Toyota")) {
                val = values5;

            }
            if (carDealer.equals("KIA") ){
                val = values6;

            }
            if (carDealer.equals("Jaguar")) {
                val = values7;

            }
            if (carDealer.equals("BMW")) {
                val = values8;

            }
            if (carDealer.equals("Dodge")) {
                val = values9;

            }
            if (carDealer.equals("Lamborghini")) {
                val = values10;

            }
            if (carDealer.equals("Lexus")) {
                val = values11;

            }
            if (carDealer.equals("Maserati")) {
                val = values12;

            }
            if (carDealer.equals("Infiniti")) {
                val = values13;

            }
            if (carDealer.equals("Honda")) {
                val = values14;
            }

        //setting up a list view and attaching it with an array adapter
          listView = (ListView) findViewById(R.id.list);
        //ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);
        //ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.dealer_text, R.id.label, values);
        //listView.setAdapter(adapter1);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.dealer_text, R.id.label, val);
        listView.setAdapter(arrayAdapter);
    }
}
