// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas_security.models;

import com.aliyun.tea.*;

public class ContentProperty extends TeaModel {
    // 123
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("text")
    public String text;

    // 213
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("text_list")
    public java.util.List<String> textList;

    // 123
    @NameInMap("urls")
    public java.util.List<String> urls;

    // 123
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("pictures")
    public java.util.List<ContentAddress> pictures;

    // 123
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("videos")
    public java.util.List<ContentAddress> videos;

    // 123
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("audios")
    public java.util.List<ContentAddress> audios;

    public static ContentProperty build(java.util.Map<String, ?> map) throws Exception {
        ContentProperty self = new ContentProperty();
        return TeaModel.build(map, self);
    }

    public ContentProperty setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public ContentProperty setTextList(java.util.List<String> textList) {
        this.textList = textList;
        return this;
    }
    public java.util.List<String> getTextList() {
        return this.textList;
    }

    public ContentProperty setUrls(java.util.List<String> urls) {
        this.urls = urls;
        return this;
    }
    public java.util.List<String> getUrls() {
        return this.urls;
    }

    public ContentProperty setPictures(java.util.List<ContentAddress> pictures) {
        this.pictures = pictures;
        return this;
    }
    public java.util.List<ContentAddress> getPictures() {
        return this.pictures;
    }

    public ContentProperty setVideos(java.util.List<ContentAddress> videos) {
        this.videos = videos;
        return this;
    }
    public java.util.List<ContentAddress> getVideos() {
        return this.videos;
    }

    public ContentProperty setAudios(java.util.List<ContentAddress> audios) {
        this.audios = audios;
        return this;
    }
    public java.util.List<ContentAddress> getAudios() {
        return this.audios;
    }

}
