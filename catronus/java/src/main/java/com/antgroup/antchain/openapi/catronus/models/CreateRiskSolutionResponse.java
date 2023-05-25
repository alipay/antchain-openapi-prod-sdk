// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class CreateRiskSolutionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 风险解决方案ID
    @NameInMap("risk_solution_id")
    public String riskSolutionId;

    public static CreateRiskSolutionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRiskSolutionResponse self = new CreateRiskSolutionResponse();
        return TeaModel.build(map, self);
    }

    public CreateRiskSolutionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateRiskSolutionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateRiskSolutionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateRiskSolutionResponse setRiskSolutionId(String riskSolutionId) {
        this.riskSolutionId = riskSolutionId;
        return this;
    }
    public String getRiskSolutionId() {
        return this.riskSolutionId;
    }

}
