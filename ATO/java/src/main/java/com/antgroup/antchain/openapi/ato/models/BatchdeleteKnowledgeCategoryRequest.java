// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class BatchdeleteKnowledgeCategoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 知识点数据库主键id数组
    @NameInMap("ids")
    @Validation(required = true)
    public java.util.List<Long> ids;

    public static BatchdeleteKnowledgeCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchdeleteKnowledgeCategoryRequest self = new BatchdeleteKnowledgeCategoryRequest();
        return TeaModel.build(map, self);
    }

    public BatchdeleteKnowledgeCategoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchdeleteKnowledgeCategoryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchdeleteKnowledgeCategoryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public BatchdeleteKnowledgeCategoryRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

}
