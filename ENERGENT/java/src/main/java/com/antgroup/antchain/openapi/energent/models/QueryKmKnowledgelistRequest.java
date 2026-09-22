// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class QueryKmKnowledgelistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 知识库名称搜索关键词
    @NameInMap("keyword")
    public String keyword;

    // 一页数据条数
    @NameInMap("page_size")
    public Long pageSize;

    // 页号
    @NameInMap("page")
    public Long page;

    public static QueryKmKnowledgelistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryKmKnowledgelistRequest self = new QueryKmKnowledgelistRequest();
        return TeaModel.build(map, self);
    }

    public QueryKmKnowledgelistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryKmKnowledgelistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryKmKnowledgelistRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryKmKnowledgelistRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryKmKnowledgelistRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

}
