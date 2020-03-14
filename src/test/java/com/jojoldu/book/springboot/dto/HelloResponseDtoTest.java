package com.jojoldu.book.springboot.dto;

import com.jojoldu.book.springboot.web.dto.HelloResponseDto;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

/**
 * Created by JH on 2020-03-14
 */
//@RunWith(SpringRunner.class)
public class HelloResponseDtoTest {

    @Test
    public void lombokFunctionTest(){
        String name = "test";
        int amount = 1000;
        HelloResponseDto dto = new HelloResponseDto(name, amount);
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(999);
    }
}
