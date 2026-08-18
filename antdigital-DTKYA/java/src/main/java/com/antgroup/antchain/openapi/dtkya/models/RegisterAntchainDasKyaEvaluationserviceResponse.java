// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class RegisterAntchainDasKyaEvaluationserviceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // did
    @NameInMap("provider_did")
    public String providerDid;

    // 评测服务编码
    @NameInMap("service_code")
    public String serviceCode;

    // 版本
    @NameInMap("version")
    public String version;

    public static RegisterAntchainDasKyaEvaluationserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterAntchainDasKyaEvaluationserviceResponse self = new RegisterAntchainDasKyaEvaluationserviceResponse();
        return TeaModel.build(map, self);
    }

    public RegisterAntchainDasKyaEvaluationserviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RegisterAntchainDasKyaEvaluationserviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RegisterAntchainDasKyaEvaluationserviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RegisterAntchainDasKyaEvaluationserviceResponse setProviderDid(String providerDid) {
        this.providerDid = providerDid;
        return this;
    }
    public String getProviderDid() {
        return this.providerDid;
    }

    public RegisterAntchainDasKyaEvaluationserviceResponse setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public RegisterAntchainDasKyaEvaluationserviceResponse setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
