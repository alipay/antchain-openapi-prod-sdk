// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteResourceVpcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 要删除的VPC所在的地域identity
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 要删除的VPC ID
    @NameInMap("vpc_id")
    @Validation(required = true)
    public String vpcId;

    // workspace id
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // unbind_only
    @NameInMap("unbind_only")
    public Boolean unbindOnly;

    // vpc_paas_id,vcp_id不存在时可用。建议用这个
    @NameInMap("vpc_paas_id")
    public String vpcPaasId;

    public static DeleteResourceVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceVpcRequest self = new DeleteResourceVpcRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceVpcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteResourceVpcRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DeleteResourceVpcRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DeleteResourceVpcRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public DeleteResourceVpcRequest setUnbindOnly(Boolean unbindOnly) {
        this.unbindOnly = unbindOnly;
        return this;
    }
    public Boolean getUnbindOnly() {
        return this.unbindOnly;
    }

    public DeleteResourceVpcRequest setVpcPaasId(String vpcPaasId) {
        this.vpcPaasId = vpcPaasId;
        return this;
    }
    public String getVpcPaasId() {
        return this.vpcPaasId;
    }

}
