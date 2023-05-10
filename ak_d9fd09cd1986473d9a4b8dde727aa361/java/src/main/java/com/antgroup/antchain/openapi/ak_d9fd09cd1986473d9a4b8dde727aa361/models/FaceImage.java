// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d9fd09cd1986473d9a4b8dde727aa361.models;

import com.aliyun.tea.*;

public class FaceImage extends TeaModel {
    // 123
    @NameInMap("content")
    public String content;

    // 123
    @NameInMap("rect")
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
