package factory;

/**
 * @author Jerry
 * @Date 2019-07-13 17:23
 */
public class SimpleFactoryClient {
    public static void main(String[] args) {
        Person person = PersonFactory.makePerson(0);
        System.out.println(person.name);
        Person person1 = PersonFactory.makePerson(1);
        System.out.println(person1.name);

    }
}
