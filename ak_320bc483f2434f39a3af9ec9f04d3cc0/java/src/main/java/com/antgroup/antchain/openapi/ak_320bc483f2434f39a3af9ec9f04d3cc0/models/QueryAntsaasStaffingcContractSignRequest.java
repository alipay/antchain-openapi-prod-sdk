// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class QueryAntsaasStaffingcContractSignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流程id
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    public static QueryAntsaasStaffingcContractSignRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntsaasStaffingcContractSignRequest self = new QueryAntsaasStaffingcContractSignRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntsaasStaffingcContractSignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntsaasStaffingcContractSignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntsaasStaffingcContractSignRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
