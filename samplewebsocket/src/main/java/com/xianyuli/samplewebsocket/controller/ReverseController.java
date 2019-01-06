package com.xianyuli.samplewebsocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: websocket-demo
 * @Package: com.xianyuli.websocketdemo.samplewebsocket
 * @ClassName: ReverseController
 * @Description: java类作用描述
 * @Author: LW
 * @CreateDate: 2019/1/6 0006 1:51
 * @UpdateUser: LW
 * @UpdateDate: 2019/1/6 0006 1:51
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Controller
public class ReverseController {

    @RequestMapping(value = "/reverse")
    public String reverse(){
        return "reverse";
    }

}
