// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class DetailBlockchainBotIotsuccessProductKnowledgebaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("kb_id")
    @Validation(required = true)
    public String kbId;

    public static DetailBlockchainBotIotsuccessProductKnowledgebaseRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailBlockchainBotIotsuccessProductKnowledgebaseRequest self = new DetailBlockchainBotIotsuccessProductKnowledgebaseRequest();
        return TeaModel.build(map, self);
    }

    public DetailBlockchainBotIotsuccessProductKnowledgebaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailBlockchainBotIotsuccessProductKnowledgebaseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailBlockchainBotIotsuccessProductKnowledgebaseRequest setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

}
