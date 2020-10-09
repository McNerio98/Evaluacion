package com.company.evaluacion;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.company.evaluacion.Adaptadores.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static List<Estudiante> globalList = new ArrayList<Estudiante>();
    public static final int ID_FORM = 4;
    private Button btnRegEstudiante;
    private Button btnShowList;
    private Button btnShowInfo;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch(requestCode){
            case ID_FORM:{
                //validar como finalizo el proceso
                if(RESULT_OK == resultCode){
                    Estudiante e = new Estudiante();
                    e.setNombre(data.getStringExtra(RegistroActivity.TAG_NAME));
                    e.setCodigo(data.getStringExtra(RegistroActivity.TAG_CODE));
                    e.setMateria(data.getStringExtra(RegistroActivity.TAG_SUBJECT));
                    e.setParcial1(Double.valueOf(data.getStringExtra(RegistroActivity.TAG_PART1)));
                    e.setParcial2(Double.valueOf(data.getStringExtra(RegistroActivity.TAG_PART2)));
                    e.setParcial3(Double.valueOf(data.getStringExtra(RegistroActivity.TAG_PART3)));

                    this.globalList.add(e);
                    Toast.makeText(MainActivity.this,"Estudiante Registrado",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"ERROR: en el Form",Toast.LENGTH_SHORT).show();
                }
            }
            break;
            default:{
                Toast.makeText(MainActivity.this,"ERROR de Inconsistencia",Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.btnRegEstudiante = findViewById(R.id.btnRegEstudiante);
        this.btnShowList = findViewById(R.id.btnShowList);
        this.btnShowInfo = findViewById(R.id.btnShowInfo);


        this.btnRegEstudiante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent frm = new Intent(MainActivity.this,RegistroActivity.class);
                startActivityForResult(frm,ID_FORM);
            }
        });

        this.btnShowList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listDisplay = new Intent(MainActivity.this,ListActivity.class);
                startActivity(listDisplay);
            }
        });

        this.btnShowInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent AcInfo = new Intent(MainActivity.this,InfoActivity.class);
                startActivity(AcInfo);
            }
        });
    }
}