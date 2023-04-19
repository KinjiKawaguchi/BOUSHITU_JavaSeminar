import java.util.Scanner;

public class arrangemant {
    public static void main(String args[]) {
        System.out.print("Boushitu Monster");
        String NPC_name = "博士";
        System.out.println(NPC_name + "「お主の名前はなんじゃね？」");

        System.out.print(">>");
        Scanner sc = new Scanner(System.in);
        String Player_name = sc.next();
        System.out.println(Player_name + "「朕の名前は" + Player_name + "だよ！」");//多様性への配慮
        System.out.println(NPC_name +"「ほうほう、お主は" + Player_name + "というのか。」");

        String[] Pokemons = {"かわきん","ぴかちゅう","ぽっちゃま"};
        int Pokemons_size = Pokemons.length;

        /*
         * System.out.println(Pokemons[1]);
         * 
         * Pokemons[0] = "らいちゅう";
         */
        sc.close();
    }
}