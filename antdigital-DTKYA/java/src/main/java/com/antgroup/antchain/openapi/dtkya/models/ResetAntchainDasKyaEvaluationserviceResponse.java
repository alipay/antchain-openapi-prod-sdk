// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class ResetAntchainDasKyaEvaluationserviceResponse extends TeaModel {
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

    // 版本号
    @NameInMap("version")
    public String version;

    public static ResetAntchainDasKyaEvaluationserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAntchainDasKyaEvaluationserviceResponse self = new ResetAntchainDasKyaEvaluationserviceResponse();
        return TeaModel.build(map, self);
    }

    public ResetAntchainDasKyaEvaluationserviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ResetAntchainDasKyaEvaluationserviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ResetAntchainDasKyaEvaluationserviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ResetAntchainDasKyaEvaluationserviceResponse setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public ResetAntchainDasKyaEvaluationserviceResponse setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
