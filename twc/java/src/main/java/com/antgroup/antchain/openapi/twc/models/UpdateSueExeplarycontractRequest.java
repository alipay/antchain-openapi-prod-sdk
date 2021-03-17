// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class UpdateSueExeplarycontractRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合约名称
    @NameInMap("contract_id")
    @Validation(required = true)
    public String contractId;

    public static UpdateSueExeplarycontractRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSueExeplarycontractRequest self = new UpdateSueExeplarycontractRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSueExeplarycontractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSueExeplarycontractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSueExeplarycontractRequest setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

}
