// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.notification.models;

import com.aliyun.tea.*;

public class CountTaskMessageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 事件码
    @NameInMap("event_code")
    public String eventCode;

    // 任务状态
    @NameInMap("task_state")
    public String taskState;

    // 消息发送统计
    @NameInMap("message_count")
    public TaskCount messageCount;

    public static CountTaskMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        CountTaskMessageResponse self = new CountTaskMessageResponse();
        return TeaModel.build(map, self);
    }

    public CountTaskMessageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CountTaskMessageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CountTaskMessageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CountTaskMessageResponse setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public CountTaskMessageResponse setTaskState(String taskState) {
        this.taskState = taskState;
        return this;
    }
    public String getTaskState() {
        return this.taskState;
    }

    public CountTaskMessageResponse setMessageCount(TaskCount messageCount) {
        this.messageCount = messageCount;
        return this;
    }
    public TaskCount getMessageCount() {
        return this.messageCount;
    }

}
