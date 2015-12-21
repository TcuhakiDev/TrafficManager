package com.uihoss.vichais.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //Main Class

    //Explicit variable
    private ListView trafficListView;

    private Button aboutMeButton;

    //ctrl + space = Auto
    //ctrl + shift + enter = auto end
    //Alt + enter  = fill semi colon


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindwidget();




    }//Main Method

    private void bindwidget() {
        //binding

        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);
        //Do more

    }


}//Main Class
