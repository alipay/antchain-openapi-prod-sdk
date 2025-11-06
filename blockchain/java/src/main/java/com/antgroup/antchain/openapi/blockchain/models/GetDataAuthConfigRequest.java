// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetDataAuthConfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 企业信用代码
    @NameInMap("enterprise_code")
    @Validation(required = true)
    public String enterpriseCode;

    public static GetDataAuthConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataAuthConfigRequest self = new GetDataAuthConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetDataAuthConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDataAuthConfigRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDataAuthConfigRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public GetDataAuthConfigRequest setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
        return this;
    }
    public String getEnterpriseCode() {
        return this.enterpriseCode;
    }

}
