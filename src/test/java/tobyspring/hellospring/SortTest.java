package tobyspring.hellospring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SortTest {

    Sort sort;

    @BeforeEach
    void beforeEach() {
        sort = new Sort();
    }


    @Test
    void sort() {
        List<String> list = sort.sortByLength(Arrays.asList("aa", "aa", "a", "aaaaa", "aaaa"));

        Assertions.assertThat(list).isEqualTo(List.of("a", "aa", "aa", "aaaa", "aaaaa"));
    }
}
