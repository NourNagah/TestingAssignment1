public class digital_watch {
    public boolean open = false;
    public boolean timer_state = false;
    public float timer = 0;
    public String turnOn(){
        if(!open){
            open = true;
            return "Turned On!";
        }
        else{
            return "Already turned on";
        }
    }
    public String setTimer(float time){
        if(open){
            timer = time;
            timer_state = true;
            return "Timer set";
        }
        else{
            return "Watch os closed";
        }
    }
    public String doSomething(){
        if(timer_state){
            return "Wait for timer to end";
        }
        else{
            return "Accepted";
        }
    }
    public String turnOff(){
        if(open){
            open = false;
            return "Turned off";
        }
        else{
            return "Error";
        }
    }
}