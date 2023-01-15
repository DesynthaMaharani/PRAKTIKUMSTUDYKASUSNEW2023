package View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PetugasGUI {
    JFrame LogReg = new JFrame();
    JLabel top;
    JButton btnobat, btnwarga,btnback;

    public PetugasGUI(){
        LogReg.setSize(900,700);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.cyan);
        top = new JLabel("=MENU UTAMA=");
        top.setBounds(270,10,700,40);
        top.setFont(new Font("Times New Roman", Font.BOLD,40));
        LogReg.add(top);

        btnobat = new JButton("Data Obat");
        btnobat.setBounds(270,150,300,50);
        btnobat.setBackground(Color.white);
        LogReg.add(btnobat);

        btnwarga = new JButton("Data Petugas");
        btnwarga.setBounds(270,250,300,50);
        btnwarga.setBackground(Color.white);
        LogReg.add(btnwarga);

        btnback = new JButton("EXIT");
        btnback.setBounds(30, 600, 100, 30);
        btnback.setBackground(Color.lightGray);
        LogReg.add(btnback);

        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);

        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LogReg.dispose();
                LoginGUI logingui = new LoginGUI();
            }
        });
        btnobat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ObatGUI obatgui = new ObatGUI();
            }
        });

        btnwarga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WargaGUI wargagui = new WargaGUI();
            }
        });

    }
}