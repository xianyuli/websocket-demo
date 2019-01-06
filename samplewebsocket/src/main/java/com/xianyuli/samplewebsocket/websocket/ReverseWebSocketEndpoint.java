package com.xianyuli.samplewebsocket.websocket;

import org.slf4j.Logger;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

/**
 * @ProjectName: websocket-demo
 * @Package: com.xianyuli.websocketdemo.samplewebsocket
 * @ClassName: ReverseWebSocketEndpoint
 * @Description: java类作用描述
 * @Author: LW
 * @CreateDate: 2019/1/6 0006 0:52
 * @UpdateUser: LW
 * @UpdateDate: 2019/1/6 0006 0:52
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@ServerEndpoint("/reverse")
public class ReverseWebSocketEndpoint {

    @OnMessage
    public void handleMessage(Session session, String message) throws IOException {
        System.out.println(message);
        session.getBasicRemote().sendText("Reversed: " + new StringBuilder(message).reverse());
    }
}
