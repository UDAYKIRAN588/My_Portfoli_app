package com.fill_tummy.uday.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void popularMovies(View view) {
        Toast.makeText(this, "opens Popular Movie App", Toast.LENGTH_LONG).show();

    }

    public void stockHawk(View view) {
        Toast.makeText(this, "opens stockHawk App", Toast.LENGTH_LONG).show();

    }

    public void buildItBigger(View view) {
        Toast.makeText(this, "opens buildItBigger App", Toast.LENGTH_LONG).show();

    }

    public void makeYourAppMaterial(View view) {
        Toast.makeText(this, "opens makeYourAppMaterial App", Toast.LENGTH_LONG).show();

    }

    public void goUbiquitos(View view) {
        Toast.makeText(this, "opens goUbiquitos App", Toast.LENGTH_LONG).show();

    }

    public void capston(View view) {
        Toast.makeText(this, "opens capston App", Toast.LENGTH_LONG).show();

    }
}
