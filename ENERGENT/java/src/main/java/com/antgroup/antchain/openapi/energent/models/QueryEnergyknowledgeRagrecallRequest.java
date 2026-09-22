// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class QueryEnergyknowledgeRagrecallRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // rag检索问题
    @NameInMap("query")
    @Validation(required = true)
    public String query;

    // 召回的知识库id
    @NameInMap("knowledgebaseids")
    public java.util.List<String> knowledgebaseids;

    // 是否包含召回文件名，默认true
    @NameInMap("includereferences")
    public Boolean includereferences;

    // 召回条数，默认5
    @NameInMap("topk")
    public Long topk;

    public static QueryEnergyknowledgeRagrecallRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEnergyknowledgeRagrecallRequest self = new QueryEnergyknowledgeRagrecallRequest();
        return TeaModel.build(map, self);
    }

    public QueryEnergyknowledgeRagrecallRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEnergyknowledgeRagrecallRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEnergyknowledgeRagrecallRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public QueryEnergyknowledgeRagrecallRequest setKnowledgebaseids(java.util.List<String> knowledgebaseids) {
        this.knowledgebaseids = knowledgebaseids;
        return this;
    }
    public java.util.List<String> getKnowledgebaseids() {
        return this.knowledgebaseids;
    }

    public QueryEnergyknowledgeRagrecallRequest setIncludereferences(Boolean includereferences) {
        this.includereferences = includereferences;
        return this;
    }
    public Boolean getIncludereferences() {
        return this.includereferences;
    }

    public QueryEnergyknowledgeRagrecallRequest setTopk(Long topk) {
        this.topk = topk;
        return this;
    }
    public Long getTopk() {
        return this.topk;
    }

}
