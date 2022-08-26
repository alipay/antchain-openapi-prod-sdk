// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d55db67c8e5a4e799ff51ac9e5bcede3.models;

import com.aliyun.tea.*;

public class DeleteBaasChainContractProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // consortium_id
    @NameInMap("consortium_id")
    public String consortiumId;

    // project_id
    @NameInMap("project_id")
    public String projectId;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    public static DeleteBaasChainContractProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBaasChainContractProjectRequest self = new DeleteBaasChainContractProjectRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBaasChainContractProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteBaasChainContractProjectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteBaasChainContractProjectRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public DeleteBaasChainContractProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteBaasChainContractProjectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
