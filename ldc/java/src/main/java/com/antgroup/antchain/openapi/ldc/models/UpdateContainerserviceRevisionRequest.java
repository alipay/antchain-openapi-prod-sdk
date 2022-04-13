// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateContainerserviceRevisionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 所属工作空间组名称。
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 容器应用服务名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 容器应用服务版本号。
    @NameInMap("revision")
    @Validation(required = true)
    public String revision;

    // 版本备注信息。
    @NameInMap("remark")
    @Validation(required = true)
    public String remark;

    public static UpdateContainerserviceRevisionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerserviceRevisionRequest self = new UpdateContainerserviceRevisionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContainerserviceRevisionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateContainerserviceRevisionRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public UpdateContainerserviceRevisionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateContainerserviceRevisionRequest setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public UpdateContainerserviceRevisionRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
