// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopRisklabelResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回码
    @NameInMap("response_code")
    public String responseCode;

    // 标签信息
    @NameInMap("risk_label_infos")
    public java.util.List<RiskLabelInfo> riskLabelInfos;

    // scroll_id
    @NameInMap("scroll_id")
    public String scrollId;

    // 是否调用成功
    @NameInMap("success")
    public Boolean success;

    // total
    @NameInMap("total")
    public Long total;

    public static QueryRtopRisklabelResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopRisklabelResponse self = new QueryRtopRisklabelResponse();
        return TeaModel.build(map, self);
    }

    public QueryRtopRisklabelResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRtopRisklabelResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRtopRisklabelResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRtopRisklabelResponse setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public QueryRtopRisklabelResponse setRiskLabelInfos(java.util.List<RiskLabelInfo> riskLabelInfos) {
        this.riskLabelInfos = riskLabelInfos;
        return this;
    }
    public java.util.List<RiskLabelInfo> getRiskLabelInfos() {
        return this.riskLabelInfos;
    }

    public QueryRtopRisklabelResponse setScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }
    public String getScrollId() {
        return this.scrollId;
    }

    public QueryRtopRisklabelResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRtopRisklabelResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
