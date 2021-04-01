// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryMypointsSkufeeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 预下单的数量
    @NameInMap("count")
    public Long count;

    // 费率
    @NameInMap("rate")
    public String rate;

    // 商品ID
    @NameInMap("sku_id")
    public String skuId;

    // 总集分宝数量（个）
    @NameInMap("total_amount")
    public Long totalAmount;

    // 总费用
    @NameInMap("total_cost")
    public String totalCost;

    public static QueryMypointsSkufeeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMypointsSkufeeResponse self = new QueryMypointsSkufeeResponse();
        return TeaModel.build(map, self);
    }

    public QueryMypointsSkufeeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMypointsSkufeeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMypointsSkufeeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMypointsSkufeeResponse setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public QueryMypointsSkufeeResponse setRate(String rate) {
        this.rate = rate;
        return this;
    }
    public String getRate() {
        return this.rate;
    }

    public QueryMypointsSkufeeResponse setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public QueryMypointsSkufeeResponse setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public QueryMypointsSkufeeResponse setTotalCost(String totalCost) {
        this.totalCost = totalCost;
        return this;
    }
    public String getTotalCost() {
        return this.totalCost;
    }

}
