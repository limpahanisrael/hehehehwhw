import java.awt.*;
import javax.swing.*;

public class year {

    public static void main(String[] args){

        JFrame frame = new JFrame("je yo ay");
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout (FlowLayout.LEFT, 20, 10));

        JLabel lblName = new JLabel("First Name");
        JTextField txtName = new JTextField(30);
        JLabel lblLastname = new JLabel("Last Name");
        JTextField txtLastname = new JTextField(30);
        String[] yearLevels = {"select year level", "1st Year", "2nd Year", "3rd Year", "4th Year"};
        JLabel age = new JLabel("rayt ur ij");
        JTextField txtAge = new JTextField (30);
        JLabel lblYear = new JLabel("Year Level");

        JComboBox<String> cmbYear = new JComboBox<>(yearLevels);

        JLabel lblStudentType = new JLabel("Multiple Choice");
        JRadioButton a = new JRadioButton("BSIT");
        JRadioButton b = new JRadioButton("TLE");
        JRadioButton c = new JRadioButton("BFPT");

        ButtonGroup StudentType = new ButtonGroup();
        StudentType.add(a);
        StudentType.add(b);
        StudentType.add(c);

        JLabel lblMenu = new JLabel("VIAND");
        JCheckBox FViand = new JCheckBox("papaitan");
        JCheckBox SViand = new JCheckBox("dinuguan");
        JCheckBox TViand = new JCheckBox("Kari-kari");
        JCheckBox FoViand = new JCheckBox("adobong browni");

        JLabel lblAddress = new JLabel("Adress: ");
        JTextArea txtAddress = new JTextArea(5, 30);
        txtAddress.setLineWrap(true); 
        txtAddress.setWrapStyleWord(true);
        
        JButton btnStart = new JButton("Start");
        JButton btnStop = new JButton("Stop");

        frame.add(lblName);
        frame.add(txtName);
        frame.add(lblLastname);
        frame.add(txtLastname);
        frame.add(age);
        frame.add(txtAge);
        frame.add(lblYear);
        frame.add(cmbYear);
        frame.add(lblStudentType);
        frame.add(a);
        frame.add(b);
        frame.add(c);
        frame.add(lblMenu);
        frame.add(FViand);
        frame.add(SViand);
        frame.add(TViand);
        frame.add(FoViand);
        frame.add(lblAddress);
        frame.add(txtAddress);
        frame.add(btnStart);
        frame.add(btnStop);

        btnStart.addActionListener(e ->{
            String Name = txtName.getText().trim();
            String Lastname = txtLastname.getText().trim();
            String ageText = txtAge.getText().trim();
            String yearLevel = cmbYear.getSelectedItem().toString();
            String student;
            if(a.isSelected()){
                student = "BSIT";
            }else if (b.isSelected()) {
                student = "TLE";                
            }else{
                student = "BFPT";
            }
            String menu = " ";
            if (FViand.isSelected()){
                menu += "papaitan, ";
            }
            if(SViand.isSelected()){
                menu += "dinuguan, ";
            }
            if(TViand.isSelected()){
                menu += "Kari-kari, ";
            }
            if(FoViand.isSelected()){
                menu += "adobong browni ";
            }
            
            
            String message = "DATA ENTRY\n\n" + "FIRST NAME:\n " +
            Name +"\nLAST NAME:\n " + Lastname + "\nAGE:\n" + ageText + "\nYEAR:\n"
            + yearLevel + "\nSTUDENT COURSE:\n" + student + "\nVIAND\n" + menu;



            JOptionPane.showMessageDialog(frame, message, "Succesful",
            JOptionPane.INFORMATION_MESSAGE);});
        

        frame.setVisible(true);
    }


}
