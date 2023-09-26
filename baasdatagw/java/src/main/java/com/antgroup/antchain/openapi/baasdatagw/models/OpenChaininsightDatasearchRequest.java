// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class OpenChaininsightDatasearchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联盟ID
    @NameInMap("union_id")
    @Validation(required = true)
    public String unionId;

    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 租户ID，留空
    @NameInMap("tenant_id")
    public String tenantId;

    public static OpenChaininsightDatasearchRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenChaininsightDatasearchRequest self = new OpenChaininsightDatasearchRequest();
        return TeaModel.build(map, self);
    }

    public OpenChaininsightDatasearchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OpenChaininsightDatasearchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OpenChaininsightDatasearchRequest setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

    public OpenChaininsightDatasearchRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public OpenChaininsightDatasearchRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
