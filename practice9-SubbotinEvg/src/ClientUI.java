import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ClientUI extends JFrame {
    private final JLabel jLabelINN = new JLabel("ИНН: ");
    private final TextField textFieldINN = new TextField(20);

    private final JLabel jLabelFullName = new JLabel("ФИО: ");
    private final TextField textFieldFullName = new TextField(20);

    private final JButton button = new JButton("Проверить");

    private final Font font = new Font("Times new roman", Font.BOLD, 20);

    private final JPanel[] jPanels = new JPanel[3];

    ClientUI() {
        super("Проверка ИНН у пользователя");

        setInitFont();
        initLayout();
        addEventListenerButtonByClick();

        setSize(600, 600);
        setVisible(true);
    }

    private void initLayout(){
        setLayout(new GridLayout(jPanels.length, 1));

        for (int i = 0; i < jPanels.length; i++) {
            jPanels[i] = new JPanel();
            jPanels[i].setLayout(new FlowLayout());
            add(jPanels[i]);
        }

        jPanels[0].add(jLabelFullName);
        jPanels[0].add(textFieldFullName);
        jPanels[1].add(jLabelINN);
        jPanels[1].add(textFieldINN);
        jPanels[2].add(button);
    }

    private void setInitFont() {
        jLabelINN.setFont(font);
        textFieldINN.setFont(font);

        jLabelFullName.setFont(font);
        textFieldFullName.setFont(font);

        button.setFont(font);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    private void addEventListenerButtonByClick() {
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Main.checkClient(textFieldINN.getText(), textFieldFullName.getText());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}
