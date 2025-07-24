import java.util.*;


class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Parameterized constructor
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getters and Setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}




class qn41
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // Create and store 3 accounts
        BankAccount[] accounts = new BankAccount[3];
        for (int i = 0; i < 3; i++) {
            int accountNumber = sc.nextInt();
            sc.nextLine(); // Consume newline
            String holderName = sc.nextLine();
            double balance = sc.nextDouble();
            accounts[i] = new BankAccount(accountNumber, holderName, balance);
        }

        int a=Integer.parseInt(sc.nextLine());
        double b=Double.parseDouble(sc.nextLine());
        double wd=withdraw(accounts,a,b);
        if(wd<0)
        {
            System.out.println("Sorry - Account not found\" if the returned value is -2");
        }
        else{
            System.out.println("updated balance: "+wd);
        }

        int c=Integer.parseInt(sc.nextLine());
        double d=Double.parseDouble(sc.nextLine());
        double da=deposit(accounts, c, d);
        if(da<0)
        {
            System.out.println("Sorry - Account not found");
        }
        else{
            System.out.println("updated balance after deposit: "+da);
        }





    }

    public static double withdraw(BankAccount[] ob,int num,int a)
    {
        double bal;
        
        for(int i=0;i<ob.length;i++)
        {
            bal=ob[i].getBalance();
            
            if(ob[i].getAccountNumber()==num)
            {
                if(bal>a)
                {
                    bal=bal-a;

                }
                else{
                    return -1;
                }
            }

            else{
                return -1;
            }

            return bal;
        }
    }

    public static double deposit(BankAccount[] ob,int a,double b)
    {
        double bal;
        for(int i=0;i<ob.length;i++)
        {
            bal=ob[i].getBalance();
            if(ob[i].getAccountNumber()==a)
            {
                bal=bal+b;



            }
            else{
                return -1;
            }
        }

        return bal;
    }
}