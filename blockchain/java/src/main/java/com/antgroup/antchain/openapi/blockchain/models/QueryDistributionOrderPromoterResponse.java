// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDistributionOrderPromoterResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 佣金
    @NameInMap("commission")
    public String commission;

    // 佣金比例 10表示 10%
    @NameInMap("commission_rate")
    public String commissionRate;

    // 订单id
    @NameInMap("order_id")
    public String orderId;

    // 订单金额
    @NameInMap("order_price")
    public String orderPrice;

    // 推广人上级ID
    @NameInMap("prev_promoter_id")
    public String prevPromoterId;

    // 推广人上级分佣金额
    @NameInMap("prev_promoter_price")
    public String prevPromoterPrice;

    // 商品id
    @NameInMap("product_id")
    public String productId;

    // 推广人id
    @NameInMap("promoter_id")
    public String promoterId;

    // 链上地址
    @NameInMap("tx_hash")
    public String txHash;

    public static QueryDistributionOrderPromoterResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributionOrderPromoterResponse self = new QueryDistributionOrderPromoterResponse();
        return TeaModel.build(map, self);
    }

    public QueryDistributionOrderPromoterResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDistributionOrderPromoterResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDistributionOrderPromoterResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDistributionOrderPromoterResponse setCommission(String commission) {
        this.commission = commission;
        return this;
    }
    public String getCommission() {
        return this.commission;
    }

    public QueryDistributionOrderPromoterResponse setCommissionRate(String commissionRate) {
        this.commissionRate = commissionRate;
        return this;
    }
    public String getCommissionRate() {
        return this.commissionRate;
    }

    public QueryDistributionOrderPromoterResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryDistributionOrderPromoterResponse setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
        return this;
    }
    public String getOrderPrice() {
        return this.orderPrice;
    }

    public QueryDistributionOrderPromoterResponse setPrevPromoterId(String prevPromoterId) {
        this.prevPromoterId = prevPromoterId;
        return this;
    }
    public String getPrevPromoterId() {
        return this.prevPromoterId;
    }

    public QueryDistributionOrderPromoterResponse setPrevPromoterPrice(String prevPromoterPrice) {
        this.prevPromoterPrice = prevPromoterPrice;
        return this;
    }
    public String getPrevPromoterPrice() {
        return this.prevPromoterPrice;
    }

    public QueryDistributionOrderPromoterResponse setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public QueryDistributionOrderPromoterResponse setPromoterId(String promoterId) {
        this.promoterId = promoterId;
        return this;
    }
    public String getPromoterId() {
        return this.promoterId;
    }

    public QueryDistributionOrderPromoterResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
