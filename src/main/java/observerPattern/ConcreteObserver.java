package observerPattern;

/**
 * @ProjectName: design_pattern
 * @Package: observerPattern
 * @ClassName: ConcreteObserver
 * @Description:
 * @Author: uunnfly
 * @CreateDate: 2019/4/2 0002 22:14
 * @UpdateUser: 无
 * @UpdateDate: 2019/4/2 0002 22:14
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ConcreteObserver implements Observer {
    private Subject subject;

    public void update(Subject subject) {
        this.subject = subject;
        System.out.println("观察者观察到状态改变，状态为: " + ((ConcreteSubject)subject).getState());
    }
}
