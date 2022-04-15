// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class Text extends TeaModel {
    // 内容
    @NameInMap("content")
    public String content;

    public static Text build(java.util.Map<String, ?> map) throws Exception {
        Text self = new Text();
        return TeaModel.build(map, self);
    }

    public Text setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
