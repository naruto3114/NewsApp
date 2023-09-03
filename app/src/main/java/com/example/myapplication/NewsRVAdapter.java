package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class NewsRVAdapter extends RecyclerView.Adapter<NewsRVAdapter.ViewHolder> {
    private ArrayList<Articles> articlesArrayList;
    private Context context;

    public NewsRVAdapter(ArrayList<Articles> articlesArrayList, Context context) {
        this.articlesArrayList = articlesArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public NewsRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_rv_items,parent,false);
        return new NewsRVAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsRVAdapter.ViewHolder holder, int position) {
     Articles articles = articlesArrayList.get(position);
     holder.SubTitalTV.setText(articles.getDescription());
     holder.titleTV.setText(articles.getTitle());
        Picasso.get().load(articles.getUrlToImage()).into(holder.newsIv);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context,NewsDetiltActivity.class);
                 i.putExtra("title",articles.getTitle());
                i.putExtra("content",articles.getContent());
                i.putExtra("disc",articles.getDescription());
                i.putExtra("img",articles.getUrlToImage());
                i.putExtra("url",articles.getUrl());
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return articlesArrayList.size();
    }



  public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView titleTV,SubTitalTV;
        private ImageView newsIv;
      public ViewHolder(@NonNull View itemView) {
          super(itemView);
          titleTV = itemView.findViewById(R.id.idTVNewsHeading);
          SubTitalTV = itemView.findViewById(R.id.tvsubtital);
          newsIv = itemView.findViewById(R.id.IVNews);
      }
  }
}