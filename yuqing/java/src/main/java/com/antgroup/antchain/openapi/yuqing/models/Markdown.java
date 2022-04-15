// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class Markdown extends TeaModel {
    // 标题
    @NameInMap("title")
    public String title;

    // 内容
    @NameInMap("text")
    public String text;

    public static Markdown build(java.util.Map<String, ?> map) throws Exception {
        Markdown self = new Markdown();
        return TeaModel.build(map, self);
    }

    public Markdown setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public Markdown setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
