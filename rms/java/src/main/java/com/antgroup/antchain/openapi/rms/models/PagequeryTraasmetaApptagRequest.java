// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class PagequeryTraasmetaApptagRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 每页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 当前页
    @NameInMap("current_page")
    @Validation(required = true)
    public Long currentPage;

    // tenant_uuid
    @NameInMap("tenant_uuid")
    public String tenantUuid;

    // tenant_name
    @NameInMap("tenant_name")
    public String tenantName;

    // app_name
    @NameInMap("app_name")
    public String appName;

    // 是否是模糊搜索，默认为false
    @NameInMap("search")
    @Validation(required = true)
    public Boolean search;

    public static PagequeryTraasmetaApptagRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryTraasmetaApptagRequest self = new PagequeryTraasmetaApptagRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryTraasmetaApptagRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryTraasmetaApptagRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryTraasmetaApptagRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public PagequeryTraasmetaApptagRequest setTenantUuid(String tenantUuid) {
        this.tenantUuid = tenantUuid;
        return this;
    }
    public String getTenantUuid() {
        return this.tenantUuid;
    }

    public PagequeryTraasmetaApptagRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public PagequeryTraasmetaApptagRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public PagequeryTraasmetaApptagRequest setSearch(Boolean search) {
        this.search = search;
        return this;
    }
    public Boolean getSearch() {
        return this.search;
    }

}
