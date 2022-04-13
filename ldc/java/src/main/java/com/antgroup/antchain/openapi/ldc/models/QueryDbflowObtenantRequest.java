// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryDbflowObtenantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 租户类型GZONE|RZONE，分别用于存放单库或分片库
    @NameInMap("type")
    public String type;

    // 租户名称前缀
    @NameInMap("name")
    public String name;

    // 当前页码，默认为1
    @NameInMap("page_number")
    public Long pageNumber;

    // 单页个数，默认为10
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryDbflowObtenantRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDbflowObtenantRequest self = new QueryDbflowObtenantRequest();
        return TeaModel.build(map, self);
    }

    public QueryDbflowObtenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDbflowObtenantRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public QueryDbflowObtenantRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryDbflowObtenantRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryDbflowObtenantRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryDbflowObtenantRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
