// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class CertifyIndividualidFaceauthResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 认证的唯一性id
    @NameInMap("certify_id")
    public String certifyId;

    // 认证url
    @NameInMap("verify_url")
    public String verifyUrl;

    public static CertifyIndividualidFaceauthResponse build(java.util.Map<String, ?> map) throws Exception {
        CertifyIndividualidFaceauthResponse self = new CertifyIndividualidFaceauthResponse();
        return TeaModel.build(map, self);
    }

    public CertifyIndividualidFaceauthResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CertifyIndividualidFaceauthResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CertifyIndividualidFaceauthResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CertifyIndividualidFaceauthResponse setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public CertifyIndividualidFaceauthResponse setVerifyUrl(String verifyUrl) {
        this.verifyUrl = verifyUrl;
        return this;
    }
    public String getVerifyUrl() {
        return this.verifyUrl;
    }

}
