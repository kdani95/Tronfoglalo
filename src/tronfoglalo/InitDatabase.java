package tronfoglalo;

import Cards.Cards;
import Logic.Save;
import Statistics.Stats;

public class InitDatabase {
    
    public static void main(String[] args){
        Cards.init();
        Stats.init();
        Save.init();
    }
    
    public static void resetCardsAndSaves(String name){
        Cards.init();
        Save.reset(name);
    }
}
