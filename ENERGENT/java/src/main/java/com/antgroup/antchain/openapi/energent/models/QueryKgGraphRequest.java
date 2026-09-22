// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class QueryKgGraphRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 知识库ID
    @NameInMap("kb_id")
    @Validation(required = true)
    public String kbId;

    // 限定实体类型集合(逗号分隔)
    @NameInMap("entity_types")
    public String entityTypes;

    // 限定关系类型集合(逗号分隔)
    @NameInMap("relation_types")
    public String relationTypes;

    // 是否包含孤立节点
    @NameInMap("show_isolated")
    public Boolean showIsolated;

    // 是否包含锚点节点
    @NameInMap("include_anchors")
    public Boolean includeAnchors;

    public static QueryKgGraphRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryKgGraphRequest self = new QueryKgGraphRequest();
        return TeaModel.build(map, self);
    }

    public QueryKgGraphRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryKgGraphRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryKgGraphRequest setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

    public QueryKgGraphRequest setEntityTypes(String entityTypes) {
        this.entityTypes = entityTypes;
        return this;
    }
    public String getEntityTypes() {
        return this.entityTypes;
    }

    public QueryKgGraphRequest setRelationTypes(String relationTypes) {
        this.relationTypes = relationTypes;
        return this;
    }
    public String getRelationTypes() {
        return this.relationTypes;
    }

    public QueryKgGraphRequest setShowIsolated(Boolean showIsolated) {
        this.showIsolated = showIsolated;
        return this;
    }
    public Boolean getShowIsolated() {
        return this.showIsolated;
    }

    public QueryKgGraphRequest setIncludeAnchors(Boolean includeAnchors) {
        this.includeAnchors = includeAnchors;
        return this;
    }
    public Boolean getIncludeAnchors() {
        return this.includeAnchors;
    }

}
