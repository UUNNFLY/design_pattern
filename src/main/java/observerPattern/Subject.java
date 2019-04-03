package observerPattern;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ProjectName: design_pattern
 * @Package: observerPattern
 * @ClassName: Subject
 * @Description:
 * @Author: uunnfly
 * @CreateDate: 2019/4/2 0002 21:48
 * @UpdateUser: 无
 * @UpdateDate: 2019/4/2 0002 21:48
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class Subject {
    private List<Observer> observerList = new ArrayList<Observer>();

    public void addObserver(Observer o){
        observerList.add(o);
    }

    public void deleteObserver(Observer o){
        observerList.remove(o);
    }


    public void notifyObservers(){
        for(Observer o : observerList){
            o.update(this);
        }
    }
}
