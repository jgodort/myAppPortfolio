package com.software.jgodort.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonSpotifyApp = (Button) findViewById(R.id.btn_spotify_launch);
        buttonSpotifyApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),
                        "This button will launch my Spotify Streamer App!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        final Button buttonScoresApp = (Button) findViewById(R.id.btn_scores_lauch);
        buttonScoresApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),
                        "This button will launch my Scores App!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        final Button buttonLibraryApp = (Button) findViewById(R.id.btn_library_Lauch);
        buttonLibraryApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),
                        "This button will launch my Library App!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        final Button buttonBuiltApp = (Button) findViewById(R.id.btn_builtitBiggger_launch);
        buttonBuiltApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),
                        "This button will launch my Built It Bigger App!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        final Button buttonXYZApp = (Button) findViewById(R.id.btn_xyz_Reader);
        buttonXYZApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),
                        "This button will launch my XYZ Reader App!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        final Button buttonCapstoneApp = (Button) findViewById(R.id.btn_capstone_launch);
        buttonCapstoneApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),
                        "This button will launch my Capstone App!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }


}
