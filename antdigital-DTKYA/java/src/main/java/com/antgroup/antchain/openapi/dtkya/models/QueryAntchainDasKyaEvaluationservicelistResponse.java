// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class QueryAntchainDasKyaEvaluationservicelistResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 评测服务编码
    @NameInMap("service_code")
    public String serviceCode;

    // 评测服务名称
    @NameInMap("service_name")
    public String serviceName;

    // 评测服务描述
    @NameInMap("service_description")
    public String serviceDescription;

    // 评测服务类型
    @NameInMap("evaluation_type")
    public String evaluationType;

    // 评测服务提供放did
    @NameInMap("provider_did")
    public String providerDid;

    // 评测服务版本号
    @NameInMap("version")
    public String version;

    public static QueryAntchainDasKyaEvaluationservicelistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDasKyaEvaluationservicelistResponse self = new QueryAntchainDasKyaEvaluationservicelistResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDasKyaEvaluationservicelistResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainDasKyaEvaluationservicelistResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainDasKyaEvaluationservicelistResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainDasKyaEvaluationservicelistResponse setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public QueryAntchainDasKyaEvaluationservicelistResponse setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public QueryAntchainDasKyaEvaluationservicelistResponse setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
        return this;
    }
    public String getServiceDescription() {
        return this.serviceDescription;
    }

    public QueryAntchainDasKyaEvaluationservicelistResponse setEvaluationType(String evaluationType) {
        this.evaluationType = evaluationType;
        return this;
    }
    public String getEvaluationType() {
        return this.evaluationType;
    }

    public QueryAntchainDasKyaEvaluationservicelistResponse setProviderDid(String providerDid) {
        this.providerDid = providerDid;
        return this;
    }
    public String getProviderDid() {
        return this.providerDid;
    }

    public QueryAntchainDasKyaEvaluationservicelistResponse setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
