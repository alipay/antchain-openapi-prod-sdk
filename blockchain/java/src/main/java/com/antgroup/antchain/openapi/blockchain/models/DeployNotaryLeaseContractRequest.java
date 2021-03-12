// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DeployNotaryLeaseContractRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租赁服务平台部署的合约Id名称
    @NameInMap("contract_id")
    @Validation(required = true)
    public String contractId;

    public static DeployNotaryLeaseContractRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployNotaryLeaseContractRequest self = new DeployNotaryLeaseContractRequest();
        return TeaModel.build(map, self);
    }

    public DeployNotaryLeaseContractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeployNotaryLeaseContractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeployNotaryLeaseContractRequest setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

}
