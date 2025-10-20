// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class OperateAgentTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 会话结果
    // 
    @NameInMap("task_messages")
    public String taskMessages;

    public static OperateAgentTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateAgentTaskResponse self = new OperateAgentTaskResponse();
        return TeaModel.build(map, self);
    }

    public OperateAgentTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public OperateAgentTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public OperateAgentTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public OperateAgentTaskResponse setTaskMessages(String taskMessages) {
        this.taskMessages = taskMessages;
        return this;
    }
    public String getTaskMessages() {
        return this.taskMessages;
    }

}
