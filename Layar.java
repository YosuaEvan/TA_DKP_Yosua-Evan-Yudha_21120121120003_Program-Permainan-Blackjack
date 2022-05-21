import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Stack;

public class Layar {
    // 1) Variabel
    // 2) Function
    // 3) Pengkondisian
    // 4) Stack
    // 5) Loop
    // 6) GUI

    public String card[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    public String CardType[] = {"♠", "♥", "♦", "♣"};
    public String new_card; //Temporary Variable
    public boolean busted = false;
    private JPanel Panel;
    private JButton StandButton;
    private JButton HitButton;
    private JButton StartButton;
    private JButton ResetButton;
    private JButton ContinueButton;
    private JLabel WinText;
    private JLabel Title;

    // Variabel untuk Player
    private JLabel Player;
    private JLabel PlayerCard;
    public int PlayerHas; // total nilai kartu
    public int TotalPlayerAce;

    // Variabel untuk dealer
    private JLabel Dealer;
    private JLabel DealerCard;
    public int DealerHas;
    public int TotalDealerAce;

    Stack PlayerStack = new Stack();
    Stack DealerStack = new Stack();

    public Layar() {
        StartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StartGame();
                ResetButton.setVisible(true);
                StartButton.setVisible(false);
            }
        });
        ResetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlayerHas = 0;
                DealerHas = 0;
                TotalPlayerAce = 0;
                TotalDealerAce = 0;
                Player.setText("Player");
                Dealer.setText("Dealer");
                PlayerCard.setText("");
                DealerCard.setText("");
                WinText.setText("");
                PlayerStack.clear();
                DealerStack.clear();
                ResetButton.setVisible(false);
                StartButton.setVisible(true);
                HitButton.setVisible(false);
                StandButton.setVisible(false);
            }
        });
        HitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hit();
            }
        });
        StandButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Stand();
            }
        });
        ContinueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Continue();
            }
        });
    }

    // Menampilkan GUI
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tugas DKP");
        frame.setContentPane(new Layar().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400, 300);
        frame.setResizable(true);
    }

    // Start Game
    public void StartGame() {
        HitButton.setVisible(true);
        StandButton.setVisible(true);
        for (int i = 1; i <= 2; i++) {
            PlayerAddCard();
        }
        WinText.setText("");
        if (PlayerHas == 21) {
            Blackjack();
        }

        DealerAddCard();
        DealerCard.setText(DealerStack.toString().replace("[","").replace("]","")+ " [?]");
    }

    // Random Card to Player
    public void PlayerAddCard() {
        Random random = new Random();
        int index = random.nextInt(13);
        String new_card = card[index];
        index = random.nextInt(4);
        PlayerStack.push(new_card + CardType[index] + "  ");
        PlayerCardCount(new_card);
        PlayerCard.setText(PlayerStack.toString().replace("[","").replace("]","").replace(",",""));
    }

    // Random Card to Dealer
    public void DealerAddCard() {
        Random random = new Random();
        int index = random.nextInt(13);
        String new_card = card[index];
        index = random.nextInt(4);
        DealerStack.push(new_card + CardType[index] + "  ");
        DealerCardCount(new_card);
        DealerCard.setText(DealerStack.toString().replace("[","").replace("]","").replace(",",""));
    }

    // Hit Button
    public void Hit() {
        PlayerAddCard();
    }

    //Stand Button
    public void Stand() {
        StandButton.setVisible(false);
        HitButton.setVisible(false);
        ResetButton.setVisible(false);
        ContinueButton.setVisible(true);
    }

    // Black Jack Condition
    public void Blackjack() {
        WinText.setFont(new Font(WinText.getName(),Font.BOLD,20));
        WinText.setForeground(Color.ORANGE);
        WinText.setText("BLACKJACK! You Win!");
        WinText.setFont(new Font(WinText.getName(),Font.BOLD,16));
        StandButton.setVisible(false);
        HitButton.setVisible(false);
        ResetButton.setVisible(true);
    }

    // Continue
    public void Continue() {
        DealerAddCard();
    }

    // is the card Busted
    public void isBusted() {
        if (PlayerHas > 21) {
            WinText.setText("Busted!");
            StandButton.setVisible(false);
            HitButton.setVisible(false);
            DealerAddCard();
            busted = true;
            FinalCount();
            StandButton.setVisible(false);
            HitButton.setVisible(false);
            ResetButton.setVisible(true);
        }
    }

    // Count PlayerCard
    public void PlayerCardCount(String card) {
        int plus;
        switch (card) {
            case "A":
                plus = 1;
                TotalPlayerAce += 1;
                break;
            case "J":
            case "Q":
            case "K":
                plus = 10;
                break;
            default:
                int value = Integer.parseInt(card);
                plus = value;
        }

        PlayerHas += plus;

        if (TotalPlayerAce > 0) {
            if (PlayerHas + 10 <= 21) {
                PlayerHas += 10;
            }else if(PlayerHas > 21) {
                PlayerHas -= 10;
                TotalPlayerAce -= 1;
            }
        }


        isBusted();

        Player.setText("Player (" + PlayerHas + ")");
    }

    // Count Dealer Card
    public void DealerCardCount(String card) {
        int plus;
        switch (card) {
            case "A":
                TotalDealerAce += 1;
                plus = 1;
                break;
            case "J":
            case "Q":
            case "K":
                plus = 10;
                break;
            default:
                int value = Integer.parseInt(card);
                plus = value;
        }

        DealerHas += plus;

        if (DealerHas == 1) {
            Dealer.setText("Dealer (1/11)");
        } else {
            Dealer.setText("Dealer (" + DealerHas + ")");
        }

        if (TotalDealerAce > 0) {
            if (DealerHas + 10 <= 21) {
                DealerHas += 10;
                Dealer.setText("Dealer (" + DealerHas + ")");
            }else if(DealerHas > 21){
                DealerHas -= 10;
                TotalDealerAce -= 1;
                Dealer.setText("Dealer (" + DealerHas + ")");
            }
        }

        if (DealerHas >= 17) {
            ContinueButton.setVisible(false);
            ResetButton.setVisible(true);
            FinalCount();
        }
    }

    // Print Winning Text
    public void FinalCount() {
        if (DealerHas > 21) {
            WinText.setText("You Win!");
            WinText.setForeground(Color.GREEN);
        }else if (PlayerHas > DealerHas && PlayerHas <= 21) {
            WinText.setText("You Win!");
            WinText.setForeground(Color.GREEN);
        }else if (PlayerHas < DealerHas) {
            WinText.setText("You Lose!");
            WinText.setForeground(Color.RED);
        }else if (PlayerHas == DealerHas){
            WinText.setText("Draw");
            WinText.setForeground(Color.WHITE);
        }else{
            WinText.setText("You Lose!");
            WinText.setForeground(Color.RED);
        }
    }
}
