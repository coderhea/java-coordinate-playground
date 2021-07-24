package coordinate.line;

import java.math.BigDecimal;
import java.nio.file.Path;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class BeLine extends BigDecimal implements IntPredicate, LongPredicate, DoublePredicate, CharSequence, DoubleStream, LongStream, IntStream, Path {
    public BeLine(BeCoordinate first, BeCoordinate second) {
        super();
    }
}
