import javax.swing.*;

/**
 * User: Chittra Kumari
 * Date: 26-02-2022
 * IDE: IntelliJ IDEA
 * File: PACKAGE_NAME.Main.java
 * JDK: Oracle JDK 17
 */

public class Main {
    public static void main(String[] args) {
        Teacher object = new Teacher(12345, "Chittra", "Kumari", 9434053111L);

        JOptionPane.showMessageDialog(null, object.FirstName(), "FirstNameOfTeacher", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, object, "Feilds Of Object", JOptionPane.PLAIN_MESSAGE);
    }
}
