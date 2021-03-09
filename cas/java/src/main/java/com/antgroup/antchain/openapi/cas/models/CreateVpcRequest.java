// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateVpcRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 专有网络网段
    @NameInMap("cidr_lock")
    @Validation(required = true)
    public String cidrLock;

    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 工作空间
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static CreateVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcRequest self = new CreateVpcRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateVpcRequest setCidrLock(String cidrLock) {
        this.cidrLock = cidrLock;
        return this;
    }
    public String getCidrLock() {
        return this.cidrLock;
    }

    public CreateVpcRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVpcRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
