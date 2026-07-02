// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OperateInnerKnowledgecategoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 知识点数据库主键ids
    @NameInMap("ids")
    @Validation(required = true)
    public java.util.List<Long> ids;

    // 提交(submit)、上线(online)、下线(offline)、撤回(withdraw)
    @NameInMap("operation")
    @Validation(required = true)
    public String operation;

    public static OperateInnerKnowledgecategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateInnerKnowledgecategoryRequest self = new OperateInnerKnowledgecategoryRequest();
        return TeaModel.build(map, self);
    }

    public OperateInnerKnowledgecategoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateInnerKnowledgecategoryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateInnerKnowledgecategoryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OperateInnerKnowledgecategoryRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    public OperateInnerKnowledgecategoryRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

}
