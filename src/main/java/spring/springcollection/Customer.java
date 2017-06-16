package spring.springcollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class Customer {

    private List<Object> lists;
    private Set<Object> sets;
    private Map<Object, Object> maps;
    private Properties pros;

    // CONSTRUCTORS
    public Customer() {
        System.out.println("CONSTRUCTOR - NO args");
    }

    public Customer(List<Object> lists, Set<Object> sets, Map<Object, Object> maps, Properties pros) {
        System.out.println("CONSTRUCTOR - WITH args");
        this.lists = lists;
        this.sets = sets;
        this.maps = maps;
        this.pros = pros;
    }

    //  GETTERS AND SETTERS
    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Set<Object> getSets() {
        return sets;
    }

    public void setSets(Set<Object> sets) {
        this.sets = sets;
    }

    public Map<Object, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<Object, Object> maps) {
        this.maps = maps;
    }

    public Properties getPros() {
        return pros;
    }

    public void setPros(Properties pros) {
        this.pros = pros;
    }


    @Override
    public String toString() {
        return "CUSTOMER --> LIST = " + lists + " SET = " + sets + " MAP = " + maps + " PROS = " + pros ;
    }
}
