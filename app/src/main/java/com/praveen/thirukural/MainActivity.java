package com.praveen.thirukural;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Switch switch1;
    ListView listView;

    String[] sTitle = {"1. The Praise of God", "2. The Excellence of Rain",
            "3. The Greatness of Ascetics", "4. Assertion of the Strength of Virtue",
            "5. Domestic Life", "6. The Goodness of the Help to Domestic Life",
            "7. The Obtaining of Sons", "8. The Possession of Love", "9. Cherishing Guests",
            "10. The Utterance of Pleasant Words", "11. The Knowledge of Benefits Conferred: Gratitude",
            "12. Impartiality", "13. The Possession of Self-restraint", "14. The Possession of Decorum",
            "15. Not coveting another's Wife", "16. The Possession of Patience, Forbearance",
            "17. Not Envying", "18. Not Coveting", "19. Not Backbiting", "20. The Not Speaking Profitless Words",
            "21. Dread of Evil Deeds", "22. The knowledge of what is Befitting a Man's Position",
            "23. Giving", "24. Renown", "25. The Possession of Benevolence", "26. The Renunciation of Flesh",
            "27. Penance", "28. Inconsistent Conduct", "29. The Absence of Fraud", "30. Veracity",
            "31. The not being Angry", "32. Not doing Evil", "33. Not killing", "34. Instability",
            "35. Renunciation", "36. Knowledge of the True", "37. The Extirpation of Desire",
            "38. Fate", "39. The Greatness of a King", "40. Learning",
            "41. Ignorance", "42. Hearing", "43. The Possession of Knowledge",
            "44. The Correction of Faults", "45. Seeking the Aid of Great Men",
            "46. Avoiding mean Associations", "47. Acting after due Consideration",
            "48. The Knowledge of Power", "49. Knowing the fitting Time", "50. Knowing the Place",
            "51. Selection and Confidence", "52. Selection and Employment", "53. Cherishing one's Kindred",
            "54. Unforgetfulness", "55. The Right Sceptre", "56. The Cruel Sceptre",
            "57. Absence of 'Terrorism", "58. Benignity", "59. Detectives", "60. Energy",
            "61. Unsluggishness", "62. Manly Effort", "63. Hopefulness in Trouble",
            "64. The Office of Minister of state", "65. Power in Speech", "66. Purity in Action",
            "67. Power in Action", "68.Modes of Action ", "69. The Envoy", "70. Conduct in the Presence of the King", "71. The Knowledge of Indications",
            "72. The Knowledge of the Council Chamber", "73. Not to dread the Council", "74. The Land", "75. The Fortification",
            "76. Way of Accumulating Wealth", "77. The Excellence of an Army", "78. Military Spirit",
            "79. Friendship", "80. Investigation in forming Friendships", "81. Familiarity",
            "82. Evil Friendship", "83. Unreal Friendship", "84. Folly", "85. Ignorance",
            "86. Hostility", "87. The Might of Hatred", "88. Knowing the Quality of Hate", "89. Enmity within",
            "90. Not Offending the Great", "91. Being led by Women", "92. Wanton Women",
            "93. Not Drinking Palm-Wine", "94. Gaming (Gambling)", "95. Medicine", "96. Nobility",
            "97. Honour", "98. Greatness", "99. Perfectness", "100. Courtesy",
            "101. Wealth without Benefaction", "102. Shame", "103. The Way of Maintaining the Family", "104. Agriculture", "105. Poverty", "106. Mendicancy",
            "107. The Dread of Mendicancy", "108. Baseness", "109. Mental Disturbance caused by the Beauty of the Princess",
            "110. Recognition of the Signs (of Mutual Love)", "111. Rejoicing in the Embrace", "112. The Praise of her Beauty", "113. Declaration of Love's special Excellence",
            "114. The Abandonment of Reserve", "115. The Announcement of the Rumour", "116. Separation unendurable",
            "117. Complainings", "118. Eyes consumed with Grief", "119. The Pallid Hue", "120. The Solitary Anguish",
            "121. Sad Memories", "122. The Visions of the Night", "123. Lamentations at Eventide", "124. Wasting Away", "125. Soliloquy",
            "126. Reserve Overcome", "127. Mutual Desire", "128. The Reading of the Signs", "129. Desire for Reunion",
            "130. Expostulation with Oneself", "131. Pouting", "132. Feigned Anger", "133. The Pleasures of 'Temporary Variance'"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        listView.setVerticalScrollBarEnabled(false);
        MyAdapter adapter = new MyAdapter(this, sTitle, 0);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                switch (position) {
                    case 0:
                        GlobalVar.setPageName(sTitle[0]);
                        GlobalVar.setStr("1");
                        break;
                    case 1:
                        GlobalVar.setPageName(sTitle[1]);
                        GlobalVar.setStr("2");
                        break;
                    case 2:
                        GlobalVar.setPageName(sTitle[2]);
                        GlobalVar.setStr("3");
                        break;
                    case 3:
                        GlobalVar.setPageName(sTitle[3]);
                        GlobalVar.setStr("4");
                        break;
                    case 4:
                        GlobalVar.setPageName(sTitle[4]);
                        GlobalVar.setStr("5");
                        break;
                    case 5:
                        GlobalVar.setPageName(sTitle[5]);
                        GlobalVar.setStr("6");
                        break;
                    case 6:
                        GlobalVar.setPageName(sTitle[6]);
                        GlobalVar.setStr("7");
                        break;
                    case 7:
                        GlobalVar.setPageName(sTitle[7]);
                        GlobalVar.setStr("8");
                        break;
                    case 8:
                        GlobalVar.setPageName(sTitle[8]);
                        GlobalVar.setStr("9");
                        break;
                    case 9:
                        GlobalVar.setPageName(sTitle[9]);
                        GlobalVar.setStr("10");
                        break;
                    case 10:
                        GlobalVar.setPageName(sTitle[10]);
                        GlobalVar.setStr("11");
                        break;
                    case 11:
                        GlobalVar.setPageName(sTitle[11]);
                        GlobalVar.setStr("12");
                        break;
                    case 12:
                        GlobalVar.setPageName(sTitle[12]);
                        GlobalVar.setStr("13");
                        break;
                    case 13:
                        GlobalVar.setPageName(sTitle[13]);
                        GlobalVar.setStr("14");
                        break;
                    case 14:
                        GlobalVar.setPageName(sTitle[14]);
                        GlobalVar.setStr("15");
                        break;
                    case 15:
                        GlobalVar.setPageName(sTitle[15]);
                        GlobalVar.setStr("16");
                        break;
                    case 16:
                        GlobalVar.setPageName(sTitle[16]);
                        GlobalVar.setStr("17");
                        break;
                    case 17:
                        GlobalVar.setPageName(sTitle[17]);
                        GlobalVar.setStr("18");
                        break;
                    case 18:
                        GlobalVar.setPageName(sTitle[18]);
                        GlobalVar.setStr("19");
                        break;
                    case 19:
                        GlobalVar.setPageName(sTitle[19]);
                        GlobalVar.setStr("20");
                        break;
                    case 20:
                        GlobalVar.setPageName(sTitle[20]);
                        GlobalVar.setStr("21");
                        break;
                    case 21:
                        GlobalVar.setPageName(sTitle[21]);
                        GlobalVar.setStr("22");
                        break;
                    case 22:
                        GlobalVar.setPageName(sTitle[22]);
                        GlobalVar.setStr("23");
                        break;
                    case 23:
                        GlobalVar.setPageName(sTitle[23]);
                        GlobalVar.setStr("24");
                        break;
                    case 24:
                        GlobalVar.setPageName(sTitle[24]);
                        GlobalVar.setStr("25");
                        break;
                    case 25:
                        GlobalVar.setPageName(sTitle[25]);
                        GlobalVar.setStr("26");
                        break;
                    case 26:
                        GlobalVar.setPageName(sTitle[26]);
                        GlobalVar.setStr("27");
                        break;
                    case 27:
                        GlobalVar.setPageName(sTitle[27]);
                        GlobalVar.setStr("28");
                        break;
                    case 28:
                        GlobalVar.setPageName(sTitle[28]);
                        GlobalVar.setStr("29");
                        break;
                    case 29:
                        GlobalVar.setPageName(sTitle[29]);
                        GlobalVar.setStr("30");
                        break;
                    case 30:
                        GlobalVar.setPageName(sTitle[30]);
                        GlobalVar.setStr("31");
                        break;
                    case 31:
                        GlobalVar.setPageName(sTitle[31]);
                        GlobalVar.setStr("32");
                        break;
                    case 32:
                        GlobalVar.setPageName(sTitle[32]);
                        GlobalVar.setStr("33");
                        break;
                    case 33:
                        GlobalVar.setPageName(sTitle[33]);
                        GlobalVar.setStr("34");
                        break;
                    case 34:
                        GlobalVar.setPageName(sTitle[34]);
                        GlobalVar.setStr("35");
                        break;
                    case 35:
                        GlobalVar.setPageName(sTitle[35]);
                        GlobalVar.setStr("36");
                        break;
                    case 36:
                        GlobalVar.setPageName(sTitle[36]);
                        GlobalVar.setStr("37");
                        break;
                    case 37:
                        GlobalVar.setPageName(sTitle[37]);
                        GlobalVar.setStr("38");
                        break;
                    case 38:
                        GlobalVar.setPageName(sTitle[38]);
                        GlobalVar.setStr("39");
                        break;
                    case 39:
                        GlobalVar.setPageName(sTitle[39]);
                        GlobalVar.setStr("40");
                        break;
                    case 40:
                        GlobalVar.setPageName(sTitle[40]);
                        GlobalVar.setStr("41");
                        break;
                    case 41:
                        GlobalVar.setPageName(sTitle[41]);
                        GlobalVar.setStr("42");
                        break;
                    case 42:
                        GlobalVar.setPageName(sTitle[42]);
                        GlobalVar.setStr("43");
                        break;
                    case 43:
                        GlobalVar.setPageName(sTitle[43]);
                        GlobalVar.setStr("44");
                        break;
                    case 44:
                        GlobalVar.setPageName(sTitle[44]);
                        GlobalVar.setStr("45");
                        break;
                    case 45:
                        GlobalVar.setPageName(sTitle[45]);
                        GlobalVar.setStr("46");
                        break;
                    case 46:
                        GlobalVar.setPageName(sTitle[46]);
                        GlobalVar.setStr("47");
                        break;
                    case 47:
                        GlobalVar.setPageName(sTitle[47]);
                        GlobalVar.setStr("48");
                        break;
                    case 48:
                        GlobalVar.setPageName(sTitle[48]);
                        GlobalVar.setStr("49");
                        break;
                    case 49:
                        GlobalVar.setPageName(sTitle[49]);
                        GlobalVar.setStr("50");
                        break;
                    case 50:
                        GlobalVar.setPageName(sTitle[50]);
                        GlobalVar.setStr("51");
                        break;
                    case 51:
                        GlobalVar.setPageName(sTitle[51]);
                        GlobalVar.setStr("52");
                        break;
                    case 52:
                        GlobalVar.setPageName(sTitle[52]);
                        GlobalVar.setStr("53");
                        break;
                    case 53:
                        GlobalVar.setPageName(sTitle[53]);
                        GlobalVar.setStr("54");
                        break;
                    case 54:
                        GlobalVar.setPageName(sTitle[54]);
                        GlobalVar.setStr("55");
                        break;
                    case 55:
                        GlobalVar.setPageName(sTitle[55]);
                        GlobalVar.setStr("56");
                        break;
                    case 56:
                        GlobalVar.setPageName(sTitle[56]);
                        GlobalVar.setStr("57");
                        break;
                    case 57:
                        GlobalVar.setPageName(sTitle[57]);
                        GlobalVar.setStr("58");
                        break;
                    case 58:
                        GlobalVar.setPageName(sTitle[58]);
                        GlobalVar.setStr("59");
                        break;
                    case 59:
                        GlobalVar.setPageName(sTitle[59]);
                        GlobalVar.setStr("60");
                        break;
                    case 60:
                        GlobalVar.setPageName(sTitle[60]);
                        GlobalVar.setStr("61");
                        break;
                    case 61:
                        GlobalVar.setPageName(sTitle[61]);
                        GlobalVar.setStr("62");
                        break;
                    case 62:
                        GlobalVar.setPageName(sTitle[62]);
                        GlobalVar.setStr("63");
                        break;
                    case 63:
                        GlobalVar.setPageName(sTitle[63]);
                        GlobalVar.setStr("64");
                        break;
                    case 64:
                        GlobalVar.setPageName(sTitle[64]);
                        GlobalVar.setStr("65");
                        break;
                    case 65:
                        GlobalVar.setPageName(sTitle[65]);
                        GlobalVar.setStr("66");
                        break;
                    case 66:
                        GlobalVar.setPageName(sTitle[66]);
                        GlobalVar.setStr("67");
                        break;
                    case 67:
                        GlobalVar.setPageName(sTitle[67]);
                        GlobalVar.setStr("68");
                        break;
                    case 68:
                        GlobalVar.setPageName(sTitle[68]);
                        GlobalVar.setStr("69");
                        break;
                    case 69:
                        GlobalVar.setPageName(sTitle[69]);
                        GlobalVar.setStr("70");
                        break;
                    case 70:
                        GlobalVar.setPageName(sTitle[70]);
                        GlobalVar.setStr("71");
                        break;
                    case 71:
                        GlobalVar.setPageName(sTitle[71]);
                        GlobalVar.setStr("72");
                        break;
                    case 72:
                        GlobalVar.setPageName(sTitle[72]);
                        GlobalVar.setStr("73");
                        break;
                    case 73:
                        GlobalVar.setPageName(sTitle[73]);
                        GlobalVar.setStr("74");
                        break;
                    case 74:
                        GlobalVar.setPageName(sTitle[74]);
                        GlobalVar.setStr("75");
                        break;
                    case 75:
                        GlobalVar.setPageName(sTitle[75]);
                        GlobalVar.setStr("76");
                        break;
                    case 76:
                        GlobalVar.setPageName(sTitle[76]);
                        GlobalVar.setStr("77");
                        break;
                    case 77:
                        GlobalVar.setPageName(sTitle[77]);
                        GlobalVar.setStr("78");
                        break;
                    case 78:
                        GlobalVar.setPageName(sTitle[78]);
                        GlobalVar.setStr("79");
                        break;
                    case 79:
                        GlobalVar.setPageName(sTitle[79]);
                        GlobalVar.setStr("80");
                        break;
                    case 80:
                        GlobalVar.setPageName(sTitle[80]);
                        GlobalVar.setStr("81");
                        break;
                    case 81:
                        GlobalVar.setPageName(sTitle[81]);
                        GlobalVar.setStr("82");
                        break;
                    case 82:
                        GlobalVar.setPageName(sTitle[82]);
                        GlobalVar.setStr("83");
                        break;
                    case 83:
                        GlobalVar.setPageName(sTitle[83]);
                        GlobalVar.setStr("84");
                        break;
                    case 84:
                        GlobalVar.setPageName(sTitle[84]);
                        GlobalVar.setStr("85");
                        break;
                    case 85:
                        GlobalVar.setPageName(sTitle[85]);
                        GlobalVar.setStr("86");
                        break;
                    case 86:
                        GlobalVar.setPageName(sTitle[86]);
                        GlobalVar.setStr("87");
                        break;
                    case 87:
                        GlobalVar.setPageName(sTitle[87]);
                        GlobalVar.setStr("88");
                        break;
                    case 88:
                        GlobalVar.setPageName(sTitle[88]);
                        GlobalVar.setStr("89");
                        break;
                    case 89:
                        GlobalVar.setPageName(sTitle[89]);
                        GlobalVar.setStr("90");
                        break;
                    case 90:
                        GlobalVar.setPageName(sTitle[90]);
                        GlobalVar.setStr("91");
                        break;
                    case 91:
                        GlobalVar.setPageName(sTitle[91]);
                        GlobalVar.setStr("92");
                        break;
                    case 92:
                        GlobalVar.setPageName(sTitle[92]);
                        GlobalVar.setStr("93");
                        break;
                    case 93:
                        GlobalVar.setPageName(sTitle[93]);
                        GlobalVar.setStr("94");
                        break;
                    case 94:
                        GlobalVar.setPageName(sTitle[94]);
                        GlobalVar.setStr("95");
                        break;
                    case 95:
                        GlobalVar.setPageName(sTitle[95]);
                        GlobalVar.setStr("96");
                        break;
                    case 96:
                        GlobalVar.setPageName(sTitle[96]);
                        GlobalVar.setStr("97");
                        break;
                    case 97:
                        GlobalVar.setPageName(sTitle[97]);
                        GlobalVar.setStr("98");
                        break;
                    case 98:
                        GlobalVar.setPageName(sTitle[98]);
                        GlobalVar.setStr("99");
                        break;
                    case 99:
                        GlobalVar.setPageName(sTitle[99]);
                        GlobalVar.setStr("100");
                        break;
                    case 100:
                        GlobalVar.setPageName(sTitle[100]);
                        GlobalVar.setStr("101");
                        break;
                    case 101:
                        GlobalVar.setPageName(sTitle[101]);
                        GlobalVar.setStr("102");
                        break;
                    case 102:
                        GlobalVar.setPageName(sTitle[102]);
                        GlobalVar.setStr("103");
                        break;
                    case 103:
                        GlobalVar.setPageName(sTitle[103]);
                        GlobalVar.setStr("104");
                        break;
                    case 104:
                        GlobalVar.setPageName(sTitle[104]);
                        GlobalVar.setStr("105");
                        break;
                    case 105:
                        GlobalVar.setPageName(sTitle[105]);
                        GlobalVar.setStr("106");
                        break;
                    case 106:
                        GlobalVar.setPageName(sTitle[106]);
                        GlobalVar.setStr("107");
                        break;
                    case 107:
                        GlobalVar.setPageName(sTitle[107]);
                        GlobalVar.setStr("108");
                        break;
                    case 108:
                        GlobalVar.setPageName(sTitle[108]);
                        GlobalVar.setStr("109");
                        break;
                    case 109:
                        GlobalVar.setPageName(sTitle[109]);
                        GlobalVar.setStr("110");
                        break;
                    case 110:
                        GlobalVar.setPageName(sTitle[110]);
                        GlobalVar.setStr("111");
                        break;
                    case 111:
                        GlobalVar.setPageName(sTitle[111]);
                        GlobalVar.setStr("112");
                    case 112:
                        GlobalVar.setPageName(sTitle[112]);
                        GlobalVar.setStr("113");
                        break;
                    case 113:
                        GlobalVar.setPageName(sTitle[113]);
                        GlobalVar.setStr("114");
                        break;
                    case 114:
                        GlobalVar.setPageName(sTitle[114]);
                        GlobalVar.setStr("115");
                        break;
                    case 115:
                        GlobalVar.setPageName(sTitle[115]);
                        GlobalVar.setStr("116");
                        break;
                    case 116:
                        GlobalVar.setPageName(sTitle[116]);
                        GlobalVar.setStr("117");
                        break;
                    case 117:
                        GlobalVar.setPageName(sTitle[117]);
                        GlobalVar.setStr("118");
                        break;
                    case 118:
                        GlobalVar.setPageName(sTitle[118]);
                        GlobalVar.setStr("119");
                        break;
                    case 119:
                        GlobalVar.setPageName(sTitle[119]);
                        GlobalVar.setStr("120");
                        break;
                    case 120:
                        GlobalVar.setPageName(sTitle[120]);
                        GlobalVar.setStr("121");
                        break;
                    case 121:
                        GlobalVar.setPageName(sTitle[121]);
                        GlobalVar.setStr("122");
                        break;
                    case 122:
                        GlobalVar.setPageName(sTitle[122]);
                        GlobalVar.setStr("123");
                        break;
                    case 123:
                        GlobalVar.setPageName(sTitle[123]);
                        GlobalVar.setStr("124");
                        break;
                    case 124:
                        GlobalVar.setPageName(sTitle[124]);
                        GlobalVar.setStr("125");
                        break;
                    case 125:
                        GlobalVar.setPageName(sTitle[125]);
                        GlobalVar.setStr("126");
                        break;
                    case 126:
                        GlobalVar.setPageName(sTitle[126]);
                        GlobalVar.setStr("127");
                        break;
                    case 127:
                        GlobalVar.setPageName(sTitle[127]);
                        GlobalVar.setStr("128");
                        break;
                    case 128:
                        GlobalVar.setPageName(sTitle[128]);
                        GlobalVar.setStr("129");
                        break;

                    case 129:
                        GlobalVar.setPageName(sTitle[129]);
                        GlobalVar.setStr("130");
                        break;
                    case 130:
                        GlobalVar.setPageName(sTitle[130]);
                        GlobalVar.setStr("131");
                        break;
                    case 131:
                        GlobalVar.setPageName(sTitle[131]);
                        GlobalVar.setStr("132");
                        break;

                    case 132:
                        GlobalVar.setPageName(sTitle[132]);
                        GlobalVar.setStr("133");
                        break;
                }
                next();
            }
        });

    }


    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String sTitle[];

        MyAdapter(Context c, String title[], int num) {
            super(c, num, title);
            this.context = c;
            this.sTitle = title;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            @SuppressLint("ViewHolder") View row = layoutInflater.inflate(R.layout.row, parent, false);

            TextView myTitle = (TextView) row.findViewById(R.id.txtlist);
            myTitle.setText(sTitle[position]);

            return row;
        }
    }

    public void next() {
        Intent intent = new Intent(this, Thirukural.class);
        startActivity(intent);

    }

 }
