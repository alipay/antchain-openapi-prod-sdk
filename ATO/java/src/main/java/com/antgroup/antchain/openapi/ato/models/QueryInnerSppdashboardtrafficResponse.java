// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerSppdashboardtrafficResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 流量转化看板，5 项流量指标 + 全链路转化率 + updateTime
    @NameInMap("conversion")
    public String conversion;

    // 收入结果看板，当日收入预估 + 平台收入 GAAP + updateTime
    @NameInMap("income")
    public String income;

    public static QueryInnerSppdashboardtrafficResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerSppdashboardtrafficResponse self = new QueryInnerSppdashboardtrafficResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerSppdashboardtrafficResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerSppdashboardtrafficResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerSppdashboardtrafficResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerSppdashboardtrafficResponse setConversion(String conversion) {
        this.conversion = conversion;
        return this;
    }
    public String getConversion() {
        return this.conversion;
    }

    public QueryInnerSppdashboardtrafficResponse setIncome(String income) {
        this.income = income;
        return this;
    }
    public String getIncome() {
        return this.income;
    }

}
