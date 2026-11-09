// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class SearchAntchainDasKyaAgentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 语义检索文本，去首尾空白后 1～512 个 Unicode 字符
    @NameInMap("query")
    @Validation(required = true)
    public String query;

    // 返回条数上限，整数 1～20，默认 5
    @NameInMap("top_k")
    public Long topK;

    // JSON 对象字符串，UTF-8 不超过 4096 字节；支持 require_l3_binding、require_authenticated 布尔值及 bound_entity_type（PERSON、ENTERPRISE）；条件按 AND 组合；未知键、重复键、null 或错误类型均拒绝
    @NameInMap("search_conditions")
    public String searchConditions;

    public static SearchAntchainDasKyaAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAntchainDasKyaAgentRequest self = new SearchAntchainDasKyaAgentRequest();
        return TeaModel.build(map, self);
    }

    public SearchAntchainDasKyaAgentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SearchAntchainDasKyaAgentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SearchAntchainDasKyaAgentRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SearchAntchainDasKyaAgentRequest setTopK(Long topK) {
        this.topK = topK;
        return this;
    }
    public Long getTopK() {
        return this.topK;
    }

    public SearchAntchainDasKyaAgentRequest setSearchConditions(String searchConditions) {
        this.searchConditions = searchConditions;
        return this;
    }
    public String getSearchConditions() {
        return this.searchConditions;
    }

}
