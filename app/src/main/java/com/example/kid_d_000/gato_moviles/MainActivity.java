package com.example.kid_d_000.gato_moviles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    Button boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, B[][];
    int cont = 0, M[][], n = 0, n2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = (Button) findViewById(R.id.btn1);
        boton2 = (Button) findViewById(R.id.btn2);
        boton3 = (Button) findViewById(R.id.btn3);
        boton4 = (Button) findViewById(R.id.btn4);
        boton5 = (Button) findViewById(R.id.btn5);
        boton6 = (Button) findViewById(R.id.btn6);
        boton7 = (Button) findViewById(R.id.btn7);
        boton8 = (Button) findViewById(R.id.btn8);
        boton9 = (Button) findViewById(R.id.btn9);
        text = (TextView) findViewById(R.id.textView);

        B = new Button[3][3];
        B[0][0] = boton1;
        B[1][0] = boton2;
        B[2][0] = boton3;
        B[0][1] = boton4;
        B[1][1] = boton5;
        B[2][1] = boton6;
        B[0][2] = boton7;
        B[1][2] = boton8;
        B[2][2] = boton9;

        M = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int c = 0; c < 3; c++) {
                M[i][c] = 4;
            }
        }

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bucle1:
                for (int t = 0; t <= 0; t++) {
                    if ((cont % 2) == 0) {
                        boton1.setText("X");
                        M[0][0] = 1;
                        text.setText("Turno del Jugador 2");
                    } else {
                        boton1.setText("O");
                        M[0][0] = 0;
                        text.setText("Turno del Jugador 2");
                    }
                    boton1.setEnabled(false);
                    cont++;
                    for (int i = 0; i < 3; i++) {
                        for (int m = 0; m < 3; m++) {
                            n += M[i][m];
                        }
                        if (n == 3) {
                            text.setText("Gana Jugador 1");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle1;
                        } else if (n == 0) {
                            text.setText("Gana Jugador 2");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle1;
                        }
                        n = 0;
                    }
                    for (int i = 0; i < 3; i++) {
                        for (int m = 0; m < 3; m++) {
                            n += M[m][i];
                        }
                        if (n == 3) {
                            text.setText("Gana Jugador 1");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle1;
                        } else if (n == 0) {
                            text.setText("Gana Jugador 2");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle1;
                        }
                        n = 0;
                    }
                    for (int i = 0, m = 2; i < 3; i++, m--) {
                        n += M[i][i];
                        n2 += M[m][i];
                    }
                    if (n == 3 || n2 == 3) {
                        text.setText("Gana Jugador 1");
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                B[a][b].setEnabled(false);
                            }
                        }
                        break bucle1;
                    } else if (n == 0 || n2 == 0) {
                        text.setText("Gana Jugador 2");
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                B[a][b].setEnabled(false);
                            }
                        }
                        break bucle1;
                    }
                    n = n2 = 0;
                    if (cont == 9) {
                        text.setText("Gato encerrado");
                    }
                }
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bucle2:
                for (int t = 0; t <= 0; t++) {
                    if ((cont % 2) == 0) {
                        boton2.setText("X");
                        M[1][0] = 1;
                        text.setText("Turno del Jugador 2");
                    } else {
                        boton2.setText("O");
                        M[1][0] = 0;
                        text.setText("Turno del Jugador 1");
                    }
                    boton2.setEnabled(false);
                    cont++;
                    for (int i = 0; i < 3; i++) {
                        for (int m = 0; m < 3; m++) {
                            n += M[i][m];
                        }
                        if (n == 3) {
                            text.setText("Gana Jugador 1");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle2;
                        } else if (n == 0) {
                            text.setText("Gana Jugador 2");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle2;
                        }
                        n = 0;
                    }
                    for (int i = 0; i < 3; i++) {
                        for (int m = 0; m < 3; m++) {
                            n += M[m][i];
                        }
                        if (n == 3) {
                            text.setText("Gana Jugador 1");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle2;
                        } else if (n == 0) {
                            text.setText("Gana Jugador 2");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle2;
                        }
                        n = 0;
                    }
                    for (int i = 0, m = 2; i < 3; i++, m--) {
                        n += M[i][i];
                        n2 += M[m][i];
                    }
                    if (n == 3 || n2 == 3) {
                        text.setText("Gana Jugador 1");
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                B[a][b].setEnabled(false);
                            }
                        }
                        break bucle2;
                    } else if (n == 0 || n2 == 0) {
                        text.setText("Gana Jugador 2");
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                B[a][b].setEnabled(false);
                            }
                        }
                        break bucle2;
                    }
                    n = n2 = 0;
                    if (cont == 9) {
                        text.setText("Gato encerrado");
                    }
                }
            }
        });
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bucle3:
                for (int t = 0; t <= 0; t++) {
                    if ((cont % 2) == 0) {
                        boton3.setText("X");
                        M[2][0] = 1;
                        text.setText("Turno del Jugador 2");
                    } else {
                        boton3.setText("O");
                        M[2][0] = 0;
                        text.setText("Turno del Jugador 1");
                    }
                    boton3.setEnabled(false);
                    cont++;
                    for (int i = 0; i < 3; i++) {
                        for (int m = 0; m < 3; m++) {
                            n += M[i][m];
                        }
                        if (n == 3) {
                            text.setText("Gana Jugador 1");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle3;
                        } else if (n == 0) {
                            text.setText("Gana Jugador 2");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle3;
                        }
                        n = 0;
                    }
                    for (int i = 0; i < 3; i++) {
                        for (int m = 0; m < 3; m++) {
                            n += M[m][i];
                        }
                        if (n == 3) {
                            text.setText("Gana Jugador 1");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle3;
                        } else if (n == 0) {
                            text.setText("Gana Jugador 2");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle3;
                        }
                        n = 0;
                    }
                    for (int i = 0, m = 2; i < 3; i++, m--) {
                        n += M[i][i];
                        n2 += M[m][i];
                    }
                    if (n == 3 || n2 == 3) {
                        text.setText("Gana Jugador 1");
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                B[a][b].setEnabled(false);
                            }
                        }
                        break bucle3;
                    } else if (n == 0 || n2 == 0) {
                        text.setText("Gana Jugador 2");
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                B[a][b].setEnabled(false);
                            }
                        }
                        break bucle3;
                    }
                    n = n2 = 0;
                    if (cont == 9) {
                        text.setText("Gato encerrado");
                    }
                }
            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bucle4:
                for (int t = 0; t <= 0; t++) {
                    if ((cont % 2) == 0) {
                        boton4.setText("X");
                        M[0][1] = 1;
                        text.setText("Turno del Jugador 2");
                    } else {
                        boton4.setText("O");
                        M[0][1] = 0;
                        text.setText("Turno del Jugador 1");
                    }
                    boton4.setEnabled(false);
                    cont++;
                    for (int i = 0; i < 3; i++) {
                        for (int m = 0; m < 3; m++) {
                            n += M[i][m];
                        }
                        if (n == 3) {
                            text.setText("Gana Jugador 1");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle4;
                        } else if (n == 0) {
                            text.setText("Gana Jugador 2");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle4;
                        }
                        n = 0;
                    }
                    for (int i = 0; i < 3; i++) {
                        for (int m = 0; m < 3; m++) {
                            n += M[m][i];
                        }
                        if (n == 3) {
                            text.setText("Gana Jugador 1");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle4;
                        } else if (n == 0) {
                            text.setText("Gana Jugador 2");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle4;
                        }
                        n = 0;
                    }
                    for (int i = 0, m = 2; i < 3; i++, m--) {
                        n += M[i][i];
                        n2 += M[m][i];
                    }
                    if (n == 3 || n2 == 3) {
                        text.setText("Gana Jugador 1");
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                B[a][b].setEnabled(false);
                            }
                        }
                        break bucle4;
                    } else if (n == 0 || n2 == 0) {
                        text.setText("Gana Jugador 2");
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                B[a][b].setEnabled(false);
                            }
                        }
                        break bucle4;
                    }
                    n = n2 = 0;
                    if (cont == 9) {
                        text.setText("Gato encerrado");
                    }
                }
            }
        });
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bucle5:
                for (int t = 0; t <= 0; t++) {
                    if ((cont % 2) == 0) {
                        boton5.setText("X");
                        M[1][1] = 1;
                        text.setText("Turno del Jugador 2");
                    } else {
                        boton5.setText("O");
                        M[1][1] = 0;
                        text.setText("Turno del Jugador 1");
                    }
                    boton5.setEnabled(false);
                    cont++;
                    for (int i = 0; i < 3; i++) {
                        for (int m = 0; m < 3; m++) {
                            n += M[i][m];
                        }
                        if (n == 3) {
                            text.setText("Gana Jugador 1");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle5;
                        } else if (n == 0) {
                            text.setText("Gana Jugador 2");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle5;
                        }
                        n = 0;
                    }
                    for (int i = 0; i < 3; i++) {
                        for (int m = 0; m < 3; m++) {
                            n += M[m][i];
                        }
                        if (n == 3) {
                            text.setText("Gana Jugador 1");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle5;
                        } else if (n == 0) {
                            text.setText("Gana Jugador 2");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle5;
                        }
                        n = 0;
                    }
                    for (int i = 0, m = 2; i < 3; i++, m--) {
                        n += M[i][i];
                        n2 += M[m][i];
                    }
                    if (n == 3 || n2 == 3) {
                        text.setText("Gana Jugador 1");
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                B[a][b].setEnabled(false);
                            }
                        }
                        break bucle5;
                    } else if (n == 0 || n2 == 0) {
                        text.setText("Gana Jugador 2");
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                B[a][b].setEnabled(false);
                            }
                        }
                        break bucle5;
                    }
                    n = n2 = 0;
                    if (cont == 9) {
                        text.setText("Gato encerrado");
                    }
                }
            }
        });
        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bucle6:
                for (int t = 0; t <= 0; t++) {
                    if ((cont % 2) == 0) {
                        boton6.setText("X");
                        M[2][1] = 1;
                        text.setText("Turno del Jugador 2");
                    } else {
                        boton6.setText("O");
                        M[2][1] = 0;
                        text.setText("Turno del Jugador 1");
                    }
                    boton6.setEnabled(false);
                    cont++;
                    for (int i = 0; i < 3; i++) {
                        for (int m = 0; m < 3; m++) {
                            n += M[i][m];
                        }
                        if (n == 3) {
                            text.setText("Gana Jugador 1");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle6;
                        } else if (n == 0) {
                            text.setText("Gana Jugador 2");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle6;
                        }
                        n = 0;
                    }
                    for (int i = 0; i < 3; i++) {
                        for (int m = 0; m < 3; m++) {
                            n += M[m][i];
                        }
                        if (n == 3) {
                            text.setText("Gana Jugador 1");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle6;
                        } else if (n == 0) {
                            text.setText("Gana Jugador 2");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle6;
                        }
                        n = 0;
                    }
                    for (int i = 0, m = 2; i < 3; i++, m--) {
                        n += M[i][i];
                        n2 += M[m][i];
                    }
                    if (n == 3 || n2 == 3) {
                        text.setText("Gana Jugador 1");
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                B[a][b].setEnabled(false);
                            }
                        }
                        break bucle6;
                    } else if (n == 0 || n2 == 0) {
                        text.setText("Gana Jugador 2");
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                B[a][b].setEnabled(false);
                            }
                        }
                        break bucle6;
                    }
                    n = n2 = 0;
                    if (cont == 9) {
                        text.setText("Gato encerrado");
                    }
                }
            }
        });
        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bucle7:
                for (int t = 0; t <= 0; t++) {
                    if ((cont % 2) == 0) {
                        boton7.setText("X");
                        M[0][2] = 1;
                        text.setText("Turno del Jugador 2");
                    } else {
                        boton7.setText("O");
                        M[0][2] = 0;
                        text.setText("Turno del Jugador 1");
                    }
                    boton7.setEnabled(false);
                    cont++;
                    for (int i = 0; i < 3; i++) {
                        for (int m = 0; m < 3; m++) {
                            n += M[i][m];
                        }
                        if (n == 3) {
                            text.setText("Gana Jugador 1");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle7;
                        } else if (n == 0) {
                            text.setText("Gana Jugador 2");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle7;
                        }
                        n = 0;
                    }
                    for (int i = 0; i < 3; i++) {
                        for (int m = 0; m < 3; m++) {
                            n += M[m][i];
                        }
                        if (n == 3) {
                            text.setText("Gana Jugador 1");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle7;
                        } else if (n == 0) {
                            text.setText("Gana Jugador 2");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle7;
                        }
                        n = 0;
                    }
                    for (int i = 0, m = 2; i < 3; i++, m--) {
                        n += M[i][i];
                        n2 += M[m][i];
                    }
                    if (n == 3 || n2 == 3) {
                        text.setText("Gana Jugador 1");
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                B[a][b].setEnabled(false);
                            }
                        }
                        break bucle7;
                    } else if (n == 0 || n2 == 0) {
                        text.setText("Gana Jugador 2");
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                B[a][b].setEnabled(false);
                            }
                        }
                        break bucle7;
                    }
                    n = n2 = 0;
                    if (cont == 9) {
                        text.setText("Gato encerrado");
                    }
                }
            }
        });
        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bucle8:
                for (int t = 0; t <= 0; t++) {
                    if ((cont % 2) == 0) {
                        boton8.setText("X");
                        M[1][2] = 1;
                        text.setText("Turno del Jugador 2");
                    } else {
                        boton8.setText("O");
                        M[1][2] = 0;
                        text.setText("Turno del Jugador 1");
                    }
                    boton8.setEnabled(false);
                    cont++;
                    for (int i = 0; i < 3; i++) {
                        for (int m = 0; m < 3; m++) {
                            n += M[i][m];
                        }
                        if (n == 3) {
                            text.setText("Gana Jugador 1");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle8;
                        } else if (n == 0) {
                            text.setText("Gana Jugador 2");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle8;
                        }
                        n = 0;
                    }
                    for (int i = 0; i < 3; i++) {
                        for (int m = 0; m < 3; m++) {
                            n += M[m][i];
                        }
                        if (n == 3) {
                            text.setText("Gana Jugador 1");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle8;
                        } else if (n == 0) {
                            text.setText("Gana Jugador 2");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle8;
                        }
                        n = 0;
                    }
                    for (int i = 0, m = 2; i < 3; i++, m--) {
                        n += M[i][i];
                        n2 += M[m][i];
                    }
                    if (n == 3 || n2 == 3) {
                        text.setText("Gana Jugador 1");
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                B[a][b].setEnabled(false);
                            }
                        }
                        break bucle8;
                    } else if (n == 0 || n2 == 0) {
                        text.setText("Gana Jugador 2");
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                B[a][b].setEnabled(false);
                            }
                        }
                        break bucle8;
                    }
                    n = n2 = 0;
                    if (cont == 9) {
                        text.setText("Gato encerrado");
                    }
                }
            }
        });
        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bucle9:
                for (int t = 0; t <= 0; t++) {
                    if ((cont % 2) == 0) {
                        boton9.setText("X");
                        M[2][2] = 1;
                        text.setText("Turno del Jugador 2");
                    } else {
                        boton9.setText("O");
                        M[2][2] = 0;
                        text.setText("Turno del Jugador 1");
                    }
                    boton9.setEnabled(false);
                    cont++;
                    for (int i = 0; i < 3; i++) {
                        for (int m = 0; m < 3; m++) {
                            n += M[i][m];
                        }
                        if (n == 3) {
                            text.setText("Gana Jugador 1");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle9;
                        } else if (n == 0) {
                            text.setText("Gana Jugador 2");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle9;
                        }
                        n = 0;
                    }
                    for (int i = 0; i < 3; i++) {
                        for (int m = 0; m < 3; m++) {
                            n += M[m][i];
                        }
                        if (n == 3) {
                            text.setText("Gana Jugador 1");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle9;
                        } else if (n == 0) {
                            text.setText("Gana Jugador 2");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {
                                    B[a][b].setEnabled(false);
                                }
                            }
                            break bucle9;
                        }
                        n = 0;
                    }
                    for (int i = 0, m = 2; i < 3; i++, m--) {
                        n += M[i][i];
                        n2 += M[m][i];
                    }
                    if (n == 3 || n2 == 3) {
                        text.setText("Gana Jugador 1");
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                B[a][b].setEnabled(false);
                            }
                        }
                        break bucle9;
                    } else if (n == 0 || n2 == 0) {
                        text.setText("Gana Jugador 2");
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                B[a][b].setEnabled(false);
                            }
                        }
                        break bucle9;
                    }
                    n = n2 = 0;
                    if (cont == 9) {
                        text.setText("Gato encerrado");
                    }
                }
            }
        });
    }
}
