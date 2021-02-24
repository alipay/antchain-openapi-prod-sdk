// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopRiskstormResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 年报数据
    @NameInMap("annual_reports")
    public java.util.List<RtopRiskStormCompanyAnnualReport> annualReports;

    // 风险标签数据
    @NameInMap("risk_labels")
    public java.util.List<RiskStormLabelResp> riskLabels;

    public static QueryRtopRiskstormResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopRiskstormResponse self = new QueryRtopRiskstormResponse();
        return TeaModel.build(map, self);
    }

    public QueryRtopRiskstormResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRtopRiskstormResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRtopRiskstormResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRtopRiskstormResponse setAnnualReports(java.util.List<RtopRiskStormCompanyAnnualReport> annualReports) {
        this.annualReports = annualReports;
        return this;
    }
    public java.util.List<RtopRiskStormCompanyAnnualReport> getAnnualReports() {
        return this.annualReports;
    }

    public QueryRtopRiskstormResponse setRiskLabels(java.util.List<RiskStormLabelResp> riskLabels) {
        this.riskLabels = riskLabels;
        return this;
    }
    public java.util.List<RiskStormLabelResp> getRiskLabels() {
        return this.riskLabels;
    }

}
