// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class StartDatasetCollectingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部数据ID
    @NameInMap("dataset_id")
    @Validation(required = true)
    public String datasetId;

    // 采集数据所属用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static StartDatasetCollectingRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDatasetCollectingRequest self = new StartDatasetCollectingRequest();
        return TeaModel.build(map, self);
    }

    public StartDatasetCollectingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDatasetCollectingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDatasetCollectingRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public StartDatasetCollectingRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
