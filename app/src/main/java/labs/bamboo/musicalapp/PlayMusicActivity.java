package labs.bamboo.musicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PlayMusicActivity extends AppCompatActivity {

    private TextView musicName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);
        initialize();
    }

    public void initialize(){
        Intent intent = getIntent();
        musicName = findViewById(R.id.musicTitle);
        musicName.setText(intent.getStringExtra("musicName"));
    }
}