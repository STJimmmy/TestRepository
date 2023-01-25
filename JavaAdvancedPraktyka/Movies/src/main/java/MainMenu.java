import java.util.Scanner;

public class MainMenu {
    public void run(){

showOptions();
int input = readOptions();
executeOptions(input);
    }
    private int readOptions(){
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        return input;
    }
    private void showOptions(){
        System.out.println("""
                What do you want to do?
                1 - Add a movie
                2 - Show all movies
                3 - Quit """);
    }
    private void executeOptions(int input){
        while (true){


            switch(input){
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                default:
                    System.out.println("Please choose among 3 options");
                    run();
            } break;
        }
    }
}
