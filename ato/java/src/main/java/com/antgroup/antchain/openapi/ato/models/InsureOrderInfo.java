// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class InsureOrderInfo extends TeaModel {
    // 商家订单ID
    @NameInMap("order_id")
    public String orderId;

    // 投保编号（承保id）
    @NameInMap("insure_id")
    public String insureId;

    // 商品名称
    @NameInMap("product_name")
    public String productName;

    // 保险开始时间
    @NameInMap("insure_start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String insureStartTime;

    // 保险终止时间
    @NameInMap("insure_end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String insureEndTime;

    // 投保金额（保额），单位分 100代表1元
    @NameInMap("insure_amount")
    public Long insureAmount;

    // 投保费用（保费），单位分 100代表1元
    @NameInMap("insure_premium")
    public Long insurePremium;

    // 投保状态枚举
    @NameInMap("status")
    public String status;

    public static InsureOrderInfo build(java.util.Map<String, ?> map) throws Exception {
        InsureOrderInfo self = new InsureOrderInfo();
        return TeaModel.build(map, self);
    }

    public InsureOrderInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public InsureOrderInfo setInsureId(String insureId) {
        this.insureId = insureId;
        return this;
    }
    public String getInsureId() {
        return this.insureId;
    }

    public InsureOrderInfo setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public InsureOrderInfo setInsureStartTime(String insureStartTime) {
        this.insureStartTime = insureStartTime;
        return this;
    }
    public String getInsureStartTime() {
        return this.insureStartTime;
    }

    public InsureOrderInfo setInsureEndTime(String insureEndTime) {
        this.insureEndTime = insureEndTime;
        return this;
    }
    public String getInsureEndTime() {
        return this.insureEndTime;
    }

    public InsureOrderInfo setInsureAmount(Long insureAmount) {
        this.insureAmount = insureAmount;
        return this;
    }
    public Long getInsureAmount() {
        return this.insureAmount;
    }

    public InsureOrderInfo setInsurePremium(Long insurePremium) {
        this.insurePremium = insurePremium;
        return this;
    }
    public Long getInsurePremium() {
        return this.insurePremium;
    }

    public InsureOrderInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
