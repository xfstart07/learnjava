package patternzen.ch02.v1;

public class Client {
    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        soldier.setGun(new Rifle());

        soldier.killEnemy();
    }
}
