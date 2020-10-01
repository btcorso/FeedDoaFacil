package com.example.feeddoafacil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView lvFeed;

    int imagem = R.drawable.ic_launcher_foreground;

    String[] nomes = {"Nome#1","Nome#2","Nome#3","Nome#4","Nome#5","Nome#6","Nome#7","Nome#8"};

    String[] detalhes = {"Descrição#1","Descrição#2","Descrição#3","Descrição#4","Descrição#5","Descrição#6","Descrição#7","Descrição#8"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFeed = findViewById(R.id.feedDoacoes);

        CustomAdaptor customAdaptor = new CustomAdaptor();
        lvFeed.setAdapter(customAdaptor);
    }

    class CustomAdaptor extends BaseAdapter{

        @Override
        public int getCount() {
            return nomes.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            View v = getLayoutInflater().inflate(R.layout.customlayout, null);

            ImageView mImageView = v.findViewById(R.id.imgDoacao);
            TextView mTitulo = v.findViewById(R.id.txtTituloDoacao);
            TextView mDetalhe = v.findViewById(R.id.txtDetalheDoacao);

            mImageView.setImageResource(imagem);
            mTitulo.setText(nomes[i]);
            mDetalhe.setText(detalhes[i]);

            return v;
        }
    }
}