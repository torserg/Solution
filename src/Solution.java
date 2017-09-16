/**
 * Created by oooliaaa on 01.03.2017.
 * Создать 10 зергов, 5 протосов, 12 терран и дать им всем уникальные имена
 */
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код


        for(int i = 0; i < 10; i++){
            Zerg zerg = new Zerg();
            zerg.name = "Zerg"+i;
            System.out.println(zerg.name);
        }



        for(int i = 0; i < 5; i++){
            Protoss protoss = new Protoss();
            protoss.name = "Protoss"+i;
            System.out.println(protoss.name);
        }



        for(int i = 0; i < 12; i++){
            Terran terran = new Terran();
            terran.name = "Terran"+i;
            System.out.println(terran.name);
        }

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
