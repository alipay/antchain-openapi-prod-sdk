// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class GetDatasearchIndexRequest extends TeaModel {
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

    public static GetDatasearchIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatasearchIndexRequest self = new GetDatasearchIndexRequest();
        return TeaModel.build(map, self);
    }

    public GetDatasearchIndexRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDatasearchIndexRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDatasearchIndexRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetDatasearchIndexRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetDatasearchIndexRequest setMetaId(String metaId) {
        this.metaId = metaId;
        return this;
    }
    public String getMetaId() {
        return this.metaId;
    }

    public GetDatasearchIndexRequest setIndexType(String indexType) {
        this.indexType = indexType;
        return this;
    }
    public String getIndexType() {
        return this.indexType;
    }

}
