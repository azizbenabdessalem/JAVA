package pm;
import java.util.function.Function ;


public class Demo {

    Function <Integer, Integer> aziz = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer integer) {
            return 2 * integer;
        }
    } ;

}
