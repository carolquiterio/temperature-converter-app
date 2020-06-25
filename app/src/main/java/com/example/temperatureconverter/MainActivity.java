package com.example.temperatureconverter;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Button;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvMensagem;
    EditText edtCelsius;
    Button btnConverter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMensagem = (TextView)findViewById(R.id.tvMensagem);
        edtCelsius = (EditText)findViewById(R.id.edtCelsius);
        btnConverter = (Button)findViewById(R.id.btnConverter);

        btnConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edtCelsius.getText().toString().equals(""))
                {
                    tvMensagem.setText("Escreva um número para continuar!");

                 // Toast.makeText(this, "Escreva um número válido", Toast.LENGTH_LONG).show();
                }
                else {
                    tvMensagem.setText("");

                    double varCelsius = Double.parseDouble((edtCelsius.getText().toString()));

                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    Bundle params = new Bundle();

                    params.putDouble("celsius", varCelsius);

                    intent.putExtras(params);
                    startActivity(intent);
                }
            }
        });
    }
}
