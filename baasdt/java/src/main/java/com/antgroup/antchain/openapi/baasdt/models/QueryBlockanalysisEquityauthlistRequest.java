// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryBlockanalysisEquityauthlistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 分页查询每页数量
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    // 商品ID
    @NameInMap("equity_id")
    @Validation(required = true)
    public String equityId;

    // 分页查询页码
    @NameInMap("page")
    @Validation(required = true)
    public Long page;

    // 代理租户ID
    @NameInMap("delegated_tenant_id")
    @Validation(required = true)
    public String delegatedTenantId;

    public static QueryBlockanalysisEquityauthlistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockanalysisEquityauthlistRequest self = new QueryBlockanalysisEquityauthlistRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockanalysisEquityauthlistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBlockanalysisEquityauthlistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBlockanalysisEquityauthlistRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public QueryBlockanalysisEquityauthlistRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public QueryBlockanalysisEquityauthlistRequest setEquityId(String equityId) {
        this.equityId = equityId;
        return this;
    }
    public String getEquityId() {
        return this.equityId;
    }

    public QueryBlockanalysisEquityauthlistRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public QueryBlockanalysisEquityauthlistRequest setDelegatedTenantId(String delegatedTenantId) {
        this.delegatedTenantId = delegatedTenantId;
        return this;
    }
    public String getDelegatedTenantId() {
        return this.delegatedTenantId;
    }

}
