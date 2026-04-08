// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.morserta.models;

import com.aliyun.tea.*;

public class ConversionAdDataAttributedResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 处理是否成功
    @NameInMap("success")
    public Boolean success;

    // 是否需要回传媒体
    @NameInMap("callback")
    public Long callback;

    public static ConversionAdDataAttributedResponse build(java.util.Map<String, ?> map) throws Exception {
        ConversionAdDataAttributedResponse self = new ConversionAdDataAttributedResponse();
        return TeaModel.build(map, self);
    }

    public ConversionAdDataAttributedResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ConversionAdDataAttributedResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ConversionAdDataAttributedResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ConversionAdDataAttributedResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ConversionAdDataAttributedResponse setCallback(Long callback) {
        this.callback = callback;
        return this;
    }
    public Long getCallback() {
        return this.callback;
    }

}
