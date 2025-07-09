// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class AvatarLlmChatInfo extends TeaModel {
    // 大模型对话配置编码
    /**
     * <strong>example:</strong>
     * <p>8810606430954027635</p>
     */
    @NameInMap("llm_chat_code")
    @Validation(required = true)
    public String llmChatCode;

    // 大模型对话配置名
    /**
     * <strong>example:</strong>
     * <p>智能体</p>
     */
    @NameInMap("llm_chat_name")
    @Validation(required = true)
    public String llmChatName;

    // 描述
    /**
     * <strong>example:</strong>
     * <p>大模型</p>
     */
    @NameInMap("description")
    public String description;

    // 模型配置名
    /**
     * <strong>example:</strong>
     * <p>百炼</p>
     */
    @NameInMap("model_name")
    @Validation(required = true)
    public String modelName;

    // 模型配置编码
    /**
     * <strong>example:</strong>
     * <p>bailian</p>
     */
    @NameInMap("model_code")
    @Validation(required = true)
    public String modelCode;

    // 模型配置id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    // 大模型对话自定义配置信息
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("config")
    public String config;

    public static AvatarLlmChatInfo build(java.util.Map<String, ?> map) throws Exception {
        AvatarLlmChatInfo self = new AvatarLlmChatInfo();
        return TeaModel.build(map, self);
    }

    public AvatarLlmChatInfo setLlmChatCode(String llmChatCode) {
        this.llmChatCode = llmChatCode;
        return this;
    }
    public String getLlmChatCode() {
        return this.llmChatCode;
    }

    public AvatarLlmChatInfo setLlmChatName(String llmChatName) {
        this.llmChatName = llmChatName;
        return this;
    }
    public String getLlmChatName() {
        return this.llmChatName;
    }

    public AvatarLlmChatInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AvatarLlmChatInfo setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public AvatarLlmChatInfo setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public AvatarLlmChatInfo setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public AvatarLlmChatInfo setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

}
