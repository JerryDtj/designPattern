package celve;

/**
 * @author Jerry
 * @Date 2019-07-13 19:19
 */
public class StrategyClient {
    public static void main(String[] args) {
        Sound sound = new Cat();
        sound.animalSound();
        sound = new Dog();
        sound.animalSound();
    }
}
