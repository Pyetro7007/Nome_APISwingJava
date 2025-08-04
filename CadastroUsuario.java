import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CadastroUsuario {
    public static void main(String[] args) {
        // Criação do frame (janela)
        JFrame frame = new JFrame("Exemplo Simples com Swing");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Rótulos 
        JLabel labelNome = new JLabel("Nome:");
        JLabel labelSobrenome = new JLabel("Sobrenome:");

        // Campos de Texto
        JTextField campoNome = new JTextField(10);
        JTextField campoSobrenome = new JTextField(10);

        // Botão
        JButton botaoSaudar = new JButton("Saudar");
        
        // Ação do botão
        botaoSaudar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomeCompleto = campoNome.getText() + " " + campoSobrenome.getText();
                JOptionPane.showMessageDialog(frame, "Olá, " + nomeCompleto + "!");
            }
        });

        // Adincionando componentes ao frame
        frame.add(labelNome);
        frame.add(campoNome);
        frame.add(labelSobrenome);
        frame.add(campoSobrenome);
        frame.add(botaoSaudar);

        // Exibir a janela
        frame.setVisible(true);
    }
}