// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateCellgroupDisasterinfoRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 灾备信息
    @NameInMap("disaster_info")
    public java.util.List<DisasterInfo> disasterInfo;

    // 逻辑单元名称
    @NameInMap("name")
    public String name;

    // 操作人
    @NameInMap("operator")
    public String operator;

    // 所属环境组名称
    @NameInMap("workspace_group")
    public String workspaceGroup;

    public static UpdateCellgroupDisasterinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCellgroupDisasterinfoRequest self = new UpdateCellgroupDisasterinfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCellgroupDisasterinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateCellgroupDisasterinfoRequest setDisasterInfo(java.util.List<DisasterInfo> disasterInfo) {
        this.disasterInfo = disasterInfo;
        return this;
    }
    public java.util.List<DisasterInfo> getDisasterInfo() {
        return this.disasterInfo;
    }

    public UpdateCellgroupDisasterinfoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCellgroupDisasterinfoRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateCellgroupDisasterinfoRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
