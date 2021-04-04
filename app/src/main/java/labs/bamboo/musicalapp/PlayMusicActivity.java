package labs.bamboo.musicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayMusicActivity extends AppCompatActivity {

    private TextView musicNamePlay;
    private TextView musicAuthorPlay;
    private ImageView musicImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);
        setTitle(R.string.now_playing);
        initialize();
    }

    public void initialize(){
        Intent intent = getIntent();
        musicNamePlay = findViewById(R.id.musicNamePlay);
        musicNamePlay.setText(intent.getStringExtra("musicName"));

        musicAuthorPlay = findViewById(R.id.musicAuthorPlay);
        musicAuthorPlay.setText(intent.getStringExtra("musicAuthor"));

        musicImage = findViewById(R.id.musicImage);
        musicImage.setImageResource(R.drawable.jekyllrb);
    }
}