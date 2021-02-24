// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopRisklabelFilterResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 返回码
    @NameInMap("response_code")
    public String responseCode;

    // 标签配置全量信息
    @NameInMap("risk_label_filter_config_info")
    public java.util.List<RiskLabelFilterConfigInfo> riskLabelFilterConfigInfo;

    // 是否调用成功
    @NameInMap("success")
    public Boolean success;

    // 总数
    @NameInMap("total")
    public Long total;

    public static QueryRtopRisklabelFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopRisklabelFilterResponse self = new QueryRtopRisklabelFilterResponse();
        return TeaModel.build(map, self);
    }

    public QueryRtopRisklabelFilterResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRtopRisklabelFilterResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRtopRisklabelFilterResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRtopRisklabelFilterResponse setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public QueryRtopRisklabelFilterResponse setRiskLabelFilterConfigInfo(java.util.List<RiskLabelFilterConfigInfo> riskLabelFilterConfigInfo) {
        this.riskLabelFilterConfigInfo = riskLabelFilterConfigInfo;
        return this;
    }
    public java.util.List<RiskLabelFilterConfigInfo> getRiskLabelFilterConfigInfo() {
        return this.riskLabelFilterConfigInfo;
    }

    public QueryRtopRisklabelFilterResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRtopRisklabelFilterResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
