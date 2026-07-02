// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SyncInnerMeterforwholeorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户租户id
    @NameInMap("merchant_tenant_id")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String merchantTenantId;

    // 商户统一社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true, maxLength = 199, minLength = 1)
    public String merchantId;

    // 商户购买的产品code
    @NameInMap("meter_product_code")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String meterProductCode;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 49, minLength = 1)
    public String orderId;

    // 订单总租期
    @NameInMap("order_rent_term")
    @Validation(required = true)
    public Long orderRentTerm;

    // 订单总租金，单位为分
    @NameInMap("order_total_money")
    @Validation(required = true)
    public Long orderTotalMoney;

    // 系统名称
    @NameInMap("sys_name")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String sysName;

    // 订单产品的二级类目
    @NameInMap("order_product_subclass")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String orderProductSubclass;

    public static SyncInnerMeterforwholeorderRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncInnerMeterforwholeorderRequest self = new SyncInnerMeterforwholeorderRequest();
        return TeaModel.build(map, self);
    }

    public SyncInnerMeterforwholeorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncInnerMeterforwholeorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncInnerMeterforwholeorderRequest setMerchantTenantId(String merchantTenantId) {
        this.merchantTenantId = merchantTenantId;
        return this;
    }
    public String getMerchantTenantId() {
        return this.merchantTenantId;
    }

    public SyncInnerMeterforwholeorderRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SyncInnerMeterforwholeorderRequest setMeterProductCode(String meterProductCode) {
        this.meterProductCode = meterProductCode;
        return this;
    }
    public String getMeterProductCode() {
        return this.meterProductCode;
    }

    public SyncInnerMeterforwholeorderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncInnerMeterforwholeorderRequest setOrderRentTerm(Long orderRentTerm) {
        this.orderRentTerm = orderRentTerm;
        return this;
    }
    public Long getOrderRentTerm() {
        return this.orderRentTerm;
    }

    public SyncInnerMeterforwholeorderRequest setOrderTotalMoney(Long orderTotalMoney) {
        this.orderTotalMoney = orderTotalMoney;
        return this;
    }
    public Long getOrderTotalMoney() {
        return this.orderTotalMoney;
    }

    public SyncInnerMeterforwholeorderRequest setSysName(String sysName) {
        this.sysName = sysName;
        return this;
    }
    public String getSysName() {
        return this.sysName;
    }

    public SyncInnerMeterforwholeorderRequest setOrderProductSubclass(String orderProductSubclass) {
        this.orderProductSubclass = orderProductSubclass;
        return this;
    }
    public String getOrderProductSubclass() {
        return this.orderProductSubclass;
    }

}
