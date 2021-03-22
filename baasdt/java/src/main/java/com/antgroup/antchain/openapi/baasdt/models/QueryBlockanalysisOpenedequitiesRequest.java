// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryBlockanalysisOpenedequitiesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 每页数据量
    @NameInMap("count")
    public Long count;

    // 页数
    @NameInMap("page")
    public Long page;

    public static QueryBlockanalysisOpenedequitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockanalysisOpenedequitiesRequest self = new QueryBlockanalysisOpenedequitiesRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockanalysisOpenedequitiesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBlockanalysisOpenedequitiesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBlockanalysisOpenedequitiesRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public QueryBlockanalysisOpenedequitiesRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public QueryBlockanalysisOpenedequitiesRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

}
