public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("----------shouldWakeUp-----------");
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println("----------hasTeen-----------");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("----------infHasTeen-----------");
        System.out.println(infHasTeen(9, 99, 19,123,23,4));
        System.out.println(infHasTeen(23, 15, 42));
        System.out.println(infHasTeen(22, 23, 34,123));
        System.out.println("----------isCatPlaying-----------");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

    }

    public static boolean shouldWakeUp(boolean isBarking, int hour) throws Exception {
        if (!isBarking) return false;
        if (hour > 23 || hour < 0) return false;
        return (hour >= 20 || hour < 8);
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        if ((age1 >= 13 && age1 <= 19) || (age2 >= 13 && age2 <= 19) || (age3 >= 13 && age3 <= 19)) return true;
        else return false;
    }

    public static boolean infHasTeen(int... ages) {

        for (int age : ages) {
            if (age >= 13 && age <= 19) {return true;}


    }  return false;
    }


public static boolean isCatPlaying (boolean isSummer, int tempurature)
{
if (isSummer && (tempurature >= 25 && tempurature <= 45 )) return true;
if (!isSummer&& (tempurature >= 25 && tempurature <= 35 )) return true;
else return false;
}}

