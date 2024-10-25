// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class CaptionsStyle extends TeaModel {
    // 字体类型
    @NameInMap("font_type")
    @Validation(required = true)
    public String fontType;

    // 字体大小，像素单位
    @NameInMap("font_size")
    @Validation(required = true)
    public Long fontSize;

    // 字体颜色
    @NameInMap("font_color")
    @Validation(required = true)
    public String fontColor;

    // 描边颜色
    @NameInMap("stroke_color")
    public String strokeColor;

    // 描边宽度
    @NameInMap("stroke_width")
    public Long strokeWidth;

    // 字体背景颜色
    @NameInMap("background_color")
    public String backgroundColor;

    public static CaptionsStyle build(java.util.Map<String, ?> map) throws Exception {
        CaptionsStyle self = new CaptionsStyle();
        return TeaModel.build(map, self);
    }

    public CaptionsStyle setFontType(String fontType) {
        this.fontType = fontType;
        return this;
    }
    public String getFontType() {
        return this.fontType;
    }

    public CaptionsStyle setFontSize(Long fontSize) {
        this.fontSize = fontSize;
        return this;
    }
    public Long getFontSize() {
        return this.fontSize;
    }

    public CaptionsStyle setFontColor(String fontColor) {
        this.fontColor = fontColor;
        return this;
    }
    public String getFontColor() {
        return this.fontColor;
    }

    public CaptionsStyle setStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
        return this;
    }
    public String getStrokeColor() {
        return this.strokeColor;
    }

    public CaptionsStyle setStrokeWidth(Long strokeWidth) {
        this.strokeWidth = strokeWidth;
        return this;
    }
    public Long getStrokeWidth() {
        return this.strokeWidth;
    }

    public CaptionsStyle setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

}
