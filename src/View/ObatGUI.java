package View;
import Controller.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class ObatGUI {
    private static ControllerObat obate = new ControllerObat();
    JFrame Obat = new JFrame();
    JLabel top,labelrefnumber,labelnamaobat,labeljenisobat,labelharga;
    JTextField textrefnumber,textnamaobat,textjenisobat,textharga;
    JButton btnubahobat,btnhapus,btnback, btntambahobat;
    JTable tabelobat = new JTable();
    JScrollPane scrolobat = new JScrollPane(tabelobat);
    int index;

    public ObatGUI(){

        Obat.setSize(900,700);
        Obat.setLayout(null);
        Obat.getContentPane().setBackground(Color.pink);

        top = new JLabel("DATA OBAT");
        top.setBounds(130,10,600,50);
        top.setFont(new Font("Times New Roman", Font.BOLD,40));
        Obat.add(top);


        scrolobat.setBounds(300,180,600,270);
        tabelobat.setModel(obate.listobat());
        Obat.add(scrolobat);

        labelrefnumber = new JLabel("REFNUMBER");
        labelrefnumber.setBounds(30,150,100,30);
        Obat.add(labelrefnumber);

        textrefnumber = new JTextField();
        textrefnumber.setBounds(30,180,200,30);
        Obat.add(textrefnumber);

        labelnamaobat = new JLabel("NAMA OBAT");
        labelnamaobat.setBounds(30,210,100,30);
        Obat.add(labelnamaobat);

        textnamaobat = new JTextField();
        textnamaobat.setBounds(30,240,200,30);
        Obat.add(textnamaobat);

        labeljenisobat = new JLabel("JENISE OBAT");
        labeljenisobat.setBounds(30,270,100,30);
        Obat.add(labeljenisobat);

        textjenisobat = new JTextField();
        textjenisobat.setBounds(30,300,200,30);
        Obat.add(textjenisobat);

        labelharga = new JLabel("HARGA");
        labelharga.setBounds(30,330,200,30);
        Obat.add(labelharga);

        textharga = new JTextField();
        textharga.setBounds(30,360,200,30);
        Obat.add(textharga);

        btntambahobat = new JButton("Tambah Obat");
        btntambahobat.setBounds(50,470,150,30);
        Obat.add(btntambahobat);

        btnubahobat = new JButton("Ubah Obat");
        btnubahobat.setBounds(50,510,150,30);
        Obat.add(btnubahobat);

        btnhapus = new JButton("Hapus Obat");
        btnhapus.setBounds(50,550,150,30);
        Obat.add(btnhapus);

        btnback = new JButton("BACK");
        btnback.setBounds(30, 600, 100, 30);
        btnback.setBackground(Color.lightGray);
        Obat.add(btnback);

        Obat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Obat.setVisible(true);
        Obat.setLocationRelativeTo(null);

        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Obat.dispose();
                PetugasGUI petugas = new PetugasGUI();
            }
        });

        btntambahobat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String namaobat =  textnamaobat.getText();
                    String jenisobat = textjenisobat.getText();
                    String harga = textharga.getText();
                    String refnumber = textrefnumber.getText();
                    AllObjController.obat.insert(namaobat,jenisobat,harga,refnumber);
                    JOptionPane.showMessageDialog(null,"Input Obat Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                    tabelobat.setModel(AllObjController.obat.listobat());
                    reset();

                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Fomat penulisan salah","Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } );

        btnubahobat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String namaobat =  textnamaobat.getText();
                    String jenisobat = textjenisobat.getText();
                    String harga = textharga.getText();
                    String refnumber = textrefnumber.getText();
                    AllObjController.obat.update(index,namaobat,jenisobat,harga,refnumber);
                    JOptionPane.showMessageDialog(null,"Ubah Obat Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                    reset();
                    tabelobat.setModel(AllObjController.obat.listobat());
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Fomat penulisan salah","Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } );
        tabelobat.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelobat.getSelectedRow();
                index=i;
                textrefnumber.setText(AllObjController.obat.listobat().getValueAt(i, 3).toString());
                textnamaobat.setText(AllObjController.obat.listobat().getValueAt(i, 0).toString());
                textjenisobat.setText(AllObjController.obat.listobat().getValueAt(i, 1).toString());
                textharga.setText(AllObjController.obat.listobat().getValueAt(i, 2).toString());
            }
        });

        btnhapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{

                    AllObjController.obat.delete(index);
                    JOptionPane.showMessageDialog(null,"Hapus obat Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                    tabelobat.setModel(AllObjController.obat.listobat());
                    reset();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Fomat penulisan salah","Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

    }
    void reset(){
        textrefnumber.setText(null);//ISI
        textnamaobat.setText(null);
        textjenisobat.setText(null);
        textharga.setText(null);
    }
}

