import java.util.Scanner;

public class scanner {
    public static void main(String args[]) {
        System.out.print("Boushitu Monster");
        String NPC_name = "博士";
        System.out.println(NPC_name + "「お主の名前はなんじゃね？」");

        System.out.print(">>");
        Scanner sc = new Scanner(System.in);
        String Player_name = sc.next();
        System.out.println(Player_name + "「朕の名前は" + Player_name + "だよ！」");//多様性への配慮
        System.out.println(NPC_name +"「ほうほう、お主は" + Player_name + "というのか。」");
        /*
         *System.out.println(NPC_name + "「お主は何歳じゃ？」");
         *System.out.print(>>)
         *int Player_age = sc.nextInt();
         *System.out.println(Player_name + "「朕の年齢は」" + Player_age +"だよ！」");
         *System.out.println(Player_name + "「" + Player_age + 10 + "歳か！」");//歳を聞き間違える風
         */
        sc.close();
    }
}