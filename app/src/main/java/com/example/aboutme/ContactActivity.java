package com.example.aboutme;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        ImageView btnLinkedin = findViewById(R.id.btnLinkedin);
        ImageView btnWhatsapp = findViewById(R.id.btnWhatsapp);
        MaterialButton btnEmail = findViewById(R.id.btnEmail);

        btnLinkedin.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.linkedin.com/in/"));
            startActivity(intent);
        });

        btnWhatsapp.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://wa.me/56965083637"));
            startActivity(intent);
        });


        btnEmail.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:tucorreo@gmail.com"));
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto desde mi App");
            startActivity(intent);
        });

        MaterialButton btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(v -> {
            finish();
        });
    }
}