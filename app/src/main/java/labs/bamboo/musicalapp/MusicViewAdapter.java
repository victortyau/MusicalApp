package labs.bamboo.musicalapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicViewAdapter extends ArrayAdapter<MusicView> {

    public MusicViewAdapter(Context context, ArrayList<MusicView> arrayList){
        super(context, 0 , arrayList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View currentItemView = convertView;

        if ( currentItemView == null ){
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.music_item_view, parent, false);
        }

        MusicView currentPosition = getItem(position);

        ImageView imageId = currentItemView.findViewById(R.id.imageView);
        assert currentPosition != null;
        imageId.setImageResource(currentPosition.getImageId());

        TextView musicTitle = currentItemView.findViewById(R.id.musicTitle);
        musicTitle.setText(currentPosition.getMusicName());

        TextView musicAuthor = currentItemView.findViewById(R.id.musicAuthor);
        musicAuthor.setText(currentPosition.getMusicAuthor());

        return currentItemView;
    }
}
