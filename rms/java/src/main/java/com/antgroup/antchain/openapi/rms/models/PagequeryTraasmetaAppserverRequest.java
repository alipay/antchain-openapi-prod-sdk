// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class PagequeryTraasmetaAppserverRequest extends TeaModel {
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

    // 
    // tenant_uuid
    @NameInMap("tenant_uuid")
    public String tenantUuid;

    // tenant_name
    // 
    @NameInMap("tenant_name")
    public String tenantName;

    // workspace_name
    @NameInMap("workspace_name")
    public String workspaceName;

    // host_ip
    @NameInMap("host_ip")
    public String hostIp;

    // app_name
    @NameInMap("app_name")
    public String appName;

    // ip
    @NameInMap("ip")
    public String ip;

    // hotsname
    @NameInMap("hotsname")
    public String hotsname;

    // 是否是模糊搜索，默认为false
    @NameInMap("search")
    @Validation(required = true)
    public Boolean search;

    public static PagequeryTraasmetaAppserverRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryTraasmetaAppserverRequest self = new PagequeryTraasmetaAppserverRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryTraasmetaAppserverRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryTraasmetaAppserverRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryTraasmetaAppserverRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public PagequeryTraasmetaAppserverRequest setTenantUuid(String tenantUuid) {
        this.tenantUuid = tenantUuid;
        return this;
    }
    public String getTenantUuid() {
        return this.tenantUuid;
    }

    public PagequeryTraasmetaAppserverRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public PagequeryTraasmetaAppserverRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public PagequeryTraasmetaAppserverRequest setHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }
    public String getHostIp() {
        return this.hostIp;
    }

    public PagequeryTraasmetaAppserverRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public PagequeryTraasmetaAppserverRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public PagequeryTraasmetaAppserverRequest setHotsname(String hotsname) {
        this.hotsname = hotsname;
        return this;
    }
    public String getHotsname() {
        return this.hotsname;
    }

    public PagequeryTraasmetaAppserverRequest setSearch(Boolean search) {
        this.search = search;
        return this;
    }
    public Boolean getSearch() {
        return this.search;
    }

}
