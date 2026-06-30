// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class OperateNotaryOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单ID
    @NameInMap("notary_order_id")
    @Validation(required = true)
    public String notaryOrderId;

    // 更新状态类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static OperateNotaryOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateNotaryOrderRequest self = new OperateNotaryOrderRequest();
        return TeaModel.build(map, self);
    }

    public OperateNotaryOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateNotaryOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateNotaryOrderRequest setNotaryOrderId(String notaryOrderId) {
        this.notaryOrderId = notaryOrderId;
        return this;
    }
    public String getNotaryOrderId() {
        return this.notaryOrderId;
    }

    public OperateNotaryOrderRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
