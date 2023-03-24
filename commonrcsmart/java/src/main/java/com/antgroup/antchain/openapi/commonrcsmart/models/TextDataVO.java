// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commonrcsmart.models;

import com.aliyun.tea.*;

public class TextDataVO extends TeaModel {
    // 审核文本内容
    @NameInMap("text")
    @Validation(required = true)
    public String text;

    public static TextDataVO build(java.util.Map<String, ?> map) throws Exception {
        TextDataVO self = new TextDataVO();
        return TeaModel.build(map, self);
    }

    public TextDataVO setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
