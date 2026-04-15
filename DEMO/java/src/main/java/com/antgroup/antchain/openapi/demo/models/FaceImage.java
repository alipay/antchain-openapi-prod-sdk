// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class FaceImage extends TeaModel {
    // 123
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("content")
    public String content;

    // 213
    /**
     * <strong>example:</strong>
     * <p>13</p>
     */
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
