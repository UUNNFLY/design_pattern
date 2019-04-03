package observerPattern.useJdk;

/**
 * @ProjectName: design_pattern
 * @Package: observerPattern.useJdk
 * @ClassName: TestUseJdk
 * @Description:
 * @Author: uunnfly
 * @CreateDate: 2019/4/2 0002 22:39
 * @UpdateUser: 无
 * @UpdateDate: 2019/4/2 0002 22:39
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class TestUseJdk {
    public static void main(String[] args){
        Bloom bloom = new Bloom();
        Gardener gardener = new Gardener();

        bloom.addObserver(gardener);
        bloom.dry();
        bloom.flower();
    }
}
