package com.example.myapplication;

import java.util.ArrayList;




public class NewsModel {
    private int totalResults;
    private String status;
    private ArrayList<Articles> articles;

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Articles> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Articles> articles) {
        this.articles = articles;
    }

    public NewsModel() {
        this.totalResults = totalResults;
        this.status = status;
        this.articles = articles;
    }

    NewsModel newsModel = new NewsModel();
}
