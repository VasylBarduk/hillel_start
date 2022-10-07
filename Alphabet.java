package Alphabet;

public class Alphabet {
    public static void main(String[] args) {
        int rangeRandom = rangeRandom(45, 190);
        isAlphabet((char) rangeRandom);
    }

    static int rangeRandom(int start, int end) {
        double random = Math.random();
        return (char) (random * (end - start + 1)) + start;
    }

    static void isAlphabet(char randomChar) {
        System.out.println("Значение " +  randomChar);

       if (randomChar == ('a'-'z') || randomChar == ('A'-'Z'))
        {
            System.out.println("is a Alphabet" );
        }
       else if (randomChar != ('a'-'z') || randomChar !=('A'-'Z')) {
           System.out.println("is not a Symbol");

       }


        }
    }

