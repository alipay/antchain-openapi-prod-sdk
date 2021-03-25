// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SetNotarizationOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 公证事项ID
    @NameInMap("biz_code")
    public String bizCode;

    // 需设置的属性名称
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 公证订单ID
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 被设置字段的值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static SetNotarizationOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        SetNotarizationOrderRequest self = new SetNotarizationOrderRequest();
        return TeaModel.build(map, self);
    }

    public SetNotarizationOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetNotarizationOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetNotarizationOrderRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public SetNotarizationOrderRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public SetNotarizationOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SetNotarizationOrderRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
