// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class UpdateBlockchainBotIotsuccessProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_key")
    @Validation(required = true)
    public String productKey;

    @NameInMap("name")
    public String name;

    @NameInMap("description")
    public String description;

    @NameInMap("external_id")
    public String externalId;

    @NameInMap("long_memory_enabled")
    public Boolean longMemoryEnabled;

    public static UpdateBlockchainBotIotsuccessProductRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBlockchainBotIotsuccessProductRequest self = new UpdateBlockchainBotIotsuccessProductRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBlockchainBotIotsuccessProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateBlockchainBotIotsuccessProductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateBlockchainBotIotsuccessProductRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UpdateBlockchainBotIotsuccessProductRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateBlockchainBotIotsuccessProductRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateBlockchainBotIotsuccessProductRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public UpdateBlockchainBotIotsuccessProductRequest setLongMemoryEnabled(Boolean longMemoryEnabled) {
        this.longMemoryEnabled = longMemoryEnabled;
        return this;
    }
    public Boolean getLongMemoryEnabled() {
        return this.longMemoryEnabled;
    }

}
