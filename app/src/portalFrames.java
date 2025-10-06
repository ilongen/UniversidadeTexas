import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
public class portalFrames {
    JFrame frame = new JFrame("Portal Universidade Texas");
    public portalFrames() {
        frame.setSize(1200,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

    }
}
