// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class TextInfoDto extends TeaModel {
    // 文本素材信息
    /**
     * <strong>example:</strong>
     * <p>文本素材信息</p>
     */
    @NameInMap("text")
    @Validation(required = true)
    public String text;

    public static TextInfoDto build(java.util.Map<String, ?> map) throws Exception {
        TextInfoDto self = new TextInfoDto();
        return TeaModel.build(map, self);
    }

    public TextInfoDto setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
