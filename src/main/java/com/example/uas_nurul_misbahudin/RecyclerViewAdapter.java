package com.example.uas_nurul_misbahudin;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {


    private ArrayList<String> fotorumahsakit = new ArrayList<>();
    private ArrayList<String> namarumahsakit = new ArrayList<>();
    private ArrayList<String> namakota = new ArrayList<>();
    private ArrayList<String> info = new ArrayList<>();


    private Context context;

    public RecyclerViewAdapter(ArrayList<String> fotorumahsakit, ArrayList<String> namarumahsakit,ArrayList<String> namakota, ArrayList<String> info, Context context) {
        this.fotorumahsakit = fotorumahsakit;
        this.namarumahsakit = namarumahsakit;
        this.namakota = namakota;
        this.info = info;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);



        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        Glide.with(context).asBitmap().load(fotorumahsakit.get(position)).into(holder.imageView);
        holder.textView.setText(namakota.get(position));



        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(context, namamahasiswa.get(position), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context,DetailActivity.class);

                intent.putExtra("foto_rumahsakit", fotorumahsakit.get(position));
                intent.putExtra("nama_rumahsakit", namarumahsakit.get(position));
                intent.putExtra("nama_kota", namakota.get(position));
                intent.putExtra("info", info.get(position));


                context.startActivity(intent);


            }
        });

    }

    @Override
    public int getItemCount() {
        return namakota.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        CircleImageView imageView;
        TextView textView;




        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView1);



            constraintLayout = itemView.findViewById(R.id.constrainLayout);
        }
    }

}
