// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class CaptionsInfo extends TeaModel {
    // 字幕画面位置x坐标，距左侧
    @NameInMap("x")
    @Validation(required = true)
    public Long x;

    // 字幕画面位置y坐标，距上侧
    @NameInMap("y")
    @Validation(required = true)
    public Long y;

    // 字幕框宽度
    @NameInMap("w")
    @Validation(required = true)
    public Long w;

    // 字幕框高度
    @NameInMap("h")
    @Validation(required = true)
    public Long h;

    // 字幕id
    @NameInMap("id")
    public String id;

    // 字幕句子时间节点信息
    @NameInMap("sentences")
    @Validation(required = true)
    public java.util.List<Sentence> sentences;

    // 是否自定义字幕样式，默认为false
    @NameInMap("custom_captions")
    public Boolean customCaptions;

    // 字幕自定义样式
    @NameInMap("captions_style")
    @Validation(required = true)
    public CaptionsStyle captionsStyle;

    public static CaptionsInfo build(java.util.Map<String, ?> map) throws Exception {
        CaptionsInfo self = new CaptionsInfo();
        return TeaModel.build(map, self);
    }

    public CaptionsInfo setX(Long x) {
        this.x = x;
        return this;
    }
    public Long getX() {
        return this.x;
    }

    public CaptionsInfo setY(Long y) {
        this.y = y;
        return this;
    }
    public Long getY() {
        return this.y;
    }

    public CaptionsInfo setW(Long w) {
        this.w = w;
        return this;
    }
    public Long getW() {
        return this.w;
    }

    public CaptionsInfo setH(Long h) {
        this.h = h;
        return this;
    }
    public Long getH() {
        return this.h;
    }

    public CaptionsInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CaptionsInfo setSentences(java.util.List<Sentence> sentences) {
        this.sentences = sentences;
        return this;
    }
    public java.util.List<Sentence> getSentences() {
        return this.sentences;
    }

    public CaptionsInfo setCustomCaptions(Boolean customCaptions) {
        this.customCaptions = customCaptions;
        return this;
    }
    public Boolean getCustomCaptions() {
        return this.customCaptions;
    }

    public CaptionsInfo setCaptionsStyle(CaptionsStyle captionsStyle) {
        this.captionsStyle = captionsStyle;
        return this;
    }
    public CaptionsStyle getCaptionsStyle() {
        return this.captionsStyle;
    }

}
