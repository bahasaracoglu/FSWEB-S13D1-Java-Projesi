public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp (boolean isBarking, int hour) throws Exception {
        if(!isBarking) return false;
        if(hour > 23 || hour < 0) return false;
        return (hour >= 20 || hour < 8);

}}

