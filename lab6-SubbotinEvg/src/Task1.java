import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Task1 extends JFrame {
    JLabel labelInstruction = new JLabel("Угадайте число от 0 до 20");
    JTextField input = new JTextField(10);
    JButton button = new JButton("Выбрать");
    JLabel labelMessage = new JLabel();

    JPanel[] jPanel = new JPanel[5];

    int numberOfAttempts;

    int answer;

    Font font = new Font("Times new roman", Font.BOLD, 20);

    Task1(){
        super("Игра-угадайка");

        setInitData();

        setLayout(new GridLayout(jPanel.length, 1));

        for (int i = 0; i < jPanel.length; i++) {
            jPanel[i] = new JPanel();
            add(jPanel[i]);
        }

        jPanel[1].add(labelInstruction);
        jPanel[2].add(input);
        jPanel[2].add(button);
        jPanel[3].add(labelMessage);

        labelInstruction.setFont(font);
        input.setFont(font);
        button.setFont(font);
        labelMessage.setFont(font);

        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                boolean hasReply = false;
                int reply = JOptionPane.YES_OPTION;

                String textMessage = "Начать игру заново?";

                if (answer == Integer.parseInt(input.getText())) {
                    reply = JOptionPane.showConfirmDialog(Task1.this,
                            "Вы выйграли!\n" + textMessage);
                    hasReply = true;
                } else {
                    numberOfAttempts--;

                    if (numberOfAttempts == 0) {
                        reply = JOptionPane.showConfirmDialog(Task1.this,
                                "Вы проиграли!\n" + textMessage);
                        hasReply = true;
                    }

                    setMessage();
                }

                if (hasReply) {
                    if (reply == JOptionPane.YES_OPTION) {
                        setInitData();

                    } else {
                        System.exit(0);
                    }
                }
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

        setSize(600, 600);
        setVisible(true);
    }

    public void setInitData() {
        input.setText("");
        answer = (int) (Math.random() * 21);
        numberOfAttempts = 3;
        setMessage();
    }

    public void setMessage() {
        labelMessage.setText("Осталось количество попыток: " + numberOfAttempts + " " + answer);
    }

    public static void main(String[] args) {
        new Task1();
    }
}
