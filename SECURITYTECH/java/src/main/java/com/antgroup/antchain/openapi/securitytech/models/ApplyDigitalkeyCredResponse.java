// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ApplyDigitalkeyCredResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 凭证数据
    @NameInMap("cred")
    public String cred;

    public static ApplyDigitalkeyCredResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyDigitalkeyCredResponse self = new ApplyDigitalkeyCredResponse();
        return TeaModel.build(map, self);
    }

    public ApplyDigitalkeyCredResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyDigitalkeyCredResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyDigitalkeyCredResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyDigitalkeyCredResponse setCred(String cred) {
        this.cred = cred;
        return this;
    }
    public String getCred() {
        return this.cred;
    }

}
