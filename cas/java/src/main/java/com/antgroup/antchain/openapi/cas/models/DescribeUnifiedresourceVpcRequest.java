// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DescribeUnifiedresourceVpcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 提供商类型
    @NameInMap("provider_type")
    @Validation(required = true)
    public String providerType;

    // region
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 工作空间
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static DescribeUnifiedresourceVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUnifiedresourceVpcRequest self = new DescribeUnifiedresourceVpcRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUnifiedresourceVpcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DescribeUnifiedresourceVpcRequest setProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }
    public String getProviderType() {
        return this.providerType;
    }

    public DescribeUnifiedresourceVpcRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeUnifiedresourceVpcRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
