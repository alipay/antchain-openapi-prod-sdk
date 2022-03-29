// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ComponentContent extends TeaModel {
    // 文本内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 超链接
    @NameInMap("url")
    public String url;

    // 是否粗体
    @NameInMap("bold")
    @Validation(required = true)
    public Boolean bold;

    public static ComponentContent build(java.util.Map<String, ?> map) throws Exception {
        ComponentContent self = new ComponentContent();
        return TeaModel.build(map, self);
    }

    public ComponentContent setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ComponentContent setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public ComponentContent setBold(Boolean bold) {
        this.bold = bold;
        return this;
    }
    public Boolean getBold() {
        return this.bold;
    }

}
