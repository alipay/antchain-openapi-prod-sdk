// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CancelCyclinginsuranceServiceorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求唯一Id
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 来源场景
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 调用应用名
    @NameInMap("caller_app_name")
    @Validation(required = true)
    public String callerAppName;

    // 外部业务id，用于幂等
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 账号id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    public static CancelCyclinginsuranceServiceorderRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelCyclinginsuranceServiceorderRequest self = new CancelCyclinginsuranceServiceorderRequest();
        return TeaModel.build(map, self);
    }

    public CancelCyclinginsuranceServiceorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelCyclinginsuranceServiceorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelCyclinginsuranceServiceorderRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelCyclinginsuranceServiceorderRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CancelCyclinginsuranceServiceorderRequest setCallerAppName(String callerAppName) {
        this.callerAppName = callerAppName;
        return this;
    }
    public String getCallerAppName() {
        return this.callerAppName;
    }

    public CancelCyclinginsuranceServiceorderRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CancelCyclinginsuranceServiceorderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CancelCyclinginsuranceServiceorderRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
