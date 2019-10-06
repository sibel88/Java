public class CoffeeMaker {
    private int cups;
    private int timer;

    public CoffeeMaker() {
        this.cups = 6;
        this.timer = 20;
    }

    public CoffeeMaker(int cups, int timer) {
        this.cups = cups;
        this.timer = timer;
    }

    public int getCups() {
        return cups;
    }

    public int getTime() {
        return timer;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public void setTime(int timer) {
        this.timer = timer;
    }

    public void setTheTimer(int timer) {
        this.timer = timer;
    }

    public void setNewTimer(int newTimer) {
        this.timer = newTimer;
        System.out.println("Timer is :" + this.timer);

    }

    public void checTheStatus() {
        if (this.timer == 0) {
            System.out.println(this.cups + " cups coffee is ready");
        } else {
            System.out.println("Not ready yet");
        }
    }

    public void resetTimer() {
        this.timer = 0;
        System.out.println("Timer is reset");
    }
}
