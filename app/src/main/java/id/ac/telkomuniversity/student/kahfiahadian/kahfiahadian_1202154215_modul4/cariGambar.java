
package id.ac.telkomuniversity.student.kahfiahadian.kahfiahadian_1202154215_modul4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class cariGambar extends AppCompatActivity {
    //mendeklarasikan variabel yang dibutuhkan
    ImageView gambar;
    EditText sumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari_gambar);

        //memanggil variabel yang ada pada layout
        gambar = (ImageView)findViewById(R.id.imageView2);
        sumber = (EditText)findViewById(R.id.urlgambar);
    }
    //ketika button dipencet
    public void carigmbr(View view) {
        //loading gambar dari internet ke imageview
        Picasso.with(cariGambar.this).load(sumber.getText().toString())
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_launcher)
                .into(gambar);
    }

}
