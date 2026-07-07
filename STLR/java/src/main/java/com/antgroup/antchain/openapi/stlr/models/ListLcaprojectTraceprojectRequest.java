// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class ListLcaprojectTraceprojectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 产品规格
    @NameInMap("specification")
    @Validation(required = true)
    public String specification;

    // 列表数量
    @NameInMap("limit")
    public Long limit;

    public static ListLcaprojectTraceprojectRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLcaprojectTraceprojectRequest self = new ListLcaprojectTraceprojectRequest();
        return TeaModel.build(map, self);
    }

    public ListLcaprojectTraceprojectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListLcaprojectTraceprojectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListLcaprojectTraceprojectRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListLcaprojectTraceprojectRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public ListLcaprojectTraceprojectRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

}
