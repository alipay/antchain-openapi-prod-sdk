// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class RegisterAntchainDasKyaAgentevaluationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 评测记录id
    @NameInMap("evaluation_id")
    public String evaluationId;

    // 评测接入配置信息
    @NameInMap("access_config")
    public String accessConfig;

    public static RegisterAntchainDasKyaAgentevaluationResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterAntchainDasKyaAgentevaluationResponse self = new RegisterAntchainDasKyaAgentevaluationResponse();
        return TeaModel.build(map, self);
    }

    public RegisterAntchainDasKyaAgentevaluationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RegisterAntchainDasKyaAgentevaluationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RegisterAntchainDasKyaAgentevaluationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RegisterAntchainDasKyaAgentevaluationResponse setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
        return this;
    }
    public String getEvaluationId() {
        return this.evaluationId;
    }

    public RegisterAntchainDasKyaAgentevaluationResponse setAccessConfig(String accessConfig) {
        this.accessConfig = accessConfig;
        return this;
    }
    public String getAccessConfig() {
        return this.accessConfig;
    }

}
