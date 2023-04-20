import java.util.Scanner;

public class for {
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
        int[] Pokemons_maxHP = {100,500,1000};
        int[] Pokemons_currentHP = new int[3];
        int[] Pokemons_attack = {10,200,300};
        double[] Pokemons_defence = {0.1,0.3,0.4} ;
        int Pokemons_size = Pokemons.length;

        for(int i = 0;i<Pokemons_size;i++){
            Pokemons_currentHP[i] = Pokemons_maxHP[i];
        }
        System.out.println(NPC_name + "「" + Pokemons_size +"体のポケモンの中から1匹選ぶんじゃ」");
        for(int i = 0;i<Pokemons_size;i++){
            System.out.print(i + ":" + Pokemons[i] + ",");
        }
        System.out.println("");//改行
        System.out.print(">>");
        int Selected_Pokemon = sc.nextInt();
        System.out.println(NPC_name + "「" + Pokemons[Selected_Pokemon] +"を選んだのか！良いセンスじゃ。」");
        System.out.println("=====ポケモンGET！！=====");
        System.out.println("最大体力:" + Pokemons_maxHP[Selected_Pokemon]);
        System.out.println("攻撃力:" + Pokemons_attack[Selected_Pokemon]);
        System.out.println("防御値:" + Pokemons_defence[Selected_Pokemon]);

        sc.close();
    }
}