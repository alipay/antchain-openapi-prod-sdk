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

    // 是否跳过中台数据校验处理
    @NameInMap("skip_pegasus")
    @Validation(required = true)
    public Boolean skipPegasus;

    // 场景名称
    // 
    @NameInMap("scene_name")
    public String sceneName;

    // 租户
    // 
    @NameInMap("tenant_name")
    public String tenantName;

    // 场景类型
    // 
    @NameInMap("scene_type")
    public String sceneType;

    // 定制数据处理类 , 使用用逗号分隔
    @NameInMap("customer_processor")
    public String customerProcessor;

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

    public UpdateSceneRequest setSkipPegasus(Boolean skipPegasus) {
        this.skipPegasus = skipPegasus;
        return this;
    }
    public Boolean getSkipPegasus() {
        return this.skipPegasus;
    }

    public UpdateSceneRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
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

    public UpdateSceneRequest setCustomerProcessor(String customerProcessor) {
        this.customerProcessor = customerProcessor;
        return this;
    }
    public String getCustomerProcessor() {
        return this.customerProcessor;
    }

}
