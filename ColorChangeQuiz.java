import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeQuiz extends JFrame {
    private JButton[] buttons;
    private String[] quizAnswers = {"A", "B", "C", "D"}; // Example answers
    private String[] correctAnswers = {"A", "B", "C", "D"}; // Correct answers for the quiz
    private int score = 0; // Keeps track of the correct answers
    private JLabel scoreLabel;

    public ColorChangeQuiz() {
        // Set up the frame
        setTitle("Color Change Quiz");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1)); // GridLayout for buttons and label
        
        // Initialize buttons
        buttons = new JButton[4];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("Answer " + (char)('A' + i));
            buttons[i].setBackground(Color.LIGHT_GRAY);
            buttons[i].setOpaque(true);
            buttons[i].setBorderPainted(false);
            
            // Add ActionListener to each button
            final int index = i; // Save the current index for the listener
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    buttons[index].setBackground(Color.GREEN); // Change color on click
                    checkAnswer(index); // Check if the answer is correct
                }
            });
            add(buttons[i]);
        }
        
        // Label to display the score
        scoreLabel = new JLabel("Score: 0", SwingConstants.CENTER);
        add(scoreLabel);
    }

    // Method to check if the clicked button is the correct answer
    private void checkAnswer(int index) {
        if (quizAnswers[index].equals(correctAnswers[index])) {
            score++;
            scoreLabel.setText("Score: " + score); // Update the score
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ColorChangeQuiz().setVisible(true);
            }
        });
    }
}

