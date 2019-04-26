package oobook.oo.oop.dip;

public class Player {

    /**
     * 不好的依赖，对于 DIP 中的 “高层模块依赖底层模块”，Player 直接使用了 Ford 类对象作为参数，Ford 类修改，Player 类【需要】重新编译、测试
     * @param car
     */
    public void play(Ford car) {
        car.accelerate();
        car.shift();
        car.steer();
        car.brake();
    }

    /**
     * 同上，不好的依赖
     * @param car
     */
    public void play(Benz car) {
        car.accelerate();
        car.shift();
        car.steer();
        car.brake();
    }

    /**
     * 同上，不好的依赖
     * @param car
     */
    public void play(Chery car) {
        car.accelerate();
        car.shift();
        car.steer();
        car.brake();
    }

    /**
     * 好的依赖，对于 DIP 中的 “高层模块依赖抽象层”，Player 依赖 ICar 接口，不需要知道具体的车类型
     * @param car
     */
    public void play(ICar car) {
        car.accelerate();
        car.shift();
        car.steer();
        car.brake();
    }

}
