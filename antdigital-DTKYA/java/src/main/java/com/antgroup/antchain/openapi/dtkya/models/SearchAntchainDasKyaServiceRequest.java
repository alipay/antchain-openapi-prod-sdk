// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class SearchAntchainDasKyaServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 按公开服务名称与描述检索。去首尾空白后 1～512 个 Unicode 字符。
    @NameInMap("query")
    @Validation(required = true)
    public String query;

    // 返回条数上限，整数 1～20，默认 5
    @NameInMap("top_k")
    public Long topK;

    // 可选 JSON 对象字符串，最多 4096 UTF-8 字节。service_type 仅支持 MCP，缺省也按 MCP 查询。
    @NameInMap("search_conditions")
    public String searchConditions;

    public static SearchAntchainDasKyaServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAntchainDasKyaServiceRequest self = new SearchAntchainDasKyaServiceRequest();
        return TeaModel.build(map, self);
    }

    public SearchAntchainDasKyaServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SearchAntchainDasKyaServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SearchAntchainDasKyaServiceRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SearchAntchainDasKyaServiceRequest setTopK(Long topK) {
        this.topK = topK;
        return this;
    }
    public Long getTopK() {
        return this.topK;
    }

    public SearchAntchainDasKyaServiceRequest setSearchConditions(String searchConditions) {
        this.searchConditions = searchConditions;
        return this;
    }
    public String getSearchConditions() {
        return this.searchConditions;
    }

}
