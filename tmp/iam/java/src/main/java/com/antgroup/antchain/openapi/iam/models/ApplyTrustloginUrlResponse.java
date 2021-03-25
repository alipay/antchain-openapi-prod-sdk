// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class ApplyTrustloginUrlResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 信登URL
    @NameInMap("trust_login_url")
    public String trustLoginUrl;

    public static ApplyTrustloginUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyTrustloginUrlResponse self = new ApplyTrustloginUrlResponse();
        return TeaModel.build(map, self);
    }

    public ApplyTrustloginUrlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyTrustloginUrlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyTrustloginUrlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyTrustloginUrlResponse setTrustLoginUrl(String trustLoginUrl) {
        this.trustLoginUrl = trustLoginUrl;
        return this;
    }
    public String getTrustLoginUrl() {
        return this.trustLoginUrl;
    }

}
