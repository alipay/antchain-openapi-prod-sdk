// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class UpdateLeaseContractRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被升级的合约名称
    @NameInMap("contract_id")
    @Validation(required = true)
    public String contractId;

    // 合约业务层id
    @NameInMap("application_id")
    public String applicationId;

    public static UpdateLeaseContractRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLeaseContractRequest self = new UpdateLeaseContractRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLeaseContractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateLeaseContractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateLeaseContractRequest setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public UpdateLeaseContractRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

}
