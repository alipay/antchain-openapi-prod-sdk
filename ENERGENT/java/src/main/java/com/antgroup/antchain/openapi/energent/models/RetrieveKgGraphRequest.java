// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class RetrieveKgGraphRequest extends TeaModel {
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

    public static RetrieveKgGraphRequest build(java.util.Map<String, ?> map) throws Exception {
        RetrieveKgGraphRequest self = new RetrieveKgGraphRequest();
        return TeaModel.build(map, self);
    }

    public RetrieveKgGraphRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RetrieveKgGraphRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RetrieveKgGraphRequest setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

    public RetrieveKgGraphRequest setEntityTypes(String entityTypes) {
        this.entityTypes = entityTypes;
        return this;
    }
    public String getEntityTypes() {
        return this.entityTypes;
    }

    public RetrieveKgGraphRequest setRelationTypes(String relationTypes) {
        this.relationTypes = relationTypes;
        return this;
    }
    public String getRelationTypes() {
        return this.relationTypes;
    }

    public RetrieveKgGraphRequest setShowIsolated(Boolean showIsolated) {
        this.showIsolated = showIsolated;
        return this;
    }
    public Boolean getShowIsolated() {
        return this.showIsolated;
    }

    public RetrieveKgGraphRequest setIncludeAnchors(Boolean includeAnchors) {
        this.includeAnchors = includeAnchors;
        return this;
    }
    public Boolean getIncludeAnchors() {
        return this.includeAnchors;
    }

}
