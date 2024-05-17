// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class VerifyAuthTokenValidityResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 验证结果（ture表示通过，false表示不通过）
    @NameInMap("verify_result")
    public Boolean verifyResult;

    // 错误信息
    @NameInMap("err_msg")
    public String errMsg;

    public static VerifyAuthTokenValidityResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyAuthTokenValidityResponse self = new VerifyAuthTokenValidityResponse();
        return TeaModel.build(map, self);
    }

    public VerifyAuthTokenValidityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyAuthTokenValidityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyAuthTokenValidityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyAuthTokenValidityResponse setVerifyResult(Boolean verifyResult) {
        this.verifyResult = verifyResult;
        return this;
    }
    public Boolean getVerifyResult() {
        return this.verifyResult;
    }

    public VerifyAuthTokenValidityResponse setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

}
