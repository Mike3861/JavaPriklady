import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class kalkulacka {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Kalkulačka App"); // vytvorime okno
        frame.setMinimumSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ked kliknem na X na okne (cize vo frame) tak sa zatvori standardne
        frame.setLocationRelativeTo(null); // vycentrovanie okna

        // JFrame by mal obsahovat panel, teda container JPanel
        JPanel panel = new JPanel();
        panel.setLayout(null); // layout pre panel bude null, cize prazdny
        //panel.setBackground(Color.RED);

        frame.setContentPane(panel); // my dany panel pridame do frame


        // JText
        JTextField textField = new JTextField();
        textField.setBounds(95, 20, 200, 30); // x, y, sirka, vyska
        textField.setHorizontalAlignment(JTextField.RIGHT);
        panel.add(textField);


        JLabel labelText = new JLabel("Zadaj číslo"); // popisok
        labelText.setBounds(160,50,150,20); // x, y, sirka, vyska
        panel.add(labelText);



        JButton btnNumber1 = new JButton("1"); // tlacidlo
        btnNumber1.setBounds(100, 80, 40, 40); // x, y, sirka, vyska
        panel.add(btnNumber1);

        btnNumber1.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "1");
            }
        });


        JButton btnNumber2 = new JButton("2"); // tlacidlo
        btnNumber2.setBounds(140, 80, 40, 40); // x, y, sirka, vyska
        panel.add(btnNumber2);

        btnNumber2.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "2");
            }
        });


        JButton btnPlus = new JButton("+"); // tlacidlo
        btnPlus.setBounds(180, 80, 40, 40); // x, y, sirka, vyska
        panel.add(btnPlus);

        btnPlus.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "+");
            }
        });


        JButton btnRovnaSa = new JButton("="); // tlacidlo
        btnRovnaSa.setBounds(220, 80, 40, 40); // x, y, sirka, vyska
        panel.add(btnRovnaSa);

        btnRovnaSa.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                ScriptEngineManager factory = new ScriptEngineManager();
                ScriptEngine engine = factory.getEngineByName("nashorn");
                String vzorec = textField.getText();
                try {
                    textField.setText(engine.eval(vzorec).toString()); // vysledok Stringu, ktory obsahuje vzorec vypisem
                } catch (ScriptException e1) {
                    throw new RuntimeException(e1);
                }
            }
        });


        JButton btnZmaz = new JButton("C"); // tlacidlo
        btnZmaz.setBounds(260, 80, 40, 40); // x, y, sirka, vyska
        panel.add(btnZmaz);

        btnZmaz.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                textField.setText(""); // Zmaze okno vzorca / vysledku
            }
        });



        // display it
        frame.pack();
        frame.setVisible(true);

    }
}