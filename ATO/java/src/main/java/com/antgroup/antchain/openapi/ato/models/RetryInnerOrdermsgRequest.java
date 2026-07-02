// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class RetryInnerOrdermsgRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // SANDBOX 沙箱 PROD 生产
    @NameInMap("env")
    @Validation(required = true)
    public String env;

    // 订单id
    // 
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 消息ID
    // 
    @NameInMap("msg_id")
    @Validation(required = true)
    public String msgId;

    // 使用租户新回调地址
    @NameInMap("using_new_callback_url")
    @Validation(required = true)
    public Boolean usingNewCallbackUrl;

    public static RetryInnerOrdermsgRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryInnerOrdermsgRequest self = new RetryInnerOrdermsgRequest();
        return TeaModel.build(map, self);
    }

    public RetryInnerOrdermsgRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RetryInnerOrdermsgRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RetryInnerOrdermsgRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public RetryInnerOrdermsgRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public RetryInnerOrdermsgRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RetryInnerOrdermsgRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public RetryInnerOrdermsgRequest setUsingNewCallbackUrl(Boolean usingNewCallbackUrl) {
        this.usingNewCallbackUrl = usingNewCallbackUrl;
        return this;
    }
    public Boolean getUsingNewCallbackUrl() {
        return this.usingNewCallbackUrl;
    }

}
