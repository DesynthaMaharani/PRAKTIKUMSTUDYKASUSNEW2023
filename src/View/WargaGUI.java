package View;
import Controller.*;
import Entity.PetugasEntity;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class WargaGUI {
    private static ControllerPetugas ptugs = new ControllerPetugas();
    JFrame Petugas = new JFrame();
    JLabel top, labelid, labelnama;
    JTextField textid, textnama;
    JButton btnhapuspetugas, btnback, btntambahpetugas;
    JTable tabelpetugas = new JTable();
    JScrollPane scrolpetugas = new JScrollPane(tabelpetugas);
    int index;

    public WargaGUI() {

        Petugas.setSize(900, 700);
        Petugas.setLayout(null);
        Petugas.getContentPane().setBackground(Color.orange);
        top = new JLabel("DATA PETUGAS");
        top.setBounds(130, 10, 600, 50);
        top.setFont(new Font("Times New Roman", Font.BOLD, 40));
        Petugas.add(top);

        // membuat tabel
        scrolpetugas.setBounds(300, 180, 570, 270);
        tabelpetugas.setModel(ptugs.listpetugas());
        Petugas.add(scrolpetugas);

        labelid = new JLabel("ID Petugas");
        labelid.setBounds(30, 150, 100, 30);
        Petugas.add(labelid);

        textid = new JTextField();
        textid.setBounds(30, 180, 200, 30);
        Petugas.add(textid);

        labelnama = new JLabel("Nama Petugas");
        labelnama.setBounds(30, 210, 100, 30);
        Petugas.add(labelnama);

        textnama = new JTextField();
        textnama.setBounds(30, 240, 200, 30);
        Petugas.add(textnama);

        btntambahpetugas = new JButton("Tambah Petugas");
        btntambahpetugas.setBounds(30, 420, 200, 30);
        Petugas.add(btntambahpetugas);

        btnhapuspetugas = new JButton("Hapus Petugas");
        btnhapuspetugas.setBounds(50, 460, 150, 30);
        Petugas.add(btnhapuspetugas);

        btnback = new JButton("BACK");
        btnback.setBounds(30, 570, 100, 30);
        btnback.setBackground(Color.lightGray);
        Petugas.add(btnback);

        Petugas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Petugas.setVisible(true);
        Petugas.setLocationRelativeTo(null);

        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Petugas.dispose();
                PetugasEntity petugas = new PetugasEntity();
            }
        });
        btntambahpetugas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nama = textnama.getText();
                    String id = textid.getText();
                    AllObjController.petugas.insert(nama,id);
                    tabelpetugas.setModel(AllObjController.petugas.listpetugas());
                    JOptionPane.showMessageDialog(null, "Input Petugas Sukses", "Information", JOptionPane.INFORMATION_MESSAGE);
                    reset();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Fomat penulisan salah", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        tabelpetugas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelpetugas.getSelectedRow();
                index = i;
                textid.setText(AllObjController.petugas.listpetugas().getValueAt(i, 0).toString());
                textnama.setText(AllObjController.petugas.listpetugas().getValueAt(i, 1).toString());
            }
        });

        btnhapuspetugas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    AllObjController.petugas.delete(index);
                    JOptionPane.showMessageDialog(null, "Hapus Petugas Sukses", "Information", JOptionPane.INFORMATION_MESSAGE);
                    tabelpetugas.setModel(AllObjController.petugas.listpetugas());
                    reset();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Fomat penulisan salah", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
        void reset() {
            textid.setText(null);
            textnama.setText(null);
        }
}

