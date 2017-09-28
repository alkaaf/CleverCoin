package org.alkaaf.clevercoin;

import android.support.v7.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by dalbo on 9/29/2017.
 */

public class nek {
    public static void main(String[] args) {
        FirebaseRecyclerAdapter<String, RecyclerView.ViewHolder> rf = new FirebaseRecyclerAdapter<String, RecyclerView.ViewHolder>(String.class, R.layout.activity_main,RecyclerView.ViewHolder.class, FirebaseDatabase.getInstance().getReference()) {
            @Override
            protected void populateViewHolder(RecyclerView.ViewHolder viewHolder, String model, int position) {

            }
        };
    }
}
