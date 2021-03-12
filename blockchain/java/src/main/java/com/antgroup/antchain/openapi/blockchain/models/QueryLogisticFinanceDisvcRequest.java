// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryLogisticFinanceDisvcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 代理申请的分布式数字身份，缺省时为自己的分布式数字身份
    @NameInMap("agent_did")
    public String agentDid;

    // 可验证声明id
    @NameInMap("vc_id")
    @Validation(required = true)
    public String vcId;

    public static QueryLogisticFinanceDisvcRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLogisticFinanceDisvcRequest self = new QueryLogisticFinanceDisvcRequest();
        return TeaModel.build(map, self);
    }

    public QueryLogisticFinanceDisvcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLogisticFinanceDisvcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryLogisticFinanceDisvcRequest setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public QueryLogisticFinanceDisvcRequest setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

}
