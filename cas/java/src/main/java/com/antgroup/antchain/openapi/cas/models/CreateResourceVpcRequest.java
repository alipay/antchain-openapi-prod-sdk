// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateResourceVpcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // VPC的网段。您可以使用以下网段或其子集作为VPC的网段：
    // 
    // 172.16.0.0/12（默认值）。
    // 10.0.0.0/8。
    // 192.168.0.0/16。
    @NameInMap("cidr_block")
    public String cidrBlock;

    // 描述信息
    @NameInMap("description")
    public String description;

    // VPC的名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // VPC所在的地域
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 用户侧网络的网段
    @NameInMap("user_cidr")
    public String userCidr;

    // 所属工作空间 identity
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static CreateResourceVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceVpcRequest self = new CreateResourceVpcRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceVpcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateResourceVpcRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public CreateResourceVpcRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateResourceVpcRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateResourceVpcRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateResourceVpcRequest setUserCidr(String userCidr) {
        this.userCidr = userCidr;
        return this;
    }
    public String getUserCidr() {
        return this.userCidr;
    }

    public CreateResourceVpcRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
