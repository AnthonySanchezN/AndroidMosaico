package com.example.mosaico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageButton foto1, foto2, foto3, foto4, foto5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foto1 = (ImageButton) findViewById(R.id.img1);
        foto2 = (ImageButton) findViewById(R.id.img2);
        foto3 = (ImageButton) findViewById(R.id.img3);
        foto4 = (ImageButton) findViewById(R.id.img4);
        foto5 = (ImageButton) findViewById(R.id.img5);

        foto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 0);
            }
        });

        foto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent((MediaStore.ACTION_IMAGE_CAPTURE));
                startActivityForResult(intent2, 1);
            }
        });

        foto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent((MediaStore.ACTION_IMAGE_CAPTURE));
                startActivityForResult(intent2, 2);
            }
        });

        foto4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent((MediaStore.ACTION_IMAGE_CAPTURE));
                startActivityForResult(intent2, 3);
            }
        });

        foto5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent((MediaStore.ACTION_IMAGE_CAPTURE));
                startActivityForResult(intent2, 4);
            }
        });
    }


    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode){
            case 0:
                Bitmap bp = (Bitmap) data.getExtras().get("data");
                foto1.setImageBitmap(bp);
                break;

            case 1:
                Bitmap bp2 = (Bitmap) data.getExtras().get("data");
                foto2.setImageBitmap(bp2);
                break;

            case 2:
                Bitmap bp3 = (Bitmap) data.getExtras().get("data");
                foto3.setImageBitmap(bp3);
                break;

            case 3:
                Bitmap bp4 = (Bitmap) data.getExtras().get("data");
                foto4.setImageBitmap(bp4);
                break;

            case 4:
                Bitmap bp5 = (Bitmap) data.getExtras().get("data");
                foto5.setImageBitmap(bp5);
                break;
        }
    }


}