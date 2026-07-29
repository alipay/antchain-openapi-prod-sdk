// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SumbitInnerMermngcontractextractResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务id
    @NameInMap("task_instant_id")
    public String taskInstantId;

    public static SumbitInnerMermngcontractextractResponse build(java.util.Map<String, ?> map) throws Exception {
        SumbitInnerMermngcontractextractResponse self = new SumbitInnerMermngcontractextractResponse();
        return TeaModel.build(map, self);
    }

    public SumbitInnerMermngcontractextractResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SumbitInnerMermngcontractextractResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SumbitInnerMermngcontractextractResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SumbitInnerMermngcontractextractResponse setTaskInstantId(String taskInstantId) {
        this.taskInstantId = taskInstantId;
        return this;
    }
    public String getTaskInstantId() {
        return this.taskInstantId;
    }

}
