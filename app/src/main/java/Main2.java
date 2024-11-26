import jp.ac.uryukyu.ie.e245708.*;

public class Main2 {
    public static void main(String[] args){
        Hero hero = new Hero("勇者", 10, 5); // (a)　(5)で生成するオブジェクトをWarriorからHeroに変更している
        Enemy enemy = new Enemy("スライム", 6, 3);

        System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());

        int turn = 0;
        while( hero.isDead() == false && enemy.isDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            hero.attack(enemy); // (b)　(5)でattackWithWeponSkillからattackに戻している
            enemy.attack(hero);
        }
        System.out.println("戦闘終了");
        System.out.println(hero);
    }
}