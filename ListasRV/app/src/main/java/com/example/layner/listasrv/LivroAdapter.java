package com.example.layner.listasrv;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Layner on 10/3/2018.
 */

public class LivroAdapter extends RecyclerView.Adapter<LivroViewHolder> {

    private List<Livro> livros;
    private Context context;

    public LivroAdapter(List<Livro> livros, Context context) {
        this.livros = livros;
        this.context = context;
    }

    @Override
    public LivroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View linha = LayoutInflater.from(this.context)
                .inflate(R.layout.item_layout, parent, false);
        LivroViewHolder linhaViewHolder = new LivroViewHolder(linha);

        return linhaViewHolder;
    }

    @Override
    public void onBindViewHolder(LivroViewHolder holder, int position) {
        Livro livro = livros.get(position);
        holder.tvTitulo.setText(livro.getTitulo());
        holder.tvResumo.setText(livro.getResumo());
    }

    @Override
    public int getItemCount() {
        return livros.size();
    }
}
