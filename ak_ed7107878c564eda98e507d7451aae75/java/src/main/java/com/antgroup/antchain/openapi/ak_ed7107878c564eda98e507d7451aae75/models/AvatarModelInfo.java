// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class AvatarModelInfo extends TeaModel {
    // 数字人形象id
    /**
     * <strong>example:</strong>
     * <p>1886</p>
     */
    @NameInMap("model_id")
    @Validation(required = true)
    public Long modelId;

    // 数字人形象名
    /**
     * <strong>example:</strong>
     * <p>小忆</p>
     */
    @NameInMap("model_name")
    @Validation(required = true)
    public String modelName;

    // 数字人形象默认音色列表
    /**
     * <strong>example:</strong>
     * <p>[&quot;269&quot;]</p>
     */
    @NameInMap("voice_list")
    @Validation(required = true)
    public java.util.List<String> voiceList;

    // 数字人形象预览图
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.123.com">www.123.com</a></p>
     */
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    public static AvatarModelInfo build(java.util.Map<String, ?> map) throws Exception {
        AvatarModelInfo self = new AvatarModelInfo();
        return TeaModel.build(map, self);
    }

    public AvatarModelInfo setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public AvatarModelInfo setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public AvatarModelInfo setVoiceList(java.util.List<String> voiceList) {
        this.voiceList = voiceList;
        return this;
    }
    public java.util.List<String> getVoiceList() {
        return this.voiceList;
    }

    public AvatarModelInfo setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

}
