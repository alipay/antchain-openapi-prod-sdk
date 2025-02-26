// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9705ae7650f74f47b1e8158151cc122f.models;

import com.aliyun.tea.*;

public class QueryBlockchainBccrDciRegistrationcertResponse extends TeaModel {
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

    public static QueryBlockchainBccrDciRegistrationcertResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBccrDciRegistrationcertResponse self = new QueryBlockchainBccrDciRegistrationcertResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBccrDciRegistrationcertResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBlockchainBccrDciRegistrationcertResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBlockchainBccrDciRegistrationcertResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBlockchainBccrDciRegistrationcertResponse setCertificateData(CertificateData certificateData) {
        this.certificateData = certificateData;
        return this;
    }
    public CertificateData getCertificateData() {
        return this.certificateData;
    }

}
