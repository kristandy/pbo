package week13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class App {
    private JFrame frame;
    private JTextField textFieldNama;
    private JTextField textFieldAlamat;
    private JTextField textFieldNoTelp;
    private JTextField textFieldTotalBayar;
    private JTextArea textAreaPesanan;
    private JButton btnTambah;
    private JCheckBox chckbxSteak;
    private JCheckBox chckbxSphageti;
    private JCheckBox chckbxPizza;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    App window = new App();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public App() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Aplikasi Pemesanan Makanan");
        frame.setBounds(100, 100, 600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNama = new JLabel("Nama:");
        lblNama.setBounds(20, 30, 60, 15);
        frame.getContentPane().add(lblNama);

        textFieldNama = new JTextField();
        textFieldNama.setBounds(90, 30, 200, 20);
        frame.getContentPane().add(textFieldNama);
        textFieldNama.setColumns(10);

        JLabel lblAlamat = new JLabel("Alamat:");
        lblAlamat.setBounds(20, 60, 60, 15);
        frame.getContentPane().add(lblAlamat);

        textFieldAlamat = new JTextField();
        textFieldAlamat.setBounds(90, 60, 200, 20);
        frame.getContentPane().add(textFieldAlamat);
        textFieldAlamat.setColumns(10);

        JLabel lblNoTelp = new JLabel("No Telp:");
        lblNoTelp.setBounds(20, 90, 60, 15);
        frame.getContentPane().add(lblNoTelp);

        textFieldNoTelp = new JTextField();
        textFieldNoTelp.setBounds(90, 90, 200, 20);
        frame.getContentPane().add(textFieldNoTelp);
        textFieldNoTelp.setColumns(10);

        chckbxSteak = new JCheckBox("Steak");
        chckbxSteak.setBounds(342, 30, 100, 20);
        frame.getContentPane().add(chckbxSteak);

        chckbxSphageti = new JCheckBox("Sphageti");
        chckbxSphageti.setBounds(342, 50, 100, 20);
        frame.getContentPane().add(chckbxSphageti);

        chckbxPizza = new JCheckBox("Pizza");
        chckbxPizza.setBounds(342, 70, 100, 20);
        frame.getContentPane().add(chckbxPizza);

        btnTambah = new JButton("Tambah");
        btnTambah.setBounds(418, 191, 80, 20);
        frame.getContentPane().add(btnTambah);
        
        textAreaPesanan = new JTextArea();
        textAreaPesanan.setBounds(20, 217, 545, 235);
        frame.getContentPane().add(textAreaPesanan);

        textFieldTotalBayar = new JTextField();
        textFieldTotalBayar.setBounds(302, 160, 200, 20);
        frame.getContentPane().add(textFieldTotalBayar);
        textFieldTotalBayar.setColumns(10);

        JLabel lblTotalBayar = new JLabel("Total Bayar:");
        lblTotalBayar.setBounds(302, 140, 100, 15);
        frame.getContentPane().add(lblTotalBayar);
        
        JScrollPane scrollPane = new JScrollPane(textAreaPesanan);
        scrollPane.setBounds(20, 217, 545, 235);
        frame.getContentPane().add(scrollPane);
        
        chckbxSteak.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                updateTotal();
            }
        });

        chckbxSphageti.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                updateTotal();
            }
        });

        chckbxPizza.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                updateTotal();
            }
        });
        
        btnTambah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                
                String nama = textFieldNama.getText();
                String alamat = textFieldAlamat.getText();
                String noTelp = textFieldNoTelp.getText();

                int harga = 0;

                textAreaPesanan.append("Nama: " + nama + "\n");
                textAreaPesanan.append("Alamat: " + alamat + "\n");
                textAreaPesanan.append("No.HP: " + noTelp + "\n");
                textAreaPesanan.append("--------------------------------------------------------------------\n");
                textAreaPesanan.append("Pesanan:\n");
            
                if (chckbxSteak.isSelected()) {
                    harga = 40000;
                    textAreaPesanan.append("- Steak (" + harga + ")\n");
                }
                if (chckbxSphageti.isSelected()) {
                    harga = 80000;
                    textAreaPesanan.append("- Sphageti (" + harga + ")\n");
                }
                if (chckbxPizza.isSelected()) {
                    harga = 100000;
                    textAreaPesanan.append("- Pizza (" + harga + ")\n");
                }
                textAreaPesanan.append("\n");
            }
        });
    }

    private void updateTotal() {
        int total = 0;

        if (chckbxSteak.isSelected()) {
            total += 40000;
        }
        if (chckbxSphageti.isSelected()) {
            total += 80000;
        }
        if (chckbxPizza.isSelected()) {
            total += 100000;
        }

        textFieldTotalBayar.setText(Integer.toString(total));
    }
}