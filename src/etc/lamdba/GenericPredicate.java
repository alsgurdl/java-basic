package etc.lamdba;

@FunctionalInterface
public interface GenericPredicate<T> {

    boolean test(T t);

}
