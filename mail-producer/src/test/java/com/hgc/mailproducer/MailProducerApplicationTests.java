package com.hgc.mailproducer;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hgc.common.entity.MstDict;
import com.hgc.common.service.IMstDictService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MailProducerApplicationTests {

    @Test
    public void contextLoads() {
        log.info("hello world!");
    }

    @Autowired
    IMstDictService mstDictService;

    @Test
    public void testDict() {
        /*MstDict mstDict = new MstDict();
        mstDict.setCode("test");
        mstDict.setName("测试");
        mstDict.setStatus("1");
        mstDictService.save(mstDict);*/

        List<MstDict> list = mstDictService.list(new QueryWrapper<MstDict>());
        list.forEach(dict -> {
            System.out.println(dict);
        });
    }
}
