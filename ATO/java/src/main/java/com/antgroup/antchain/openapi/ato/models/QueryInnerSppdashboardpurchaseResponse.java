// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerSppdashboardpurchaseResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 采买总览（目标/当前/达成率）
    @NameInMap("overview")
    public String overview;

    // 各商家采购达成卡
    @NameInMap("merchants")
    public String merchants;

    // 商家流量评估（渠道 Top20% + AI 调量）
    @NameInMap("evaluations")
    public String evaluations;

    public static QueryInnerSppdashboardpurchaseResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerSppdashboardpurchaseResponse self = new QueryInnerSppdashboardpurchaseResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerSppdashboardpurchaseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerSppdashboardpurchaseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerSppdashboardpurchaseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerSppdashboardpurchaseResponse setOverview(String overview) {
        this.overview = overview;
        return this;
    }
    public String getOverview() {
        return this.overview;
    }

    public QueryInnerSppdashboardpurchaseResponse setMerchants(String merchants) {
        this.merchants = merchants;
        return this;
    }
    public String getMerchants() {
        return this.merchants;
    }

    public QueryInnerSppdashboardpurchaseResponse setEvaluations(String evaluations) {
        this.evaluations = evaluations;
        return this;
    }
    public String getEvaluations() {
        return this.evaluations;
    }

}
