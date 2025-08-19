import java.util.ArrayList;
import java.util.List;
/*Final class so that no can extend it or change value by constructor by using super keyword
* final variables, not to change
* defencive copy of list so that not to change the original one
* */
public final class ImmutablePractice {
private final String name;
private final int age;
private final List<String>hobbies;

public ImmutablePractice(String name,int age,List<String> hobbies){
    this.age=age;
    this.name=name;
    this.hobbies=new ArrayList<>(hobbies);
}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getHobbies() {
        return new ArrayList<>(hobbies);
    }
}
