package test.JunitTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hubu.model.DeviceiInfo;
import com.hubu.dao.DeviceiInfoMapper;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class DaoTest {

    @Autowired
    private DeviceiInfoMapper deviceiInfoMapper;

    @Test
    public void select() {
        DeviceiInfo deviceInfo = deviceiInfoMapper.selectByPrimaryKey(1);
        System.out.println("deviceInfo-->" + deviceInfo);
    }


}
