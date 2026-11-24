// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class SetBlockchainBotIotsuccessProductKnowledgebaseTriggerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("kb_id")
    @Validation(required = true)
    public String kbId;

    // 枚举:ANY,ALL
    @NameInMap("combine")
    @Validation(required = true)
    public String combine;

    @NameInMap("keywords")
    public java.util.List<String> keywords;

    @NameInMap("intents")
    public java.util.List<String> intents;

    @NameInMap("entities")
    public java.util.List<String> entities;

    public static SetBlockchainBotIotsuccessProductKnowledgebaseTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        SetBlockchainBotIotsuccessProductKnowledgebaseTriggerRequest self = new SetBlockchainBotIotsuccessProductKnowledgebaseTriggerRequest();
        return TeaModel.build(map, self);
    }

    public SetBlockchainBotIotsuccessProductKnowledgebaseTriggerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetBlockchainBotIotsuccessProductKnowledgebaseTriggerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetBlockchainBotIotsuccessProductKnowledgebaseTriggerRequest setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

    public SetBlockchainBotIotsuccessProductKnowledgebaseTriggerRequest setCombine(String combine) {
        this.combine = combine;
        return this;
    }
    public String getCombine() {
        return this.combine;
    }

    public SetBlockchainBotIotsuccessProductKnowledgebaseTriggerRequest setKeywords(java.util.List<String> keywords) {
        this.keywords = keywords;
        return this;
    }
    public java.util.List<String> getKeywords() {
        return this.keywords;
    }

    public SetBlockchainBotIotsuccessProductKnowledgebaseTriggerRequest setIntents(java.util.List<String> intents) {
        this.intents = intents;
        return this;
    }
    public java.util.List<String> getIntents() {
        return this.intents;
    }

    public SetBlockchainBotIotsuccessProductKnowledgebaseTriggerRequest setEntities(java.util.List<String> entities) {
        this.entities = entities;
        return this;
    }
    public java.util.List<String> getEntities() {
        return this.entities;
    }

}
