import com.soat.kata.Stack;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StackShould {

    private static final int DEFAULT_STACK_SIZE_WHEN_CREATED = 0;
    private static final int ONE = 1;

    private Stack stack;

    @Before
    public void init() {
        // Given
        stack  = new Stack();
    }

    @Test
    public void be_empty_when_created() {
        assertThat(stackSize()).isEqualTo(DEFAULT_STACK_SIZE_WHEN_CREATED);
    }

    @Test
    public void has_a_size_of_one_after_one_push() {
        // When
        stack.push(1);

        // Then
        assertThat(stackSize()).isEqualTo(ONE);
    }

    @Test
    public void has_a_size_of_zero_after_one_push_and_one_pop() {
        // When
        stack.push(1);
        stack.pop();

        // Then
        assertThat(stackSize()).isEqualTo(DEFAULT_STACK_SIZE_WHEN_CREATED);
    }

    private int stackSize() {
        return stack.getSize();
    }
}
