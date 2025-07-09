// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class AvatarLlmModelInfo extends TeaModel {
    // 模型id
    /**
     * <strong>example:</strong>
     * <p>8810606430954027635</p>
     */
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    // 模型名称
    /**
     * <strong>example:</strong>
     * <p>百炼</p>
     */
    @NameInMap("model_name")
    @Validation(required = true)
    public String modelName;

    // 模型编码
    /**
     * <strong>example:</strong>
     * <p>bailian</p>
     */
    @NameInMap("model_code")
    @Validation(required = true)
    public String modelCode;

    // 模型描述
    /**
     * <strong>example:</strong>
     * <p>描述</p>
     */
    @NameInMap("description")
    public String description;

    // 模型图片url
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.123.com">www.123.com</a></p>
     */
    @NameInMap("image_url")
    public String imageUrl;

    public static AvatarLlmModelInfo build(java.util.Map<String, ?> map) throws Exception {
        AvatarLlmModelInfo self = new AvatarLlmModelInfo();
        return TeaModel.build(map, self);
    }

    public AvatarLlmModelInfo setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public AvatarLlmModelInfo setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public AvatarLlmModelInfo setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public AvatarLlmModelInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AvatarLlmModelInfo setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
