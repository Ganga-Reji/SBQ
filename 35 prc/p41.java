import java.util.*;
public class p41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount[] bnk = new BankAccount[3];
        for(int i=0; i<3; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            double c = sc.nextDouble();

            bnk[i] = new BankAccount(a,b,c);
        }
        System.out.println("enter account number:");
        int account_no=sc.nextInt();sc.nextLine();
        double amount_taken=withdraw(bnk,account_no);
        if(amount_taken==-1)
        {
            System.out.println("Not enough balance");
        }
        else if(amount_taken==-2){
            System.out.println("Sorry - Account not found");
        }
        else{
            System.out.println("updated balance: "+amount_taken);
        }

        //-------------------------
        System.out.println("Account number to deposit:");
int dep=sc.nextInt();sc.nextLine();
    double after_deposit_balance=deposit(bnk,dep);
    if(after_deposit_balance==-1)
    {
        System.out.println("no account found");
    }
    else
    {
        System.out.println("updated balance after deposit:"+ after_deposit_balance);
    }




    }


    private static double withdraw(BankAccount[] ob,int account_no)
{
    for(int i=0;i<ob.length;i++)
    {
        Scanner sc = new Scanner(System.in);
        if(ob[i].getAcNo()==account_no)
        {
            double amount_to_draw=sc.nextDouble();sc.nextLine();
            if(ob[i].getBalance()>amount_to_draw)
            {
                ob[i].setBalance(ob[i].getBalance()-amount_to_draw);
                return ob[i].getBalance();
            }
            else{
                return -1;
            }

        }
    }
    return -2;
}

private static double deposit(BankAccount[] ob,int account_no)
{Scanner sc = new Scanner(System.in);
    for(int i=0;i<ob.length;i++)
    {
    if(ob[i].getAcNo()==account_no)
    {
        System.out.println("amount to deposit:");
        double deposit=sc.nextDouble();sc.nextLine();
        double add_deposit=ob[i].getBalance()+deposit;
        ob[i].setBalance(add_deposit);
        return ob[i].getBalance();
    }
  

}
return -1;
}
}

















class BankAccount
{
    private int acno;
    private String acname;
    private double balance;
    public BankAccount(int acno, String acname, double balance)
    {
        this.acno = acno;
        this.acname = acname;
        this.balance = balance;
    }
    public int getAcNo()
    {
        return acno;
    }
    public void setAcNo(int acno)
    {
        this.acno = acno;
    }
    public String getAcName()
    {
        return acname;
    }
    public void setAcName(String acname)
    {
        this.acname = acname;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
}