import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class RegistrationForm extends JDialog {
    private JTextField tfName;
    private JTextField tfEmail;
    private JTextField tfPhone;
    private JTextField tfAddress;
    private JPasswordField tfPassword;
    private JPasswordField tfConformPassword;
    private JButton btRegister;
    private JButton btCancle;
    private JPanel registrationPanel;


    public RegistrationForm(JFrame parent) {
        super(parent);
        setTitle("Create a new Account");
        setContentPane(registrationPanel);
        setMinimumSize(new Dimension(450,
                                     474));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        btRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }
        });
        btCancle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }

    private void registerUser() {

        String name = tfName.getText();
        String email = tfEmail.getText();
        String phone = tfPhone.getText();
        String address = tfAddress.getText();
        String password = String.valueOf(tfPassword.getPassword());
        String ConformPassword = String.valueOf(tfConformPassword.getPassword());

        if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                                          "Please enter all fields",
                                          "Try again",
                                          JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!password.equals(ConformPassword)) {
            JOptionPane.showMessageDialog(this,
                                          "Conform Password Didn't Matched",
                                          "Try again",
                                          JOptionPane.ERROR_MESSAGE);
            return;
        }
        user=addUserToDatabase(name, email, phone, address, password);
        if (user != null){
            dispose();
        }
        else {
            JOptionPane.showMessageDialog(this,
                                          "Failed to register new user",
                                          "Try again",
                                          JOptionPane.ERROR_MESSAGE);
        }
    }

    public User user;
    private User addUserToDatabase(String name,
                           String email,
                           String phone,
                           String address,
                           String password) {
        User user = null;
            final String DB_URL = "jdbc:mysql://localhost/mysql?serverTimezone=UTC";
            final String USERNAME = "root";
            final String PASSWORD = "";


        try {
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
//            connected to database successfully
            Statement stat = conn.createStatement();

            String sql = "INSERT INTO users (name, email, phone, address, password) " + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, phone);
            preparedStatement.setString(4, address);
            preparedStatement.setString(5, password);
            //Insert row into the table

            int addedRows = preparedStatement.executeUpdate();
            if (addedRows > 0) {
                user = new User();
                user.name = name;
                user.email = email;
                user.phone = phone;
                user.address = address;
                user.password = password;
            }
            stat.close();
            conn.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }

    public static void main(String[] args) {
        RegistrationForm myForm = new RegistrationForm(null);
        User user = myForm.user;
        if (user != null){
            System.out.println("Successful Registration of " + user.name);
        }
        else {
            System.out.println("Registration Cancelled.");
        }
    }
}
