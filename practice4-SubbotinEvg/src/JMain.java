import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JMain extends JFrame {
    private int scoreACMilan = 0;
    private int scoreRealMadrid = 0;

    private final String nameACMilan = "AC Milan";
    private final String nameRealMadrid = "Real Madrid";

    private String lastScorer = "N/A";

    JButton buttonACMilan = new JButton("AC Milan");
    JButton buttonRealMadrid = new JButton("Real Madrid");

    JLabel labelResult = new JLabel();
    JLabel labelLastScorer = new JLabel();
    JLabel labelWinner = new JLabel();

    Font font = new Font("Times new roman", Font.BOLD, 20);

    JPanel[] jPanels = new JPanel[4];

    JMain() {
        super("Результаты матчей");
        setLayout(new GridLayout(4, 1));
        setSize(600, 600);

        for (int i = 0; i < jPanels.length; i++) {
            jPanels[i] = new JPanel();
            jPanels[i].setLayout(new FlowLayout());
            add(jPanels[i]);
        }

        jPanels[0].add(buttonACMilan);
        jPanels[0].add(buttonRealMadrid);
        jPanels[1].add(labelResult);
        jPanels[2].add(labelLastScorer);
        jPanels[3].add(labelWinner);

        buttonACMilan.setFont(font);
        buttonRealMadrid.setFont(font);
        labelResult.setFont(font);
        labelLastScorer.setFont(font);
        labelWinner.setFont(font);

        setData();

        buttonACMilan.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                scoreACMilan++;
                lastScorer = nameACMilan;
                setData();
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

        buttonRealMadrid.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                scoreRealMadrid++;
                lastScorer = nameRealMadrid;
                setData();
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

        setVisible(true);
    }

    private void setData() {
        labelResult.setText(getResult());
        labelLastScorer.setText(getLastScorer());
        labelWinner.setText(getWinner());
    }

    private String getResult() {
        return "Result " + scoreACMilan + " X " + scoreRealMadrid;
    }

    private String getLastScorer() {
        return "Last Scorer: " + lastScorer;
    }

    private String getWinner() {
        String winner = "DRAW";

        if (scoreRealMadrid > scoreACMilan) {
            winner = nameRealMadrid;
        } else if (scoreRealMadrid < scoreACMilan) {
            winner = nameACMilan;
        }
        return "Winner: " + winner;
    }

    public static void main(String[] args) {
        new JMain();
    }
}
