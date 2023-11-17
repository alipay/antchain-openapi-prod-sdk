// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class QueryAntchainPdcpDatasetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据集id
    @NameInMap("dataset_id")
    @Validation(required = true, minLength = 1)
    public String datasetId;

    public static QueryAntchainPdcpDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainPdcpDatasetRequest self = new QueryAntchainPdcpDatasetRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainPdcpDatasetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainPdcpDatasetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainPdcpDatasetRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

}
