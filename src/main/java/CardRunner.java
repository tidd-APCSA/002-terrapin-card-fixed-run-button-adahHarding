public class CardRunner {
    public static void main(String args[]){
        // ☕
        //System.out.println("hey");
        TerrapinCard billyCard = new TerrapinCard(20);
        TerrapinCard brianCard = new TerrapinCard(30);
        
        billyCard.payGourmet();
        System.out.println("Billy: " + billyCard);
        brianCard.payEconomical();
        System.out.println("Brian: " + brianCard);

        billyCard.loadMoney(20);
        System.out.println("Billy: " + billyCard);
        brianCard.payGourmet();
        System.out.println("Brian: " + brianCard);

        billyCard.payEconomical();
        billyCard.payEconomical();
        System.out.println("Billy: " + billyCard);
        brianCard.loadMoney(50);
        System.out.println("Brian: " + brianCard);
    }
}
