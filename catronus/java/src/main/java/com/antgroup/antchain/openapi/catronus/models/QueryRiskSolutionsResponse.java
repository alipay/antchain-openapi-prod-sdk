// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class QueryRiskSolutionsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 风险解决方案列表
    @NameInMap("risk_solutions")
    public java.util.List<RiskSolution> riskSolutions;

    // 总数
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryRiskSolutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskSolutionsResponse self = new QueryRiskSolutionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRiskSolutionsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRiskSolutionsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRiskSolutionsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRiskSolutionsResponse setRiskSolutions(java.util.List<RiskSolution> riskSolutions) {
        this.riskSolutions = riskSolutions;
        return this;
    }
    public java.util.List<RiskSolution> getRiskSolutions() {
        return this.riskSolutions;
    }

    public QueryRiskSolutionsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
