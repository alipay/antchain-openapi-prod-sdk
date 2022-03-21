// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class AddSceneRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景名称
    @NameInMap("scene_name")
    @Validation(required = true)
    public String sceneName;

    // 是否托管,取值范围为：NON_ESCROWED、ESCROWED
    @NameInMap("escrowed")
    @Validation(required = true)
    public String escrowed;

    // 私钥密码
    @NameInMap("private_key_password")
    @Validation(required = true)
    public String privateKeyPassword;

    // 租户
    @NameInMap("tenant_name")
    @Validation(required = true)
    public String tenantName;

    // 场景类型
    @NameInMap("scene_type")
    @Validation(required = true)
    public String sceneType;

    // 是否为测试数据
    @NameInMap("mock")
    public Boolean mock;

    public static AddSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSceneRequest self = new AddSceneRequest();
        return TeaModel.build(map, self);
    }

    public AddSceneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddSceneRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddSceneRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public AddSceneRequest setEscrowed(String escrowed) {
        this.escrowed = escrowed;
        return this;
    }
    public String getEscrowed() {
        return this.escrowed;
    }

    public AddSceneRequest setPrivateKeyPassword(String privateKeyPassword) {
        this.privateKeyPassword = privateKeyPassword;
        return this;
    }
    public String getPrivateKeyPassword() {
        return this.privateKeyPassword;
    }

    public AddSceneRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public AddSceneRequest setSceneType(String sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public String getSceneType() {
        return this.sceneType;
    }

    public AddSceneRequest setMock(Boolean mock) {
        this.mock = mock;
        return this;
    }
    public Boolean getMock() {
        return this.mock;
    }

}
