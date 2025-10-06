import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class framePadrao {
    // CRIANDO CONSTRUTOR
    public framePadrao() {
    JFrame frame = new JFrame("Portal Texas");
    JPanel painel = new JPanel();
    JLabel label = new JLabel();

    // CONFIGURANDO A TELA PADRAO
    frame.setSize(800, 600);
    painel.setSize(800, 600);
    label.setText("Seja muito bem-vindo ao Portal Texas");


    painel.add(label);
    frame.add(painel);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);

    }
}
