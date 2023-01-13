// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class OperateChainsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // -
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 不留空表示给租户开通权限
    @NameInMap("tenant_id")
    public String tenantId;

    // 操作类型，默认留空表示开通
    @NameInMap("type")
    public String type;

    public static OperateChainsRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateChainsRequest self = new OperateChainsRequest();
        return TeaModel.build(map, self);
    }

    public OperateChainsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateChainsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateChainsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public OperateChainsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OperateChainsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
