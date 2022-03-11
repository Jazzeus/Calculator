//################################################ BLITZ ################################################
//#################################### https://github.com/BLITZ-GIT #####################################
//####################################### https://jakegame.codes ########################################





import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Calculator {

    // TODO: - Punkt vor Strich, mehr Rechenoperatoren
    // global variables

    // counter for changing the colors of the buttons
    int count = 0;
    // user's input
    String input = "";
    // new input after replacing "."
    String inputNew = "";
    // interim result for decimal numbers
    String interimResult = "";
    String finalResult = "";
    // array to split in part
    String[] split;
    double result = Double.NaN;


    public Calculator() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        panel.setLayout(null);
        JTextField text = new JTextField(100);


        // to put only numbers into the field
        text.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();  // if it's not a number, ignore the event
                }
            }
        });

        // position of button and text
        text.setBounds(100, 220, 230, 75);
        JButton buttonComma = new JButton(",");
        buttonComma.setBounds(220, 445, 50, 35);
        JButton buttonDelete = new JButton("AC");
        buttonDelete.setBackground(Color.GREEN);
        buttonDelete.setBounds(280, 490, 50, 35);
        JButton button0 = new JButton("0");
        button0.setBounds(100, 445, 110, 35);
        JButton button1 = new JButton("1");
        button1.setBounds(100, 400, 50, 35);
        JButton button2 = new JButton("2");
        button2.setBounds(160, 400, 50, 35);
        JButton button3 = new JButton("3");
        button3.setBounds(220, 400, 50, 35);
        JButton button4 = new JButton("4");
        button4.setBounds(100, 355, 50, 35);
        JButton button5 = new JButton("5");
        button5.setBounds(160, 355, 50, 35);
        JButton button6 = new JButton("6");
        button6.setBounds(220, 355, 50, 35);
        JButton button7 = new JButton("7");
        button7.setBounds(100, 310, 50, 35);
        JButton button8 = new JButton("8");
        button8.setBounds(160, 310, 50, 35);
        JButton button9 = new JButton("9");
        button9.setBounds(220, 310, 50, 35);

        JButton buttonDivide = new JButton("/");
        buttonDivide.setBounds(280, 310, 50, 35);
        buttonDivide.setBackground(Color.ORANGE);
        JButton buttonMulti = new JButton("*");
        buttonMulti.setBounds(280, 355, 50, 35);
        buttonMulti.setBackground(Color.ORANGE);
        JButton buttonMinus = new JButton("-");
        buttonMinus.setBounds(280, 400, 50, 35);
        buttonMinus.setBackground(Color.ORANGE);
        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(280, 445, 50, 35);
        buttonPlus.setBackground(Color.ORANGE);
        JButton buttonIs = new JButton("=");
        buttonIs.setBounds(100, 490, 170, 35);
        buttonIs.setBackground(Color.YELLOW);


        // adding buttons to the panel
        panel.setBorder(BorderFactory.createEmptyBorder(50, 30, 10, 30));
        panel.add(text);
        panel.add(buttonComma);
        panel.add(buttonDelete);
        panel.add(button0);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonDivide);
        panel.add(buttonMulti);
        panel.add(buttonMinus);
        panel.add(buttonPlus);
        panel.add(buttonIs);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("JZ Taschenrechner");
        frame.pack();
        frame.setVisible(true);
        frame.setIconImage(new ImageIcon("C:/Users/jakob/Pictures/Vom Handy/Wichtig/jzlogo.jpg.jpg").getImage().getScaledInstance(10000, 10000, java.awt.Image.SCALE_SMOOTH));

        // actionListener for each button
        buttonComma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = input + ",";
                text.setText(input);
                if (count % 2 == 0) {
                    buttonComma.setBackground(Color.PINK);
                    count++;
                } else if (count % 2 == 1) {
                    buttonComma.setBackground(Color.RED);
                    count++;
                }
                System.out.println(count);
            }
        });
        buttonDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                text.getText();
                text.setText("");
                input = "";
            }
        });
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = input + 0;
                text.setText(input);
                System.out.println(text.getText());
                if (count % 2 == 0) {
                    button0.setBackground(Color.MAGENTA);
                    count++;
                } else if (count % 2 == 1) {
                    button0.setBackground(Color.RED);
                    count++;
                }
                System.out.println(count);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = input + 1;
                text.setText(input);
                if (count % 2 == 0) {
                    button1.setBackground(Color.MAGENTA);
                    count++;
                } else if (count % 2 == 1) {
                    button1.setBackground(Color.RED);
                    count++;
                }
                System.out.println(count);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = input + 2;
                text.setText(input);
                if (count % 2 == 0) {
                    button2.setBackground(Color.MAGENTA);
                    count++;
                } else if (count % 2 == 1) {
                    button2.setBackground(Color.RED);
                    count++;
                }
                System.out.println(count);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = input + 3;
                text.setText(input);
                if (count % 2 == 0) {
                    button3.setBackground(Color.MAGENTA);
                    count++;
                } else if (count % 2 == 1) {
                    button3.setBackground(Color.RED);
                    count++;
                }
                System.out.println(count);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = input + 4;
                text.setText(input);
                if (count % 2 == 0) {
                    button4.setBackground(Color.MAGENTA);
                    count++;
                } else if (count % 2 == 1) {
                    button4.setBackground(Color.RED);
                    count++;
                }
                System.out.println(count);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = input + 5;
                text.setText(input);
                if (count % 2 == 0) {
                    button5.setBackground(Color.MAGENTA);
                    count++;
                } else if (count % 2 == 1) {
                    button5.setBackground(Color.RED);
                    count++;
                }
                System.out.println(count);
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = input + 6;
                text.setText(input);
                if (count % 2 == 0) {
                    button6.setBackground(Color.MAGENTA);
                    count++;
                } else if (count % 2 == 1) {
                    button6.setBackground(Color.RED);
                    count++;
                }
                System.out.println(count);
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = input + 7;
                text.setText(input);
                if (count % 2 == 0) {
                    button7.setBackground(Color.MAGENTA);
                    count++;
                } else if (count % 2 == 1) {
                    button7.setBackground(Color.RED);
                    count++;
                }
                System.out.println(count);
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = input + 8;
                text.setText(input);
                if (count % 2 == 0) {
                    button8.setBackground(Color.MAGENTA);
                    count++;
                } else if (count % 2 == 1) {
                    button8.setBackground(Color.RED);
                    count++;
                }
                System.out.println(count);
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = input + 9;
                text.setText(input);
                if (count % 2 == 0) {
                    button9.setBackground(Color.MAGENTA);
                    count++;
                } else if (count % 2 == 1) {
                    button9.setBackground(Color.RED);
                    count++;
                }
                System.out.println(count);
            }
        });
        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = input + "/";
                text.setText(input);
                if (count % 2 == 0) {
                    buttonDivide.setBackground(Color.ORANGE);
                    count++;
                } else if (count % 2 == 1) {
                    buttonDivide.setBackground(Color.WHITE);
                    count++;
                }
                System.out.println(count);
            }
        });
        buttonMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = input + "*";
                text.setText(input);
                if (count % 2 == 0) {
                    buttonMulti.setBackground(Color.ORANGE);
                    count++;
                } else if (count % 2 == 1) {
                    buttonMulti.setBackground(Color.WHITE);
                    count++;
                }
                System.out.println(count);
            }
        });
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = input + "-";
                text.setText(input);
                if (count % 2 == 0) {
                    buttonMinus.setBackground(Color.ORANGE);
                    count++;
                } else if (count % 2 == 1) {
                    buttonMinus.setBackground(Color.WHITE);
                    count++;
                }
                System.out.println(count);
            }
        });
        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = input + "+";
                text.setText(input);
                if (count % 2 == 0) {
                    buttonPlus.setBackground(Color.ORANGE);
                    count++;
                } else if (count % 2 == 1) {
                    buttonPlus.setBackground(Color.WHITE);
                    count++;
                }
                System.out.println(count);
            }
        });
        buttonIs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Test");
                label.setVisible(true);
                text.getText();
                // checking if the text contains a comma, because Java can only handle dots
                if (input.contains(",")) {
                    inputNew = input.replace(",", ".");
                    System.out.println(inputNew);
                }else{
                    inputNew = input;
                }
                // execute the operations
