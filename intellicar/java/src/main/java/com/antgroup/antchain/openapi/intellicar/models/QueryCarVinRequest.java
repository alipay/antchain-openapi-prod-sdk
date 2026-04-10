// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class QueryCarVinRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 车架号
    @NameInMap("vin_code")
    @Validation(required = true)
    public String vinCode;

    public static QueryCarVinRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCarVinRequest self = new QueryCarVinRequest();
        return TeaModel.build(map, self);
    }

    public QueryCarVinRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCarVinRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCarVinRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryCarVinRequest setVinCode(String vinCode) {
        this.vinCode = vinCode;
        return this;
    }
    public String getVinCode() {
        return this.vinCode;
    }

}
