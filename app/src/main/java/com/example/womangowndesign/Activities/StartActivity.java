package com.example.womangowndesign.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.example.womangowndesign.Adapter.GownAdapter;
import com.example.womangowndesign.ModelClass.Model;
import com.example.womangowndesign.R;
import com.example.womangowndesign.databinding.ActivityStartBinding;

import java.util.ArrayList;

public class StartActivity extends AppCompatActivity {
ActivityStartBinding binding;
ArrayList<Model>list;
GownAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityStartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        GridLayoutManager layoutManager=new GridLayoutManager(this,3);
        binding.rec.setLayoutManager(layoutManager);
        list=new ArrayList<>();
        list.add(new Model(R.drawable.dr));
        list.add(new Model(R.drawable.d));
        list.add(new Model(R.drawable.dres));
        list.add(new Model(R.drawable.drs));
        list.add(new Model(R.drawable.drss));
        list.add(new Model(R.drawable.dt));
        list.add(new Model(R.drawable.g));
        list.add(new Model(R.drawable.go));
        list.add(new Model(R.drawable.gown));
        list.add(new Model(R.drawable.gow));
        list.add(new Model(R.drawable.gown));
        list.add(new Model(R.drawable.hh));
        list.add(new Model(R.drawable.dr));
        list.add(new Model(R.drawable.dr));

        adapter=new GownAdapter(list,StartActivity.this);
        binding.rec.setAdapter(adapter);

    }
}