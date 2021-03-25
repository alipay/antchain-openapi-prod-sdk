// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateVpcRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // VPC所在的地域
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 创建的VPC的ID
    @NameInMap("vpc_id")
    @Validation(required = true)
    public String vpcId;

    // 	
    // 所属环境id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // vpc名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

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

    public CreateVpcRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateVpcRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVpcRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateVpcRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateVpcRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateVpcRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
