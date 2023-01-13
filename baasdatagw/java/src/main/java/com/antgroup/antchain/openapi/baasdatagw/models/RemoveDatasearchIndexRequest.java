// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class RemoveDatasearchIndexRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户唯一标识符（租户ID）
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 链唯一标识符
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 合约ABI meta ID
    @NameInMap("meta_id")
    @Validation(required = true)
    public String metaId;

    // 索引类型， interface 为合约方法及输入输出； event 为合约Logs; deposit 为原生存证
    @NameInMap("index_type")
    @Validation(required = true)
    public String indexType;

    public static RemoveDatasearchIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveDatasearchIndexRequest self = new RemoveDatasearchIndexRequest();
        return TeaModel.build(map, self);
    }

    public RemoveDatasearchIndexRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RemoveDatasearchIndexRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RemoveDatasearchIndexRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public RemoveDatasearchIndexRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RemoveDatasearchIndexRequest setMetaId(String metaId) {
        this.metaId = metaId;
        return this;
    }
    public String getMetaId() {
        return this.metaId;
    }

    public RemoveDatasearchIndexRequest setIndexType(String indexType) {
        this.indexType = indexType;
        return this;
    }
    public String getIndexType() {
        return this.indexType;
    }

}
