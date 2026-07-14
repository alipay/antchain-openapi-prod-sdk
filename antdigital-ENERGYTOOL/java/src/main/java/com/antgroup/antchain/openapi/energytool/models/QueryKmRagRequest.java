// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryKmRagRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 用户问题
    @NameInMap("query")
    @Validation(required = true)
    public String query;

    // 子范围标识（目录树），用于缩小召回范围；不传则不限范围
    @NameInMap("knowledge_base_ids")
    public java.util.List<String> knowledgeBaseIds;

    // 召回条数
    @NameInMap("topk")
    public Long topk;

    // 是否包含引用来源
    @NameInMap("include_references")
    public Boolean includeReferences;

    public static QueryKmRagRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryKmRagRequest self = new QueryKmRagRequest();
        return TeaModel.build(map, self);
    }

    public QueryKmRagRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryKmRagRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public QueryKmRagRequest setKnowledgeBaseIds(java.util.List<String> knowledgeBaseIds) {
        this.knowledgeBaseIds = knowledgeBaseIds;
        return this;
    }
    public java.util.List<String> getKnowledgeBaseIds() {
        return this.knowledgeBaseIds;
    }

    public QueryKmRagRequest setTopk(Long topk) {
        this.topk = topk;
        return this;
    }
    public Long getTopk() {
        return this.topk;
    }

    public QueryKmRagRequest setIncludeReferences(Boolean includeReferences) {
        this.includeReferences = includeReferences;
        return this;
    }
    public Boolean getIncludeReferences() {
        return this.includeReferences;
    }

}
