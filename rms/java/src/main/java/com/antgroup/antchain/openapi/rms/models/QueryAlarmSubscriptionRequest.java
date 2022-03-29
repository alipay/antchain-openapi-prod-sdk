// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryAlarmSubscriptionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 是否只查询我的订阅
    @NameInMap("only_mine")
    public Boolean onlyMine;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryAlarmSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmSubscriptionRequest self = new QueryAlarmSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public QueryAlarmSubscriptionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAlarmSubscriptionRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryAlarmSubscriptionRequest setOnlyMine(Boolean onlyMine) {
        this.onlyMine = onlyMine;
        return this;
    }
    public Boolean getOnlyMine() {
        return this.onlyMine;
    }

    public QueryAlarmSubscriptionRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryAlarmSubscriptionRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
