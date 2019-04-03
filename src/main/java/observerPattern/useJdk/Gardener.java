package observerPattern.useJdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @ProjectName: design_pattern
 * @Package: observerPattern.useJdk
 * @ClassName: Gardener
 * @Description:
 * @Author: uunnfly
 * @CreateDate: 2019/4/2 0002 22:38
 * @UpdateUser: 无
 * @UpdateDate: 2019/4/2 0002 22:38
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Gardener implements Observer {
    public void update(Observable o, Object arg) {
        if(arg.equals("dry")) water();
        if(arg.equals("flower")) happy();
    }

    private void water(){
        System.out.println("The gardener starts to water.");
    }

    private void happy(){
        System.out.println("The gardener becomes happy.");
    }
}
