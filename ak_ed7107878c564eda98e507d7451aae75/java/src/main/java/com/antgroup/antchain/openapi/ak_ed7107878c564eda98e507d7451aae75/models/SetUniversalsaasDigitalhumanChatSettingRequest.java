// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class SetUniversalsaasDigitalhumanChatSettingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户编码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // 交互配置ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 交互配置名
    @NameInMap("title")
    public String title;

    // 背景图片url
    @NameInMap("bg_img")
    public String bgImg;

    // logo图片url
    @NameInMap("logo_img")
    public String logoImg;

    // 气泡配置
    @NameInMap("bubble_config")
    public java.util.List<AvatarBubbleInfo> bubbleConfig;

    // 自定义组件配置
    @NameInMap("component_config")
    public java.util.List<AvatarComponentInfo> componentConfig;

    // 关联大模型对话配置编码
    @NameInMap("llm_code")
    public String llmCode;

    // 关联知识库列表
    @NameInMap("library_ids")
    public java.util.List<Long> libraryIds;

    // 话术配置
    @NameInMap("script_config")
    public AvatarScriptConfigInfo scriptConfig;

    public static SetUniversalsaasDigitalhumanChatSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        SetUniversalsaasDigitalhumanChatSettingRequest self = new SetUniversalsaasDigitalhumanChatSettingRequest();
        return TeaModel.build(map, self);
    }

    public SetUniversalsaasDigitalhumanChatSettingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetUniversalsaasDigitalhumanChatSettingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetUniversalsaasDigitalhumanChatSettingRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public SetUniversalsaasDigitalhumanChatSettingRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SetUniversalsaasDigitalhumanChatSettingRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SetUniversalsaasDigitalhumanChatSettingRequest setBgImg(String bgImg) {
        this.bgImg = bgImg;
        return this;
    }
    public String getBgImg() {
        return this.bgImg;
    }

    public SetUniversalsaasDigitalhumanChatSettingRequest setLogoImg(String logoImg) {
        this.logoImg = logoImg;
        return this;
    }
    public String getLogoImg() {
        return this.logoImg;
    }

    public SetUniversalsaasDigitalhumanChatSettingRequest setBubbleConfig(java.util.List<AvatarBubbleInfo> bubbleConfig) {
        this.bubbleConfig = bubbleConfig;
        return this;
    }
    public java.util.List<AvatarBubbleInfo> getBubbleConfig() {
        return this.bubbleConfig;
    }

    public SetUniversalsaasDigitalhumanChatSettingRequest setComponentConfig(java.util.List<AvatarComponentInfo> componentConfig) {
        this.componentConfig = componentConfig;
        return this;
    }
    public java.util.List<AvatarComponentInfo> getComponentConfig() {
        return this.componentConfig;
    }

    public SetUniversalsaasDigitalhumanChatSettingRequest setLlmCode(String llmCode) {
        this.llmCode = llmCode;
        return this;
    }
    public String getLlmCode() {
        return this.llmCode;
    }

    public SetUniversalsaasDigitalhumanChatSettingRequest setLibraryIds(java.util.List<Long> libraryIds) {
        this.libraryIds = libraryIds;
        return this;
    }
    public java.util.List<Long> getLibraryIds() {
        return this.libraryIds;
    }

    public SetUniversalsaasDigitalhumanChatSettingRequest setScriptConfig(AvatarScriptConfigInfo scriptConfig) {
        this.scriptConfig = scriptConfig;
        return this;
    }
    public AvatarScriptConfigInfo getScriptConfig() {
        return this.scriptConfig;
    }

}
