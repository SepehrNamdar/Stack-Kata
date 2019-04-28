import com.soat.kata.IllegalCapacityException;
import com.soat.kata.Stack;
import com.soat.kata.StackLimitPassedException;
import com.soat.kata.SteckUnderflowException;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class StackShould {

    private Stack stack;

    @Before
    public void init() {
        stack  = new Stack(5);
    }

    @Test
    public void be_empty_when_created() {
        assertThat(stack.isEmpty()).isTrue();
    }

    @Test
    public void has_a_size_of_one_after_one_push() {
        stack.push(1);

        assertThat(stackSize()).isEqualTo(1);
    }

    @Test
    public void has_a_size_of_zero_after_one_push_and_one_pop() {
        stack.push(1);
        stack.pop();

        assertThat(stack.isEmpty()).isTrue();
    }

    @Test
    public void throw_stack_limit_passed_exception_when_pushed_passed_limit() {
        Stack stack = new Stack(0);

        assertThatExceptionOfType(StackLimitPassedException.class)
                .isThrownBy(() -> { stack.push(1); });
    }

    @Test
    public void throw_stack_underflow_exception_when_popped_passed_limit() {
        Stack stack = new Stack(0);

        assertThatExceptionOfType(SteckUnderflowException.class).isThrownBy(stack::pop);
    }

    @Test
    public void has_a_size_of_one_after_two_push_and_one_pop() {
        stack.push(1);
        stack.push(2);
        stack.pop();

        assertThat(stack.getSize()).isEqualTo(1);
    }

    @Test
    public void has_element_one_on_top_when_pushed() {
        stack.push(1);

        assertThat(stack.top()).isEqualTo(1);
    }
    @Test
    public void has_respectively_element_two_nd_one_on_top_when_pushed() {
        stack.push(1);
        assertThat(stack.top()).isEqualTo(1);

        stack.push(2);
        assertThat(stack.top()).isEqualTo(2);

        stack.pop();
        assertThat(stack.top()).isEqualTo(1);

        stack.pop();
        assertThat(stack.isEmpty());
    }

    @Test
    public void throw_illegal_capacity_exception_when_creating_stack_with_negative_size() {
        assertThatExceptionOfType(IllegalCapacityException.class).isThrownBy(() -> { new Stack(-1); });
    }

    // FIXME : What if I do stack.top() with an empty stack ?

    // FIXME : What if I do 3 push and 3 pop ?

    private int stackSize() {
        return stack.getSize();
    }
}
