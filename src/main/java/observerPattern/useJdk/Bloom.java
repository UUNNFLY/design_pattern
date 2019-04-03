package observerPattern.useJdk;

import java.util.Observable;

/**
 * @ProjectName: design_pattern
 * @Package: observerPattern.useJdk
 * @ClassName: Bloom
 * @Description:
 * @Author: uunnfly
 * @CreateDate: 2019/4/2 0002 22:37
 * @UpdateUser: 无
 * @UpdateDate: 2019/4/2 0002 22:37
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Bloom extends Observable {
    public void dry(){
        System.out.println("the bloom is dry.");
        setChanged();
        notifyObservers("dry");
    }

    public void flower(){
        System.out.println("the bloom is flowering.");
        setChanged();
        System.out.println("before notify:" + hasChanged());
        notifyObservers("flower");
        System.out.println("after notify:" + hasChanged());
    }
}
