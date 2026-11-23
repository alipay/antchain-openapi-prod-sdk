// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class MaterialTemplateData extends TeaModel {
    // prompt
    /**
     * <strong>example:</strong>
     * <p>参考 @{商品图,ref-01}，先拍全景，再切近景</p>
     */
    @NameInMap("prompt")
    @Validation(required = true)
    public String prompt;

    // 生图模型id
    /**
     * <strong>example:</strong>
     * <p>image-model-demo</p>
     */
    @NameInMap("image_model_id")
    public String imageModelId;

    // 生视频模型id
    /**
     * <strong>example:</strong>
     * <p>video-model-demo</p>
     */
    @NameInMap("video_model_id")
    public String videoModelId;

    // 参考图片列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("image_refs")
    public java.util.List<CreativeTemplateAssetRef> imageRefs;

    // 参考音频列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("voice_refs")
    public java.util.List<CreativeTemplateAssetRef> voiceRefs;

    // 参考视频列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("video_refs")
    public java.util.List<CreativeTemplateAssetRef> videoRefs;

    public static MaterialTemplateData build(java.util.Map<String, ?> map) throws Exception {
        MaterialTemplateData self = new MaterialTemplateData();
        return TeaModel.build(map, self);
    }

    public MaterialTemplateData setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public MaterialTemplateData setImageModelId(String imageModelId) {
        this.imageModelId = imageModelId;
        return this;
    }
    public String getImageModelId() {
        return this.imageModelId;
    }

    public MaterialTemplateData setVideoModelId(String videoModelId) {
        this.videoModelId = videoModelId;
        return this;
    }
    public String getVideoModelId() {
        return this.videoModelId;
    }

    public MaterialTemplateData setImageRefs(java.util.List<CreativeTemplateAssetRef> imageRefs) {
        this.imageRefs = imageRefs;
        return this;
    }
    public java.util.List<CreativeTemplateAssetRef> getImageRefs() {
        return this.imageRefs;
    }

    public MaterialTemplateData setVoiceRefs(java.util.List<CreativeTemplateAssetRef> voiceRefs) {
        this.voiceRefs = voiceRefs;
        return this;
    }
    public java.util.List<CreativeTemplateAssetRef> getVoiceRefs() {
        return this.voiceRefs;
    }

    public MaterialTemplateData setVideoRefs(java.util.List<CreativeTemplateAssetRef> videoRefs) {
        this.videoRefs = videoRefs;
        return this;
    }
    public java.util.List<CreativeTemplateAssetRef> getVideoRefs() {
        return this.videoRefs;
    }

}
