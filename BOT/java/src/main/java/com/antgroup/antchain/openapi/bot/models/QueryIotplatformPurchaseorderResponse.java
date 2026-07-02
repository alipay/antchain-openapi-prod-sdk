// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryIotplatformPurchaseorderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否为链上采购商品，true：是，false：否
    @NameInMap("goods_from_chain")
    public Boolean goodsFromChain;

    // 采购时间
    @NameInMap("purchase_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String purchaseTime;

    // 采购商名称
    @NameInMap("lease_name")
    public String leaseName;

    // 采购价
    @NameInMap("purchase_order_price")
    public String purchaseOrderPrice;

    // 商品名称
    @NameInMap("goods_name")
    public String goodsName;

    public static QueryIotplatformPurchaseorderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIotplatformPurchaseorderResponse self = new QueryIotplatformPurchaseorderResponse();
        return TeaModel.build(map, self);
    }

    public QueryIotplatformPurchaseorderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIotplatformPurchaseorderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIotplatformPurchaseorderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIotplatformPurchaseorderResponse setGoodsFromChain(Boolean goodsFromChain) {
        this.goodsFromChain = goodsFromChain;
        return this;
    }
    public Boolean getGoodsFromChain() {
        return this.goodsFromChain;
    }

    public QueryIotplatformPurchaseorderResponse setPurchaseTime(String purchaseTime) {
        this.purchaseTime = purchaseTime;
        return this;
    }
    public String getPurchaseTime() {
        return this.purchaseTime;
    }

    public QueryIotplatformPurchaseorderResponse setLeaseName(String leaseName) {
        this.leaseName = leaseName;
        return this;
    }
    public String getLeaseName() {
        return this.leaseName;
    }

    public QueryIotplatformPurchaseorderResponse setPurchaseOrderPrice(String purchaseOrderPrice) {
        this.purchaseOrderPrice = purchaseOrderPrice;
        return this;
    }
    public String getPurchaseOrderPrice() {
        return this.purchaseOrderPrice;
    }

    public QueryIotplatformPurchaseorderResponse setGoodsName(String goodsName) {
        this.goodsName = goodsName;
        return this;
    }
    public String getGoodsName() {
        return this.goodsName;
    }

}
