package com.example.trance.justmusic;

import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Trance on 6/22/2017.
 */

public class customadapter extends BaseAdapter {
    private Context context;
    private ArrayList<Songs> songList;
    public customadapter(Context context, ArrayList<Songs> songList) {
        this.context = context;
        this.songList = songList;
    }
    @Override
    public int getCount() {
        return songList.size();
    }
    @Override
    public Object getItem(int position) {
        return songList.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View v = View.inflate(context,R.layout.row_item,null);
        TextView tv = (TextView) v.findViewById(R.id.textView);
        TextView tv1 = (TextView) v.findViewById(R.id.textView2);
        TextView tv2 = (TextView) v.findViewById(R.id.textView3);
        tv.setText(songList.get(position).getSongTitle());
        tv1.setText(songList.get(position).getSongArtist());

long kk = songList.get(position).getSongDuration();
        String kkk = convertDuration(kk);

        tv2.setText(kkk);



        return v;
    }

    public String convertDuration(long duration) {
        String out = null;
        long hours=0;
        try {
            hours = (duration / 3600000);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return out;
        }
        long remaining_minutes = (duration - (hours * 3600000)) / 60000;
        String minutes = String.valueOf(remaining_minutes);
        if (minutes.equals(0)) {
            minutes = "00";
        }
        long remaining_seconds = (duration - (hours * 3600000) - (remaining_minutes * 60000));
        String seconds = String.valueOf(remaining_seconds);
        if (seconds.length() < 2) {
            seconds = "00";
        } else {
            seconds = seconds.substring(0, 2);
        }

        if (hours > 0) {
            out = hours + ":" + minutes + ":" + seconds;
        } else {
            out = minutes + ":" + seconds;
        }

        return out;

    }
}
