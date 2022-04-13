// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class RebootSidecaropsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用服务名
    @NameInMap("container_service_name")
    @Validation(required = true)
    public String containerServiceName;

    // 防重放
    @NameInMap("client_token")
    public String clientToken;

    // 命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 部署单元名称
    @NameInMap("cell_name")
    @Validation(required = true)
    public String cellName;

    // 需要重启的pod列表，元素值为pod的名称
    @NameInMap("server_identities")
    @Validation(required = true)
    public java.util.List<String> serverIdentities;

    // 执行单号
    @NameInMap("order_num")
    @Validation(required = true)
    public String orderNum;

    public static RebootSidecaropsRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootSidecaropsRequest self = new RebootSidecaropsRequest();
        return TeaModel.build(map, self);
    }

    public RebootSidecaropsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RebootSidecaropsRequest setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public RebootSidecaropsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RebootSidecaropsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public RebootSidecaropsRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public RebootSidecaropsRequest setCellName(String cellName) {
        this.cellName = cellName;
        return this;
    }
    public String getCellName() {
        return this.cellName;
    }

    public RebootSidecaropsRequest setServerIdentities(java.util.List<String> serverIdentities) {
        this.serverIdentities = serverIdentities;
        return this;
    }
    public java.util.List<String> getServerIdentities() {
        return this.serverIdentities;
    }

    public RebootSidecaropsRequest setOrderNum(String orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public String getOrderNum() {
        return this.orderNum;
    }

}
