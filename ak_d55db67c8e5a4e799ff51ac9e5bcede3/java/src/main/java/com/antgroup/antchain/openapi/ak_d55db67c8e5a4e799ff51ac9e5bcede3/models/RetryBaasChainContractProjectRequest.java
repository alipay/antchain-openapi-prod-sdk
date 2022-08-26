// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d55db67c8e5a4e799ff51ac9e5bcede3.models;

import com.aliyun.tea.*;

public class RetryBaasChainContractProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // consortium_id
    @NameInMap("consortium_id")
    @Validation(required = true)
    public String consortiumId;

    // description
    @NameInMap("description")
    public String description;

    // name
    @NameInMap("name")
    public String name;

    // project_id
    @NameInMap("project_id")
    public String projectId;

    // project_version
    @NameInMap("project_version")
    public String projectVersion;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    public static RetryBaasChainContractProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryBaasChainContractProjectRequest self = new RetryBaasChainContractProjectRequest();
        return TeaModel.build(map, self);
    }

    public RetryBaasChainContractProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RetryBaasChainContractProjectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RetryBaasChainContractProjectRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public RetryBaasChainContractProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RetryBaasChainContractProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RetryBaasChainContractProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public RetryBaasChainContractProjectRequest setProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
        return this;
    }
    public String getProjectVersion() {
        return this.projectVersion;
    }

    public RetryBaasChainContractProjectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
