import com.soat.kata.Stack;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StackShould {

    private static final int DEFAULT_STACK_SIZE_WHEN_CREATED = 0;

    @Test
    public void be_empty_when_created() {
        Stack stack  = new Stack();
        assertThat(stack.getSize()).isEqualTo(DEFAULT_STACK_SIZE_WHEN_CREATED);
    }
}
