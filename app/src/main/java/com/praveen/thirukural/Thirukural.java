package com.praveen.thirukural;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Thirukural extends AppCompatActivity  {

    public TextView txt1;
    public TextView txt2;
    public TextView txt3;
    public TextView txt4;
    public TextView txt5;
    public TextView txt6;
    public TextView txt7;
    public TextView txt8;
    public TextView txt9;
    public TextView txt10;
    public TextView exp1;
    public TextView exp2;
    public TextView exp3;
    public TextView exp4;
    public TextView exp5;
    public TextView exp6;
    public TextView exp7;
    public TextView exp8;
    public TextView exp9;
    public TextView exp10;
    public TextView number1;
    public TextView number2;
    public TextView number3;
    public TextView number4;
    public TextView number5;
    public TextView number6;
    public TextView number7;
    public TextView number8;
    public TextView number9;
    public TextView number10;
    public  TextView txtpg;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kural);

        txt1 = (TextView) findViewById(R.id.kur1);
        txt2 = (TextView) findViewById(R.id.kur2);
        txt3 = (TextView) findViewById(R.id.kur3);
        txt4 = (TextView) findViewById(R.id.kur4);
        txt5 = (TextView) findViewById(R.id.kur5);
        txt6 = (TextView) findViewById(R.id.kur6);
        txt7 = (TextView) findViewById(R.id.kur7);
        txt8 = (TextView) findViewById(R.id.kur8);
        txt9 = (TextView) findViewById(R.id.kur9);
        txt10 = (TextView) findViewById(R.id.kur10);
        exp1 = (TextView)findViewById(R.id.exp1);
        exp2 = (TextView)findViewById(R.id.exp2);
        exp3 = (TextView)findViewById(R.id.exp3);
        exp4 = (TextView)findViewById(R.id.exp4);
        exp5 = (TextView)findViewById(R.id.exp5);
        exp6 = (TextView)findViewById(R.id.exp6);
        exp7 = (TextView)findViewById(R.id.exp7);
        exp8 = (TextView)findViewById(R.id.exp8);
        exp9 = (TextView)findViewById(R.id.exp9);
        exp10 = (TextView)findViewById(R.id.exp10);
        number1 = (TextView)findViewById(R.id.num1);
        number2 = (TextView)findViewById(R.id.num2);
        number3 = (TextView)findViewById(R.id.num3);
        number4 = (TextView)findViewById(R.id.num4);
        number5 = (TextView)findViewById(R.id.num5);
        number6 = (TextView)findViewById(R.id.num6);
        number7 = (TextView)findViewById(R.id.num7);
        number8 = (TextView)findViewById(R.id.num8);
        number9 = (TextView)findViewById(R.id.num9);
        number10 = (TextView)findViewById(R.id.num10);

        txtpg = (TextView)findViewById(R.id.textpage);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "font/verdana.ttf");
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "font/Constantia.ttf");
        Typeface typeface2 = Typeface.createFromAsset(getAssets(), "font/Cassandra.ttf");

        txtpg.setTypeface(typeface2);

        txt1.setTypeface(typeface);
        txt2.setTypeface(typeface);
        txt3.setTypeface(typeface);
        txt4.setTypeface(typeface);
        txt5.setTypeface(typeface);
        txt6.setTypeface(typeface);
        txt7.setTypeface(typeface);
        txt8.setTypeface(typeface);
        txt9.setTypeface(typeface);
        txt10.setTypeface(typeface);




        exp1.setTypeface(typeface1);
        exp2.setTypeface(typeface1);
        exp3.setTypeface(typeface1);
        exp4.setTypeface(typeface1);
        exp5.setTypeface(typeface1);
        exp6.setTypeface(typeface1);
        exp7.setTypeface(typeface1);
        exp8.setTypeface(typeface1);
        exp9.setTypeface(typeface1);
        exp10.setTypeface(typeface1);


        if(GlobalVar.getStr().equals("1")) {

            String[] categories = getResources().getStringArray(R.array.one);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 1);

        }
        else
        if(GlobalVar.getStr().equals("2"))
        {
            String[] categories = getResources().getStringArray(R.array.two);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 2);
        }
        if(GlobalVar.getStr().equals("3")) {

            String[] categories = getResources().getStringArray(R.array.three);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 3);

        }
        else
        if(GlobalVar.getStr().equals("4"))
        {
            String[] categories = getResources().getStringArray(R.array.four);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 4);
        }
        if(GlobalVar.getStr().equals("5")) {

            String[] categories = getResources().getStringArray(R.array.five);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 5);

        }
        else
        if(GlobalVar.getStr().equals("6"))
        {
            String[] categories = getResources().getStringArray(R.array.six);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 6);
        }
        if(GlobalVar.getStr().equals("7")) {

            String[] categories = getResources().getStringArray(R.array.seven);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 7);

        }
        else
        if(GlobalVar.getStr().equals("8"))
        {
            String[] categories = getResources().getStringArray(R.array.eight);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 8);
        }
        if(GlobalVar.getStr().equals("9")) {

            String[] categories = getResources().getStringArray(R.array.nine);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 9);

        }
        else
        if(GlobalVar.getStr().equals("10"))
        {
            String[] categories = getResources().getStringArray(R.array.onezero);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 10);
        }
        if(GlobalVar.getStr().equals("11")) {

            String[] categories = getResources().getStringArray(R.array.oneone);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 11);

        }
        else
        if(GlobalVar.getStr().equals("12"))
        {
            String[] categories = getResources().getStringArray(R.array.onetwo);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 12);
        }
        if(GlobalVar.getStr().equals("13")) {

            String[] categories = getResources().getStringArray(R.array.onethree);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 13);

        }
        else
        if(GlobalVar.getStr().equals("14"))
        {
            String[] categories = getResources().getStringArray(R.array.onefour);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 14);
        }
        if(GlobalVar.getStr().equals("15")) {

            String[] categories = getResources().getStringArray(R.array.onefive);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 15);

        }
        else
        if(GlobalVar.getStr().equals("16"))
        {
            String[] categories = getResources().getStringArray(R.array.onesix);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 16);
        }
        if(GlobalVar.getStr().equals("17")) {

            String[] categories = getResources().getStringArray(R.array.oneseven);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 17);

        }
        else
        if(GlobalVar.getStr().equals("18"))
        {
            String[] categories = getResources().getStringArray(R.array.oneeight);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 18);
        }
        if(GlobalVar.getStr().equals("19")) {

            String[] categories = getResources().getStringArray(R.array.onenine);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 19);

        }
        else
        if(GlobalVar.getStr().equals("20"))
        {
            String[] categories = getResources().getStringArray(R.array.twozero);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 20);
        }
        if(GlobalVar.getStr().equals("21")) {

            String[] categories = getResources().getStringArray(R.array.twoone);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 21);

        }
        else
        if(GlobalVar.getStr().equals("22"))
        {
            String[] categories = getResources().getStringArray(R.array.twotwo);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 22);
        }
        if(GlobalVar.getStr().equals("23")) {

            String[] categories = getResources().getStringArray(R.array.twothree);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 23);

        }
        else
        if(GlobalVar.getStr().equals("24"))
        {
            String[] categories = getResources().getStringArray(R.array.twofour);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 24);
        }
        if(GlobalVar.getStr().equals("25")) {

            String[] categories = getResources().getStringArray(R.array.twofive);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 25);

        }
        else
        if(GlobalVar.getStr().equals("26"))
        {
            String[] categories = getResources().getStringArray(R.array.twosix);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 26);
        }
        if(GlobalVar.getStr().equals("27")) {

            String[] categories = getResources().getStringArray(R.array.twoseven);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 27);

        }
        else
        if(GlobalVar.getStr().equals("28"))
        {
            String[] categories = getResources().getStringArray(R.array.twoeight);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 28);
        }
        if(GlobalVar.getStr().equals("29")) {

            String[] categories = getResources().getStringArray(R.array.twonine);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 29);

        }
        else
        if(GlobalVar.getStr().equals("30"))
        {
            String[] categories = getResources().getStringArray(R.array.threezero);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 30);
        }
        if(GlobalVar.getStr().equals("31")) {

            String[] categories = getResources().getStringArray(R.array.threeone);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 31);

        }
        else
        if(GlobalVar.getStr().equals("32"))
        {
            String[] categories = getResources().getStringArray(R.array.threetwo);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 32);
        }
        if(GlobalVar.getStr().equals("33")) {

            String[] categories = getResources().getStringArray(R.array.threethree);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 33);

        }
        else
        if(GlobalVar.getStr().equals("34"))
        {
            String[] categories = getResources().getStringArray(R.array.threefour);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 34);
        }
        if(GlobalVar.getStr().equals("35")) {

            String[] categories = getResources().getStringArray(R.array.threefive);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 35);

        }
        else
        if(GlobalVar.getStr().equals("36"))
        {
            String[] categories = getResources().getStringArray(R.array.threesix);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 36);
        }
        if(GlobalVar.getStr().equals("37")) {

            String[] categories = getResources().getStringArray(R.array.threeseven);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 37);

        }
        else
        if(GlobalVar.getStr().equals("38"))
        {
            String[] categories = getResources().getStringArray(R.array.threeeight);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 38);
        }
        if(GlobalVar.getStr().equals("39")) {

            String[] categories = getResources().getStringArray(R.array.threenine);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 39);

        }
        else
        if(GlobalVar.getStr().equals("40"))
        {
            String[] categories = getResources().getStringArray(R.array.fourzero);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 40);
        }
        else
        if(GlobalVar.getStr().equals("41"))
        {
            String[] categories = getResources().getStringArray(R.array.fourone);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 41);
        }
        else
        if(GlobalVar.getStr().equals("42"))
        {
            String[] categories = getResources().getStringArray(R.array.fourtwo);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 42);
        }
        else
        if(GlobalVar.getStr().equals("43"))
        {
            String[] categories = getResources().getStringArray(R.array.fourthree);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 43);
        }
        else
        if(GlobalVar.getStr().equals("44"))
        {
            String[] categories = getResources().getStringArray(R.array.fourfour);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 44);
        }
        else
        if(GlobalVar.getStr().equals("45"))
        {
            String[] categories = getResources().getStringArray(R.array.fourfive);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 45);
        }
        else
        if(GlobalVar.getStr().equals("46"))
        {
            String[] categories = getResources().getStringArray(R.array.foursix);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 46);
        }
        else
        if(GlobalVar.getStr().equals("47"))
        {
            String[] categories = getResources().getStringArray(R.array.fourseven);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 47);
        }
        else
        if(GlobalVar.getStr().equals("48"))
        {
            String[] categories = getResources().getStringArray(R.array.foureight);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 48);
        }
        else
        if(GlobalVar.getStr().equals("49"))
        {
            String[] categories = getResources().getStringArray(R.array.fournine);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 49);
        }
        else
        if(GlobalVar.getStr().equals("50"))
        {
            String[] categories = getResources().getStringArray(R.array.fivezero);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 40);
        }
        else
        if(GlobalVar.getStr().equals("51"))
        {
            String[] categories = getResources().getStringArray(R.array.fiveone);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 51);
        }
        else
        if(GlobalVar.getStr().equals("52"))
        {
            String[] categories = getResources().getStringArray(R.array.fivetwo);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 52);
        }
        else
        if(GlobalVar.getStr().equals("53"))
        {
            String[] categories = getResources().getStringArray(R.array.fivethree);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 53);
        }
        else
        if(GlobalVar.getStr().equals("54"))
        {
            String[] categories = getResources().getStringArray(R.array.fivefour);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 54);
        }
        else
        if(GlobalVar.getStr().equals("55"))
        {
            String[] categories = getResources().getStringArray(R.array.fivefive);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 55);
        }
        else
        if(GlobalVar.getStr().equals("56"))
        {
            String[] categories = getResources().getStringArray(R.array.fivesix);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 56);
        }
        else
        if(GlobalVar.getStr().equals("57"))
        {
            String[] categories = getResources().getStringArray(R.array.fiveseven);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 57);
        }
        else
        if(GlobalVar.getStr().equals("58"))
        {
            String[] categories = getResources().getStringArray(R.array.fiveeight);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 58);
        }
        else
        if(GlobalVar.getStr().equals("59"))
        {
            String[] categories = getResources().getStringArray(R.array.fivenine);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 59);
        }
        else
        if(GlobalVar.getStr().equals("60"))
        {
            String[] categories = getResources().getStringArray(R.array.sixzero);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 60);
        }
        else
        if(GlobalVar.getStr().equals("61"))
        {
            String[] categories = getResources().getStringArray(R.array.sixone);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 61);
        }
        else
        if(GlobalVar.getStr().equals("62"))
        {
            String[] categories = getResources().getStringArray(R.array.sixtwo);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 62);
        }
        else
        if(GlobalVar.getStr().equals("63"))
        {
            String[] categories = getResources().getStringArray(R.array.sixthree);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 63);
        }
        else
        if(GlobalVar.getStr().equals("64"))
        {
            String[] categories = getResources().getStringArray(R.array.sixfour);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 64);
        }
        else
        if(GlobalVar.getStr().equals("65"))
        {
            String[] categories = getResources().getStringArray(R.array.sixfive);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 65);
        }
        else
        if(GlobalVar.getStr().equals("66"))
        {
            String[] categories = getResources().getStringArray(R.array.sixsix);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 66);
        }
        else
        if(GlobalVar.getStr().equals("67"))
        {
            String[] categories = getResources().getStringArray(R.array.sixseven);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 67);
        }
        else
        if(GlobalVar.getStr().equals("68"))
        {
            String[] categories = getResources().getStringArray(R.array.sixeight);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 68);
        }
        else
        if(GlobalVar.getStr().equals("69"))
        {
            String[] categories = getResources().getStringArray(R.array.sixnine);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 69);
        }
        else
        if(GlobalVar.getStr().equals("70"))
        {
            String[] categories = getResources().getStringArray(R.array.sevenzero);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 70);
        }
        else
        if(GlobalVar.getStr().equals("71"))
        {
            String[] categories = getResources().getStringArray(R.array.sevenone);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 71);
        }
        else
        if(GlobalVar.getStr().equals("72"))
        {
            String[] categories = getResources().getStringArray(R.array.seventwo);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 72);
        }
        else
        if(GlobalVar.getStr().equals("73"))
        {
            String[] categories = getResources().getStringArray(R.array.seventhree);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 73);
        }
        else
        if(GlobalVar.getStr().equals("74"))
        {
            String[] categories = getResources().getStringArray(R.array.sevenfour);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 74);
        }
        else
        if(GlobalVar.getStr().equals("75"))
        {
            String[] categories = getResources().getStringArray(R.array.sevenfive);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 75);
        }
        else
        if(GlobalVar.getStr().equals("76"))
        {
            String[] categories = getResources().getStringArray(R.array.sevensix);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 76);
        }
        else
        if(GlobalVar.getStr().equals("77"))
        {
            String[] categories = getResources().getStringArray(R.array.sevenseven);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 77);
        }
        else
        if(GlobalVar.getStr().equals("78"))
        {
            String[] categories = getResources().getStringArray(R.array.seveneight);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 78);
        }
        else
        if(GlobalVar.getStr().equals("79"))
        {
            String[] categories = getResources().getStringArray(R.array.sevennine);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 79);
        }
        else
        if(GlobalVar.getStr().equals("80"))
        {
            String[] categories = getResources().getStringArray(R.array.eightzero);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 80);
        }
        else
        if(GlobalVar.getStr().equals("81"))
        {
            String[] categories = getResources().getStringArray(R.array.eightone);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 81);
        }
        else
        if(GlobalVar.getStr().equals("82"))
        {
            String[] categories = getResources().getStringArray(R.array.eighttwo);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 82);
        }
        else
        if(GlobalVar.getStr().equals("83"))
        {
            String[] categories = getResources().getStringArray(R.array.eightthree);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 83);
        }
        else
        if(GlobalVar.getStr().equals("84"))
        {
            String[] categories = getResources().getStringArray(R.array.eightfour);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 84);
        }
        else
        if(GlobalVar.getStr().equals("85"))
        {
            String[] categories = getResources().getStringArray(R.array.eightfive);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 85);
        }
        else
        if(GlobalVar.getStr().equals("86"))
        {
            String[] categories = getResources().getStringArray(R.array.eightsix);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 86);
        }
        else
        if(GlobalVar.getStr().equals("87"))
        {
            String[] categories = getResources().getStringArray(R.array.eightseven);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 87);
        }
        else
        if(GlobalVar.getStr().equals("88"))
        {
            String[] categories = getResources().getStringArray(R.array.eighteight);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 88);
        }
        else
        if(GlobalVar.getStr().equals("89"))
        {
            String[] categories = getResources().getStringArray(R.array.eightnine);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 89);
        }
        else
        if(GlobalVar.getStr().equals("90"))
        {
            String[] categories = getResources().getStringArray(R.array.ninezero);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 90);
        }
        else
        if(GlobalVar.getStr().equals("91"))
        {
            String[] categories = getResources().getStringArray(R.array.nineone);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 91);
        }
        else
        if(GlobalVar.getStr().equals("92"))
        {
            String[] categories = getResources().getStringArray(R.array.ninetwo);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 92);
        }
        else
        if(GlobalVar.getStr().equals("93"))
        {
            String[] categories = getResources().getStringArray(R.array.ninethree);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 93);
        }
        else
        if(GlobalVar.getStr().equals("94"))
        {
            String[] categories = getResources().getStringArray(R.array.ninefour);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 94);
        }
        else
        if(GlobalVar.getStr().equals("95"))
        {
            String[] categories = getResources().getStringArray(R.array.ninefive);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 95);
        }
        else
        if(GlobalVar.getStr().equals("96"))
        {
            String[] categories = getResources().getStringArray(R.array.ninesix);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 96);
        }
        else
        if(GlobalVar.getStr().equals("97"))
        {
            String[] categories = getResources().getStringArray(R.array.nineseven);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 97);
        }
        else
        if(GlobalVar.getStr().equals("98"))
        {
            String[] categories = getResources().getStringArray(R.array.nineeight);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 98);
        }
        else
        if(GlobalVar.getStr().equals("99"))
        {
            String[] categories = getResources().getStringArray(R.array.ninenine);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 78);
        }
        else
        if(GlobalVar.getStr().equals("100"))
        {
            String[] categories = getResources().getStringArray(R.array.onezerozero);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 100);
        }
        else
        if(GlobalVar.getStr().equals("101"))
        {
            String[] categories = getResources().getStringArray(R.array.onezeroone);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 101);
        }
        else
        if(GlobalVar.getStr().equals("102"))
        {
            String[] categories = getResources().getStringArray(R.array.onezerotwo);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 102);
        }
        else
        if(GlobalVar.getStr().equals("103"))
        {
            String[] categories = getResources().getStringArray(R.array.onezerothree);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 103);
        }
        else
        if(GlobalVar.getStr().equals("104"))
        {
            String[] categories = getResources().getStringArray(R.array.onezerofour);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 104);
        }
        else
        if(GlobalVar.getStr().equals("105"))
        {
            String[] categories = getResources().getStringArray(R.array.onezerofive);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 105);
        }
        else
        if(GlobalVar.getStr().equals("106"))
        {
            String[] categories = getResources().getStringArray(R.array.onezerosix);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 106);
        }
        else
        if(GlobalVar.getStr().equals("107"))
        {
            String[] categories = getResources().getStringArray(R.array.onezeroseven);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 107);
        }
        else
        if(GlobalVar.getStr().equals("108"))
        {
            String[] categories = getResources().getStringArray(R.array.onezeroeight);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 108);
        }
        else
        if(GlobalVar.getStr().equals("109"))
        {
            String[] categories = getResources().getStringArray(R.array.onezeronine);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 109);
        }
        else
        if(GlobalVar.getStr().equals("110"))
        {
            String[] categories = getResources().getStringArray(R.array.oneonezero);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 110);
        }
        else
        if(GlobalVar.getStr().equals("111"))
        {
            String[] categories = getResources().getStringArray(R.array.oneoneone);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 111);
        }
        else
        if(GlobalVar.getStr().equals("112"))
        {
            String[] categories = getResources().getStringArray(R.array.oneonetwo);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 112);
        }
        else
        if(GlobalVar.getStr().equals("113"))
        {
            String[] categories = getResources().getStringArray(R.array.oneonethree);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 113);
        }
        else
        if(GlobalVar.getStr().equals("114"))
        {
            String[] categories = getResources().getStringArray(R.array.oneonefour);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 114);
        }
        else
        if(GlobalVar.getStr().equals("115"))
        {
            String[] categories = getResources().getStringArray(R.array.oneonefive);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 115);
        }
        else
        if(GlobalVar.getStr().equals("116"))
        {
            String[] categories = getResources().getStringArray(R.array.oneonesix);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 116);
        }
        else
        if(GlobalVar.getStr().equals("117"))
        {
            String[] categories = getResources().getStringArray(R.array.oneoneseven);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 117);
        }
        else
        if(GlobalVar.getStr().equals("118"))
        {
            String[] categories = getResources().getStringArray(R.array.oneoneeight);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 118);
        }
        else
        if(GlobalVar.getStr().equals("119"))
        {
            String[] categories = getResources().getStringArray(R.array.oneonenine);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 119);
        }
        else
        if(GlobalVar.getStr().equals("120"))
        {
            String[] categories = getResources().getStringArray(R.array.onetwozero);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 120);
        }
        else
        if(GlobalVar.getStr().equals("121"))
        {
            String[] categories = getResources().getStringArray(R.array.onetwoone);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 121);
        }
        else
        if(GlobalVar.getStr().equals("122"))
        {
            String[] categories = getResources().getStringArray(R.array.onetwotwo);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 122);
        }
        else
        if(GlobalVar.getStr().equals("123"))
        {
            String[] categories = getResources().getStringArray(R.array.onetwothree);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 123);
        }
        else
        if(GlobalVar.getStr().equals("124"))
        {
            String[] categories = getResources().getStringArray(R.array.onetwofour);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 124);
        }
        else
        if(GlobalVar.getStr().equals("125"))
        {
            String[] categories = getResources().getStringArray(R.array.onetwofive);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 125);
        }
        else
        if(GlobalVar.getStr().equals("126"))
        {
            String[] categories = getResources().getStringArray(R.array.onetwosix);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 126);
        }
        else
        if(GlobalVar.getStr().equals("127"))
        {
            String[] categories = getResources().getStringArray(R.array.onetwoseven);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 127);
        }
        else
        if(GlobalVar.getStr().equals("128"))
        {
            String[] categories = getResources().getStringArray(R.array.onetwoeight);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 128);
        }
        else
        if(GlobalVar.getStr().equals("129"))
        {
            String[] categories = getResources().getStringArray(R.array.onetwonine);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 129);
        }
        else
        if(GlobalVar.getStr().equals("130"))
        {
            String[] categories = getResources().getStringArray(R.array.onethreezero);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 130);
        }
        else
        if(GlobalVar.getStr().equals("131"))
        {
            String[] categories = getResources().getStringArray(R.array.onethreeone);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 131);
        }
        else
        if(GlobalVar.getStr().equals("132"))
        {
            String[] categories = getResources().getStringArray(R.array.onethreetwo);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 132);
        }
        else
        if(GlobalVar.getStr().equals("133"))
        {
            String[] categories = getResources().getStringArray(R.array.onethreethree);
            List<String> stringList = new ArrayList<>(Arrays.asList(categories));
            setKural(stringList, 133);
        }
    }

    private void setKural( List<String> stringList, int num) {
        num = num-1;

        number1.setText(Integer.toString(num*10+1));
        number2.setText(Integer.toString(num*10+2));
        number3.setText(Integer.toString(num*10+3));
        number4.setText(Integer.toString(num*10+4));
        number5.setText(Integer.toString(num*10+5));
        number6.setText(Integer.toString(num*10+6));
        number7.setText(Integer.toString(num*10+7));
        number8.setText(Integer.toString(num*10+8));
        number9.setText(Integer.toString(num*10+9));
        number10.setText(Integer.toString(num*10+10));

        exp1.setText(stringList.get(1));
        exp2.setText(stringList.get(3));
        exp3.setText(stringList.get(5));
        exp4.setText(stringList.get(7));
        exp5.setText(stringList.get(9));
        exp6.setText(stringList.get(11));
        exp7.setText(stringList.get(13));
        exp8.setText(stringList.get(15));
        exp9.setText(stringList.get(17));
        exp10.setText(stringList.get(19));

        txt1.setText(stringList.get(0));
        txt2.setText(stringList.get(2));
        txt3.setText(stringList.get(4));
        txt4.setText(stringList.get(6));
        txt5.setText(stringList.get(8));
        txt6.setText(stringList.get(10));
        txt7.setText(stringList.get(12));
        txt8.setText(stringList.get(14));
        txt9.setText(stringList.get(16));
        txt10.setText(stringList.get(18));

        txtpg.setText(GlobalVar.getPageName());
    }
}
