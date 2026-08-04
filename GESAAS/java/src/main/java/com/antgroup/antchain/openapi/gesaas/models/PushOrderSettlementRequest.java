// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class PushOrderSettlementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商家产品唯一编码，64个字符以内
    @NameInMap("out_product_id")
    @Validation(required = true)
    public String outProductId;

    // 外部订单号(同一个outProductId保证唯一性)，需保证在商家端不重复，64个字符以内
    @NameInMap("out_order_no")
    @Validation(required = true)
    public String outOrderNo;

    // 订单支付金额(同分账金额)，单位：分（如 990 表示 9.90元）
    @NameInMap("total_amount")
    @Validation(required = true)
    public Long totalAmount;

    // 支付产品，默认：JSAPI
    @NameInMap("pay_product")
    public String payProduct;

    // 扩展参数，JSONString格式
    @NameInMap("ext_info")
    public String extInfo;

    // 订单创建时间，格式为yyyy-MM-dd HH:mm:ss
    @NameInMap("order_create_time")
    @Validation(required = true)
    public String orderCreateTime;

    // 订单支付标题， 150个字符以内
    @NameInMap("pay_subject")
    @Validation(required = true)
    public String paySubject;

    // 支付渠道，默认：ALIPAY
    @NameInMap("pay_channel")
    public String payChannel;

    // 支付渠道是ALIPAY场景下传入支付宝用户2088xxxx
    @NameInMap("pay_channel_user_id")
    @Validation(required = true)
    public String payChannelUserId;

    public static PushOrderSettlementRequest build(java.util.Map<String, ?> map) throws Exception {
        PushOrderSettlementRequest self = new PushOrderSettlementRequest();
        return TeaModel.build(map, self);
    }

    public PushOrderSettlementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushOrderSettlementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushOrderSettlementRequest setOutProductId(String outProductId) {
        this.outProductId = outProductId;
        return this;
    }
    public String getOutProductId() {
        return this.outProductId;
    }

    public PushOrderSettlementRequest setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
        return this;
    }
    public String getOutOrderNo() {
        return this.outOrderNo;
    }

    public PushOrderSettlementRequest setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public PushOrderSettlementRequest setPayProduct(String payProduct) {
        this.payProduct = payProduct;
        return this;
    }
    public String getPayProduct() {
        return this.payProduct;
    }

    public PushOrderSettlementRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public PushOrderSettlementRequest setOrderCreateTime(String orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
        return this;
    }
    public String getOrderCreateTime() {
        return this.orderCreateTime;
    }

    public PushOrderSettlementRequest setPaySubject(String paySubject) {
        this.paySubject = paySubject;
        return this;
    }
    public String getPaySubject() {
        return this.paySubject;
    }

    public PushOrderSettlementRequest setPayChannel(String payChannel) {
        this.payChannel = payChannel;
        return this;
    }
    public String getPayChannel() {
        return this.payChannel;
    }

    public PushOrderSettlementRequest setPayChannelUserId(String payChannelUserId) {
        this.payChannelUserId = payChannelUserId;
        return this;
    }
    public String getPayChannelUserId() {
        return this.payChannelUserId;
    }

}
