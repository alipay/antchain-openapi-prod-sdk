// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerSppdashboarddistributionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当日总进件量
    @NameInMap("total")
    public Long total;

    // 商家承接量与占比
    @NameInMap("distribution")
    public String distribution;

    // 进件实时日志（当日最新 logLimit 条，按时间倒序）
    @NameInMap("logs")
    public String logs;

    public static QueryInnerSppdashboarddistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerSppdashboarddistributionResponse self = new QueryInnerSppdashboarddistributionResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerSppdashboarddistributionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerSppdashboarddistributionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerSppdashboarddistributionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerSppdashboarddistributionResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryInnerSppdashboarddistributionResponse setDistribution(String distribution) {
        this.distribution = distribution;
        return this;
    }
    public String getDistribution() {
        return this.distribution;
    }

    public QueryInnerSppdashboarddistributionResponse setLogs(String logs) {
        this.logs = logs;
        return this;
    }
    public String getLogs() {
        return this.logs;
    }

}
