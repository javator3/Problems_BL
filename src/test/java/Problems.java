import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class Problems {

    @Test
    public void shouldFindLastElementFromListofAlphabets() throws  Exception{
        assertThat(P01.last(asList("a", "b", "c", "d")), is(equalTo("d")));
    }
}
