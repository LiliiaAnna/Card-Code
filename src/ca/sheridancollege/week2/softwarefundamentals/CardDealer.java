
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @liliia anna korol, 2022
 */

//This is my comment from 1st february by Liliia Anna Korol


public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
    }
    public void showCards() {   //to print cards
        for (Card card : cards) {
            System.out.println(card.toString());
        }
}
