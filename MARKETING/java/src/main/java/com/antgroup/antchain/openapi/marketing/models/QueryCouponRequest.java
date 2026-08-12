// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class QueryCouponRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 优惠券模板ID
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 查询范围，有效：AVAILABLE / 全部: ALL；不传默认查询有效
    @NameInMap("scope")
    public String scope;

    public static QueryCouponRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCouponRequest self = new QueryCouponRequest();
        return TeaModel.build(map, self);
    }

    public QueryCouponRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCouponRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryCouponRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public QueryCouponRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
