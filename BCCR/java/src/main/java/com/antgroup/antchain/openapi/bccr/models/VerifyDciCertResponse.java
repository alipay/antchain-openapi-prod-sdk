// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class VerifyDciCertResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 核验ID，供核验查询结果使用
    @NameInMap("certificate_verify_id")
    public String certificateVerifyId;

    public static VerifyDciCertResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyDciCertResponse self = new VerifyDciCertResponse();
        return TeaModel.build(map, self);
    }

    public VerifyDciCertResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyDciCertResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyDciCertResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyDciCertResponse setCertificateVerifyId(String certificateVerifyId) {
        this.certificateVerifyId = certificateVerifyId;
        return this;
    }
    public String getCertificateVerifyId() {
        return this.certificateVerifyId;
    }

}
