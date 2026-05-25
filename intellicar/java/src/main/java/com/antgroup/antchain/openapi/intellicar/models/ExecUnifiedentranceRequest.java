// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class ExecUnifiedentranceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数的json字符串
    @NameInMap("params")
    @Validation(required = true)
    public String params;

    // 业务场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    public static ExecUnifiedentranceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecUnifiedentranceRequest self = new ExecUnifiedentranceRequest();
        return TeaModel.build(map, self);
    }

    public ExecUnifiedentranceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecUnifiedentranceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecUnifiedentranceRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public ExecUnifiedentranceRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
