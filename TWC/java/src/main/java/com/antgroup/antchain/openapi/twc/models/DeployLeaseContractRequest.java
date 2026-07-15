// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class DeployLeaseContractRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租赁服务平台对应的合约ID
    @NameInMap("contract_id")
    @Validation(required = true)
    public String contractId;

    public static DeployLeaseContractRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployLeaseContractRequest self = new DeployLeaseContractRequest();
        return TeaModel.build(map, self);
    }

    public DeployLeaseContractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeployLeaseContractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeployLeaseContractRequest setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

}
