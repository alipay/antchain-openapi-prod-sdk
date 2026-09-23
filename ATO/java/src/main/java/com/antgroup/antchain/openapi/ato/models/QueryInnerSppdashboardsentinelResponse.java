// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerSppdashboardsentinelResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 预警统计（数量/已解决/已处理时效）
    @NameInMap("stats")
    public String stats;

    // 预警明细 + 分页
    @NameInMap("alerts")
    public String alerts;

    public static QueryInnerSppdashboardsentinelResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerSppdashboardsentinelResponse self = new QueryInnerSppdashboardsentinelResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerSppdashboardsentinelResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerSppdashboardsentinelResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerSppdashboardsentinelResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerSppdashboardsentinelResponse setStats(String stats) {
        this.stats = stats;
        return this;
    }
    public String getStats() {
        return this.stats;
    }

    public QueryInnerSppdashboardsentinelResponse setAlerts(String alerts) {
        this.alerts = alerts;
        return this;
    }
    public String getAlerts() {
        return this.alerts;
    }

}
