// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class NotifyCyclinginsuranceMidchangeserviceorderauditRequest extends TeaModel {
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

    // 审核是否通过
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    public static NotifyCyclinginsuranceMidchangeserviceorderauditRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyCyclinginsuranceMidchangeserviceorderauditRequest self = new NotifyCyclinginsuranceMidchangeserviceorderauditRequest();
        return TeaModel.build(map, self);
    }

    public NotifyCyclinginsuranceMidchangeserviceorderauditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyCyclinginsuranceMidchangeserviceorderauditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyCyclinginsuranceMidchangeserviceorderauditRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NotifyCyclinginsuranceMidchangeserviceorderauditRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public NotifyCyclinginsuranceMidchangeserviceorderauditRequest setCallerAppName(String callerAppName) {
        this.callerAppName = callerAppName;
        return this;
    }
    public String getCallerAppName() {
        return this.callerAppName;
    }

    public NotifyCyclinginsuranceMidchangeserviceorderauditRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public NotifyCyclinginsuranceMidchangeserviceorderauditRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public NotifyCyclinginsuranceMidchangeserviceorderauditRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public NotifyCyclinginsuranceMidchangeserviceorderauditRequest setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
