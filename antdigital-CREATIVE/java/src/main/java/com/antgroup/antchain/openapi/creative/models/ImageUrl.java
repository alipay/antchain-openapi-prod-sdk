// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class ImageUrl extends TeaModel {
    // test
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("image_url")
    public ContentUrl imageUrl;

    public static ImageUrl build(java.util.Map<String, ?> map) throws Exception {
        ImageUrl self = new ImageUrl();
        return TeaModel.build(map, self);
    }

    public ImageUrl setImageUrl(ContentUrl imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public ContentUrl getImageUrl() {
        return this.imageUrl;
    }

}
