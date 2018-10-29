package com.example.layner.listasrv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Livro> livros = new ArrayList<Livro>();
        livros.add(new Livro("A volta dos que não foram...","Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        livros.add(new Livro("Poeira em alto mar.","Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        livros.add(new Livro("As tranças da vovó careca.","Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        livros.add(new Livro("Dois carecas brigando pelo pente.","Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        livros.add(new Livro("Incêndio na caixa d'agua.","Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        livros.add(new Livro("A volta dos que não foram...","Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        livros.add(new Livro("A volta dos que não foram...","Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        livros.add(new Livro("A volta dos que não foram...","Lorem ipsum dolor sit amet, consectetur adipiscing elit."));

        LivroAdapter livroAdapter = new LivroAdapter(livros, MainActivity.this);

        RecyclerView lista = findViewById(R.id.lista);

        lista.setAdapter(livroAdapter);

        //LINEAR
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this,
                LinearLayoutManager.VERTICAL, false);

        //GRID
        //GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 3);

        //STAGGERED
        //StaggeredGridLayoutManager stg = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);

        lista.addItemDecoration(new DividerItemDecoration(MainActivity.this, DividerItemDecoration.VERTICAL));

        lista.setLayoutManager(linearLayoutManager);
    }
}
