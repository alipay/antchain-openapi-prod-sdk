// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class StartDatasearchIndexRequest extends TeaModel {
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

    // 合约 hex 编码的地址
    @NameInMap("contract")
    @Validation(required = true)
    public String contract;

    // 索引的起始位置，同合约ABI的起始位置； 0 表示从头
    @NameInMap("start_height")
    @Validation(required = true)
    public Long startHeight;

    // 索引的终止位置，同合约ABI的终止位置；0 表示到最新
    @NameInMap("end_height")
    @Validation(required = true)
    public Long endHeight;

    // 索引类型，   interface  为合约方法及输入输出； event 为合约Logs; deposit 为原生存证
    @NameInMap("index_type")
    @Validation(required = true)
    public String indexType;

    public static StartDatasearchIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDatasearchIndexRequest self = new StartDatasearchIndexRequest();
        return TeaModel.build(map, self);
    }

    public StartDatasearchIndexRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDatasearchIndexRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDatasearchIndexRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public StartDatasearchIndexRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public StartDatasearchIndexRequest setMetaId(String metaId) {
        this.metaId = metaId;
        return this;
    }
    public String getMetaId() {
        return this.metaId;
    }

    public StartDatasearchIndexRequest setContract(String contract) {
        this.contract = contract;
        return this;
    }
    public String getContract() {
        return this.contract;
    }

    public StartDatasearchIndexRequest setStartHeight(Long startHeight) {
        this.startHeight = startHeight;
        return this;
    }
    public Long getStartHeight() {
        return this.startHeight;
    }

    public StartDatasearchIndexRequest setEndHeight(Long endHeight) {
        this.endHeight = endHeight;
        return this;
    }
    public Long getEndHeight() {
        return this.endHeight;
    }

    public StartDatasearchIndexRequest setIndexType(String indexType) {
        this.indexType = indexType;
        return this;
    }
    public String getIndexType() {
        return this.indexType;
    }

}
