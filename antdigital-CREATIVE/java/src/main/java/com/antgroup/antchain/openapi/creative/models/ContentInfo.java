// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class ContentInfo extends TeaModel {
    // 类型
    /**
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // type=text 时提供，文本
    /**
     * <strong>example:</strong>
     * <p>生成一只猫</p>
     */
    @NameInMap("text")
    public String text;

    // type=image_url 时提供
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.test.com/123">www.test.com/123</a></p>
     */
    @NameInMap("image_url")
    public ContentUrl imageUrl;

    // type=audio_url 时提供
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.test.com/123">www.test.com/123</a></p>
     */
    @NameInMap("audio_url")
    public ContentUrl audioUrl;

    // type=video_url 时提供
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.test.com/123">www.test.com/123</a></p>
     */
    @NameInMap("video_url")
    public ContentUrl videoUrl;

    // 角色
    /**
     * <strong>example:</strong>
     * <p>reference_image</p>
     */
    @NameInMap("role")
    public String role;

    public static ContentInfo build(java.util.Map<String, ?> map) throws Exception {
        ContentInfo self = new ContentInfo();
        return TeaModel.build(map, self);
    }

    public ContentInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ContentInfo setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public ContentInfo setImageUrl(ContentUrl imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public ContentUrl getImageUrl() {
        return this.imageUrl;
    }

    public ContentInfo setAudioUrl(ContentUrl audioUrl) {
        this.audioUrl = audioUrl;
        return this;
    }
    public ContentUrl getAudioUrl() {
        return this.audioUrl;
    }

    public ContentInfo setVideoUrl(ContentUrl videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public ContentUrl getVideoUrl() {
        return this.videoUrl;
    }

    public ContentInfo setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
