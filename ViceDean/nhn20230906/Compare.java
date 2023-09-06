package nhn20230906;

import java.util.Comparator;

public class Compare<E extends Person> implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getNo() - o2.getNo();
    }
    
}
