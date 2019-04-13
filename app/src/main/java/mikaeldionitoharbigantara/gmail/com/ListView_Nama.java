package mikaeldionitoharbigantara.gmail.com;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
// // Mendeklarasikan semua import-an yang digunakan dalam class ListView_Nama yaitu Bundle, View, AdapterView, ListView dan Toast

public class ListView_Nama extends AppCompatActivity {
    // mendeklarasikan sebuah class baru dengan nama ListView_Nama dengan extends AppCompatActivity.
        ListView list;
        // mendeklarasikan sebuah ListView dengan variabel inisialisasi list.
        String[] maintitle ={
                "Mikael Dionito Harbigantara (165410102)","Antonius Jonatan BW (165410095)",
                "Danang Triyatno (165410058)","Danis Pangestu (165410156)",
                "Emanuel Krowe Goran (165410097)","Sahril (165410092)",
                "Muhammad Nur Ashidiq (165410067)","Sinar Timur Dwi Oktaviano (165410219)",
                "Zaqie Al Fatah (165410055)",
        };
        // mendeklarasikan sebuah array dengan tipedata String dengan nama maintitle yang bersisi Nama dari Teman-teman berserta NIM dari masing-masing nama yaitu :
        // "Mikael Dionito Harbigantara (165410102)","Antonius Jonatan BW (165410095)",
        // "Danang Triyatno (165410058)","Danis Pangestu (165410156)",
        // "Emanuel Krowe Goran (165410097)","Sahril (165410092)",
        // "Muhammad Nur Ashidiq (165410067)","Sinar Timur Dwi Oktaviano (165410219)",
        // "Zaqie Al Fatah (165410055)",

        String[] subtitle ={
                "mikaeldionitoharbigantara@gmail.com","antonius1938@gmail.com",
                "anaksoleh049@gmail.com","pangestudanis@gmail.com",
                "emanuelkrowegoran@gmail.com","sahrilhasan@gmail.com",
                "sidikmilati@gmail.com","sinartimur@gmail.com",
                "zaqiealfatah@gmail.com",
        };
        // mendeklarasikan sebuah array dengan tipedata String dengan nama subtitle yang berisi email dari Nama teman yang berada di array maintitle yaitu :
        // "mikaeldionitoharbigantara@gmail.com","antonius1938@gmail.com",
        // "anaksoleh049@gmail.com","pangestudanis@gmail.com",
        // "emanuelkrowegoran@gmail.com","sahrilhasan@gmail.com",
        // "sidikmilati@gmail.com","sinartimur@gmail.com",
        // "zaqiealfatah@gmail.com",

        Integer[] imgid={
                R.drawable.mik,R.drawable.anton,
                R.drawable.danang,R.drawable.denis,
                R.drawable.eman,R.drawable.sahril,
                R.drawable.sidik,R.drawable.vino,
                R.drawable.zaqie,
        };
        // mendeklarasikan sebuah arrau dengan tipedata Integer dengan nama imgid yang berisi foto teman-teman yang disimpan pada folder res/drawable/ dengan aturan setiap foto diatur posisi menurut posisi array nama pada string maintitle yaitu :
        //  R.drawable.mik,R.drawable.anton,
        //  R.drawable.danang,R.drawable.denis,
        //  R.drawable.eman,R.drawable.sahril,
        //  R.drawable.sidik,R.drawable.vino,
        //  R.drawable.zaqie,
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_list_view__nama);
            // mendeklarasikan pengambilan aturan yang dikonfigurasikan pada layout activity_list_view__nama
            ListAdapterMik adapter=new ListAdapterMik(this, maintitle, subtitle,imgid);
            // mendeklarasikan pemanggilan class ListAdapterMik dengan variabel adapter.
            list=(ListView)findViewById(R.id.list);
            // mendeklarasikan sebuah ListView dengan nama list yang berada pada layout mylist.xml
            list.setAdapter(adapter);
            // mendeklarasikan sebuah aturan pada list dengan menyatukan aturan pada variabel adapter yang terdapat pada class ListAdapterMik.
            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                //mendeklarasikan sebuah fungsi OnItemClisckListeren pada list yang berguna untuk jika pada salah satu list ditekan maka akan memunculkan alert sebuah teks seperti di bawah ini :
                @Override
                public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
// TODO Auto-generated method stub
                    if(position == 0) {
//code specific to first list item
                        Toast.makeText(getApplicationContext(),"Haii, Panggil Saya Mikael!",Toast.LENGTH_SHORT).show();
                    }
                    // pada posisi 0 yaitu pada akan memunculkan alert yaitu Haii, Panggil Saya Mikael!
                    else if(position == 1) {
//code specific to 2nd list item
                        Toast.makeText(getApplicationContext(),"Haii, Panggil Saya Anton!",Toast.LENGTH_SHORT).show();
                    }
                    // pada posisi 1 yaitu pada akan memunculkan alert yaitu Haii, Panggil Saya Anton!
                    else if(position == 2) {
                        Toast.makeText(getApplicationContext(),"Haii, Panggil Saya Danang!",Toast.LENGTH_SHORT).show();
                    }
                    // pada posisi 2 yaitu pada akan memunculkan alert yaitu Haii, Panggil Saya Danang!
                    else if(position == 3) {
                        Toast.makeText(getApplicationContext(),"Haii, Panggil Saya Denis!",Toast.LENGTH_SHORT).show();
                    }
                    // pada posisi 3 yaitu pada akan memunculkan alert yaitu Haii, Panggil Saya Denis!
                    else if(position == 4) {
                        Toast.makeText(getApplicationContext(),"Haii, Panggil Saya Eman!",Toast.LENGTH_SHORT).show();
                    }
                    // pada posisi 4 yaitu pada akan memunculkan alert yaitu Haii, Panggil Saya Eman!
                    else if(position == 5) {
                        Toast.makeText(getApplicationContext(),"Haii, Panggil Saya Sahril!",Toast.LENGTH_SHORT).show();
                    }
                    // pada posisi 5 yaitu pada akan memunculkan alert yaitu Haii, Panggil Saya Sahril!
                    else if(position == 6) {
                        Toast.makeText(getApplicationContext(),"Haii, Panggil Saya Shidiq!",Toast.LENGTH_SHORT).show();
                    }
                    // pada posisi 6 yaitu pada akan memunculkan alert yaitu Haii, Panggil Saya Shidiq!
                    else if(position == 7) {
                        Toast.makeText(getApplicationContext(),"Haii, Panggil Saya Vino!",Toast.LENGTH_SHORT).show();
                    }
                    // pada posisi 7 yaitu pada akan memunculkan alert yaitu Haii, Panggil Saya Vino!
                    else if(position == 8) {
                        Toast.makeText(getApplicationContext(),"Haii, Panggil Saya Zaqie!",Toast.LENGTH_SHORT).show();
                    }
                    // pada posisi 8 yaitu pada akan memunculkan alert yaitu Haii, Panggil Saya Zaqie!
                }
            });
        }
    }
