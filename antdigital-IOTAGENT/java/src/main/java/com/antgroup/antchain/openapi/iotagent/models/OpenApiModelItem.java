// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class OpenApiModelItem extends TeaModel {
    // 模型目录稳定键（chat model_key 提交该值）
    /**
     * <strong>example:</strong>
     * <p>dtmaas/deepseek-v4.1-flash</p>
     */
    @NameInMap("model_key")
    @Validation(required = true)
    public String modelKey;

    // 模型供应商
    /**
     * <strong>example:</strong>
     * <p>dtmaas-default</p>
     */
    @NameInMap("supplier_id")
    @Validation(required = true)
    public String supplierId;

    // 上游模型标识
    /**
     * <strong>example:</strong>
     * <p>deepseek-v4.1-flash-1017</p>
     */
    @NameInMap("upstream_model_id")
    @Validation(required = true)
    public String upstreamModelId;

    // 展示显示名
    /**
     * <strong>example:</strong>
     * <p>DeepSeek V4.1 Flash (DTMaaS)</p>
     */
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // 能力位列表（TEXT/VISION/OMNI/ASR/TTS/EMBEDDING/IMAGE_GEN/VOICE_CLONE）
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("capabilities")
    @Validation(required = true)
    public java.util.List<String> capabilities;

    // 是否该能力位的平台默认模型
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("is_default")
    @Validation(required = true)
    public Boolean isDefault;

    // 启用状态（ACTIVE）
    /**
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 思考策略（受控选项，未声明不输出）
    /**
     * <strong>example:</strong>
     * <p>OPENAI_REASONING_EFFORT</p>
     */
    @NameInMap("thinking_policy")
    public String thinkingPolicy;

    // 支持的思考等级（受控选项，未声明不输出）
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("supported_efforts")
    public java.util.List<String> supportedEfforts;

    // 默认思考等级（受控选项，未声明不输出）
    /**
     * <strong>example:</strong>
     * <p>low</p>
     */
    @NameInMap("default_effort")
    public String defaultEffort;

    // 上下文窗口 token 数
    /**
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("context_window")
    @Validation(required = true)
    public Long contextWindow;

    // 最大输出 token 数
    /**
     * <strong>example:</strong>
     * <p>16384</p>
     */
    @NameInMap("max_output_tokens")
    @Validation(required = true)
    public Long maxOutputTokens;

    public static OpenApiModelItem build(java.util.Map<String, ?> map) throws Exception {
        OpenApiModelItem self = new OpenApiModelItem();
        return TeaModel.build(map, self);
    }

    public OpenApiModelItem setModelKey(String modelKey) {
        this.modelKey = modelKey;
        return this;
    }
    public String getModelKey() {
        return this.modelKey;
    }

    public OpenApiModelItem setSupplierId(String supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public String getSupplierId() {
        return this.supplierId;
    }

    public OpenApiModelItem setUpstreamModelId(String upstreamModelId) {
        this.upstreamModelId = upstreamModelId;
        return this;
    }
    public String getUpstreamModelId() {
        return this.upstreamModelId;
    }

    public OpenApiModelItem setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public OpenApiModelItem setCapabilities(java.util.List<String> capabilities) {
        this.capabilities = capabilities;
        return this;
    }
    public java.util.List<String> getCapabilities() {
        return this.capabilities;
    }

    public OpenApiModelItem setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public OpenApiModelItem setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public OpenApiModelItem setThinkingPolicy(String thinkingPolicy) {
        this.thinkingPolicy = thinkingPolicy;
        return this;
    }
    public String getThinkingPolicy() {
        return this.thinkingPolicy;
    }

    public OpenApiModelItem setSupportedEfforts(java.util.List<String> supportedEfforts) {
        this.supportedEfforts = supportedEfforts;
        return this;
    }
    public java.util.List<String> getSupportedEfforts() {
        return this.supportedEfforts;
    }

    public OpenApiModelItem setDefaultEffort(String defaultEffort) {
        this.defaultEffort = defaultEffort;
        return this;
    }
    public String getDefaultEffort() {
        return this.defaultEffort;
    }

    public OpenApiModelItem setContextWindow(Long contextWindow) {
        this.contextWindow = contextWindow;
        return this;
    }
    public Long getContextWindow() {
        return this.contextWindow;
    }

    public OpenApiModelItem setMaxOutputTokens(Long maxOutputTokens) {
        this.maxOutputTokens = maxOutputTokens;
        return this;
    }
    public Long getMaxOutputTokens() {
        return this.maxOutputTokens;
    }

}
