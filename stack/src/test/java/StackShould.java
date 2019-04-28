import com.soat.kata.Stack;
import com.soat.kata.StackLimitPassedException;
import com.soat.kata.SteckUnderflowException;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class StackShould {

    private static final int DEFAULT_STACK_SIZE_WHEN_CREATED = 0;

    private Stack stack;

    @Before
    public void init() {
        // Given
        stack  = new Stack(5);
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
        assertThat(stackSize()).isEqualTo(1);
    }

    @Test
    public void has_a_size_of_zero_after_one_push_and_one_pop() {
        // When
        stack.push(1);
        stack.pop();

        // Then
        assertThat(stackSize()).isEqualTo(DEFAULT_STACK_SIZE_WHEN_CREATED);
    }

    @Test
    public void throw_stack_limit_passed_exception_when_pushed_passed_limit() {
        // Given
        Stack stack = new Stack(0);

        // When
        assertThatExceptionOfType(StackLimitPassedException.class)
                .isThrownBy(() -> { stack.push(1); });
    }

    @Test
    public void throw_stack_underflow_exception_when_popped_passed_limit() {
        // Given
        Stack stack = new Stack(0);

        // When
        assertThatExceptionOfType(SteckUnderflowException.class).isThrownBy(stack::pop);
    }

    private int stackSize() {
        return stack.getSize();
    }
}
