package com.example.womangowndesign.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.womangowndesign.ModelClass.Model;
import com.example.womangowndesign.R;
import com.example.womangowndesign.databinding.GownSampleBinding;

import java.util.ArrayList;

public class GownAdapter extends RecyclerView.Adapter<GownAdapter.viewHolder>{
    ArrayList<Model>list;
    Context context;

    public GownAdapter(ArrayList<Model> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.gown_sample,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
      Model model=list.get(position);
      holder.binding.imageView7.setImageResource(model.getImage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        GownSampleBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=GownSampleBinding.bind(itemView);
        }
    }
}
