public class Main {
    public static void main(String[] args) {
        int workOutDays = 10;
        double health = 8.5;
        boolean powerUp = true;

        System.out.println("Number of days: " + workOutDays);
        System.out.println("Health Scale: " + health);
        System.out.println("Are you ready to power up? " + powerUp);
        System.out.println("Total Assessment: It has been " + workOutDays + " days since you've started working out." + "\n" + "You evaluate at " + health + " out of 10 on the health scale." + "\n" + "It is " + powerUp + " that you are ready to power up your workout!");
    }
}
