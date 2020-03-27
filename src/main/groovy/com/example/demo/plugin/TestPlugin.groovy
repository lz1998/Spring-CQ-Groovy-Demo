package com.example.demo.plugin

import net.lz1998.cq.event.message.CQPrivateMessageEvent
import net.lz1998.cq.robot.CQPlugin
import net.lz1998.cq.robot.CoolQ
import org.springframework.stereotype.Component

@Component
class TestPlugin extends CQPlugin {
    @Override
    int onPrivateMessage(CoolQ cq, CQPrivateMessageEvent event) {
        println("不管受到什么都回复test")
        cq.sendPrivateMsg(event.userId, "test", false)
        return MESSAGE_IGNORE
    }
}
