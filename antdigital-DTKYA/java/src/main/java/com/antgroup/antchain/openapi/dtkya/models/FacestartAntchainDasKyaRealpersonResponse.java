// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class FacestartAntchainDasKyaRealpersonResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 刷脸认证单编号
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    // 用于唤起认证的下游地址
    @NameInMap("certify_url")
    @Validation(required = true)
    public String certifyUrl;

    // 认证单有效期截止时间，ISO 8601
    @NameInMap("expires_at")
    public String expiresAt;

    public static FacestartAntchainDasKyaRealpersonResponse build(java.util.Map<String, ?> map) throws Exception {
        FacestartAntchainDasKyaRealpersonResponse self = new FacestartAntchainDasKyaRealpersonResponse();
        return TeaModel.build(map, self);
    }

    public FacestartAntchainDasKyaRealpersonResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public FacestartAntchainDasKyaRealpersonResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public FacestartAntchainDasKyaRealpersonResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public FacestartAntchainDasKyaRealpersonResponse setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public FacestartAntchainDasKyaRealpersonResponse setCertifyUrl(String certifyUrl) {
        this.certifyUrl = certifyUrl;
        return this;
    }
    public String getCertifyUrl() {
        return this.certifyUrl;
    }

    public FacestartAntchainDasKyaRealpersonResponse setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public String getExpiresAt() {
        return this.expiresAt;
    }

}
