// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mdp.models;

import com.aliyun.tea.*;

public class GetuserscoreRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 采用哪一个模型进行推理
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    // 手机号的 md5 值
    @NameInMap("mobile_md5")
    @Validation(required = true)
    public String mobileMd5;

    public static GetuserscoreRequest build(java.util.Map<String, ?> map) throws Exception {
        GetuserscoreRequest self = new GetuserscoreRequest();
        return TeaModel.build(map, self);
    }

    public GetuserscoreRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetuserscoreRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetuserscoreRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public GetuserscoreRequest setMobileMd5(String mobileMd5) {
        this.mobileMd5 = mobileMd5;
        return this;
    }
    public String getMobileMd5() {
        return this.mobileMd5;
    }

}
