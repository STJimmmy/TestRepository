package Joiner27;
import java.util.Arrays;
import java.util.stream.Collectors;




    public class Joiner {
        private String separator;

        public Joiner(String separator) {
            this.separator = separator;
        }

        //metoda generyczna
        public <T> String join(T... elements){
            return Arrays.asList(elements).stream()
                    .map(e->e.toString())
                    .collect(Collectors.joining(separator));
        }
    }

