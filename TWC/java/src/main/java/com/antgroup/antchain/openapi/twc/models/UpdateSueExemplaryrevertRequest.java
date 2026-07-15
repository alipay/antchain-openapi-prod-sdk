// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class UpdateSueExemplaryrevertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户管理合约id
    @NameInMap("contract_id")
    @Validation(required = true)
    public String contractId;

    public static UpdateSueExemplaryrevertRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSueExemplaryrevertRequest self = new UpdateSueExemplaryrevertRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSueExemplaryrevertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSueExemplaryrevertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSueExemplaryrevertRequest setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

}
