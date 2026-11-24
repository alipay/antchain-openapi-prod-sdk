// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class CreateBlockchainBotIotsuccessProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("name")
    @Validation(required = true)
    public String name;

    @NameInMap("description")
    @Validation(required = true)
    public String description;

    @NameInMap("category_id")
    @Validation(required = true)
    public String categoryId;

    // 来自listCategories有效组合
    @NameInMap("service_form")
    @Validation(required = true)
    public String serviceForm;

    // 枚举:LICENSE,INSTANCE
    @NameInMap("authorization_mode")
    @Validation(required = true)
    public String authorizationMode;

    // 来自listCategories的activationTypes
    @NameInMap("activation_type")
    @Validation(required = true)
    public String activationType;

    // 来自品类目录
    @NameInMap("network_mode")
    public String networkMode;

    @NameInMap("external_id")
    public String externalId;

    @NameInMap("long_memory_enabled")
    public Boolean longMemoryEnabled;

    public static CreateBlockchainBotIotsuccessProductRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBlockchainBotIotsuccessProductRequest self = new CreateBlockchainBotIotsuccessProductRequest();
        return TeaModel.build(map, self);
    }

    public CreateBlockchainBotIotsuccessProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBlockchainBotIotsuccessProductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBlockchainBotIotsuccessProductRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateBlockchainBotIotsuccessProductRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateBlockchainBotIotsuccessProductRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public CreateBlockchainBotIotsuccessProductRequest setServiceForm(String serviceForm) {
        this.serviceForm = serviceForm;
        return this;
    }
    public String getServiceForm() {
        return this.serviceForm;
    }

    public CreateBlockchainBotIotsuccessProductRequest setAuthorizationMode(String authorizationMode) {
        this.authorizationMode = authorizationMode;
        return this;
    }
    public String getAuthorizationMode() {
        return this.authorizationMode;
    }

    public CreateBlockchainBotIotsuccessProductRequest setActivationType(String activationType) {
        this.activationType = activationType;
        return this;
    }
    public String getActivationType() {
        return this.activationType;
    }

    public CreateBlockchainBotIotsuccessProductRequest setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
        return this;
    }
    public String getNetworkMode() {
        return this.networkMode;
    }

    public CreateBlockchainBotIotsuccessProductRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public CreateBlockchainBotIotsuccessProductRequest setLongMemoryEnabled(Boolean longMemoryEnabled) {
        this.longMemoryEnabled = longMemoryEnabled;
        return this;
    }
    public Boolean getLongMemoryEnabled() {
        return this.longMemoryEnabled;
    }

}
