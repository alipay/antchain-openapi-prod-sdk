// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryDciRegistrationcertResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 证书信息
    @NameInMap("certificate_data")
    public CertificateData certificateData;

    public static QueryDciRegistrationcertResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDciRegistrationcertResponse self = new QueryDciRegistrationcertResponse();
        return TeaModel.build(map, self);
    }

    public QueryDciRegistrationcertResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDciRegistrationcertResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDciRegistrationcertResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDciRegistrationcertResponse setCertificateData(CertificateData certificateData) {
        this.certificateData = certificateData;
        return this;
    }
    public CertificateData getCertificateData() {
        return this.certificateData;
    }

}
