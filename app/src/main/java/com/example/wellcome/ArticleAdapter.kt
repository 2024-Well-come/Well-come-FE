package com.example.wellcome

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.wellcome.databinding.ItemArticleBinding

class ArticleAdapter(val items: MutableList<Article>):
RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder = ArticleViewHolder(ItemArticleBinding.inflate(
        LayoutInflater.from(parent.context), parent, false))

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var binding= (holder as ArticleViewHolder).binding

        binding.articleTitle.text = "강원도"
        binding.articleText.text = "힐링"
    }



}
class ArticleViewHolder(val binding: ItemArticleBinding): RecyclerView.ViewHolder(binding.root)