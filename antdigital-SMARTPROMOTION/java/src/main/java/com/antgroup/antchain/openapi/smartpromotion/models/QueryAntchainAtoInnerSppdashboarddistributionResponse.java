// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.smartpromotion.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoInnerSppdashboarddistributionResponse extends TeaModel {
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

    public static QueryAntchainAtoInnerSppdashboarddistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoInnerSppdashboarddistributionResponse self = new QueryAntchainAtoInnerSppdashboarddistributionResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoInnerSppdashboarddistributionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainAtoInnerSppdashboarddistributionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainAtoInnerSppdashboarddistributionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainAtoInnerSppdashboarddistributionResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryAntchainAtoInnerSppdashboarddistributionResponse setDistribution(String distribution) {
        this.distribution = distribution;
        return this;
    }
    public String getDistribution() {
        return this.distribution;
    }

    public QueryAntchainAtoInnerSppdashboarddistributionResponse setLogs(String logs) {
        this.logs = logs;
        return this;
    }
    public String getLogs() {
        return this.logs;
    }

}
