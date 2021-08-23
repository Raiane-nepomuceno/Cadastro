package com.example.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText nomeEt;
    private EditText telefoneEt;
    private EditText emailEt;
    private EditText cidadeEt;

    private RadioButton primeiroRadioButton;
    private CheckBox checadoCheckBox;
    private Button primeiroBotaoButton;
    private Button segunoBotaoButton;
    private Spinner opcoesSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeEt = findViewById(R.id.nomeEt);
        telefoneEt = findViewById(R.id.telefoneEt);
        emailEt = findViewById(R.id.emailEt);
        cidadeEt = findViewById(R.id.cidadeEt);

        primeiroRadioButton = findViewById(R.id.primeiroRb);
        checadoCheckBox = findViewById(R.id.checkbox);

        opcoesSpinner = findViewById(R.id.opcoesUf);
        primeiroBotaoButton = findViewById(R.id.btnLimpar);
        primeiroBotaoButton.setOnClickListener(this);

        segunoBotaoButton = findViewById(R.id.btnSalvar);
        segunoBotaoButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnLimpar)
        {

            nomeEt.getText().clear();
            telefoneEt.getText().clear();
            emailEt.getText().clear();
            cidadeEt.getText().clear();
            checadoCheckBox.setChecked(false);
            primeiroBotaoButton.getSelectionStart();
            //coesSpinner = opcoesSpinner.


        }
        else
        {

                Cadastro cadastro = new Cadastro();
                cadastro.setNomeCompleto(nomeEt.getText().toString());
                cadastro.setCidade(cidadeEt.getText().toString());
                cadastro.setEmail(emailEt.getText().toString());
                cadastro.setTelefone(telefoneEt.getText().toString());
                cadastro.getUf(((TextView) opcoesSpinner.getSelectedView()).getText().toString());
                if(primeiroRadioButton.isChecked())
                {
                    cadastro.setSexo("Masculino");
                }
                else{

                    cadastro.setSexo("Feminino");
                }
                if (checadoCheckBox.isChecked()) {
                    cadastro.setInteresseEmail(true);
                } else {
                    cadastro.setInteresseEmail(false);
                }
                String str = "Olá, "+cadastro.getNomeCompleto()+"! Você está cadastrado conosco! :)" ;
                Toast.makeText(this, str,Toast.LENGTH_SHORT).show();
}
    }
}