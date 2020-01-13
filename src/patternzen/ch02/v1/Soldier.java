package patternzen.ch02.v1;

public class Soldier {
    // 在类中调用其他类时务必要使用父类或接口，不能使用，则说明类的设计已经违背了 LSP 原则。
    private AbstractGun gun;

    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }

    public void killEnemy() {
        System.out.println("士兵开始杀敌人...");
        gun.shoot();
    }
}
