// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryOpsCheckRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 	
    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    // 应用名
    @NameInMap("app")
    public String app;

    // 应用监控指标状态 0：异常 1：正常 不传：全部
    @NameInMap("app_status")
    public Long appStatus;

    // 自定义监控指标状态 0：异常 1：正常 不传：全部
    @NameInMap("custom_status")
    public Long customStatus;

    public static QueryOpsCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOpsCheckRequest self = new QueryOpsCheckRequest();
        return TeaModel.build(map, self);
    }

    public QueryOpsCheckRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryOpsCheckRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryOpsCheckRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryOpsCheckRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryOpsCheckRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public QueryOpsCheckRequest setAppStatus(Long appStatus) {
        this.appStatus = appStatus;
        return this;
    }
    public Long getAppStatus() {
        return this.appStatus;
    }

    public QueryOpsCheckRequest setCustomStatus(Long customStatus) {
        this.customStatus = customStatus;
        return this;
    }
    public Long getCustomStatus() {
        return this.customStatus;
    }

}
