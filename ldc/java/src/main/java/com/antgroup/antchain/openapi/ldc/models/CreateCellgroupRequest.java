// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateCellgroupRequest extends TeaModel {
    // OAuth模式下的授权token
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
    @Validation(required = true)
    public String name;

    // 逻辑单元类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 所属环境名称。
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 操作人。
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

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

    public CreateCellgroupRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
