import com.soat.kata.LimitPassedException;
import com.soat.kata.Stack;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StackShould {

    private static final int LIMIT = 5;
    private Stack stack;

    @Before
    public void init() {
        stack = new Stack(LIMIT);
    }

    @Test
    public void be_empty_when_created() {
        assertThat(stack.isEmpty()).isTrue();
    }

    @Test
    public void has_a_size_of_one_after_one_push() {
        stack.push(1);

        assertThat(stack.getSize()).isEqualTo(1);
    }

    @Test
    public void be_empty_after_one_push_and_one_pop() {
        stack.push(1);
        stack.pop();

        assertThat(stack.getSize()).isEqualTo(0);
    }

    @Test(expected = LimitPassedException.class)
    public void throw_limit_passed_exception_when_push_passed_the_limit() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
    }
}
