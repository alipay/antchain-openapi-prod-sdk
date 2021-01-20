// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryCellgroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // cell group 查询前缀
    @NameInMap("name_prefix")
    public String namePrefix;

    // 所属环境名称
    @NameInMap("workspace_group")
    public String workspaceGroup;

    // 逻辑单元名称
    @NameInMap("name")
    public String name;

    public static QueryCellgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCellgroupRequest self = new QueryCellgroupRequest();
        return TeaModel.build(map, self);
    }

    public QueryCellgroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCellgroupRequest setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }
    public String getNamePrefix() {
        return this.namePrefix;
    }

    public QueryCellgroupRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public QueryCellgroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
