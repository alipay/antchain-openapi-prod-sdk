// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d55db67c8e5a4e799ff51ac9e5bcede3.models;

import com.aliyun.tea.*;

public class CloneBaasChainContractProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // consortium_id
    @NameInMap("consortium_id")
    @Validation(required = true)
    public String consortiumId;

    // project_description
    @NameInMap("project_description")
    @Validation(required = true)
    public String projectDescription;

    // project_id
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // project_name
    @NameInMap("project_name")
    @Validation(required = true)
    public String projectName;

    // project_version
    @NameInMap("project_version")
    @Validation(required = true)
    public String projectVersion;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    public static CloneBaasChainContractProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneBaasChainContractProjectRequest self = new CloneBaasChainContractProjectRequest();
        return TeaModel.build(map, self);
    }

    public CloneBaasChainContractProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CloneBaasChainContractProjectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CloneBaasChainContractProjectRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public CloneBaasChainContractProjectRequest setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
        return this;
    }
    public String getProjectDescription() {
        return this.projectDescription;
    }

    public CloneBaasChainContractProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CloneBaasChainContractProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CloneBaasChainContractProjectRequest setProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
        return this;
    }
    public String getProjectVersion() {
        return this.projectVersion;
    }

    public CloneBaasChainContractProjectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
