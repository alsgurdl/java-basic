package etc.lamdba;
@FunctionalInterface
public interface GenericFunction<X, Y> {
//X에서 Y를 추출
    Y appy(X x);

}
