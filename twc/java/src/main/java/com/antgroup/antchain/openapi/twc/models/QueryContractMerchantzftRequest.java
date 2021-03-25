// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractMerchantzftRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 代理商户账户
    @NameInMap("agent_account_id")
    public String agentAccountId;

    public static QueryContractMerchantzftRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContractMerchantzftRequest self = new QueryContractMerchantzftRequest();
        return TeaModel.build(map, self);
    }

    public QueryContractMerchantzftRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContractMerchantzftRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryContractMerchantzftRequest setAgentAccountId(String agentAccountId) {
        this.agentAccountId = agentAccountId;
        return this;
    }
    public String getAgentAccountId() {
        return this.agentAccountId;
    }

}
