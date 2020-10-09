package com.company.evaluacion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.company.evaluacion.Adaptadores.Adaptadorinformacion;
import com.company.evaluacion.Adaptadores.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    private List<Estudiante> datosInfo = new ArrayList<>();
    private RecyclerView viewInfo;
    private Adaptadorinformacion adaptador;
    private LinearLayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        this.datosInfo = MainActivity.globalList;

        // Crear enlaces
        this.viewInfo = findViewById(R.id.listStudentProms);
        this.manager = new LinearLayoutManager(this);
        this.adaptador = new Adaptadorinformacion(datosInfo);

        // Configuracion Recycler View
        this.viewInfo.setHasFixedSize(true);
        this.viewInfo.setLayoutManager(manager);
        this.viewInfo.setAdapter(this.adaptador);

    }
}