package observerPattern;

/**
 * @ProjectName: design_pattern
 * @Package: observerPattern
 * @ClassName: ConcreteSubject
 * @Description: 被观察的类
 * @Author: uunnfly
 * @CreateDate: 2019/4/2 0002 22:12
 * @UpdateUser: 无
 * @UpdateDate: 2019/4/2 0002 22:12
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ConcreteSubject extends Subject{
    private String state;

    public String getState() {
        return state;
    }

    public void change(String newState){
        state = newState;
        System.out.println("被观察对象的状态为：" + state);
        this.notifyObservers();
    }
}
