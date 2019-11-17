package com.hyperdoid.hyperdroidbenchmark;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private TextView avltb;
    private Button avlbtn;

    private TextView srttb;
    private Button srtbtn;

    private TextView exptb;
    private Button expbtn;


    private TextView facttb;
    private Button factbtn;


    private TextView nqtb;
    private Button nqbtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        avltb = (TextView) findViewById(R.id.avltb);
        avlbtn = (Button) findViewById(R.id.avlbtn);
        avlbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                long sum[] = new long[10];
                for( int i = 0 ; i < 10 ; i++ )
                    sum[i] = AVLTree.TestingAVL(30000);
                Arrays.sort(sum);
                avltb.setText(Long.toString(sum[9]));
            }
        });



        srttb = (TextView) findViewById(R.id.srttb);
        srtbtn = (Button) findViewById(R.id.srtbtn);
        srtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                long sum[] = new long[10];
                for( int i = 0 ; i < 10 ; i++ )
                    sum[i] = Sorting.TestingSorting(30000);
                Arrays.sort(sum);
                srttb.setText(Long.toString(sum[9]));
            }
        });


        exptb = (TextView) findViewById(R.id.exptb);
        expbtn = (Button) findViewById(R.id.expbtn);
        expbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                long sum[] = new long[10];
                for( int i = 0 ; i < 10 ; i++ )
                    sum[i] = HighExpo.TestExpo(30000,30000);
                Arrays.sort(sum);
                exptb.setText(Long.toString(sum[9]));



            }
        });



        facttb = (TextView) findViewById(R.id.facttb);
        factbtn = (Button) findViewById(R.id.factbtn);
        factbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                long sum[] = new long[10];
                for( int i = 0 ; i < 10 ; i++ )
                    sum[i] = BigFact.TestExpo(30000);
                Arrays.sort(sum);
                facttb.setText(Long.toString(sum[9]));
            }
        });


        nqtb = (TextView) findViewById(R.id.nqtb);
        nqbtn = (Button) findViewById(R.id.nqbtn);
        nqbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                long sum[] = new long[10];
                for( int i = 0 ; i < 10 ; i++ )
                    sum[i] = BigFact.TestExpo(30000);
                Arrays.sort(sum);
                nqtb.setText(Long.toString(sum[9]));
            }
        });
    }
}