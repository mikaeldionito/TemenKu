package mikaeldionitoharbigantara.gmail.com;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
// Mendeklarasikan semua import-an yang digunakan dalam class ListAdapterMik yaitu Activity, LayoutInflater, View, ViewGroup, ArrayAdapter, ImageView dan TextView yang digunakan untuk class ini.

public class ListAdapterMik extends ArrayAdapter<String> {
    // mendeklarasikan sebuah class baru dengan nama ListAdapterMik dengan sebuah extend sebuah ArrayAdapter yang berisi inputan bertipedata String.
    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;
    private final Integer[] imgid;
    // mendeklarasikan sebuah fungsi pada Activity yang berisi fungsi context, Array dengan tipe String dengan fungsi maintitle, Array dengan tipe String dengan fungsi subtitle, Array dengan tipe Integer dengan fungsi imgid.

    public ListAdapterMik(Activity context, String[] maintitle,String[] subtitle, Integer[] imgid)
    {
        // mendeklarasikan method ListAdapterMik dengan isian fungsi context, maintitle, subtitle dan imgid yang bersifat public
        super(context, R.layout.mylist, maintitle);
        // mendeklarasikan fungsi super dengan isian sebuah context, isian pada layout myList dan isian pada maintitle yang terdapat di class ListView_Nama.
// TODO Auto-generated constructor stub
        this.context=context;
        // mendeklarasikan sebuah fungsi context dengan inisialisasi yaitu context
        this.maintitle=maintitle;
        // mendeklarasikan sebuah fungsi maintitle dengan inisialisasi yaitu maintitle dengan isian yang berada pada class ListView_Nama.
        this.subtitle=subtitle;
        // mendeklarasikan sebuah fungsi subtitle dengan inisialisasi yaitu subtitle dengan isian yang berada pada class ListView_Nama.
        this.imgid=imgid;
        // mendeklarasikan sebuah fungsi imgid dengan inisialisasi yaitu imgid dengan isian yang berada pada class ListView_Nama
    }
    public View getView(int position,View view,ViewGroup parent) {
        // mendeklarasikan sebuah method View dengan nama getView
        LayoutInflater inflater=context.getLayoutInflater();
        // mendeklarasikan sebuah fungsi gerLayoutInflater pada fungsi context.
        View rowView=inflater.inflate(R.layout.mylist, null,true);
        // mendeklarasikan sebuah fungsi rowView pada layout myList
        TextView titleText = (TextView) rowView.findViewById(R.id.title);
        // mendeklarasikan sebuah TextView dengan variabel titleText yang akan ditampilkan pada layout dengan mengambil fungsi pada layout mylist.xml dengan id di TextView title
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        // mendeklarasikan sebuah ImageView dengan variabel imageView yang akan ditampilkan pada layout dengan mengambil fungsi pada layout myList.xml dengan id di ImageView icon.
        TextView subtitleText = (TextView) rowView.findViewById(R.id.subtitle);
        // mendellarasikan sebuah TextView dengan variabel subtitleText yang akan ditamplkan pada layout dengan mengambil fungsi pada layout myList.xml dengan id TextView subtitle.
        titleText.setText(maintitle[position]);
        imageView.setImageResource(imgid[position]);
        subtitleText.setText(subtitle[position]);
        // mendeklarasikan sebuah aturan position pada fungsi maintitle, imgid, subtitle
        return rowView;
        // membalikan nilai rowView jika ada lagi masukan yang akan diterima.
    };
}