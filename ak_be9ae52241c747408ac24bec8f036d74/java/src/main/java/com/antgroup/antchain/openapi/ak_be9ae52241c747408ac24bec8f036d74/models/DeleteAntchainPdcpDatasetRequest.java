// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class DeleteAntchainPdcpDatasetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 待删除的数据集 id，必填
    @NameInMap("dataset_id")
    @Validation(required = true)
    public String datasetId;

    public static DeleteAntchainPdcpDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAntchainPdcpDatasetRequest self = new DeleteAntchainPdcpDatasetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAntchainPdcpDatasetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteAntchainPdcpDatasetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteAntchainPdcpDatasetRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

}
