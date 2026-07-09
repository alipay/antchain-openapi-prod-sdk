// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.autoinsurancemkt.models;

import com.aliyun.tea.*;

public class NotifyAntcloudInsuranceEmbedoemautoinsuranceEventResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 0=成功，非0=失败
    @NameInMap("code")
    public Long code;

    // 返回消息
    @NameInMap("message")
    public String message;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    public static NotifyAntcloudInsuranceEmbedoemautoinsuranceEventResponse build(java.util.Map<String, ?> map) throws Exception {
        NotifyAntcloudInsuranceEmbedoemautoinsuranceEventResponse self = new NotifyAntcloudInsuranceEmbedoemautoinsuranceEventResponse();
        return TeaModel.build(map, self);
    }

    public NotifyAntcloudInsuranceEmbedoemautoinsuranceEventResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public NotifyAntcloudInsuranceEmbedoemautoinsuranceEventResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public NotifyAntcloudInsuranceEmbedoemautoinsuranceEventResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public NotifyAntcloudInsuranceEmbedoemautoinsuranceEventResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public NotifyAntcloudInsuranceEmbedoemautoinsuranceEventResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public NotifyAntcloudInsuranceEmbedoemautoinsuranceEventResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
