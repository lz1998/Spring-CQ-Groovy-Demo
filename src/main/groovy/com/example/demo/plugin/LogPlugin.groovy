package com.example.demo.plugin

import net.lz1998.cq.event.message.CQPrivateMessageEvent
import net.lz1998.cq.robot.CQPlugin
import net.lz1998.cq.robot.CoolQ
import org.springframework.stereotype.Component

@Component
class LogPlugin extends CQPlugin {
    @Override
    int onPrivateMessage(CoolQ cq, CQPrivateMessageEvent event) {
        println("收到私聊消息：" + event.message)
        return MESSAGE_IGNORE
    }
}
