package virus;

import javax.swing.*;

public class JOptionPane {


        public static void main(String[] args)  {
            while (true) {

                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (InstantiationException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (UnsupportedLookAndFeelException e) {
                    throw new RuntimeException(e);
                }
                javax.swing.JOptionPane.showMessageDialog(null, "Critical error #564AF3000A:AA", "System Failure", javax.swing.JOptionPane.ERROR_MESSAGE);



            }
        }
    }



