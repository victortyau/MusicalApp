package labs.bamboo.musicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView musicList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    public void initialize(){
        musicList = findViewById(R.id.music_list);

        fillOutListView();
    }

    public void fillOutListView(){
        ArrayList<String> playlist = new ArrayList<String>();

        playlist = getMusicList();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, playlist);

        musicList.setAdapter(arrayAdapter);

        ArrayList<String> finalPlaylist = playlist;
        musicList.setOnItemClickListener((AdapterView.OnItemClickListener) (parent, view, position, id) -> {
            String selectedMusic = finalPlaylist.get(position);
            Intent playMusic = new Intent(getApplicationContext(), PlayMusicActivity.class);
            playMusic.putExtra("musicName", selectedMusic);
            startActivity(playMusic);
        });
    }

    public ArrayList<String> getMusicList(){

        ArrayList musicList = new ArrayList<String>();

        String[] music = new String[]{ "Warm Mellow Jazz",
                "Yesterday Subtlety",
                "Crazy Of My Labels","Legendary Shadows","Crazy Of My Moves","Summer Jazz Story",
                "Cold Coffee","Jazz For Romance","Welcome Way","Unexpected Midnight",
                "Summer Of Mix","Time Of Stories","Love Moments","Muted Voice",
                "Strength Of Sounds","A Crowded Joys","Streets Of Jazz Club",
                "Music Of Past","Smooth Smoke","Daily Inner Fire"};

        for(int i = 0; i < music.length; i++){
            musicList.add(music[i]);
        }

        return musicList;
    }
}