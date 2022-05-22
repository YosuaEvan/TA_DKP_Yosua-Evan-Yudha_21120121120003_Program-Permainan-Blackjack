import javax.swing.*;
import java.awt.*;


public class CardImage{
    ImageIcon temp_image;
    ImageIcon image;
    public void GetImage(int index, int type){
        switch (type+1){
            case 1: // ♠ Spades
                switch (index+1) {
                    case 1:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Spades\\Spades_Ace.png");
                        break;
                    case 2:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Spades\\Spades_2.png");
                        break;
                    case 3:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Spades\\Spades_3.png");
                        break;
                    case 4:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Spades\\Spades_4.png");
                        break;
                    case 5:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Spades\\Spades_5.png");
                        break;
                    case 6:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Spades\\Spades_6.png");
                        break;
                    case 7:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Spades\\Spades_7.png");
                        break;
                    case 8:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Spades\\Spades_8.png");
                        break;
                    case 9:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Spades\\Spades_9.png");
                        break;
                    case 10:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Spades\\Spades_10.png");
                        break;
                    case 11:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Spades\\Spades_J.png");
                        break;
                    case 12:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Spades\\Spades_Q.png");
                        break;
                    case 13:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Spades\\Spades_K.png");
                        break;
                }
                break;
            case 2: // ♥ Heart
                switch (index+1) {
                    case 1:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Heart\\Heart_Ace.png");
                        break;
                    case 2:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Heart\\Heart_2.png");
                        break;
                    case 3:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Heart\\Heart_3.png");
                        break;
                    case 4:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Heart\\Heart_4.png");
                        break;
                    case 5:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Heart\\Heart_5.png");
                        break;
                    case 6:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Heart\\Heart_6.png");
                        break;
                    case 7:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Heart\\Heart_7.png");
                        break;
                    case 8:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Heart\\Heart_8.png");
                        break;
                    case 9:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Heart\\Heart_9.png");
                        break;
                    case 10:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Heart\\Heart_10.png");
                        break;
                    case 11:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Heart\\Heart_J.png");
                        break;
                    case 12:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Heart\\Heart_Q.png");
                        break;
                    case 13:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Heart\\Heart_K.png");
                        break;
                }
                break;
            case 3: // ♦ Diamond
                switch (index+1) {
                    case 1:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Diamond\\Diamond_Ace.png");
                        break;
                    case 2:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Diamond\\Diamond_2.png");
                        break;
                    case 3:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Diamond\\Diamond_3.png");
                        break;
                    case 4:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Diamond\\Diamond_4.png");
                        break;
                    case 5:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Diamond\\Diamond_5.png");
                        break;
                    case 6:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Diamond\\Diamond_6.png");
                        break;
                    case 7:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Diamond\\Diamond_7.png");
                        break;
                    case 8:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Diamond\\Diamond_8.png");
                        break;
                    case 9:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Diamond\\Diamond_9.png");
                        break;
                    case 10:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Diamond\\Diamond_10.png");
                        break;
                    case 11:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Diamond\\Diamond_J.png");
                        break;
                    case 12:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Diamond\\Diamond_Q.png");
                        break;
                    case 13:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Diamond\\Diamond_K.png");
                        break;
                }
                break;
            case 4: // ♣ Clover
                switch (index+1) {
                    case 1:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Clover\\Clover_Ace.png");
                        break;
                    case 2:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Clover\\Clover_2.png");
                        break;
                    case 3:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Clover\\Clover_3.png");
                        break;
                    case 4:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Clover\\Clover_4.png");
                        break;
                    case 5:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Clover\\Clover_5.png");
                        break;
                    case 6:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Clover\\Clover_6.png");
                        break;
                    case 7:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Clover\\Clover_7.png");
                        break;
                    case 8:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Clover\\Clover_8.png");
                        break;
                    case 9:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Clover\\Clover_9.png");
                        break;
                    case 10:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Clover\\Clover_10.png");
                        break;
                    case 11:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Clover\\Clover_J.png");
                        break;
                    case 12:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Clover\\Clover_Q.png");
                        break;
                    case 13:
                        temp_image = new ImageIcon("C:\\Users\\FX505GM\\IdeaProjects\\BlackJackSimulator - Copy - Copy\\Card Image\\Clover\\Clover_K.png");
                        break;
                }
                break;
        }
        image = new ImageIcon(new ImageIcon(String.valueOf(temp_image)).getImage().getScaledInstance(150,180,Image.SCALE_DEFAULT));
    }
}


