// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class Reason extends TeaModel {
    // content
    @NameInMap("content")
    public String content;

    // visible
    @NameInMap("visible")
    public Boolean visible;

    // code
    @NameInMap("code")
    public String code;

    // placeholder
    @NameInMap("placeholder")
    public String placeholder;

    // params
    @NameInMap("params")
    public java.util.List<String> params;

    public static Reason build(java.util.Map<String, ?> map) throws Exception {
        Reason self = new Reason();
        return TeaModel.build(map, self);
    }

    public Reason setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public Reason setVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }
    public Boolean getVisible() {
        return this.visible;
    }

    public Reason setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Reason setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        return this;
    }
    public String getPlaceholder() {
        return this.placeholder;
    }

    public Reason setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

}
