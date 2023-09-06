package nhn20230906;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Department<E extends Person> implements Iterable<E>{
    private int departmentNo;
    private String departementName;
    private List<E> list = new ArrayList<E>();


    public Department(int no, String name){
        this.departmentNo = no;
        this.departementName = name;
    }

    public void add(E s){
        list.add(s);
    }

    public int getDepartmentNo() {
        return departmentNo;
    }

    public String getDepartementName() {
        return departementName;
    }

    public List<E> getList() {
        return list;
    }

    public Iterator<E> iterator(){
        return this.list.iterator();
    }

    public void sort(){
        Collections.sort(this.list);
    }

    public void sort(Comparator<E> compare){
        Collections.sort(this.list, compare);
    }
}
