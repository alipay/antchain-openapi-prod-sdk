// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GoodsDigitalFingerprintPoint extends TeaModel {
    // 鉴定点子项
    @NameInMap("sub_point_name")
    @Validation(required = true)
    public String subPointName;

    // 鉴定点图片url
    @NameInMap("image_url")
    @Validation(required = true)
    public String imageUrl;

    public static GoodsDigitalFingerprintPoint build(java.util.Map<String, ?> map) throws Exception {
        GoodsDigitalFingerprintPoint self = new GoodsDigitalFingerprintPoint();
        return TeaModel.build(map, self);
    }

    public GoodsDigitalFingerprintPoint setSubPointName(String subPointName) {
        this.subPointName = subPointName;
        return this;
    }
    public String getSubPointName() {
        return this.subPointName;
    }

    public GoodsDigitalFingerprintPoint setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
