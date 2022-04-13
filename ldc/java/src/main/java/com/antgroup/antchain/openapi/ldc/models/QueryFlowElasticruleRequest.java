// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryFlowElasticruleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 环境
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 规则名称
    @NameInMap("name")
    public String name;

    // 所属类型
    @NameInMap("type")
    public String type;

    // 所属应用名称
    @NameInMap("app_name")
    public String appName;

    // 场景名称
    @NameInMap("scene_name")
    public String sceneName;

    // 分页大小，默认 10
    @NameInMap("page_size")
    public Long pageSize;

    // 当前页，默认 1
    @NameInMap("page_no")
    public Long pageNo;

    public static QueryFlowElasticruleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowElasticruleRequest self = new QueryFlowElasticruleRequest();
        return TeaModel.build(map, self);
    }

    public QueryFlowElasticruleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFlowElasticruleRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public QueryFlowElasticruleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryFlowElasticruleRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryFlowElasticruleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryFlowElasticruleRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public QueryFlowElasticruleRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryFlowElasticruleRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

}
