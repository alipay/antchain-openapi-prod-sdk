// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class ListNewAppsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支持模糊查询
    @NameInMap("app_name")
    public String appName;

    // 1
    @NameInMap("current_page")
    @Validation(required = true)
    public Long currentPage;

    // 000001
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 10
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static ListNewAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNewAppsRequest self = new ListNewAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListNewAppsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListNewAppsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListNewAppsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListNewAppsRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListNewAppsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListNewAppsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
