// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateFedloadbalancerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 联邦负载均衡实例名称，RFC1035 主机名规范 [a-z]([-a-z0-9]*[a-z0-9])?
    @NameInMap("name")
    @Validation(required = true, maxLength = 63, minLength = 1)
    public String name;

    // 命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 地址类型，例如公网、内网
    @NameInMap("addr_type")
    @Validation(required = true)
    public String addrType;

    // 指定负载均衡规格大小
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

    public static CreateFedloadbalancerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFedloadbalancerRequest self = new CreateFedloadbalancerRequest();
        return TeaModel.build(map, self);
    }

    public CreateFedloadbalancerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateFedloadbalancerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFedloadbalancerRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateFedloadbalancerRequest setAddrType(String addrType) {
        this.addrType = addrType;
        return this;
    }
    public String getAddrType() {
        return this.addrType;
    }

    public CreateFedloadbalancerRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public CreateFedloadbalancerRequest setCells(java.util.List<String> cells) {
        this.cells = cells;
        return this;
    }
    public java.util.List<String> getCells() {
        return this.cells;
    }

    public CreateFedloadbalancerRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
