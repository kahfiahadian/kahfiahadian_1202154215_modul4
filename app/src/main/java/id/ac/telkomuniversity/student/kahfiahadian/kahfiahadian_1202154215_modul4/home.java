package id.ac.telkomuniversity.student.kahfiahadian.kahfiahadian_1202154215_modul4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle("AsyncTask");
    }

    //method saat button ditekan
    public void mahasiswa(View view) {
        //untuk berpindah ke aktivitas list mahasiswa//
        Intent i = new Intent(this, listMahasiswa.class);
        startActivity(i);
    }

    //method saat button ditekan
    public void gambar(View view) {
        //untuk berpindah ke aktivitas cari gambar//
        Intent intent = new Intent(this, cariGambar.class);
        startActivity(intent);
    }
}
