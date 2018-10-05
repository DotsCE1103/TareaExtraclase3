package angelortizv.operaciones;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button suma = (Button) findViewById(R.id.btnSumar);
        suma.setOnClickListener(OkListener);

//        Button resta = (Button) findViewById(R.id.btnRestar);
//        resta.setOnClickListener(OkListener);
//        Button multiplicacion = (Button) findViewById(R.id.btnMultiplicar);
//        multiplicacion.setOnClickListener(OkListener);
//        Button division = (Button) findViewById(R.id.btnDividir);
//        division.setOnClickListener(OkListener);


    }


    private View.OnClickListener OkListener = new View.OnClickListener() {

        public void onClick(View view) {
            Suma();
            Resta();
            Multiplicacion();
            Division();
        }

    };


    public void Suma() {

        EditText numero1 = (EditText) findViewById(R.id.etNumero1);
        EditText numero2 = (EditText) findViewById(R.id.etNumero2);
        int intNumero1 = Integer.parseInt(numero1.getText().toString());
        int intNumero2 = Integer.parseInt(numero2.getText().toString());
        int totalSuma = intNumero1 + intNumero2;
        Toast.makeText(this, "El resultado de la suma es: " + totalSuma, Toast.LENGTH_LONG).show();
    }
    public void Resta() {

        EditText numero1 = (EditText) findViewById(R.id.etNumero1);
        EditText numero2 = (EditText) findViewById(R.id.etNumero2);
        int intNumero1 = Integer.parseInt(numero1.getText().toString());
        int intNumero2 = Integer.parseInt(numero2.getText().toString());
        int totalResta = intNumero1 - intNumero2;
        Toast.makeText(this, "El resultado de la resta es: " + totalResta, Toast.LENGTH_LONG).show();
    }
    public void Multiplicacion() {

        EditText numero1 = (EditText) findViewById(R.id.etNumero1);
        EditText numero2 = (EditText) findViewById(R.id.etNumero2);
        int intNumero1 = Integer.parseInt(numero1.getText().toString());
        int intNumero2 = Integer.parseInt(numero2.getText().toString());
        int totalMultiplicacion = intNumero1 * intNumero2;
        Toast.makeText(this, "El resultado de la Multiplicación es: " + totalMultiplicacion, Toast.LENGTH_LONG).show();
    }
    public void Division() {

        EditText numero1 = (EditText) findViewById(R.id.etNumero1);
        EditText numero2 = (EditText) findViewById(R.id.etNumero2);
        int intNumero1 = Integer.parseInt(numero1.getText().toString());
        int intNumero2 = Integer.parseInt(numero2.getText().toString());
        int totalDivision = intNumero1 / intNumero2;
        Toast.makeText(this, "El resultado de la División es: " + totalDivision, Toast.LENGTH_LONG).show();
    }

}

