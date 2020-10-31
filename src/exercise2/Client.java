package exercise2;

public class Client {
    public Chair chair;

    public void sit() {
        if (chair.hasLegs()) {
            System.out.println("Присаживайтесь");
        } else {
            System.out.println("Вы не можете садиться на этот стул((");
        }
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
