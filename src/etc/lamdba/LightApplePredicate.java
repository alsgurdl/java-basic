package etc.lamdba;

public class LightApplePredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return apple.getWeigh() <= 100;
    }
}
