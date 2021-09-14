import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Years {
    private JPanel panel1;
    private JTextField textFieldYearOfBirdh;
    private JLabel labelYearOfBirth;
    private JTextField textFieldYearInCalendar;
    private JLabel yearInCalendarLabel;
    private JButton buttonCalculate;
    private JLabel labelResult;

    public Years() {
        buttonCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int birthYear = Integer.parseInt(textFieldYearOfBirdh.getText());
                int calendarYear = Integer.parseInt(textFieldYearInCalendar.getText());
                int yearOfLife = calendarYear - birthYear;

                labelResult.setText("Year of life is:  " + String.valueOf(yearOfLife));
                labelResult.setVisible(true);

                  /*JOptionPane.showMessageDialog(null, "Year of birth:   "
                          + birthYear + "\n And Calendar year is:    " + calendarYear +
                          "\n Year of life is:   " + yearOfLife);
*/
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Years");
        frame.setContentPane(new Years().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
