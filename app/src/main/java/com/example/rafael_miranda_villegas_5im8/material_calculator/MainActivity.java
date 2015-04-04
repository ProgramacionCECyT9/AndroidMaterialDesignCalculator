package com.example.rafael_miranda_villegas_5im8.material_calculator;
/*
* Rafael Miranda Villegas 5IM8 2013090424.
* Laboratorio de Proyectos de Tecnologías de la Informmación
* Simple material design calculator, this provides operators like add, subtract,
* multiply, divide, square root and power.
*
* Homework for april 3
*
* For run the app press run.
 */
import java.util.ArrayList;
import android.os.Bundle;
import android.app.Activity;
import android.text.method.DigitsKeyListener;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView calculator_result;

    Button button_one, button_two, button_three,
            button_four, button_five, button_six,
            button_seven, button_eight, button_nine,
            button_zero, button_plus, button_minus,
            button_multiply, button_divide, button_power,
            button_root, button_clear, button_equals;

    ArrayList<Double> math = new ArrayList<>();
    double first_number;
    double second_number;

    int currentOperation = 0;
    int nextOperation;

    final static int ADD = 1;
    final static int SUBTRACT = 2;
    final static int MULTIPLY =3;
    final static int DIVISION = 4;
    final static int POWER = 5;
    final static int ROOT = 6;
    final static int EQUALS = 0;
    final static int CLEAR = 1;
    final static int DONT_CLEAR = 0;
    int clearDisplay = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator_result = (TextView) findViewById(R.id.calculator_result);

        button_one      = (Button) findViewById(R.id.number_one);
        button_two      = (Button) findViewById(R.id.number_two);
        button_three    = (Button) findViewById(R.id.number_three);
        button_four     = (Button) findViewById(R.id.number_four);
        button_five     = (Button) findViewById(R.id.number_five);
        button_six      = (Button) findViewById(R.id.number_six);
        button_seven    = (Button) findViewById(R.id.number_seven);
        button_eight    = (Button) findViewById(R.id.number_eight);
        button_nine     = (Button) findViewById(R.id.number_nine);
        button_zero     = (Button) findViewById(R.id.number_zero);
        button_plus     = (Button) findViewById(R.id.button_plus);
        button_minus    = (Button) findViewById(R.id.button_minus);
        button_multiply = (Button) findViewById(R.id.button_multiply);
        button_divide   = (Button) findViewById(R.id.button_divide);
        button_power    = (Button) findViewById(R.id.button_power);
        button_root     = (Button) findViewById(R.id.button_root);
        button_clear    = (Button) findViewById(R.id.button_clear);
        button_equals   = (Button) findViewById(R.id.button_equals);

        calculator_result.setKeyListener(DigitsKeyListener.getInstance(true,true));
        registerListeners();


    }

    private void registerListeners() {
        button_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clearDisplay == CLEAR) {
                    calculator_result.setText("");
                }
                clearDisplay = DONT_CLEAR;
                calculator_result.append("1");
            }
        });
        button_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clearDisplay == CLEAR) {
                    calculator_result.setText("");
                }
                clearDisplay = DONT_CLEAR;
                calculator_result.append("2");
            }
        });
        button_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clearDisplay == CLEAR) {
                    calculator_result.setText("");
                }
                clearDisplay = DONT_CLEAR;
                calculator_result.append("3");
            }
        });
        button_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clearDisplay == CLEAR) {
                    calculator_result.setText("");
                }
                clearDisplay = DONT_CLEAR;
                calculator_result.append("4");
            }
        });
        button_five.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clearDisplay == CLEAR) {
                    calculator_result.setText("");
                }
                clearDisplay = DONT_CLEAR;
                calculator_result.append("5");
            }
        });
        button_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clearDisplay == CLEAR) {
                    calculator_result.setText("");
                }
                clearDisplay = DONT_CLEAR;
                calculator_result.append("6");
            }
        });
        button_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clearDisplay == CLEAR) {
                    calculator_result.setText("");
                }
                clearDisplay = DONT_CLEAR;
                calculator_result.append("7");
            }
        });
        button_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clearDisplay == CLEAR) {
                    calculator_result.setText("");
                }
                clearDisplay = DONT_CLEAR;
                calculator_result.append("8");
            }
        });
        button_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clearDisplay == CLEAR) {
                    calculator_result.setText("");
                }
                clearDisplay = DONT_CLEAR;
                calculator_result.append("9");
            }
        });
        button_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clearDisplay == CLEAR) {
                    calculator_result.setText("");
                }
                clearDisplay = DONT_CLEAR;
                calculator_result.append("0");
            }
        });
        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcLogic(ADD);
            }
        });
        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcLogic(SUBTRACT);
            }
        });
        button_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcLogic(MULTIPLY);
            }
        });
        button_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcLogic(DIVISION);
            }
        });
        button_power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcLogic(POWER);
            }
        });
        button_root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcLogic(ROOT);
            }
        });
        button_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcLogic(EQUALS);
            }
        });
        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator_result.setText("0");
                first_number = 0;
                second_number = 0;
                math.removeAll(math);
                currentOperation = 0;
                nextOperation = 0;
            }
        });
    }
    private void calcLogic(int operator){
        math.add(Double.parseDouble(calculator_result.getText().toString()));
        if (operator != EQUALS) {
            nextOperation = operator;
        }
        else {
            nextOperation = 0;
        }
        switch (currentOperation) {
            case ADD:
                first_number = math.get(0);
                second_number = math.get(1);
                math.removeAll(math);
                math.add(first_number + second_number);
                calculator_result.setText(String.format("%.1f", math.get(0)));
                break;
            case SUBTRACT:
                first_number = math.get(0);
                second_number = math.get(1);
                math.removeAll(math);
                math.add(first_number - second_number);
                calculator_result.setText(String.format("%.1f", math.get(0)));
                break;
            case MULTIPLY:
                first_number = math.get(0);
                second_number = math.get(1);
                math.removeAll(math);
                math.add(first_number * second_number);
                calculator_result.setText(String.format("%.1f", math.get(0)));
                break;
            case DIVISION:
                first_number = math.get(0);
                second_number = math.get(1);
                math.removeAll(math);
                math.add(first_number / second_number);
                calculator_result.setText(String.format("%.1f", math.get(0)));
                break;
            case POWER:
                first_number = math.get(0);
                second_number = math.get(1);
                math.removeAll(math);
                math.add(Math.pow(first_number, second_number));
                calculator_result.setText(String.format("%.1f", math.get(0)));
                break;
            //For the square root only put the number that you want obtain his square root and press equal
            case ROOT:
                first_number = math.get(0);
                second_number = math.get(1);
                math.removeAll(math);
                math.add(Math.sqrt(first_number));
                calculator_result.setText(String.format("%.1f", math.get(0)));
                break;
        }
        clearDisplay = CLEAR;
        currentOperation = nextOperation;
        if (operator == EQUALS) {
            first_number = 0;
            second_number = 0;
            math.removeAll(math);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}