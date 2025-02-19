// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class SyncAntchainAtoTradeUserpromisedelayRequest extends TeaModel {
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

    public static SyncAntchainAtoTradeUserpromisedelayRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAntchainAtoTradeUserpromisedelayRequest self = new SyncAntchainAtoTradeUserpromisedelayRequest();
        return TeaModel.build(map, self);
    }

    public SyncAntchainAtoTradeUserpromisedelayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncAntchainAtoTradeUserpromisedelayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncAntchainAtoTradeUserpromisedelayRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncAntchainAtoTradeUserpromisedelayRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SyncAntchainAtoTradeUserpromisedelayRequest setDelayStartPeriod(Long delayStartPeriod) {
        this.delayStartPeriod = delayStartPeriod;
        return this;
    }
    public Long getDelayStartPeriod() {
        return this.delayStartPeriod;
    }

    public SyncAntchainAtoTradeUserpromisedelayRequest setDelayTimeUnit(String delayTimeUnit) {
        this.delayTimeUnit = delayTimeUnit;
        return this;
    }
    public String getDelayTimeUnit() {
        return this.delayTimeUnit;
    }

    public SyncAntchainAtoTradeUserpromisedelayRequest setDelayTimeValue(Long delayTimeValue) {
        this.delayTimeValue = delayTimeValue;
        return this;
    }
    public Long getDelayTimeValue() {
        return this.delayTimeValue;
    }

    public SyncAntchainAtoTradeUserpromisedelayRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
