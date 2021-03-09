// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListComputerRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // appserviceIds
    @NameInMap("app_service_ids")
    public java.util.List<String> appServiceIds;

    // current page
    @NameInMap("current_page")
    public Long currentPage;

    // name
    @NameInMap("name")
    public String name;

    // current page
    @NameInMap("page_size")
    public Long pageSize;

    // workspace name
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static ListComputerRequest build(java.util.Map<String, ?> map) throws Exception {
        ListComputerRequest self = new ListComputerRequest();
        return TeaModel.build(map, self);
    }

    public ListComputerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListComputerRequest setAppServiceIds(java.util.List<String> appServiceIds) {
        this.appServiceIds = appServiceIds;
        return this;
    }
    public java.util.List<String> getAppServiceIds() {
        return this.appServiceIds;
    }

    public ListComputerRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListComputerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListComputerRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListComputerRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
