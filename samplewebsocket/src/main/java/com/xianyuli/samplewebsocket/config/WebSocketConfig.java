package com.xianyuli.samplewebsocket.config;

import com.xianyuli.samplewebsocket.websocket.ReverseWebSocketEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @ProjectName: websocket-demo
 * @Package: com.xianyuli.websocketdemo.samplewebsocket
 * @ClassName: WebSocketConfig
 * @Description: java类作用描述
 * @Author: LW
 * @CreateDate: 2019/1/6 0006 0:54
 * @UpdateUser: LW
 * @UpdateDate: 2019/1/6 0006 0:54
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Configuration
@EnableWebSocket
public class WebSocketConfig {

    @Bean
    public ReverseWebSocketEndpoint reverseWebSocketEndpoint() {
        return new ReverseWebSocketEndpoint();
    }

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
