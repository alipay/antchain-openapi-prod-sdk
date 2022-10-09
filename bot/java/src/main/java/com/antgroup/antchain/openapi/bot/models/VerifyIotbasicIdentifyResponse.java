// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class VerifyIotbasicIdentifyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 认证结果
    @NameInMap("verify_result")
    public String verifyResult;

    public static VerifyIotbasicIdentifyResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyIotbasicIdentifyResponse self = new VerifyIotbasicIdentifyResponse();
        return TeaModel.build(map, self);
    }

    public VerifyIotbasicIdentifyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyIotbasicIdentifyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyIotbasicIdentifyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyIotbasicIdentifyResponse setVerifyResult(String verifyResult) {
        this.verifyResult = verifyResult;
        return this;
    }
    public String getVerifyResult() {
        return this.verifyResult;
    }

}
