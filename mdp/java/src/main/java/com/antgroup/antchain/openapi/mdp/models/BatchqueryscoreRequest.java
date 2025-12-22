// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mdp.models;

import com.aliyun.tea.*;

public class BatchqueryscoreRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 模型 id，和具体场景相关
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    // 用户 id 的类型，比如 mobile 或者 device
    @NameInMap("id_type")
    @Validation(required = true)
    public String idType;

    public static BatchqueryscoreRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryscoreRequest self = new BatchqueryscoreRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryscoreRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryscoreRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryscoreRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public BatchqueryscoreRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

}
