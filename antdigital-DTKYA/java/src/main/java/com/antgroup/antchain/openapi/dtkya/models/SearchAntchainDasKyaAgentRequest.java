// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class SearchAntchainDasKyaAgentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 检索 Agent 名称。DID 精确查询也需传值。去首尾空白后 1～512 个 Unicode 字符。
    @NameInMap("query")
    @Validation(required = true)
    public String query;

    // 返回条数上限，整数 1～20，默认 5
    @NameInMap("top_k")
    public Long topK;

    // 可选 JSON 对象字符串，最多 4096 UTF-8 字节。agent_did 最长 128 字符，走 KYA 精确查。tenant 按所属租户筛选。created_at 用带时区的 RFC 3339 gte/lt。条件按 AND 组合。
    @NameInMap("search_conditions")
    public String searchConditions;

    // 默认 false，走真实检索。true 返回固定样例，模式为 MOCK。
    @NameInMap("use_mock_data")
    public Boolean useMockData;

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

    public SearchAntchainDasKyaAgentRequest setUseMockData(Boolean useMockData) {
        this.useMockData = useMockData;
        return this;
    }
    public Boolean getUseMockData() {
        return this.useMockData;
    }

}
