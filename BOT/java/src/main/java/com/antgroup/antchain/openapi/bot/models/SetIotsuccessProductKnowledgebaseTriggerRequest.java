// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SetIotsuccessProductKnowledgebaseTriggerRequest extends TeaModel {
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

    public static SetIotsuccessProductKnowledgebaseTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        SetIotsuccessProductKnowledgebaseTriggerRequest self = new SetIotsuccessProductKnowledgebaseTriggerRequest();
        return TeaModel.build(map, self);
    }

    public SetIotsuccessProductKnowledgebaseTriggerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetIotsuccessProductKnowledgebaseTriggerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetIotsuccessProductKnowledgebaseTriggerRequest setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

    public SetIotsuccessProductKnowledgebaseTriggerRequest setCombine(String combine) {
        this.combine = combine;
        return this;
    }
    public String getCombine() {
        return this.combine;
    }

    public SetIotsuccessProductKnowledgebaseTriggerRequest setKeywords(java.util.List<String> keywords) {
        this.keywords = keywords;
        return this;
    }
    public java.util.List<String> getKeywords() {
        return this.keywords;
    }

    public SetIotsuccessProductKnowledgebaseTriggerRequest setIntents(java.util.List<String> intents) {
        this.intents = intents;
        return this;
    }
    public java.util.List<String> getIntents() {
        return this.intents;
    }

    public SetIotsuccessProductKnowledgebaseTriggerRequest setEntities(java.util.List<String> entities) {
        this.entities = entities;
        return this;
    }
    public java.util.List<String> getEntities() {
        return this.entities;
    }

}
