// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractMerchantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户入驻查询订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 代理商户账户ID，此参数不填默认平台机构账户入驻
    @NameInMap("agent_account_id")
    public String agentAccountId;

    public static QueryContractMerchantRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContractMerchantRequest self = new QueryContractMerchantRequest();
        return TeaModel.build(map, self);
    }

    public QueryContractMerchantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContractMerchantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryContractMerchantRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryContractMerchantRequest setAgentAccountId(String agentAccountId) {
        this.agentAccountId = agentAccountId;
        return this;
    }
    public String getAgentAccountId() {
        return this.agentAccountId;
    }

}
