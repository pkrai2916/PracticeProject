import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonPractice implements Serializable, Cloneable {
    private static volatile  SingletonPractice instance;

    private SingletonPractice(){
        if(instance!=null){
            throw new RuntimeException("use getInstance() method");
        }
    }
    public static SingletonPractice getInstance(){
        if(instance==null){
            synchronized (SingletonPractice.class){
                if(instance==null)
                    instance=new SingletonPractice();
            }
        }
        return instance;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
       throw new CloneNotSupportedException("cloning not allowed for singleton");
    }
/* when we create new object by serialization
SafeSingleton s2 = (SafeSingleton) in.readObject();
it internaly call readResolve method for creating object
 */
    private Object readResolve() throws ObjectStreamException {
        return getInstance();
    }
}
