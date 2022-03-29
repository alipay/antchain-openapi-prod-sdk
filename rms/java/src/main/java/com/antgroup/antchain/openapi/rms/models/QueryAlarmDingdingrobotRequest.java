// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryAlarmDingdingrobotRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作区名
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 只看当前用户创建的钉钉机器人
    @NameInMap("only_current_staff")
    public Boolean onlyCurrentStaff;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 页面尺寸
    @NameInMap("page_size")
    public Long pageSize;

    // 机器人名称
    @NameInMap("name")
    public String name;

    // 根据token过滤
    @NameInMap("token")
    public String token;

    public static QueryAlarmDingdingrobotRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmDingdingrobotRequest self = new QueryAlarmDingdingrobotRequest();
        return TeaModel.build(map, self);
    }

    public QueryAlarmDingdingrobotRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAlarmDingdingrobotRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryAlarmDingdingrobotRequest setOnlyCurrentStaff(Boolean onlyCurrentStaff) {
        this.onlyCurrentStaff = onlyCurrentStaff;
        return this;
    }
    public Boolean getOnlyCurrentStaff() {
        return this.onlyCurrentStaff;
    }

    public QueryAlarmDingdingrobotRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryAlarmDingdingrobotRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAlarmDingdingrobotRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryAlarmDingdingrobotRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
