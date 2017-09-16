package com.kamalanagarkaraja;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.os.Handler;

import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bubbleSoft();

    }


    public void bubbleSoft(){

        int arr[] ={3,60,35,2,45,320,5};

        int temp = 0;
        for( int i =0; i<arr.length-1;i++){
            for( int j=0; j<arr.length-1-i;j++){

                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j] = arr[j+1];
                    arr[j] = temp;


                }
            }
        }


        System.out.println("Array After Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }


    public void insetContact(){

        ActivityCompat.shouldShowRequestPermissionRationale(null,null);
    }


    @Override
    protected void onResume() {
        super.onResume();

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do something after 100ms

                Intent intent = new Intent(MainActivity.this, EventList.class);
                startActivity(intent);

            }
        }, 3000);

    }


}
