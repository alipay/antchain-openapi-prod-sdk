// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class AddUniversalsaasDigitalhumanKnowledgeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户编码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // 知识库id
    @NameInMap("library_id")
    @Validation(required = true)
    public Long libraryId;

    // 标问标题
    @NameInMap("question_title")
    @Validation(required = true)
    public String questionTitle;

    // 问法列表
    @NameInMap("sentence_list")
    @Validation(required = true)
    public java.util.List<String> sentenceList;

    // 答案文案
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 动画播报文案
    @NameInMap("broadcast_content")
    public String broadcastContent;

    // 行动点配置
    @NameInMap("bubble_button_config")
    public java.util.List<BubbleButton> bubbleButtonConfig;

    public static AddUniversalsaasDigitalhumanKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUniversalsaasDigitalhumanKnowledgeRequest self = new AddUniversalsaasDigitalhumanKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public AddUniversalsaasDigitalhumanKnowledgeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddUniversalsaasDigitalhumanKnowledgeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddUniversalsaasDigitalhumanKnowledgeRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public AddUniversalsaasDigitalhumanKnowledgeRequest setLibraryId(Long libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public Long getLibraryId() {
        return this.libraryId;
    }

    public AddUniversalsaasDigitalhumanKnowledgeRequest setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
        return this;
    }
    public String getQuestionTitle() {
        return this.questionTitle;
    }

    public AddUniversalsaasDigitalhumanKnowledgeRequest setSentenceList(java.util.List<String> sentenceList) {
        this.sentenceList = sentenceList;
        return this;
    }
    public java.util.List<String> getSentenceList() {
        return this.sentenceList;
    }

    public AddUniversalsaasDigitalhumanKnowledgeRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public AddUniversalsaasDigitalhumanKnowledgeRequest setBroadcastContent(String broadcastContent) {
        this.broadcastContent = broadcastContent;
        return this;
    }
    public String getBroadcastContent() {
        return this.broadcastContent;
    }

    public AddUniversalsaasDigitalhumanKnowledgeRequest setBubbleButtonConfig(java.util.List<BubbleButton> bubbleButtonConfig) {
        this.bubbleButtonConfig = bubbleButtonConfig;
        return this;
    }
    public java.util.List<BubbleButton> getBubbleButtonConfig() {
        return this.bubbleButtonConfig;
    }

}
