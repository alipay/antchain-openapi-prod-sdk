// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SyncAcctTradeorderbreachRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 签约单号，长度大于6小于50
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 平台商统一社会信用代码，长度大于0小于等于32
    @NameInMap("platform_id")
    @Validation(required = true)
    public String platformId;

    // 交易订单号，长度大于6小于50
    @NameInMap("acct_trade_order_id")
    @Validation(required = true)
    public String acctTradeOrderId;

    // 违约时间，格式 yyyy-MM-dd HH:mm:ss
    @NameInMap("breached_time")
    @Validation(required = true)
    public String breachedTime;

    // 违约金额，单位分
    @NameInMap("breached_amount")
    @Validation(required = true)
    public Long breachedAmount;

    // 违约描述，长度大于0小于等于64
    @NameInMap("breached_desc")
    @Validation(required = true)
    public String breachedDesc;

    public static SyncAcctTradeorderbreachRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAcctTradeorderbreachRequest self = new SyncAcctTradeorderbreachRequest();
        return TeaModel.build(map, self);
    }

    public SyncAcctTradeorderbreachRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncAcctTradeorderbreachRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncAcctTradeorderbreachRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncAcctTradeorderbreachRequest setPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }
    public String getPlatformId() {
        return this.platformId;
    }

    public SyncAcctTradeorderbreachRequest setAcctTradeOrderId(String acctTradeOrderId) {
        this.acctTradeOrderId = acctTradeOrderId;
        return this;
    }
    public String getAcctTradeOrderId() {
        return this.acctTradeOrderId;
    }

    public SyncAcctTradeorderbreachRequest setBreachedTime(String breachedTime) {
        this.breachedTime = breachedTime;
        return this;
    }
    public String getBreachedTime() {
        return this.breachedTime;
    }

    public SyncAcctTradeorderbreachRequest setBreachedAmount(Long breachedAmount) {
        this.breachedAmount = breachedAmount;
        return this;
    }
    public Long getBreachedAmount() {
        return this.breachedAmount;
    }

    public SyncAcctTradeorderbreachRequest setBreachedDesc(String breachedDesc) {
        this.breachedDesc = breachedDesc;
        return this;
    }
    public String getBreachedDesc() {
        return this.breachedDesc;
    }

}
