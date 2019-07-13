package factory;

/**
 * 造小人工厂
 * @author Jerry
 * @Date 2019-07-13 17:17
 */
public class PersonFactory {
    /**
     * 更具性别造小人
     * @param personSex
     * @return
     */
    public static Person makePerson(int personSex){
        Person person = new Person();
        switch (personSex){
            case 0:
                person.setName("小人男");
                person.setSex(0);
                break;
            case 1:
                person.setSex(1);
                person.setName("小人女");

        }
        return person;
    }

}
