import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.DoubleToIntFunction;

public class SistemaMedia {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Cálculo da Média - Aluno");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);


        JLabel labelNome = new JLabel("Nome do Aluno:");
        labelNome.setBounds(20,20,120,25);
        frame.add(labelNome);

        JTextField campoNome = new JTextField();
        campoNome.setBounds(150,20,200,25);
        frame.add(campoNome);

        JLabel labelNota1 = new JLabel("Nota 1:");
        labelNota1.setBounds(20,60,120,25);
        frame.add(labelNota1);

        JTextField campoNota1 = new JTextField();
        campoNota1.setBounds(150,60,200,25);
        frame.add(campoNota1);

        JLabel labelNota2 = new JLabel("Nota 2:");
        labelNota2.setBounds(20,100,120,25);
        frame.add(labelNota2);

        JTextField campoNota2 = new JTextField();
        campoNota2.setBounds(150,100,200,25);
        frame.add(campoNota2);

        JButton botaoCalcular = new JButton("Calcular Média");
        botaoCalcular.setBounds(120,140,140,30);
        frame.add(botaoCalcular);

        JLabel labelResultado = new JLabel("");
        labelResultado.setBounds(20,180,350,25);
        frame.add(labelResultado);

        botaoCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText();
                String nota1Texto = campoNota1.getText();
                String nota2Texto = campoNota2.getText();

                if (nome.isEmpty() || nota1Texto.isEmpty() || nota2Texto.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try {
                    double nota1 = Double.parseDouble(nota1Texto);
                    double nota2 = Double.parseDouble(nota2Texto);
                    double media = (nota1 + nota2) / 2;

                    if (media >= 6.0) {
                        labelResultado.setText("Aprovado com média " + media);
                    } else {
                        labelResultado.setText("Reprovado com média " + media);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Digite valores válidos para as notas!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}
