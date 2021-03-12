// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryIdentificationRiskTwometaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 是否通过
    @NameInMap("accepted")
    public Boolean accepted;

    //  
    @NameInMap("verify_url")
    public String verifyUrl;

    public static QueryIdentificationRiskTwometaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIdentificationRiskTwometaResponse self = new QueryIdentificationRiskTwometaResponse();
        return TeaModel.build(map, self);
    }

    public QueryIdentificationRiskTwometaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIdentificationRiskTwometaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIdentificationRiskTwometaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIdentificationRiskTwometaResponse setAccepted(Boolean accepted) {
        this.accepted = accepted;
        return this;
    }
    public Boolean getAccepted() {
        return this.accepted;
    }

    public QueryIdentificationRiskTwometaResponse setVerifyUrl(String verifyUrl) {
        this.verifyUrl = verifyUrl;
        return this;
    }
    public String getVerifyUrl() {
        return this.verifyUrl;
    }

}
