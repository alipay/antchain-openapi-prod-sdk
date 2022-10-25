// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseRiskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 风控结果
    // SUCCESS：通过
    // FAIL：不通过
    @NameInMap("paas")
    public String paas;

    // 风控识别id，与订单id对应
    @NameInMap("risk_id")
    public String riskId;

    public static CreateLeaseRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseRiskResponse self = new CreateLeaseRiskResponse();
        return TeaModel.build(map, self);
    }

    public CreateLeaseRiskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateLeaseRiskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateLeaseRiskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateLeaseRiskResponse setPaas(String paas) {
        this.paas = paas;
        return this;
    }
    public String getPaas() {
        return this.paas;
    }

    public CreateLeaseRiskResponse setRiskId(String riskId) {
        this.riskId = riskId;
        return this;
    }
    public String getRiskId() {
        return this.riskId;
    }

}
