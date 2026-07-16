// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryIncomeEvaluationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 最近 3 个月月均收入指数
    @NameInMap("avgincome3m")
    public String avgincome3m;

    // 最近 6 个月月均收入指数
    @NameInMap("avgincome6m")
    public String avgincome6m;

    // 最近 12 个月月均收入指数
    @NameInMap("avgincome12m")
    public String avgincome12m;

    // 洞察分
    @NameInMap("insight_score")
    public String insightScore;

    // 是否计费
    @NameInMap("billed")
    public Boolean billed;

    // 查询订单号，系统内部生成
    @NameInMap("order_no")
    public String orderNo;

    public static QueryIncomeEvaluationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIncomeEvaluationResponse self = new QueryIncomeEvaluationResponse();
        return TeaModel.build(map, self);
    }

    public QueryIncomeEvaluationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIncomeEvaluationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIncomeEvaluationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIncomeEvaluationResponse setAvgincome3m(String avgincome3m) {
        this.avgincome3m = avgincome3m;
        return this;
    }
    public String getAvgincome3m() {
        return this.avgincome3m;
    }

    public QueryIncomeEvaluationResponse setAvgincome6m(String avgincome6m) {
        this.avgincome6m = avgincome6m;
        return this;
    }
    public String getAvgincome6m() {
        return this.avgincome6m;
    }

    public QueryIncomeEvaluationResponse setAvgincome12m(String avgincome12m) {
        this.avgincome12m = avgincome12m;
        return this;
    }
    public String getAvgincome12m() {
        return this.avgincome12m;
    }

    public QueryIncomeEvaluationResponse setInsightScore(String insightScore) {
        this.insightScore = insightScore;
        return this;
    }
    public String getInsightScore() {
        return this.insightScore;
    }

    public QueryIncomeEvaluationResponse setBilled(Boolean billed) {
        this.billed = billed;
        return this;
    }
    public Boolean getBilled() {
        return this.billed;
    }

    public QueryIncomeEvaluationResponse setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

}
