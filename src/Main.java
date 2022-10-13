public class Main {
    public static void main(String[] args) {
        // HW5 - HW3.1-if
        // HW1
        // Task1
        System.out.println("\nTask 1:");
        int age = 22; // должен быть >= 0
        if (age >= 18) {
            System.out.println("Grats, you're adult person!");
        } else {
            System.out.println("Sorry, you have to wait for adulthood!");
        }

        // Task2
        System.out.println("\nTask 2:");
        if (age >= 24) {
            System.out.println("Hi there! You graduated from university and" +
                    " it's time for you to find a job");
        } else if (age >= 18) {
            System.out.println("Hi there! You have completed your studies at school" +
                    " and it is time for you to go to university");
        } else if (age >= 7) {
            System.out.println("Hi there! This child goes to school, because his age" +
                    " is above or equal 7");
        }

        // Task3
        System.out.println("\nTask 3:");
        int vagoonCapacity = 102;
        int sittingCapacity = 60;
        int occupiedPlaces = 70; // должно быть <= vagoonCapacity и > 0
        //System.out.println("There are " + occupiedPlaces + " occupied places on the vagoon, so...");
        /*if (occupiedPlaces > vagoonCapacity || occupiedPlaces < 0) {
            System.out.println("Data is incorrect, check it, please.");
        } else*/ if (occupiedPlaces == vagoonCapacity) {
            System.out.println("Sorry, there are no empty places on the vagoon.");
        } else if (occupiedPlaces >= sittingCapacity) {
            System.out.println("There are only standing places on the vagoon.");
        } else {
            System.out.println("Vagoon has emtpy seat and standing places, you're wellcome!");
        }

        // HW2 - the same ↑

        // HW3
        // Task1
        System.out.println("\nTask 1:");
        int age2 = 15; // должен быть > 1
        System.out.print("Если возраст человека равен " + age2 + " то ему надо ходить в ");
        if (age2 > 24) System.out.printf("НА РАБОТУ ПОРА УЖЕ!");
        else if (age2 > 18) System.out.printf("университет.");
        else if (age2 > 6) System.out.printf("школу.");
        else if (age2 > 1) System.out.printf("детский сад.");
        //else System.out.println("Data is incorrect, please, check it.");

        // Task2
        System.out.println("\nTask 2:");
        int age3 = 1; // должен быть > 0
        if (age3 > 14) System.out.println("Вы можете кататься на аттракционе самостоятельно.");
        else if (age3 >= 5) System.out.println("Вы можете кататься на аттракционе лишь" +
                " в сопровождении взрослого.");
        else System.out.println("Вы не можете кататься на аттракционе, подождите " + (5-age3) + " года.");

        // Task3
        System.out.println("\nTask 3:");
        int one = 21;
        int two = 19;
        int three = 19;
        System.out.println("Наибольшее число:");
        if (one > two) {
            if (one > three) {
                System.out.println(one);
            } else {
                System.out.println(three);
            }
        } else {
            if (two > three) {
                System.out.println(two);
            } else {
                System.out.println(three);
            }
        }
    }
}
