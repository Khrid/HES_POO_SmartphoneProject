import smartphone.Smartphone;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Starting smartphone...");

        try { // Pour utiliser l'app    arence du système et non le look dégeu par défaut de Java
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception ignored){}
        Smartphone s = new Smartphone();
        s.setVisible(true);
    }
}
