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



EN Gros, functional interface cest une interface avec une seule méthode abstraite. 
    Et anonymous class, c'est la méthode avec laquelle on peut instancier une functional interface . 
