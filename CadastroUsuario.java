import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CadastroUsuario {
    public static void main(String[] args) {
        // Criação do frame (janela)
        JFrame frame = new JFrame("Cadastro de Usuario");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Rótulos 
        JLabel labelNomeCompleto = new JLabel("Nome Completo:");
        JLabel labelEmail = new JLabel("Email:");
        JLabel labelIdade = new JLabel("Idade:");
        
        // Campos de Texto
        JTextField campoNomeCompleto = new JTextField(35);
        JTextField campoEmail = new JTextField(25);
        JTextField campoIdade = new JTextField(3);

        // Botão
        JButton botaoCadastrar = new JButton("Cadastrar");
        
        // Ação do botão
        botaoCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = campoNomeCompleto.getText();
                String email = campoEmail.getText();
                String idade = campoIdade.getText();
                JOptionPane.showMessageDialog(frame, "Usuário Cadastrado:" + "\nNome: " + nome + "\nEmail: " + email + "\nIdade: " + idade);
            }
        });

        // Adincionando componentes ao frame
        frame.add(labelNomeCompleto);
        frame.add(campoNomeCompleto);
        frame.add(labelEmail);
        frame.add(campoEmail);
        frame.add(labelIdade);
        frame.add(campoIdade);
        frame.add(botaoCadastrar);

        // Exibir a janela
        frame.setVisible(true);
    }
}