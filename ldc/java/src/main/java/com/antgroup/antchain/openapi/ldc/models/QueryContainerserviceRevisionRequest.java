// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryContainerserviceRevisionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 取值范围： . WAITING_FOR_DEPLOY: 待发布 . INITIALIZING: 初始化中 . INITIALIZED: 初始化完成 . INITIALIZE_FAILED: 初始化失败 . CONFIRM_WAITING: 待确认 . CONFIRMED: 已确认 . EXECUTING: 发布中 . PAUSED: 暂停 . CANCELING: 取消中 . CANCELED: 已取消 . ROLLBACKING: 回滚中 . ROLLBACK_PAUSED: 回滚暂停 . ROLLBACKED: 已回滚 . SUCCEEDED: 发布完成 . FAILED: 发布失败 . DELETING: 删除中 . DELETE_FAILED: 删除失败
    @NameInMap("deployment_status")
    public java.util.List<String> deploymentStatus;

    // 状态取值范围： . DRAFTED: 草稿 . CREATING: 创建中 . CREATED: 已创建 . UPDATING: 更新中 . UPDATED: 已更新 . DELETING: 删除中 . DELETED: 已删除 . DEPLOYED: 已发布 . CREATE_FAILED: 创建失败 . UPDATE_FAILED: 更新失败 . DELETE_FAILED: 删除失败
    @NameInMap("metadata_status")
    public java.util.List<String> metadataStatus;

    // 容器应用服务名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 命名空间名称。
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 容器服务版本列表的页码。起始值：1。默认值：1 。
    @NameInMap("page_number")
    public Long pageNumber;

    // 分页查询时设置的每页行数。最大值：100。默认值：10。
    @NameInMap("page_size")
    public Long pageSize;

    // 所属工作空间组名称。
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 可以根据版本号模糊搜索，lks1.25.0开始支持
    @NameInMap("revision")
    public String revision;

    public static QueryContainerserviceRevisionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContainerserviceRevisionRequest self = new QueryContainerserviceRevisionRequest();
        return TeaModel.build(map, self);
    }

    public QueryContainerserviceRevisionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContainerserviceRevisionRequest setDeploymentStatus(java.util.List<String> deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
        return this;
    }
    public java.util.List<String> getDeploymentStatus() {
        return this.deploymentStatus;
    }

    public QueryContainerserviceRevisionRequest setMetadataStatus(java.util.List<String> metadataStatus) {
        this.metadataStatus = metadataStatus;
        return this;
    }
    public java.util.List<String> getMetadataStatus() {
        return this.metadataStatus;
    }

    public QueryContainerserviceRevisionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryContainerserviceRevisionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryContainerserviceRevisionRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryContainerserviceRevisionRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryContainerserviceRevisionRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public QueryContainerserviceRevisionRequest setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

}
