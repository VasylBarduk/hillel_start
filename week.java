package weekDays;

public class week {
    public static void main (String [] args){
        int  rangeRandom = rangeRandom( 1 , 7);
        weekDays(rangeRandom);
    }
    static int rangeRandom (int start , int end){
        double random = Math.random();
        return (int)(random*(end-start +1 )) +start;
    }
    static void weekDays(int random) {
        System.out.println("Число " + random);

       switch (random){
           case 1: System.out.println ("Понедельнк"); break;
           case 2: System.out.println ("Вторник"); break;
           case 3: System.out.println ("Среда"); break;
           case 4: System.out.println ("Четверг"); break;
           case 5: System.out.println ("Пятница"); break;
           case 6: System.out.println ("Суббота"); break;
           case 7: System.out.println ("Воскресенье"); break;


        }
    }

}
