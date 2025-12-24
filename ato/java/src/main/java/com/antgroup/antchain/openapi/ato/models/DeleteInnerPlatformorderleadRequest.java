// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class DeleteInnerPlatformorderleadRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 服务商租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 平台订单号
    @NameInMap("delivery_id")
    @Validation(required = true)
    public String deliveryId;

    public static DeleteInnerPlatformorderleadRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInnerPlatformorderleadRequest self = new DeleteInnerPlatformorderleadRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInnerPlatformorderleadRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteInnerPlatformorderleadRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteInnerPlatformorderleadRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteInnerPlatformorderleadRequest setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }
    public String getDeliveryId() {
        return this.deliveryId;
    }

}
