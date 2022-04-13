// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DeleteContainerserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 最近一次草稿版本。
    @NameInMap("drafted_revision")
    public String draftedRevision;

    // 最近一次草稿时间
    @NameInMap("drafted_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String draftedTime;

    // 容器应用服务名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 当前命名空间名称。
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 提交人。
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 所属工作空间组名称
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static DeleteContainerserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContainerserviceRequest self = new DeleteContainerserviceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContainerserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteContainerserviceRequest setDraftedRevision(String draftedRevision) {
        this.draftedRevision = draftedRevision;
        return this;
    }
    public String getDraftedRevision() {
        return this.draftedRevision;
    }

    public DeleteContainerserviceRequest setDraftedTime(String draftedTime) {
        this.draftedTime = draftedTime;
        return this;
    }
    public String getDraftedTime() {
        return this.draftedTime;
    }

    public DeleteContainerserviceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteContainerserviceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteContainerserviceRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public DeleteContainerserviceRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
