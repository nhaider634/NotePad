package com.example.nasim.notepad;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class Adapter extends ArrayAdapter<Note> {
    private Context context;
    private ArrayList <Note> notes;
    private Note note;

    public Adapter(@NonNull Context context,  ArrayList<Note> notes) {
        super(context, R.layout.single_row, notes);
        this.context = context;
        this.notes = notes;

    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //    Log.e("List view", "getView called "+(count++));


        if(convertView==null)
        {
            LayoutInflater layoutInflater= LayoutInflater.from(context);
            convertView = layoutInflater.inflate(R.layout.single_row, parent,false);

        }



        TextView title = convertView.findViewById(R.id.title);
        TextView date = convertView.findViewById(R.id.date);

        long dates = System.currentTimeMillis();

        SimpleDateFormat sdf = new SimpleDateFormat("MMM MM dd, yyyy h:mm a");
        String dateString = sdf.format(dates);


       title.setText(notes.get(position).getNoteTitle());
        date.setText(dateString);



        return convertView;

    }




}
