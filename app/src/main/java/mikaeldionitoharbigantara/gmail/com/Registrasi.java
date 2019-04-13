package mikaeldionitoharbigantara.gmail.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
// mendeklarasikan fungsi import-an yang terdapat pada class Registrasi

public class Registrasi extends AppCompatActivity {
    // mendeklarasikan sebuah class baru dengan nama Registrasi dengan aturan
Button btnsubmit;
// mendeklarasikan sebuah fungsi Button dengan nama btnsubmit.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        // pada class Registrasi mengambil aturan layout dengan nama activity_registrasi.xml yang terdapat pada res/layout/.

        btnsubmit = (Button)findViewById(R.id.btnsubmit);
        // mendeklarasikan var btnsubmit dengan pencarian semua nama tersebut dengan inisialisasi id btnsubmit yang berada pada layout acivity_registrasi.xml.

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMik3 = new Intent(Registrasi.this, ListView_Nama.class);
                Registrasi.this.startActivity(intentMik3);
                finish();
            }
            // mendeklarasikan jika pada button submit di klik maka akan dilemparkan ke class ListView_Nama dengan menggunakan fungsi Intent dengan nama intentMik3.
        });
    }
}
