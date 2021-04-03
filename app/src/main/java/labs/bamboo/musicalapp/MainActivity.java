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
        ArrayList<MusicView> playlist = new ArrayList<MusicView>();

        playlist = getMusicList();

        MusicViewAdapter musicViewAdapter = new MusicViewAdapter(this, playlist);

        musicList.setAdapter(musicViewAdapter);



//        musicList.setOnItemClickListener((AdapterView.OnItemClickListener) (parent, view, position, id) -> {
//            String selectedMusic = finalPlaylist.get(position);
//            Intent playMusic = new Intent(getApplicationContext(), PlayMusicActivity.class);
//            playMusic.putExtra("musicName", selectedMusic);
//            startActivity(playMusic);
//        });
    }

    public ArrayList<MusicView> getMusicList(){

        ArrayList musicList = new ArrayList<MusicView>();

        String[] music = new String[]{ "Warm Mellow Jazz",
                "Yesterday Subtlety",
                "Crazy Of My Labels","Legendary Shadows","Crazy Of My Moves","Summer Jazz Story",
                "Cold Coffee","Jazz For Romance","Welcome Way","Unexpected Midnight",
                "Summer Of Mix","Time Of Stories","Love Moments","Muted Voice",
                "Strength Of Sounds","A Crowded Joys","Streets Of Jazz Club",
                "Music Of Past","Smooth Smoke","Daily Inner Fire"};

        for(int i = 0; i < music.length; i++){
            musicList.add(new MusicView(R.drawable.jekyllrb, music[i], "Ornette Coleman"));
        }

        return musicList;
    }
}