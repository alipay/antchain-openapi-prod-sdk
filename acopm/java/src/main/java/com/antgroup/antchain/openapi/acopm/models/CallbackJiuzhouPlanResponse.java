// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class CallbackJiuzhouPlanResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求标识
    @NameInMap("exec_id")
    public String execId;

    // 请求是否成功
    @NameInMap("success")
    public Boolean success;

    public static CallbackJiuzhouPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CallbackJiuzhouPlanResponse self = new CallbackJiuzhouPlanResponse();
        return TeaModel.build(map, self);
    }

    public CallbackJiuzhouPlanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CallbackJiuzhouPlanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CallbackJiuzhouPlanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CallbackJiuzhouPlanResponse setExecId(String execId) {
        this.execId = execId;
        return this;
    }
    public String getExecId() {
        return this.execId;
    }

    public CallbackJiuzhouPlanResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
