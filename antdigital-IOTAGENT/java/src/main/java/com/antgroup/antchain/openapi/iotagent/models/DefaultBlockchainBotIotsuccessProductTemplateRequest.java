// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class DefaultBlockchainBotIotsuccessProductTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_key")
    @Validation(required = true)
    public String productKey;

    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    public static DefaultBlockchainBotIotsuccessProductTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DefaultBlockchainBotIotsuccessProductTemplateRequest self = new DefaultBlockchainBotIotsuccessProductTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DefaultBlockchainBotIotsuccessProductTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DefaultBlockchainBotIotsuccessProductTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DefaultBlockchainBotIotsuccessProductTemplateRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public DefaultBlockchainBotIotsuccessProductTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
