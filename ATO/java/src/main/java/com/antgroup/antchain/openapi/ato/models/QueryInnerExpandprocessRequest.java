// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerExpandprocessRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 进件类型 
    // DIRECT("DIRECT", "直连进件模式"), 
    // AGENT("AGENT", "代理商进件模式"),
    // 
    @NameInMap("expand_mode")
    @Validation(required = true)
    public String expandMode;

    public static QueryInnerExpandprocessRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerExpandprocessRequest self = new QueryInnerExpandprocessRequest();
        return TeaModel.build(map, self);
    }

    public QueryInnerExpandprocessRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInnerExpandprocessRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInnerExpandprocessRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryInnerExpandprocessRequest setExpandMode(String expandMode) {
        this.expandMode = expandMode;
        return this;
    }
    public String getExpandMode() {
        return this.expandMode;
    }

}
