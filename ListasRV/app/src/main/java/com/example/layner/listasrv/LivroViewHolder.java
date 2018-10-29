package com.example.layner.listasrv;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Layner on 10/3/2018.
 */

public class LivroViewHolder extends RecyclerView.ViewHolder {
    public TextView tvTitulo;
    public TextView tvResumo;

    public LivroViewHolder(View itemView) {
        super(itemView);
        this.tvTitulo =itemView.findViewById(R.id.tvTitulo);
        this.tvResumo =itemView.findViewById(R.id.tvResumo);
    }
}
