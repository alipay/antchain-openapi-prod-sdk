// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryEquityCreateresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 创建商品接口返回的createEquityRequestId
    @NameInMap("create_equity_request_id")
    @Validation(required = true)
    public String createEquityRequestId;

    // 要代理操作的租户ID
    @NameInMap("delegated_tenant_id")
    public String delegatedTenantId;

    public static QueryEquityCreateresultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEquityCreateresultRequest self = new QueryEquityCreateresultRequest();
        return TeaModel.build(map, self);
    }

    public QueryEquityCreateresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEquityCreateresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEquityCreateresultRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public QueryEquityCreateresultRequest setCreateEquityRequestId(String createEquityRequestId) {
        this.createEquityRequestId = createEquityRequestId;
        return this;
    }
    public String getCreateEquityRequestId() {
        return this.createEquityRequestId;
    }

    public QueryEquityCreateresultRequest setDelegatedTenantId(String delegatedTenantId) {
        this.delegatedTenantId = delegatedTenantId;
        return this;
    }
    public String getDelegatedTenantId() {
        return this.delegatedTenantId;
    }

}
