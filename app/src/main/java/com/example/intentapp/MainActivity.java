package com.example.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void intentFunction(View v) {

        switch (v.getId()) {
            case R.id.calendar:
                Intent intent = new Intent(Intent.ACTION_EDIT);
                intent.setType("vnd.android.cursor.item/event");
                intent.putExtra("title", "Some title");
                intent.putExtra("description", "Some description");
                startActivity(intent);

                break;

            case R.id.camera:

                Intent camera_intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(camera_intent);

                break;

            case R.id.maps:
                Uri gmmIntentUri = Uri.parse("google.streetview:cbll=46.414382,10.013988");
                Intent maps_intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                maps_intent.setPackage("com.google.android.apps.maps");
                startActivity(maps_intent);


                break;

            case R.id.text:
                Intent text_intent = new Intent(Intent.ACTION_MAIN);
                text_intent.addCategory(Intent.CATEGORY_APP_MESSAGING);
                startActivity(text_intent);

                break;
        }

    }
}
