package edu.jbishop.resistancecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    double B1, B2, m, t, resistance = 0;
    Spinner band1, band2, multiplier, tolerance;
    TextView display, band1n, band2n, multin, tolern;
    ImageView iband1, iband2, imultiplier, itolerance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //gets all of the design elements
        display = findViewById(R.id.display);
        iband1 = findViewById(R.id.iband1);
        iband2 = findViewById(R.id.iband2);
        imultiplier = findViewById(R.id.imultiplier);
        itolerance = findViewById(R.id.itolerance);
        band1n = findViewById(R.id.tv_band1_number);
        band2n = findViewById(R.id.tv_band2_number);
        multin = findViewById(R.id.tv_multiplier_number);
        tolern = findViewById(R.id.tv_tolerance_number);
        band1 = findViewById(R.id.Band1);
        band2 = findViewById(R.id.Band2);
        multiplier = findViewById(R.id.Multiplier);
        tolerance = findViewById(R.id.tolerance);


        /*this was used for setting the spinners as colours instead of text.
        band1.setAdapter(new SpinnerAdaptorBand(this));
        band2.setAdapter(new SpinnerAdaptorBand(this));
        multiplier.setAdapter(new SpinnerAdaptorMultiplier(this));
        tolerance.setAdapter(new SpinnerAdaptorTolerance(this));*/

        //these are what sets the values for the calculation the colour set and the number indicator.
        //each just holds a giant switch statement.
        band1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                switch (position) {
                    case 1:
                        B1 = 0;
                        iband1.setBackgroundResource(R.color.black);
                        band1n.setText("0");

                        break;
                    case 2:
                        B1 = 1;
                        iband1.setBackgroundResource(R.color.brown);
                        band1n.setText("1");
                        break;
                    case 3:
                        B1 = 2;
                        iband1.setBackgroundResource(R.color.red);
                        band1n.setText("2");

                        break;
                    case 4:
                        B1 = 3;
                        iband1.setBackgroundResource(R.color.orange);
                        band1n.setText("3");
                        break;
                    case 5:
                        B1 = 4;
                        iband1.setBackgroundResource(R.color.yellow);
                        band1n.setText("4");
                        break;
                    case 6:
                        B1 = 5;
                        iband1.setBackgroundResource(R.color.green);
                        band1n.setText("5");
                        break;
                    case 7:
                        B1 = 6;
                        iband1.setBackgroundResource(R.color.blue);
                        band1n.setText("6");
                        break;
                    case 8:
                        B1 = 7;
                        iband1.setBackgroundResource(R.color.violet);
                        band1n.setText("7");
                        break;
                    case 9:
                        B1 = 8;
                        iband1.setBackgroundResource(R.color.gray);
                        band1n.setText("8");
                        break;
                    case 10:
                        B1 = 9;
                        iband1.setBackgroundResource(R.color.white);
                        band1n.setText("9");
                        break;


                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        band2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        B2 = 0;
                        iband2.setBackgroundResource(R.color.black);
                        band2n.setText("0");
                        break;
                    case 2:
                        B2 = 1;
                        iband2.setBackgroundResource(R.color.brown);
                        band2n.setText("1");
                        break;
                    case 3:
                        B2 = 2;
                        iband2.setBackgroundResource(R.color.red);
                        band2n.setText("2");
                        break;
                    case 4:
                        B2 = 3;
                        iband2.setBackgroundResource(R.color.orange);
                        band2n.setText("3");
                        break;
                    case 5:
                        B2 = 4;
                        iband2.setBackgroundResource(R.color.yellow);
                        band2n.setText("4");
                        break;
                    case 6:
                        B2 = 5;
                        iband2.setBackgroundResource(R.color.green);
                        band2n.setText("5");
                        break;
                    case 7:
                        B2 = 6;
                        iband2.setBackgroundResource(R.color.blue);
                        band2n.setText("6");
                        break;
                    case 8:
                        B2 = 7;
                        iband2.setBackgroundResource(R.color.violet);
                        band2n.setText("7");
                        break;
                    case 9:
                        B2 = 8;
                        iband2.setBackgroundResource(R.color.gray);
                        band2n.setText("8");
                        break;
                    case 10:
                        B2 = 9;
                        iband2.setBackgroundResource(R.color.white);
                        band2n.setText("9");
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        multiplier.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        m = 1;
                        imultiplier.setBackgroundResource(R.color.black);
                        multin.setText("1 Ω");
                        break;
                    case 2:
                        m = 10;
                        imultiplier.setBackgroundResource(R.color.brown);
                        multin.setText("10 Ω");
                        break;
                    case 3:
                        m = 100;
                        imultiplier.setBackgroundResource(R.color.red);
                        multin.setText("100 Ω");
                        break;
                    case 4:
                        m = 1000;
                        imultiplier.setBackgroundResource(R.color.orange);
                        multin.setText("1k Ω");
                        break;
                    case 5:
                        m = 10000;
                        imultiplier.setBackgroundResource(R.color.yellow);
                        multin.setText("10k Ω");
                        break;
                    case 6:
                        m = 100000;
                        imultiplier.setBackgroundResource(R.color.green);
                        multin.setText("100k Ω");
                        break;
                    case 7:
                        m = 1000000;
                        imultiplier.setBackgroundResource(R.color.blue);
                        multin.setText("1m Ω");
                        break;
                    case 8:
                        m = 10000000;
                        imultiplier.setBackgroundResource(R.color.violet);
                        multin.setText("10m Ω");
                        break;
                    case 9:
                        m = 100000000;
                        imultiplier.setBackgroundResource(R.color.gray);
                        multin.setText("100m Ω");
                        break;
                    case 10:
                        m = 1000000000;
                        imultiplier.setBackgroundResource(R.color.white);
                        multin.setText("1g Ω");
                        break;
                    case 11:
                        m = 0.1;
                        imultiplier.setBackgroundResource(R.color.gold);
                        multin.setText("0.1 Ω");
                        break;
                    case 12:
                        m = 0.01;
                        imultiplier.setBackgroundResource(R.color.silver);
                        multin.setText("0.01 Ω");
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        tolerance.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        t = 1;
                        itolerance.setBackgroundResource(R.color.brown);
                        tolern.setText("± 1%");
                        break;
                    case 2:
                        t = 2;
                        itolerance.setBackgroundResource(R.color.red);
                        tolern.setText("± 2%");
                        break;
                    case 3:
                        t = 0.5;
                        itolerance.setBackgroundResource(R.color.green);
                        tolern.setText("± .5%");
                        break;
                    case 4:
                        t = 0.25;
                        itolerance.setBackgroundResource(R.color.blue);
                        tolern.setText("± .25%");
                    case 5:
                        t = 0.1;
                        itolerance.setBackgroundResource(R.color.violet);
                        tolern.setText("± .1%");
                        break;
                    case 6:
                        t = 0.05;
                        itolerance.setBackgroundResource(R.color.gray);
                        tolern.setText("± .05%");
                        break;
                    case 7:
                        t = 5.0;
                        itolerance.setBackgroundResource(R.color.gold);
                        tolern.setText("± 5%");
                        break;
                    case 8:
                        t = 10;
                        itolerance.setBackgroundResource(R.color.silver);
                        tolern.setText("± 10%");
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    //resets everything back to default
    public void Reset(View view) {
        band1.setSelection(0);
        band2.setSelection(0);
        multiplier.setSelection(0);
        tolerance.setSelection(0);
        display.setText("resistance value: ");
        iband1.setBackgroundResource(0);
        iband2.setBackgroundResource(0);
        imultiplier.setBackgroundResource(0);
        itolerance.setBackgroundResource(0);
        band1n.setText("");
        band2n.setText("");
        multin.setText("");
        tolern.setText("");
    }

    //calculates the resistance based on the spinner selection and displays in a textView.
    public void doCalculation(View view) {

        resistance = ((B1 * 10) + B2) * m;

        display.setText("resistance value: " + resistance + "Ω" + " ±" + t + "%");

    }
}

