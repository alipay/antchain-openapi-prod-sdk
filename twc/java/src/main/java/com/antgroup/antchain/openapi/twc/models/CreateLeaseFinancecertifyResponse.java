// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseFinancecertifyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 本次认证是否通过
    @NameInMap("certify_result")
    public String certifyResult;

    // 通过的人脸认证id
    @NameInMap("lease_certify_id")
    public String leaseCertifyId;

    // 本次调用核验结果码
    @NameInMap("code")
    public String code;

    // 错误信息描述
    @NameInMap("message")
    public String message;

    public static CreateLeaseFinancecertifyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseFinancecertifyResponse self = new CreateLeaseFinancecertifyResponse();
        return TeaModel.build(map, self);
    }

    public CreateLeaseFinancecertifyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateLeaseFinancecertifyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateLeaseFinancecertifyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateLeaseFinancecertifyResponse setCertifyResult(String certifyResult) {
        this.certifyResult = certifyResult;
        return this;
    }
    public String getCertifyResult() {
        return this.certifyResult;
    }

    public CreateLeaseFinancecertifyResponse setLeaseCertifyId(String leaseCertifyId) {
        this.leaseCertifyId = leaseCertifyId;
        return this;
    }
    public String getLeaseCertifyId() {
        return this.leaseCertifyId;
    }

    public CreateLeaseFinancecertifyResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateLeaseFinancecertifyResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
