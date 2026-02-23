package projects;

public class AnimationExample {

    public static void main(String[] args) throws InterruptedException {

        String text = "HAPPY BIRTHDAY 🎂";

        for (int i = 0; i < 30; i++) {

            System.out.print("\r"); // return cursor to start

            // print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // print text
            System.out.print(text);
            Thread.sleep(200); // delay 200 ms
        }

    }


    }
