// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateCellgroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 所属idc
    @NameInMap("datacenter")
    public String datacenter;

    // 默认全局域
    @NameInMap("default_gzone")
    public String defaultGzone;

    // 逻辑单元名称
    @NameInMap("name")
    public String name;

    // 操作人
    @NameInMap("operator")
    public String operator;

    // 逻辑单元类型
    @NameInMap("type")
    public String type;

    // 所属环境组名称
    @NameInMap("workspace_group")
    public String workspaceGroup;

    public static CreateCellgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCellgroupRequest self = new CreateCellgroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateCellgroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCellgroupRequest setDatacenter(String datacenter) {
        this.datacenter = datacenter;
        return this;
    }
    public String getDatacenter() {
        return this.datacenter;
    }

    public CreateCellgroupRequest setDefaultGzone(String defaultGzone) {
        this.defaultGzone = defaultGzone;
        return this;
    }
    public String getDefaultGzone() {
        return this.defaultGzone;
    }

    public CreateCellgroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCellgroupRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CreateCellgroupRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateCellgroupRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
