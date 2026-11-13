// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class ImageUrlsList extends TeaModel {
    // 图片 URL 列表
    @NameInMap("image_urls")
    public java.util.List<String> imageUrls;

    public static ImageUrlsList build(java.util.Map<String, ?> map) throws Exception {
        ImageUrlsList self = new ImageUrlsList();
        return TeaModel.build(map, self);
    }

    public ImageUrlsList setImageUrls(java.util.List<String> imageUrls) {
        this.imageUrls = imageUrls;
        return this;
    }
    public java.util.List<String> getImageUrls() {
        return this.imageUrls;
    }

}
