package com.zhyyu.learn.springcloud.provider2.controller;

import com.zhyyu.learn.springcloud.provider.api.dto.MyDTO1;
import com.zhyyu.learn.springcloud.provider.api.service.FeignApi2Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author juror
 * @datatime 2019/7/18 17:46
 */
@RestController
@RequestMapping("provider2")
public class Provider2Controller implements FeignApi2Service {

    @Override
    public String helloFromFeignApi2(MyDTO1 myDTO1) {
        return myDTO1.toString();
    }

}
