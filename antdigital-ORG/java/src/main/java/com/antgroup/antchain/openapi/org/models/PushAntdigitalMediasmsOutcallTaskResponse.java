// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class PushAntdigitalMediasmsOutcallTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务ID
    @NameInMap("task_id")
    public String taskId;

    public static PushAntdigitalMediasmsOutcallTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        PushAntdigitalMediasmsOutcallTaskResponse self = new PushAntdigitalMediasmsOutcallTaskResponse();
        return TeaModel.build(map, self);
    }

    public PushAntdigitalMediasmsOutcallTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushAntdigitalMediasmsOutcallTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushAntdigitalMediasmsOutcallTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushAntdigitalMediasmsOutcallTaskResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
