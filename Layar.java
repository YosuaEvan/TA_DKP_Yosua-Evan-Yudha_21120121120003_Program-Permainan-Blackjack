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
    // 6) Class
    // 7) GUI
    // istem untuk permainan BlackJack Online

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
    public JLabel PlayerCard;
    public int PlayerHas; // total nilai kartu
    public int TotalPlayerAce;
    public int PlayerAcePlus;
    private JLabel PlayerCard1;
    private JLabel PlayerCard2;
    private JLabel PlayerCard3;
    private JLabel PlayerCard4;
    private JLabel PlayerCard5;
    private JLabel PlayerCard6;

    // Variabel untuk dealer
    private JLabel Dealer;
    private JLabel DealerCard;
    public int DealerHas;
    public int TotalDealerAce;
    public int DealerAcePlus;
    private JLabel DealerCard1;
    private JLabel DealerCard2;
    private JLabel DealerCard3;
    private JLabel DealerCard4;
    private JLabel DealerCard5;
    private JLabel DealerCard6;

    private JPanel PlayerCardImg;
    private JLabel containerPlayerCard;
    private JPanel DealerCardImg;

    Stack PlayerStack = new Stack();
    Stack DealerStack = new Stack();

    int PlayerCardSlot = 1;
    int DealerCardSlot = 1;

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
                ResetAllVariable();
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
        frame.setSize(1200, 800);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);


    }

    // Reset All Variable
    public void ResetAllVariable(){
        PlayerHas = 0;
        DealerHas = 0;
        PlayerCardSlot = 1;
        DealerCardSlot = 1;
        TotalPlayerAce = 0;
        TotalDealerAce = 0;
        PlayerAcePlus = 0;
        DealerAcePlus = 0;
        Player.setText("Player");
        Dealer.setText("Dealer");
        PlayerCard.setText("");
        DealerCard.setText("");
        WinText.setText("");
        PlayerStack.clear();
        DealerStack.clear();
        PlayerCard1.setIcon(null);
        PlayerCard2.setIcon(null);
        PlayerCard3.setIcon(null);
        PlayerCard4.setIcon(null);
        PlayerCard5.setIcon(null);
        PlayerCard6.setIcon(null);
        DealerCard1.setIcon(null);
        DealerCard2.setIcon(null);
        DealerCard6.setIcon(null);
        DealerCard3.setIcon(null);
        DealerCard4.setIcon(null);
        DealerCard5.setIcon(null);
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

    // Continue Button
    public void Continue() {
        DealerAddCard();
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
        DealerCard2.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\hidden_card.jpg").getImage().getScaledInstance(150,180,Image.SCALE_DEFAULT)));
        DealerCard.setText(DealerStack.toString().replace("[","").replace("]","")+ " [?]");
    }

    // Random Card to Player
    public void PlayerAddCard() {
        Random random = new Random();
        int index = random.nextInt(13);
        String new_card = card[index];
        int index2 = random.nextInt(4);
        PlayerStack.push(new_card + CardType[index2] + "  ");
        PrintImage(index, index2,"Player");
        PlayerCardCount(new_card);
        PlayerCard.setText(PlayerStack.toString().replace("[","").replace("]","").replace(",",""));
    }

    // Random Card to Dealer
    public void DealerAddCard() {
        Random random = new Random();
        int index = random.nextInt(13);
        String new_card = card[index];
        int index2 = random.nextInt(4);
        DealerStack.push(new_card + CardType[index2] + "  ");
        PrintImage(index, index2,"Dealer");
        DealerCardCount(new_card);
        DealerCard.setText(DealerStack.toString().replace("[","").replace("]","").replace(",",""));
    }

    // Print card img
    public void PrintImage(int index, int type, String turn){
        CardImage Images = new CardImage();
        Images.GetImage(index,type);  // call function to get card imgicon
        ImageIcon image = Images.image; // save card imgicon to new variable
        if(turn.equals("Player")){
            switch (PlayerCardSlot){
                case 1:
                    PlayerCard1.setIcon(image);
                    break;
                case 2:
                    PlayerCard2.setIcon(image);
                    break;
                case 3:
                    PlayerCard3.setIcon(image);
                    break;
                case 4:
                    PlayerCard4.setIcon(image);
                    break;
                case 5:
                    PlayerCard5.setIcon(image);
                    break;
                case 6:
                    PlayerCard6.setIcon(image);
                    break;
                default:
                    break;
            }
            PlayerCardSlot += 1;
        }
        else if(turn.equals("Dealer")){
            switch (DealerCardSlot){
                case 1:
                    DealerCard1.setIcon(image);
                    break;
                case 2:
                    DealerCard2.setIcon(image);
                    break;
                case 3:
                    DealerCard3.setIcon(image);
                    break;
                case 4:
                    DealerCard4.setIcon(image);
                    break;
                case 5:
                    DealerCard5.setIcon(image);
                    break;
                case 6:
                    DealerCard6.setIcon(image);
                    break;
                default:
                    break;
            }
            DealerCardSlot += 1;
        }
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

    // Black Jack Condition
    public void Blackjack() {
        WinText.setForeground(Color.ORANGE);
        WinText.setText("BLACKJACK! You Win!");
        StandButton.setVisible(false);
        HitButton.setVisible(false);
        ResetButton.setVisible(true);
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
                PlayerAcePlus += 1;
            }
            else if(PlayerHas > 21 && PlayerAcePlus > 0) {
                PlayerHas -= 10;
                TotalPlayerAce -= 1;
                PlayerAcePlus -= 1;
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
                DealerAcePlus += 1;
                Dealer.setText("Dealer (" + DealerHas + ")");
            }
            else if(DealerHas > 21 && DealerAcePlus > 0){
                DealerHas -= 10;
                TotalDealerAce -= 1;
                DealerAcePlus -= 1;
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
