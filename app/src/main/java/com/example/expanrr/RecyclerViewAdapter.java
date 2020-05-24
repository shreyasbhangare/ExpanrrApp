package com.example.expanrr;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    private  static final String TAG= "RecyclerViewAdapter";
    private ArrayList<String>mNames=new ArrayList<>();
    private ArrayList<Integer> array_image = new ArrayList<Integer>();
    private Context mcontext;

    public RecyclerViewAdapter(Context mcontext,ArrayList<String> mNames, ArrayList<Integer> array_image) {
        this.mNames = mNames;
        this.array_image = array_image;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list_item,parent,false);

        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG,"onCreateViewHolder: called.");

        Glide.with(mcontext).asBitmap().load(array_image.get(position)).into(holder.image);
        holder.name.setText(mNames.get(position));
        holder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==0)
                {
                    Intent intent=new Intent(mcontext,Article1.class);
                    mcontext.startActivity(intent);
                }
                if(position==1) {
                    Intent intent=new Intent(mcontext,Article2.class);
                    mcontext.startActivity(intent);
                }
                if(position==2){
                    Intent intent=new Intent(mcontext,Article3.class);
                    mcontext.startActivity(intent);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return mNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image);
            name=itemView.findViewById(R.id.name);

        }
    }
}
