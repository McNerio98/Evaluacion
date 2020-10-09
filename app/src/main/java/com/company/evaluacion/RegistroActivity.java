package com.company.evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistroActivity extends AppCompatActivity {
    private Button btnSave;
    private EditText txtName;
    private EditText txtCode;
    private EditText txtSubject;
    private EditText txtPartial1;
    private EditText txtPartial2;
    private EditText txtPartial3;

    public static final String TAG_NAME = "TAG_NAME";
    public static final String TAG_CODE = "TAG_CODE";
    public static final String TAG_SUBJECT = "TAG_SUBJECT";
    public static final String TAG_PART1 = "TAG_PART1";
    public static final String TAG_PART2 = "TAG_PART2";
    public static final String TAG_PART3 = "TAG_PART3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        this.btnSave = findViewById(R.id.btnSave);
        this.txtName = findViewById(R.id.txtName);
        this.txtCode = findViewById(R.id.txtCode);
        this.txtSubject = findViewById(R.id.txtSubject);
        this.txtPartial1 = findViewById(R.id.txtPartial1);
        this.txtPartial2 = findViewById(R.id.txtPartial2);
        this.txtPartial3 = findViewById(R.id.txtPartial3);


        this.btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //hacer las validaciones

                if(formIsValid()){
                    String name = txtName.getText().toString();
                    String code = txtCode.getText().toString();
                    String subject = txtSubject.getText().toString();
                    String partial1 = txtPartial1.getText().toString();
                    String partial2 = txtPartial2.getText().toString();
                    String partial3 = txtPartial3.getText().toString();

                    Intent msg_response = new Intent();
                    msg_response.putExtra(TAG_NAME,name);
                    msg_response.putExtra(TAG_CODE,code);
                    msg_response.putExtra(TAG_SUBJECT,subject);
                    msg_response.putExtra(TAG_PART1,partial1);
                    msg_response.putExtra(TAG_PART2,partial2);
                    msg_response.putExtra(TAG_PART3,partial3);
                    setResult(RESULT_OK,msg_response);
                    finish();
                }
            }
        });
    }

    private boolean formIsValid(){
        boolean isValid = true;
            if(this.txtName.getText().toString().trim().equals("")){
                this.txtName.setError("Campo Requerido");
                return false;
            }else if(this.txtCode.getText().toString().trim().equals("")){
                this.txtCode.setError("Campo Requerido");
                return false;
            }else if(this.txtSubject.getText().toString().trim().equals("")){
                this.txtSubject.setError("Campo Requerido");
                return false;
            }else if(this.txtPartial1.getText().toString().trim().equals("")){
                this.txtPartial1.setError("Campo Requerido");
                return false;
            }else if(this.txtPartial2.getText().toString().trim().equals("")){
                this.txtPartial2.setError("Campo Requerido");
                return false;
            }else if(this.txtPartial3.getText().toString().trim().equals("")){
                this.txtPartial3.setError("Campo Requerido");
                return false;
            }
        return isValid;
    };


}