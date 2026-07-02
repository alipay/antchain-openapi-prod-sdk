// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class BatchdeleteInnerKnowledgecategoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    // 
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 知识点数据库主键id数组
    @NameInMap("ids")
    @Validation(required = true)
    public java.util.List<Long> ids;

    public static BatchdeleteInnerKnowledgecategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchdeleteInnerKnowledgecategoryRequest self = new BatchdeleteInnerKnowledgecategoryRequest();
        return TeaModel.build(map, self);
    }

    public BatchdeleteInnerKnowledgecategoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchdeleteInnerKnowledgecategoryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchdeleteInnerKnowledgecategoryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public BatchdeleteInnerKnowledgecategoryRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

}
