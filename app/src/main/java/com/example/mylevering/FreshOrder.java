package com.example.mylevering;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.resources.TextAppearance;

public class FreshOrder extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresh_order);

        final LinearLayout fresh = findViewById(R.id.freshOptions);
        final LinearLayout base = new LinearLayout(getApplicationContext());
        base.setOrientation(LinearLayout.VERTICAL);

        final RadioGroup baseGroup = new RadioGroup(getApplicationContext());
        final RadioButton[] baseButtons = new RadioButton[FreshMenuOption.baseNames.length];
        for (int i = 0; i < FreshMenuOption.baseNames.length; i++){
            baseButtons[i] = new RadioButton(getApplicationContext());
            baseButtons[i].setText(FreshMenuOption.baseNames[i]);
            baseButtons[i].setId(View.generateViewId());
            baseGroup.addView(baseButtons[i]);
        }
        final TextView baseShown = new TextView(getApplicationContext());
        baseShown.setText("True");
        TextView baseTitle = new TextView(getApplicationContext());
        baseTitle.setText(R.string.base);
        final ImageView baseToggle = new ImageView(getApplicationContext());
        baseToggle.setClickable(true);
        baseToggle.setImageResource(R.drawable.baseline_arrow_drop_up_black_18dp);

        LinearLayout baseHeader = new LinearLayout(getApplicationContext());
        baseHeader.addView(baseTitle);
        baseHeader.addView(baseToggle);
        baseHeader.setPadding(50, 50,0,0);

        fresh.addView(baseHeader);
        base.addView(baseGroup);
        base.setPadding(50,0,0,0);
        fresh.addView(base);

        final LinearLayout spread = new LinearLayout(getApplicationContext());
        spread.setOrientation(LinearLayout.VERTICAL);

        final CheckBox[] spreadChecks = new CheckBox[FreshMenuOption.spreadNames.length];
        for (int i = 0; i < FreshMenuOption.spreadNames.length; i++){
            spreadChecks[i] = new CheckBox(getApplicationContext());
            spreadChecks[i].setText(FreshMenuOption.spreadNames[i]);
            spreadChecks[i].setId(View.generateViewId());
            spread.addView(spreadChecks[i]);
        }
        final TextView spreadShown = new TextView(getApplicationContext());
        spreadShown.setText("True");
        TextView spreadTitle = new TextView(getApplicationContext());
        spreadTitle.setText(R.string.spreads);
        final ImageView spreadToggle = new ImageView(getApplicationContext());
        spreadToggle.setClickable(true);
        spreadToggle.setImageResource(R.drawable.baseline_arrow_drop_up_black_18dp);

        LinearLayout spreadHeader = new LinearLayout(getApplicationContext());
        spreadHeader.addView(spreadTitle);
        spreadHeader.addView(spreadToggle);
        spreadHeader.setPadding(50, 50,0,0);

        fresh.addView(spreadHeader);
        spread.setPadding(50,0,0,0);
        fresh.addView(spread);

        final LinearLayout topping = new LinearLayout(getApplicationContext());
        topping.setOrientation(LinearLayout.VERTICAL);

        final CheckBox[] toppingChecks = new CheckBox[FreshMenuOption.toppingNames.length];
        for (int i = 0; i < FreshMenuOption.toppingNames.length; i++){
            toppingChecks[i] = new CheckBox(getApplicationContext());
            toppingChecks[i].setText(FreshMenuOption.toppingNames[i]);
            toppingChecks[i].setId(View.generateViewId());
            topping.addView(toppingChecks[i]);
        }
        final TextView toppingShown = new TextView(getApplicationContext());
        toppingShown.setText("True");
        TextView toppingTitle = new TextView(getApplicationContext());
        toppingTitle.setText(R.string.toppings);
        final ImageView toppingToggle = new ImageView(getApplicationContext());
        toppingToggle.setClickable(true);
        toppingToggle.setImageResource(R.drawable.baseline_arrow_drop_up_black_18dp);

        LinearLayout toppingHeader = new LinearLayout(getApplicationContext());
        toppingHeader.addView(toppingTitle);
        toppingHeader.addView(toppingToggle);
        toppingHeader.setPadding(50, 50,0,0);

        fresh.addView(toppingHeader);
        topping.setPadding(50,0,0,0);
        fresh.addView(topping);

        final LinearLayout protein = new LinearLayout(getApplicationContext());
        protein.setOrientation(LinearLayout.VERTICAL);

        final RadioGroup proteinGroup = new RadioGroup(getApplicationContext());
        final RadioButton[] proteinButtons = new RadioButton[FreshMenuOption.proteinNames.length];
        for (int i = 0; i < FreshMenuOption.proteinNames.length; i++){
            proteinButtons[i] = new RadioButton(getApplicationContext());
            proteinButtons[i].setText(FreshMenuOption.proteinNames[i]);
            proteinButtons[i].setId(View.generateViewId());
            proteinGroup.addView(proteinButtons[i]);
        }
        final TextView proteinShown = new TextView(getApplicationContext());
        proteinShown.setText("True");
        TextView proteinTitle = new TextView(getApplicationContext());
        proteinTitle.setText(R.string.protein);
        final ImageView proteinToggle = new ImageView(getApplicationContext());
        proteinToggle.setClickable(true);
        proteinToggle.setImageResource(R.drawable.baseline_arrow_drop_up_black_18dp);

        LinearLayout proteinHeader = new LinearLayout(getApplicationContext());
        proteinHeader.addView(proteinTitle);
        proteinHeader.addView(proteinToggle);
        proteinHeader.setPadding(50, 50,0,0);


        fresh.addView(proteinHeader);
        protein.addView(proteinGroup);
        protein.setPadding(50,0,0,0);
        fresh.addView(protein);

        final LinearLayout dressing = new LinearLayout(getApplicationContext());
        dressing.setOrientation(LinearLayout.VERTICAL);

        final RadioGroup dressingGroup = new RadioGroup(getApplicationContext());
        final RadioButton[] dressingButtons = new RadioButton[FreshMenuOption.dressingNames.length];
        for (int i = 0; i < FreshMenuOption.dressingNames.length; i++){
            dressingButtons[i] = new RadioButton(getApplicationContext());
            dressingButtons[i].setText(FreshMenuOption.dressingNames[i]);
            dressingButtons[i].setId(View.generateViewId());
            dressingGroup.addView(dressingButtons[i]);
        }
        final TextView dressingShown = new TextView(getApplicationContext());
        dressingShown.setText("True");
        TextView dressingTitle = new TextView(getApplicationContext());
        dressingTitle.setText(R.string.dressing);
        final ImageView dressingToggle = new ImageView(getApplicationContext());
        dressingToggle.setClickable(true);
        dressingToggle.setImageResource(R.drawable.baseline_arrow_drop_up_black_18dp);

        LinearLayout dressingHeader = new LinearLayout(getApplicationContext());
        dressingHeader.addView(dressingTitle);
        dressingHeader.addView(dressingToggle);
        dressingHeader.setPadding(50, 50,0,0);


        fresh.addView(dressingHeader);
        dressing.addView(dressingGroup);
        dressing.setPadding(50,0,0,0);
        fresh.addView(dressing);

        final Button orderButton = findViewById(R.id.orderButton);

        baseToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("True".equals(baseShown.getText().toString())) {
                    fresh.removeView(base);
                    baseToggle.setImageResource(R.drawable.baseline_arrow_drop_down_black_18dp);
                    baseShown.setText("False");
                } else {
                    fresh.addView(base, 1);
                    baseShown.setText("True");
                    baseToggle.setImageResource(R.drawable.baseline_arrow_drop_up_black_18dp);
                }
                changeButton(orderButton, baseGroup, spreadChecks, toppingChecks, proteinGroup, dressingGroup);
            }
        });

        spreadToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("True".equals(spreadShown.getText().toString())) {
                    fresh.removeView(spread);
                    spreadToggle.setImageResource(R.drawable.baseline_arrow_drop_down_black_18dp);
                    spreadShown.setText("False");
                } else {
                    int aboveViews = 2;
                    if ("True".equals(baseShown.getText().toString())) {
                        aboveViews += 1;
                    }
                    fresh.addView(spread, aboveViews);
                    spreadShown.setText("True");
                    spreadToggle.setImageResource(R.drawable.baseline_arrow_drop_up_black_18dp);
                }
                changeButton(orderButton, baseGroup, spreadChecks, toppingChecks, proteinGroup, dressingGroup);
            }
        });

        toppingToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("True".equals(toppingShown.getText().toString())) {
                    fresh.removeView(topping);
                    toppingToggle.setImageResource(R.drawable.baseline_arrow_drop_down_black_18dp);
                    toppingShown.setText("False");
                } else {
                    int aboveViews = 3;
                    if ("True".equals(baseShown.getText().toString())) {
                        aboveViews += 1;
                    }
                    if ("True".equals(spreadShown.getText().toString())) {
                        aboveViews += 1;
                    }
                    fresh.addView(topping, aboveViews);
                    toppingShown.setText("True");
                    toppingToggle.setImageResource(R.drawable.baseline_arrow_drop_up_black_18dp);
                }
                changeButton(orderButton, baseGroup, spreadChecks, toppingChecks, proteinGroup, dressingGroup);
            }
        });

        proteinToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("True".equals(proteinShown.getText().toString())) {
                    fresh.removeView(protein);
                    proteinToggle.setImageResource(R.drawable.baseline_arrow_drop_down_black_18dp);
                    proteinShown.setText("False");
                } else {
                    int aboveViews = 4;
                    if ("True".equals(baseShown.getText().toString())) {
                        aboveViews += 1;
                    }
                    if ("True".equals(spreadShown.getText().toString())) {
                        aboveViews += 1;
                    }
                    if ("True".equals(toppingShown.getText().toString())) {
                        aboveViews += 1;
                    }
                    fresh.addView(protein, aboveViews);
                    proteinShown.setText("True");
                    proteinToggle.setImageResource(R.drawable.baseline_arrow_drop_up_black_18dp);
                }
                changeButton(orderButton, baseGroup, spreadChecks, toppingChecks, proteinGroup, dressingGroup);
            }
        });

        dressingToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("True".equals(dressingShown.getText().toString())) {
                    fresh.removeView(dressing);
                    dressingToggle.setImageResource(R.drawable.baseline_arrow_drop_down_black_18dp);
                    dressingShown.setText("False");
                } else {
                    int aboveViews = 5;
                    if ("True".equals(baseShown.getText().toString())) {
                        aboveViews += 1;
                    }
                    if ("True".equals(spreadShown.getText().toString())) {
                        aboveViews += 1;
                    }
                    if ("True".equals(toppingShown.getText().toString())) {
                        aboveViews += 1;
                    }
                    if ("True".equals(proteinShown.getText().toString())) {
                        aboveViews += 1;
                    }
                    fresh.addView(dressing, aboveViews);
                    dressingShown.setText("True");
                    dressingToggle.setImageResource(R.drawable.baseline_arrow_drop_up_black_18dp);
                }
                changeButton(orderButton, baseGroup, spreadChecks, toppingChecks, proteinGroup, dressingGroup);
            }
        });

        if (orderButton.isClickable()) {
            orderButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MenuOption selected;
                    selected = getChoices(baseButtons, spreadChecks, toppingChecks, proteinButtons, dressingButtons);
                    Intent intent = new Intent(FreshOrder.this, ConfirmOrder.class);
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("selected", selected);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
        }

    }

    public FreshMenuOption getChoices(RadioButton[] baseButtons, CheckBox[] spreadChecks, CheckBox[] toppingChecks,
                                      RadioButton[] proteinButtons, RadioButton[] dressingButtons) {
        int base = -1;
        for (int i = 0; i < baseButtons.length; i++) {
            if(baseButtons[i].isChecked()) {
                base = i;
            }
        }
        int[] spreads = new int[spreadChecks.length];
        for (int i = 0; i < spreadChecks.length; i++) {
            if(spreadChecks[i].isChecked()) {
                spreads[i] = 1;
            }
        }
        int[] toppings = new int[toppingChecks.length];
        for (int i = 0; i < toppingChecks.length; i++) {
            if(toppingChecks[i].isChecked()) {
                toppings[i] = 1;
            }
        }
        int protein = -1;
        for (int i = 0; i < proteinButtons.length; i++) {
            if(proteinButtons[i].isChecked()) {
                protein = i;
            }
        }
        int dressing = -1;
        for (int i = 0; i < dressingButtons.length; i++) {
            if(dressingButtons[i].isChecked()) {
                dressing = i;
            }
        }
        return new FreshMenuOption(base, spreads, toppings, protein, dressing);
    }

    public boolean validateChoices(RadioGroup baseGroup, CheckBox[] spreadChecks, CheckBox[] toppingChecks,
                                   RadioGroup proteinGroup, RadioGroup dressingGroup) {
        boolean base = false;
        boolean spread = false;
        int spreadCount = 0;
        boolean topping = false;
        int toppingCount = 0;
        boolean protein = false;
        boolean dressing = false;
        if (baseGroup.getCheckedRadioButtonId() != -1) {
            base = true;
        }

        for (int i = 0; i < spreadChecks.length; i++) {
            if(spreadChecks[i].isChecked()) {
                spreadCount++;
            }
        }

        if (spreadCount <= 3 && spreadCount >= 1) {
            spread = true;
        }

        for (int i = 0; i < toppingChecks.length; i++) {
            if(toppingChecks[i].isChecked()) {
                toppingCount++;
            }
        }

        if (toppingCount <= 5 && toppingCount >= 1) {
            topping = true;
        }

        if (proteinGroup.getCheckedRadioButtonId() != -1) {
            protein = true;
        }

        if (dressingGroup.getCheckedRadioButtonId() != -1) {
            dressing = true;
        }
        return base && spread && topping && protein && dressing;
    }

    public void changeButton(Button button, RadioGroup baseGroup, CheckBox[] spreadChecks, CheckBox[] toppingChecks,
                             RadioGroup proteinGroup, RadioGroup dressingGroup) {
        if(validateChoices(baseGroup, spreadChecks, toppingChecks, proteinGroup, dressingGroup)) {
            button.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
            button.setClickable(true);
        } else {
            button.setBackgroundColor(getResources().getColor(R.color.colorGray));
            button.setClickable(false);
        }
    }
}
