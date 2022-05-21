public class ATM {
    public float accountBalance = 0;
    public boolean authentic = false;
    public boolean valid_card = true;
    public boolean password_valid = true;
    public String enterCard(){
        if(valid_card){
            return "Validated card";
        }
        else{
            return "Card not validated";
        }
    }
    public String enterPassword(){
        if(valid_card){
            System.out.println("Enter Password");
            if(password_valid){
                authentic = true;
                return "Successful login";
            }
            else{
                return "Wrong password";
            }
        }
        else{
            return "Enter card first";
        }
    }
    public String deposit(float money){
        if(authentic){
            if(money >= 50 && money <=50000){
                accountBalance += money;
                return "Successful deposit";
            }
            else{
                return "Enter valid amount";
            }
        }
        else{
            return "Not allowed";
        }
    }
    public String withdraw(float amount){
        if(authentic){
            if(amount <= accountBalance){
                accountBalance -= amount;
                return "Successful withdraw";
            }
            else{
                return "Not enough balance";
            }
        }
        else{
            return "Not allowed";
        }
    }
    public String removeCard(){
        if(valid_card){
            return "Card removed";
        }
        else{
            return "Not allowed";
        }
    }
}