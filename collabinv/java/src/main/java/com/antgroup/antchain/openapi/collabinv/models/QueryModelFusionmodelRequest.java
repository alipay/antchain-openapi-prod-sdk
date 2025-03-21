// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class QueryModelFusionmodelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 融合模型编码
    @NameInMap("fusion_model_code")
    @Validation(required = true)
    public String fusionModelCode;

    // 模型调用的id，一般是用户id 可能是用户手机号或者身份照号码的md5
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    public static QueryModelFusionmodelRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryModelFusionmodelRequest self = new QueryModelFusionmodelRequest();
        return TeaModel.build(map, self);
    }

    public QueryModelFusionmodelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryModelFusionmodelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryModelFusionmodelRequest setFusionModelCode(String fusionModelCode) {
        this.fusionModelCode = fusionModelCode;
        return this;
    }
    public String getFusionModelCode() {
        return this.fusionModelCode;
    }

    public QueryModelFusionmodelRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

}
