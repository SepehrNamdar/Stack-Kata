import com.soat.kata.Stack;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StackShould {

    private Stack stack;

    @Before
    public void init() {
        stack = new Stack();
    }


    @Test
    public void be_empty_when_created() {
        assertThat(stack.isEmpty()).isTrue();
    }

    @Test
    public void has_a_size_of_one_after_one_push() {
        assertThat(stack.getSize()).isEqualTo(1);
    }
}