/*this code was for setting the spinners to colours instead of text.
changed to using text as i couldn't get text and the background colours to work together.*/
/*
class SpinnerAdaptorBand extends BaseAdapter{


    ArrayList<Integer> bands ;
    Context context;

    public SpinnerAdaptorBand(Context context)
    {
        this.context=context;
        bands= new ArrayList<Integer>();
        int[] retrieve;
        retrieve = context.getResources().getIntArray(R.array.bands);

        for(int re:retrieve) {
            bands.add(re);

        }



    }
    @Override
    public int getCount() {
        return bands.size();
    }

    @Override
    public Object getItem(int position) {
        return bands.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        view=inflater.inflate(android.R.layout.simple_spinner_dropdown_item, null);
        TextView txv=(TextView)view.findViewById(android.R.id.text1);
        txv.setBackgroundColor(bands.get(position));
        txv.setPadding(5,5,5,5);
        txv.setTextSize(20f);


        return view;
    }
}
class SpinnerAdaptorMultiplier extends BaseAdapter{


    ArrayList<Integer> multiplier ;
    Context context;

    public SpinnerAdaptorMultiplier(Context context)
    {
        this.context=context;
        multiplier= new ArrayList<Integer>();
        int[] retrieve;
        retrieve = context.getResources().getIntArray(R.array.Multiplier);

        for(int re:retrieve) {
            multiplier.add(re);

        }



    }
    @Override
    public int getCount() {
        return multiplier.size();
    }

    @Override
    public Object getItem(int position) {
        return multiplier.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        view=inflater.inflate(android.R.layout.simple_spinner_dropdown_item, null);
        TextView txv=(TextView)view.findViewById(android.R.id.text1);
        txv.setBackgroundColor(multiplier.get(position));
        txv.setPadding(5,5,5,5);
        txv.setTextSize(20f);


        return view;
    }
}
class SpinnerAdaptorTolerance extends BaseAdapter{


    ArrayList<Integer> Tolerance ;
    Context context;

    public SpinnerAdaptorTolerance(Context context)
    {
        this.context=context;
        Tolerance= new ArrayList<Integer>();
        int[] retrieve;
        retrieve = context.getResources().getIntArray(R.array.Tolerance);

        for(int re:retrieve) {
            Tolerance.add(re);

        }



    }
    @Override
    public int getCount() {
        return Tolerance.size();
    }

    @Override
    public Object getItem(int position) {
        return Tolerance.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        view=inflater.inflate(android.R.layout.simple_spinner_dropdown_item, null);
        TextView txv=(TextView)view.findViewById(android.R.id.text1);
        txv.setBackgroundColor(Tolerance.get(position));
        txv.setPadding(5,5,5,5);
        txv.setTextSize(20f);


        return view;
    }
}*/
