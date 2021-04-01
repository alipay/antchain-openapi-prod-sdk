// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class InitIdentificationEnterpriseFaceauthResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 本次认证的业务唯一性标示
    @NameInMap("biz_no")
    public String bizNo;

    // 认证url
    @NameInMap("verify_url")
    public String verifyUrl;

    public static InitIdentificationEnterpriseFaceauthResponse build(java.util.Map<String, ?> map) throws Exception {
        InitIdentificationEnterpriseFaceauthResponse self = new InitIdentificationEnterpriseFaceauthResponse();
        return TeaModel.build(map, self);
    }

    public InitIdentificationEnterpriseFaceauthResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitIdentificationEnterpriseFaceauthResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitIdentificationEnterpriseFaceauthResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitIdentificationEnterpriseFaceauthResponse setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public InitIdentificationEnterpriseFaceauthResponse setVerifyUrl(String verifyUrl) {
        this.verifyUrl = verifyUrl;
        return this;
    }
    public String getVerifyUrl() {
        return this.verifyUrl;
    }

}
