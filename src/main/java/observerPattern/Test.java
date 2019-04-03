package observerPattern;

/**
 * @ProjectName: design_pattern
 * @Package: observerPattern
 * @ClassName: Test
 * @Description:
 * @Author: uunnfly
 * @CreateDate: 2019/4/2 0002 22:31
 * @UpdateUser: 无
 * @UpdateDate: 2019/4/2 0002 22:31
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Test {


    public static void main(String[] args){
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.addObserver(observer);
        subject.change("hello,this is my new state");
    }

}
