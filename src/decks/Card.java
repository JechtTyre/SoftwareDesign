/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decks;

/**
 *
 * @author othma
 */
public class Card {
    //fields
    int number;
    String suit;
     static final  String[] suits = {"Hearts","Diamonds","Spades","Clubs"};
    
    
    Card(int number,String suit){
        this.number = number;
        this.suit = suit;
    }
    
    public void setNumber(int number){this.number = number;}
    public void setSuit(String suit){this.suit = suit;}
    
    public int getNumber(){return this.number;}
    public String getSuit(){return this.suit;}
    
    
    public void printCard(){
        System.out.println(number + " of" + suit);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    
    
    public static void printDeck(){
                for(int i=1;i<14;i++){
            for(int j=0;j<suits.length;j++){
                if(i<11)
                    System.out.println(i + " of " + suits[j]);
                else{
                    //named cars
                    if(i==11){
                        System.out.println("Prince of" + suits[j]);
                    }
                    else if(i==12)
                        System.out.println("Queen of " + suits[j]);
                    else 
                        System.out.println("King of " + suits[j]);
                }
                            
            }
        }
    }
    
}
