// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class QueryKnowledgeRagRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户问题
    @NameInMap("query")
    @Validation(required = true)
    public String query;

    // 知识库id
    @NameInMap("knowledge_base_ids")
    public java.util.List<String> knowledgeBaseIds;

    // 召回个数
    @NameInMap("topk")
    public Long topk;

    // 是否包含引用来源
    @NameInMap("include_references")
    public Boolean includeReferences;

    public static QueryKnowledgeRagRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryKnowledgeRagRequest self = new QueryKnowledgeRagRequest();
        return TeaModel.build(map, self);
    }

    public QueryKnowledgeRagRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryKnowledgeRagRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryKnowledgeRagRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public QueryKnowledgeRagRequest setKnowledgeBaseIds(java.util.List<String> knowledgeBaseIds) {
        this.knowledgeBaseIds = knowledgeBaseIds;
        return this;
    }
    public java.util.List<String> getKnowledgeBaseIds() {
        return this.knowledgeBaseIds;
    }

    public QueryKnowledgeRagRequest setTopk(Long topk) {
        this.topk = topk;
        return this;
    }
    public Long getTopk() {
        return this.topk;
    }

    public QueryKnowledgeRagRequest setIncludeReferences(Boolean includeReferences) {
        this.includeReferences = includeReferences;
        return this;
    }
    public Boolean getIncludeReferences() {
        return this.includeReferences;
    }

}
