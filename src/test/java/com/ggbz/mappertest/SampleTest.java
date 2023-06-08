package com.ggbz.mappertest;

import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.ggbz.mapper.UserMapper;
import com.ggbz.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class SampleTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void testSelect(){
        System.out.println("---selectALl method test---");
        List<User> userList = userMapper.selectList(null);

        userList.forEach(System.out::println);
    }

}
