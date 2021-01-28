// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryCertificationResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 存证证明的证书信息列表
    @NameInMap("certificate_info")
    public java.util.List<CertificateInfo> certificateInfo;

    // 返回值状态码，0000则为成功
    @NameInMap("code")
    public String code;

    // 异常状态时的错误信息
    @NameInMap("message")
    public String message;

    public static QueryCertificationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCertificationResponse self = new QueryCertificationResponse();
        return TeaModel.build(map, self);
    }

    public QueryCertificationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCertificationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCertificationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCertificationResponse setCertificateInfo(java.util.List<CertificateInfo> certificateInfo) {
        this.certificateInfo = certificateInfo;
        return this;
    }
    public java.util.List<CertificateInfo> getCertificateInfo() {
        return this.certificateInfo;
    }

    public QueryCertificationResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCertificationResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
