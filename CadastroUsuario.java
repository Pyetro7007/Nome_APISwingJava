// TRABALHO FEITO POR: Pyetro Fabrício Peterlini - 2°DS MTEC manhã
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
        JLabel labelSexo = new JLabel("Sexo: ");
        
        // Campos de Texto
        JTextField campoNomeCompleto = new JTextField(35);
        JTextField campoEmail = new JTextField(25);
        JTextField campoIdade = new JTextField(3);

        // Botões de selção do sexo
        JRadioButton botãoMasculino = new JRadioButton("Masculino");
        JRadioButton botãoFeminino = new JRadioButton("Feminino");

        // ButtonGroup para obrigar o usuário selecionar apenas 1
        ButtonGroup grupoSexo = new ButtonGroup();
        grupoSexo.add(botãoMasculino);
        grupoSexo.add(botãoFeminino);
        
        // Botões
        JButton botaoCadastrar = new JButton("Cadastrar");
        JButton botaoLimpar = new JButton("Limpar");
        
        // Ação do botão
        botaoCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = campoNomeCompleto.getText();
                String email = campoEmail.getText();
                String idade = campoIdade.getText();
                String sexo = botãoMasculino.isSelected() ? "Masculino" : botãoFeminino.isSelected() ? "Feminino" : "";

                    // Validação dos campos vazios
                    if (nome.isEmpty() || email.isEmpty() || idade.isEmpty() || sexo.isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "Por favor preencha os campos corretamente", "Erro de validação", JOptionPane.ERROR_MESSAGE);
                    } else {
                    // Exibe os dados cadastrados
                        JOptionPane.showMessageDialog(frame, "Usuário Cadastrado:" + "\nNome: " + nome + "\nEmail: " + email + "\nIdade: " + idade + "\nSexo: " + sexo);
                    }
            }
        });

        // Botão de limpar as informações
        botaoLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                campoNomeCompleto.setText("");
                campoEmail.setText("");
                campoIdade.setText("");
                grupoSexo.clearSelection();
            }
        });

        // Adincionando componentes ao frame
        frame.add(labelNomeCompleto);
        frame.add(campoNomeCompleto);
        frame.add(labelEmail);
        frame.add(campoEmail);
        frame.add(labelIdade);
        frame.add(campoIdade);
        frame.add(labelSexo);
        frame.add(botãoMasculino);
        frame.add(botãoFeminino);
        frame.add(botaoCadastrar);
        frame.add(botaoLimpar);

        // Exibir a janela
        frame.setVisible(true);
    }
}