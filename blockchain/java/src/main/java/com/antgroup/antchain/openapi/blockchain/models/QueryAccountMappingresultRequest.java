// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAccountMappingresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询之前对应批量映射请求的映射结果
    @NameInMap("batch_id")
    @Validation(required = true)
    public String batchId;

    public static QueryAccountMappingresultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountMappingresultRequest self = new QueryAccountMappingresultRequest();
        return TeaModel.build(map, self);
    }

    public QueryAccountMappingresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAccountMappingresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAccountMappingresultRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

}
