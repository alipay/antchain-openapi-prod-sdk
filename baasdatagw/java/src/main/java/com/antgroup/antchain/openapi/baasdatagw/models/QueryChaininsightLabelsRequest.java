// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class QueryChaininsightLabelsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 需要查询的地址列表
    @NameInMap("hex_addresses")
    @Validation(required = true)
    public java.util.List<String> hexAddresses;

    // 租户ID，留空
    @NameInMap("tenant_id")
    public String tenantId;

    public static QueryChaininsightLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChaininsightLabelsRequest self = new QueryChaininsightLabelsRequest();
        return TeaModel.build(map, self);
    }

    public QueryChaininsightLabelsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryChaininsightLabelsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryChaininsightLabelsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryChaininsightLabelsRequest setHexAddresses(java.util.List<String> hexAddresses) {
        this.hexAddresses = hexAddresses;
        return this;
    }
    public java.util.List<String> getHexAddresses() {
        return this.hexAddresses;
    }

    public QueryChaininsightLabelsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
