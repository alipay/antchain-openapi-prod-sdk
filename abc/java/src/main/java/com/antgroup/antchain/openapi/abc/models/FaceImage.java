// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.abc.models;

import com.aliyun.tea.*;

public class FaceImage extends TeaModel {
    // 1123
    @NameInMap("content")
    public String content;

    // 123
    @NameInMap("rect")
    @Validation(required = true)
    public String rect;

    public static FaceImage build(java.util.Map<String, ?> map) throws Exception {
        FaceImage self = new FaceImage();
        return TeaModel.build(map, self);
    }

    public FaceImage setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public FaceImage setRect(String rect) {
        this.rect = rect;
        return this;
    }
    public String getRect() {
        return this.rect;
    }

}
