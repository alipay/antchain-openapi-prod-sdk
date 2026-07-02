// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CompleteDigitalregistrationApplyformsealResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否完成签署
    @NameInMap("completed")
    public Boolean completed;

    public static CompleteDigitalregistrationApplyformsealResponse build(java.util.Map<String, ?> map) throws Exception {
        CompleteDigitalregistrationApplyformsealResponse self = new CompleteDigitalregistrationApplyformsealResponse();
        return TeaModel.build(map, self);
    }

    public CompleteDigitalregistrationApplyformsealResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CompleteDigitalregistrationApplyformsealResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CompleteDigitalregistrationApplyformsealResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CompleteDigitalregistrationApplyformsealResponse setCompleted(Boolean completed) {
        this.completed = completed;
        return this;
    }
    public Boolean getCompleted() {
        return this.completed;
    }

}
