// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SyncTradeUserpromisedelayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // order_id
    @NameInMap("order_id")
    @Validation(required = true, minLength = 1)
    public String orderId;

    // merchant_id
    @NameInMap("merchant_id")
    @Validation(required = true, minLength = 1)
    public String merchantId;

    // 1
    @NameInMap("delay_start_period")
    @Validation(required = true, minimum = 1)
    public Long delayStartPeriod;

    // 延期时间单位
    @NameInMap("delay_time_unit")
    @Validation(required = true, minLength = 1)
    public String delayTimeUnit;

    // 延期时间数值
    @NameInMap("delay_time_value")
    @Validation(required = true, minimum = 1)
    public Long delayTimeValue;

    // 原因描述
    @NameInMap("reason")
    @Validation(required = true, minLength = 1)
    public String reason;

    public static SyncTradeUserpromisedelayRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncTradeUserpromisedelayRequest self = new SyncTradeUserpromisedelayRequest();
        return TeaModel.build(map, self);
    }

    public SyncTradeUserpromisedelayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncTradeUserpromisedelayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncTradeUserpromisedelayRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncTradeUserpromisedelayRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SyncTradeUserpromisedelayRequest setDelayStartPeriod(Long delayStartPeriod) {
        this.delayStartPeriod = delayStartPeriod;
        return this;
    }
    public Long getDelayStartPeriod() {
        return this.delayStartPeriod;
    }

    public SyncTradeUserpromisedelayRequest setDelayTimeUnit(String delayTimeUnit) {
        this.delayTimeUnit = delayTimeUnit;
        return this;
    }
    public String getDelayTimeUnit() {
        return this.delayTimeUnit;
    }

    public SyncTradeUserpromisedelayRequest setDelayTimeValue(Long delayTimeValue) {
        this.delayTimeValue = delayTimeValue;
        return this;
    }
    public Long getDelayTimeValue() {
        return this.delayTimeValue;
    }

    public SyncTradeUserpromisedelayRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
