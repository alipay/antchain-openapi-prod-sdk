// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateFedloadbalancerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 联邦负载均衡实例名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 联邦负载均衡实例所在命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 地址类型，例如公网、内网
    @NameInMap("addr_type")
    @Validation(required = true)
    public String addrType;

    // 指定负载均衡规格
    @NameInMap("spec")
    public String spec;

    // 联邦负载均衡实例对应的部署单元列表
    @NameInMap("cells")
    @Validation(required = true)
    public java.util.List<String> cells;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static UpdateFedloadbalancerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFedloadbalancerRequest self = new UpdateFedloadbalancerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFedloadbalancerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateFedloadbalancerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateFedloadbalancerRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateFedloadbalancerRequest setAddrType(String addrType) {
        this.addrType = addrType;
        return this;
    }
    public String getAddrType() {
        return this.addrType;
    }

    public UpdateFedloadbalancerRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public UpdateFedloadbalancerRequest setCells(java.util.List<String> cells) {
        this.cells = cells;
        return this;
    }
    public java.util.List<String> getCells() {
        return this.cells;
    }

    public UpdateFedloadbalancerRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
