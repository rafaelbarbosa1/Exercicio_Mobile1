package com.example.cadastroalunos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListagemAlunos extends AppCompatActivity {

    ListView listaAlunos;
    List<Aluno> alunos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem_alunos);

        setTitle("Listagem de alunos");

        alunos = new ArrayList<>();

        listaAlunos = findViewById(R.id.lstAlunos);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_listagem_alunos, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.menuFecharApp: {
                finish();
                break;
            }
            case R.id.menuNovoAluno: {
                Intent i = new Intent(this, CadastroAluno.class);
                startActivity(i);
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
