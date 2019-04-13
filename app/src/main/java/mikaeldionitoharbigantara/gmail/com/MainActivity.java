package mikaeldionitoharbigantara.gmail.com;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
// mendeklarasikan import-an yang terdapat pada class MainActivity

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    // mendeklarasikan sebuah EditText dengan nama inisialisasi username dan password yang berada pada layout acivity_main.xml.
    Button btnLogin, btnRegist;
    // mendeklaraiskan sebuah Button dengan nama insisialisasi btnLogin dan BtnRegist yang berada pada layout acivity_main.xml.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.username);
        // mendeklarasikan var username dengan pencarian semua nama tersebut dengan inisialisasi id username yang berada pada layout acivity_main.xml.
        password = (EditText)findViewById(R.id.password);
        // mendeklarasikan var password dengan pencarian semua nama tersebut dengan inisialisasi id password yang berada pada layout acivity_main.xml.
        btnLogin = (Button)findViewById(R.id.btnlogin);
        // mendeklarasikan var username dengan pencarian semua nama tersebut dengan inisialisasi id btnLogin yang berada pada layout acivity_main.xml.
        btnRegist = (Button)findViewById(R.id.btnregis);
        // mendeklarasikan var btnRegist dengan pencarian semua nama tersebut dengan inisialisasi id username yang berada pada layout acivity_main.xml.

        btnLogin.setOnClickListener(new View.OnClickListener() {
            // mendeklarasikan fungsi btnLogin yang akan diklik akan mengambil fungsi sebagai berikut :
            @Override
            public void onClick(View v) {
                String username_key = username.getText().toString();
                String password_key = password.getText().toString();
                // mendeklarasikan sebuah fungsi username_key dan password_key dengan tipedata String mengambil isian tiap masing-masing fungsi dan mengubah ke tipedata String.

                if(username_key.equals("mikael")&& password_key.equals("165410102")){
                    Toast.makeText(getApplicationContext(), "LOGIN BERHASIL",
                            Toast.LENGTH_SHORT).show();
                    Intent intentMik = new Intent(MainActivity.this, ListView_Nama.class);
                    MainActivity.this.startActivity(intentMik);
                    finish();
                    // mendeklarasikan fungsi if else jika isian pada fungsi username_key berisi mikael dan pada password_key berisi 165410102 maka akan ada aler LOGIN BERHASIL.
                    // dan jika di klik button LOGIN maka akan menggunakan fungsi Intent dengan nama intentMik yang akan dilempar ke class ListView_nama.
                }else {
                    AlertDialog.Builder builderMik = new AlertDialog.Builder(MainActivity.this);
                    builderMik.setMessage("Username dan Password yang anda masukan Salah!").setNegativeButton("Retry", null).create().show();
                }
                // dan jika username dan password yang dimasukan selain dari aturan di atas maka akan menampilkan alert Username dan Password yang anda masukan Salah daan menampilkan button Retry dengan fungsi memasukan kembali username dan password yang benar.
            }
        });

        btnRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMik2 = new Intent(MainActivity.this, Registrasi.class);
                MainActivity.this.startActivity(intentMik2);
                finish();
            }
        });
        // mendeklarasikan fungsi dari btnRegist dimana menggunakan fungsi Intent dengan nama intentMik2 dimana jika diklik pada button tersebut maka akan dilempar ke class Registerasi.
    }
}
