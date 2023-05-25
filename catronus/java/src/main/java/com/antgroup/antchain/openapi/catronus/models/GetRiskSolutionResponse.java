// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class GetRiskSolutionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 风险解决方案
    @NameInMap("risk_solution")
    public RiskSolution riskSolution;

    public static GetRiskSolutionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRiskSolutionResponse self = new GetRiskSolutionResponse();
        return TeaModel.build(map, self);
    }

    public GetRiskSolutionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetRiskSolutionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetRiskSolutionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetRiskSolutionResponse setRiskSolution(RiskSolution riskSolution) {
        this.riskSolution = riskSolution;
        return this;
    }
    public RiskSolution getRiskSolution() {
        return this.riskSolution;
    }

}
