// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CancelContractPaytradeRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 智能合同id
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    public static CancelContractPaytradeRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelContractPaytradeRequest self = new CancelContractPaytradeRequest();
        return TeaModel.build(map, self);
    }

    public CancelContractPaytradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelContractPaytradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelContractPaytradeRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
