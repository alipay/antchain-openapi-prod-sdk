// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class QueryUniversalsaasDigitalhumanCloneTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数字人id
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    public static QueryUniversalsaasDigitalhumanCloneTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUniversalsaasDigitalhumanCloneTaskRequest self = new QueryUniversalsaasDigitalhumanCloneTaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryUniversalsaasDigitalhumanCloneTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUniversalsaasDigitalhumanCloneTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUniversalsaasDigitalhumanCloneTaskRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

}
