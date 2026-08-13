// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryIotagentUseridsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户租户名
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static QueryIotagentUseridsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIotagentUseridsRequest self = new QueryIotagentUseridsRequest();
        return TeaModel.build(map, self);
    }

    public QueryIotagentUseridsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIotagentUseridsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIotagentUseridsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryIotagentUseridsRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public QueryIotagentUseridsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
