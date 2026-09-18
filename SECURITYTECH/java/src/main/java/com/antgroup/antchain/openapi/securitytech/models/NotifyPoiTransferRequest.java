// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class NotifyPoiTransferRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 关联交易单号（天枢内部，eKYT接收不透出商城）
    @NameInMap("trade_no")
    @Validation(required = true)
    public String tradeNo;

    // 商城订单号
    @NameInMap("biz_order_no")
    @Validation(required = true)
    public String bizOrderNo;

    // 原始正向订单号（仅MALL携带，余额来源业务订单号）
    @NameInMap("original_order_no")
    public String originalOrderNo;

    // 分账时间，格式yyyy-MM-dd HH:mm:ss
    @NameInMap("gmt_transfer")
    @Validation(required = true)
    public String gmtTransfer;

    // 结算类型：PET-活体 / MALL-商城消费 / SCORE-充值余额整笔 / MEMBER-会员
    @NameInMap("settle_type")
    @Validation(required = true)
    public String settleType;

    // 分账明细JSON数组（天枢每批次收款主体唯一，单元素数组；元素：cert_no收款主体社信码、transfer_amount结算金额元）
    @NameInMap("transfer_details")
    @Validation(required = true)
    public String transferDetails;

    public static NotifyPoiTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyPoiTransferRequest self = new NotifyPoiTransferRequest();
        return TeaModel.build(map, self);
    }

    public NotifyPoiTransferRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyPoiTransferRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyPoiTransferRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public NotifyPoiTransferRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public NotifyPoiTransferRequest setOriginalOrderNo(String originalOrderNo) {
        this.originalOrderNo = originalOrderNo;
        return this;
    }
    public String getOriginalOrderNo() {
        return this.originalOrderNo;
    }

    public NotifyPoiTransferRequest setGmtTransfer(String gmtTransfer) {
        this.gmtTransfer = gmtTransfer;
        return this;
    }
    public String getGmtTransfer() {
        return this.gmtTransfer;
    }

    public NotifyPoiTransferRequest setSettleType(String settleType) {
        this.settleType = settleType;
        return this;
    }
    public String getSettleType() {
        return this.settleType;
    }

    public NotifyPoiTransferRequest setTransferDetails(String transferDetails) {
        this.transferDetails = transferDetails;
        return this;
    }
    public String getTransferDetails() {
        return this.transferDetails;
    }

}
