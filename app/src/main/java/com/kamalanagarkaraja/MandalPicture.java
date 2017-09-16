package com.kamalanagarkaraja;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MandalPicture extends AppCompatActivity {

    int[] image = { R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,
            R.drawable.img5 };
     ViewFlipper myViewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mandal_picture);

        myViewFlipper = (ViewFlipper)findViewById(R.id.viewFlipper);

        for (int i = 0; i < image.length; i++) {
            ImageView imageView = new ImageView(MandalPicture.this);
            imageView.setImageResource(image[i]);
            myViewFlipper.addView(imageView);
        }


    }


    @Override
    protected void onResume() {
        super.onResume();
        myViewFlipper.setAutoStart(true);
        myViewFlipper.setFlipInterval(2000);
    }
}

