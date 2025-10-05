import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class framePadrao {
    // CRIANDO INSTANCIAS DOS OBJETOS
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
}
}
