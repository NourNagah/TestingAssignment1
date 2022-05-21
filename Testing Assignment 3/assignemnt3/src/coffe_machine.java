public class coffe_machine {
    public boolean power = false;
    public boolean light = false;
    public boolean busy_state = false;
    public float money;
    private final float price = 12;
    public int coffeeAmount;
    public String addMoney(float money) {
        if (power) {
            this.money = money;
            return "money added Successfully";
        } else {
            return "Please turn the machine on";
        }
    }
    public String openMachine() {
        if (!power) {
            power = true;
            light = true;
            return "Power on" + "Lights on";
        } else {
            return "Error!";
        }
    }
    public String closeMachine() {
        if (power) {
            light = false;
            power = false;
            return "Lights off" + "Power off";
        } else {
            return "Error!";
        }
    }
    public String makeCoffee(int coffeeAmount) {
        if (power) {
            int i = 0;
            if (money >= price) {
                while (money >= price && coffeeAmount > 0) {
                    money -= price;
                    busy_state = true;
                    coffeeAmount--;
                    i++;
                }
            }
            else{
                return "Insufficient balance";
            }
            busy_state = false;
            return i + " Coffee successfuly made";
        } else {
            return "Please turn the machine on";
        }
    }
}
