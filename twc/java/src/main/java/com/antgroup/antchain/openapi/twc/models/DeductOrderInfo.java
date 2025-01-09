// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class DeductOrderInfo extends TeaModel {
    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 商户统一社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 用户支付宝uid
    @NameInMap("alipay_user_id")
    @Validation(required = true)
    public String alipayUserId;

    // 商品名称
    @NameInMap("product_name")
    public String productName;

    // 订单创建时间
    @NameInMap("order_create_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String orderCreateDate;

    // 订单状态
    @NameInMap("order_status_code")
    public String orderStatusCode;

    // 订单子状态,ORDER_FULFILLMENT: 履约中;ORDER_FULFILLMENT_COMPLETED:履约完成;
    @NameInMap("order_sub_status_code")
    @Validation(required = true)
    public String orderSubStatusCode;

    // 总金额，单位为分
    @NameInMap("total_rent_money")
    @Validation(required = true)
    public Long totalRentMoney;

    public static DeductOrderInfo build(java.util.Map<String, ?> map) throws Exception {
        DeductOrderInfo self = new DeductOrderInfo();
        return TeaModel.build(map, self);
    }

    public DeductOrderInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DeductOrderInfo setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public DeductOrderInfo setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeductOrderInfo setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
        return this;
    }
    public String getAlipayUserId() {
        return this.alipayUserId;
    }

    public DeductOrderInfo setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public DeductOrderInfo setOrderCreateDate(String orderCreateDate) {
        this.orderCreateDate = orderCreateDate;
        return this;
    }
    public String getOrderCreateDate() {
        return this.orderCreateDate;
    }

    public DeductOrderInfo setOrderStatusCode(String orderStatusCode) {
        this.orderStatusCode = orderStatusCode;
        return this;
    }
    public String getOrderStatusCode() {
        return this.orderStatusCode;
    }

    public DeductOrderInfo setOrderSubStatusCode(String orderSubStatusCode) {
        this.orderSubStatusCode = orderSubStatusCode;
        return this;
    }
    public String getOrderSubStatusCode() {
        return this.orderSubStatusCode;
    }

    public DeductOrderInfo setTotalRentMoney(Long totalRentMoney) {
        this.totalRentMoney = totalRentMoney;
        return this;
    }
    public Long getTotalRentMoney() {
        return this.totalRentMoney;
    }

}
