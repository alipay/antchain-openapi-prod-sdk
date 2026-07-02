// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PagequeryTenantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 页数，默认1
    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    // 页码大小，默认10，最大100
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 租户
    @NameInMap("tenant_name")
    public String tenantName;

    // 是否为测试数据
    @NameInMap("mock")
    public Boolean mock;

    public static PagequeryTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryTenantRequest self = new PagequeryTenantRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryTenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryTenantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryTenantRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public PagequeryTenantRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryTenantRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public PagequeryTenantRequest setMock(Boolean mock) {
        this.mock = mock;
        return this;
    }
    public Boolean getMock() {
        return this.mock;
    }

}
