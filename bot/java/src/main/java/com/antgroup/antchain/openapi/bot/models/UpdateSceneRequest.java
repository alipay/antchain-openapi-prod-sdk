// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UpdateSceneRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 主键Id 
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 场景名称
    // 
    @NameInMap("scene_name")
    public String sceneName;

    // 是否托管,取值范围为：NON_ESCROWED、ESCROWED
    @NameInMap("escrowed")
    public String escrowed;

    // 私钥密码
    // 
    @NameInMap("private_key_password")
    public String privateKeyPassword;

    // 租户
    // 
    @NameInMap("tenant_name")
    public String tenantName;

    // 场景类型
    // 
    @NameInMap("scene_type")
    public String sceneType;

    public static UpdateSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSceneRequest self = new UpdateSceneRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSceneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSceneRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSceneRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateSceneRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public UpdateSceneRequest setEscrowed(String escrowed) {
        this.escrowed = escrowed;
        return this;
    }
    public String getEscrowed() {
        return this.escrowed;
    }

    public UpdateSceneRequest setPrivateKeyPassword(String privateKeyPassword) {
        this.privateKeyPassword = privateKeyPassword;
        return this;
    }
    public String getPrivateKeyPassword() {
        return this.privateKeyPassword;
    }

    public UpdateSceneRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public UpdateSceneRequest setSceneType(String sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public String getSceneType() {
        return this.sceneType;
    }

}
