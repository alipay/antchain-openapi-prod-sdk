// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpAccountsettlementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 版权方的链上id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 为空，返回所有数据，true，返回入驻数据，false，返回未入驻数据
    @NameInMap("is_filtered")
    public Boolean isFiltered;

    public static QueryIpAccountsettlementRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIpAccountsettlementRequest self = new QueryIpAccountsettlementRequest();
        return TeaModel.build(map, self);
    }

    public QueryIpAccountsettlementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIpAccountsettlementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIpAccountsettlementRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public QueryIpAccountsettlementRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public QueryIpAccountsettlementRequest setIsFiltered(Boolean isFiltered) {
        this.isFiltered = isFiltered;
        return this;
    }
    public Boolean getIsFiltered() {
        return this.isFiltered;
    }

}
