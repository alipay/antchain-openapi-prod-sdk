// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeploySceneRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景名称
    @NameInMap("scene_name")
    @Validation(required = true)
    public String sceneName;

    // 链ID
    @NameInMap("bnaas_basic_service_did")
    @Validation(required = true)
    public String bnaasBasicServiceDid;

    public static DeploySceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DeploySceneRequest self = new DeploySceneRequest();
        return TeaModel.build(map, self);
    }

    public DeploySceneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeploySceneRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeploySceneRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public DeploySceneRequest setBnaasBasicServiceDid(String bnaasBasicServiceDid) {
        this.bnaasBasicServiceDid = bnaasBasicServiceDid;
        return this;
    }
    public String getBnaasBasicServiceDid() {
        return this.bnaasBasicServiceDid;
    }

}
