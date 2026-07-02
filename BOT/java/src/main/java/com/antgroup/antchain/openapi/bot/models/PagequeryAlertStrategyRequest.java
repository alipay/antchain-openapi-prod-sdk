// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PagequeryAlertStrategyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 页数，默认1
    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    // 页码大小，默认10
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 租户
    @NameInMap("tenant_name")
    public String tenantName;

    // 场景码
    // 
    @NameInMap("scene")
    public String scene;

    public static PagequeryAlertStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryAlertStrategyRequest self = new PagequeryAlertStrategyRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryAlertStrategyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryAlertStrategyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryAlertStrategyRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public PagequeryAlertStrategyRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryAlertStrategyRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public PagequeryAlertStrategyRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
