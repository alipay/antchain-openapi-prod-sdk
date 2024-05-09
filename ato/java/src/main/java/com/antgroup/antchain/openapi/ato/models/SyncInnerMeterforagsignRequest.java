// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SyncInnerMeterforagsignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户租户id
    @NameInMap("merchant_tenant_id")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String merchantTenantId;

    // 商户社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true, maxLength = 199, minLength = 1)
    public String merchantId;

    // 计量上报Code
    @NameInMap("meter_product_code")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String meterProductCode;

    // 系统名字
    @NameInMap("sys_name")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String sysName;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 49, minLength = 1)
    public String orderId;

    // 合同编号
    @NameInMap("sign_no")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String signNo;

    public static SyncInnerMeterforagsignRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncInnerMeterforagsignRequest self = new SyncInnerMeterforagsignRequest();
        return TeaModel.build(map, self);
    }

    public SyncInnerMeterforagsignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncInnerMeterforagsignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncInnerMeterforagsignRequest setMerchantTenantId(String merchantTenantId) {
        this.merchantTenantId = merchantTenantId;
        return this;
    }
    public String getMerchantTenantId() {
        return this.merchantTenantId;
    }

    public SyncInnerMeterforagsignRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SyncInnerMeterforagsignRequest setMeterProductCode(String meterProductCode) {
        this.meterProductCode = meterProductCode;
        return this;
    }
    public String getMeterProductCode() {
        return this.meterProductCode;
    }

    public SyncInnerMeterforagsignRequest setSysName(String sysName) {
        this.sysName = sysName;
        return this;
    }
    public String getSysName() {
        return this.sysName;
    }

    public SyncInnerMeterforagsignRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncInnerMeterforagsignRequest setSignNo(String signNo) {
        this.signNo = signNo;
        return this;
    }
    public String getSignNo() {
        return this.signNo;
    }

}
