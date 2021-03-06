package lab;


import java.util.Scanner;

public class MainMachine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Machine machine = new Machine(sc.next());

        int n = sc.nextInt();
        AnswerSheet[] arr = new AnswerSheet[n];
        for(int i=0 ; i < n;i++){
            arr[i] = new AnswerSheet(sc.next());
            arr[i].setScore(machine.checkAnswer(arr[i]));
            //System.out.println((i+1)+": "+machine.checkAnswer(arr[i])+"/"+machine.getAnswer().length());

            machine.checkAnswerSheet(arr[i]);

        }


        for(int i=0; i < machine.getAnswer().length(); i++){

            System.out.println((i+1)+": "+ machine.getAnswerCount()[i]);
        }

    }
}
