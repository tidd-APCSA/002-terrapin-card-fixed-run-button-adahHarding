public class TerrapinCard {
  private double balance;
  public TerrapinCard(double balanceAtStart){
    balance = balanceAtStart;
  }
  public void payEconomical(){
    if(balance >= 2.50){
      balance = balance - 2.50;
    }
  }

  public void payGourmet(){
    if(balance >= 4.00){
      balance = balance - 4.00;
    }
  }
  
  public double getBalance(){
    return balance;
  }

  public void loadMoney(double amount){
    if(amount >= 0){
      balance = balance + amount;
      if(balance > 150){
        balance = 150;
      }
    }
  }

  public String toString(){
    return "The card has " + balance + " dollars.";
  }
}
