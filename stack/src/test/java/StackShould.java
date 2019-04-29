import com.soat.kata.Stack;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StackShould {

    @Test
    public void be_empty_when_created() {
        Stack stack = new Stack();

        assertThat(stack.isEmpty()).isTrue();
    }
}