//                if (inputNew.contains("+") && inputNew.contains("*")) {
//                    System.out.println("test");
//                    split = inputNew.split("\\+");
//                    split = inputNew.split("\\*");
//                    if (split.length >= 2) {
//                        result = Double.parseDouble(split[0]);
//                        for (int i = 1; i < split.length; i++) { //arrWerte.length, da wir ja unterschiedliche Längen bei den Arrays haben; z.B. bei 3 Zahlen = 3 Stellen im Array
//                            result = result + Double.parseDouble(split[i]) * Double.parseDouble(split[split.length - 1]);
//                        }
//                        System.out.println(result);
//                        interimResult = String.valueOf(result);
//                        // replacing the "." with "," again
//                        finalResult = "";
//                        if (interimResult.contains(".")) {
//                            finalResult = interimResult.replace(".", ",");
//                        }
//                        text.setText(String.valueOf(finalResult));
//                        System.out.println(finalResult);
//                    }
//                }
                if (inputNew.contains("+")) {
                    split = inputNew.split("\\+");
                    if (split.length >= 2) {
                        result = Double.parseDouble(split[0]);
                        for (int i = 1; i < split.length; i++) { //arrWerte.length, da wir ja unterschiedliche Längen bei den Arrays haben; z.B. bei 3 Zahlen = 3 Stellen im Array
                            result = result + Double.parseDouble(split[i]);
                        }
                        System.out.println(result);
                        interimResult = String.valueOf(result);
                        // replacing the "." with "," again
                        finalResult = "";
                        if (interimResult.contains(".")) {
                            finalResult = interimResult.replace(".", ",");
                        }
                        text.setText(String.valueOf(finalResult));
                    }
                } else if (inputNew.contains("-")) {
                    split = inputNew.split("\\-");
                    if (split.length >= 2) {
                        result = Double.parseDouble(split[0]);
                        for (int i = 1; i < split.length; i++) { //arrWerte.length, da wir ja unterschiedliche Längen bei den Arrays haben; z.B. bei 3 Zahlen = 3 Stellen im Array
                            result = result - Double.parseDouble(split[i]);
                        }
                        System.out.println(result);
                        interimResult = String.valueOf(result);
                        finalResult = "";
                        if (interimResult.contains(".")) {
                            finalResult = interimResult.replace(".", ",");
                        }
                        text.setText(String.valueOf(finalResult));
                    }
                } else if (inputNew.contains("*")) {
                    split = inputNew.split("\\*");
                    if (split.length >= 2) {
                        result = Double.parseDouble(split[0]);
                        for (int i = 1; i < split.length; i++) { //arrWerte.length, da wir ja unterschiedliche Längen bei den Arrays haben; z.B. bei 3 Zahlen = 3 Stellen im Array
                            result = result * Double.parseDouble(split[i]);
                        }
                        System.out.println(result);
                        interimResult = String.valueOf(result);
                        finalResult = "";
                        if (interimResult.contains(".")) {
                            finalResult = interimResult.replace(".", ",");
                        }
                        text.setText(String.valueOf(finalResult));
                    }
                } else if (inputNew.contains("/")) {
                    split = inputNew.split("\\/");
                    if (split.length >= 2) {
                        result = Double.parseDouble(split[0]);
                        for (int i = 1; i < split.length; i++) { //arrWerte.length, da wir ja unterschiedliche Längen bei den Arrays haben; z.B. bei 3 Zahlen = 3 Stellen im Array
                            result = result / Double.parseDouble(split[i]);
                        }
                        System.out.println(result);
                        interimResult = String.valueOf(result);
                        finalResult = "";
                        if (interimResult.contains(".")) {
                            finalResult = interimResult.replace(".", ",");
                        }
                        text.setText(String.valueOf(finalResult));
                    }
                }
                if (count % 2 == 0) {
                    buttonIs.setBackground(Color.blue);
                    buttonIs.setForeground(Color.white);
                    count++;
                } else if (count % 2 == 1) {
                    buttonIs.setBackground(Color.black);
                    buttonIs.setForeground(Color.white);
                    count++;
                }

                System.out.println(count);
            }
        });

    }


    public static void main(String[] args) {
        new Calculator();
    }
}
