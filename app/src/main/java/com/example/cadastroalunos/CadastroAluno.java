package com.example.cadastroalunos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class CadastroAluno extends AppCompatActivity {

    Spinner cursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_aluno);

        setTitle("Cadastro de aluno");

        cursos = findViewById(R.id.spnCurso);

        String[] strCursos = getResources().getStringArray(R.array.cursos);

        ArrayAdapter<String>  adp = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, strCursos);

        cursos.setAdapter(adp);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_cadastro_aluno, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()) {
            case R.id.menuCancelar: {
                finish();
                break;
            }
            case R.id.menuSalvarAluno: {
                salvarAluno();
                finish();
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    public void salvarAluno() {
        Toast.makeText(this, "Salvando aluno", Toast.LENGTH_SHORT).show();

    }
}
