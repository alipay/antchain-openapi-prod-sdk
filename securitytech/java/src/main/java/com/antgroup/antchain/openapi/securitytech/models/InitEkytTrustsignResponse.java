// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class InitEkytTrustsignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 响应结果
    @NameInMap("success")
    public Boolean success;

    // 结果描述
    @NameInMap("message")
    public String message;

    // 可信签约初始化数据
    @NameInMap("data")
    public TrustSignInitData data;

    public static InitEkytTrustsignResponse build(java.util.Map<String, ?> map) throws Exception {
        InitEkytTrustsignResponse self = new InitEkytTrustsignResponse();
        return TeaModel.build(map, self);
    }

    public InitEkytTrustsignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitEkytTrustsignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitEkytTrustsignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitEkytTrustsignResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public InitEkytTrustsignResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitEkytTrustsignResponse setData(TrustSignInitData data) {
        this.data = data;
        return this;
    }
    public TrustSignInitData getData() {
        return this.data;
    }

}
