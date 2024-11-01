// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.asset.models;

import com.aliyun.tea.*;

public class QuerySupplierMonthwriteofffileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 云站租户 id
    @NameInMap("cloud_tenant_id")
    @Validation(required = true)
    public String cloudTenantId;

    // 请求唯一id	
    // 
    @NameInMap("request_unique_id")
    @Validation(required = true, maxLength = 36)
    public String requestUniqueId;

    // 202408
    @NameInMap("billing_month")
    public String billingMonth;

    public static QuerySupplierMonthwriteofffileRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySupplierMonthwriteofffileRequest self = new QuerySupplierMonthwriteofffileRequest();
        return TeaModel.build(map, self);
    }

    public QuerySupplierMonthwriteofffileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySupplierMonthwriteofffileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySupplierMonthwriteofffileRequest setCloudTenantId(String cloudTenantId) {
        this.cloudTenantId = cloudTenantId;
        return this;
    }
    public String getCloudTenantId() {
        return this.cloudTenantId;
    }

    public QuerySupplierMonthwriteofffileRequest setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
        return this;
    }
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

    public QuerySupplierMonthwriteofffileRequest setBillingMonth(String billingMonth) {
        this.billingMonth = billingMonth;
        return this;
    }
    public String getBillingMonth() {
        return this.billingMonth;
    }

}
