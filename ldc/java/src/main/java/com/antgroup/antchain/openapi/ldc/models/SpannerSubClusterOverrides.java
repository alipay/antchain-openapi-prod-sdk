// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class SpannerSubClusterOverrides extends TeaModel {
    // 机房/可用区
    @NameInMap("zone")
    @Validation(required = true)
    public String zone;

    // spanner镜像地址
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    public static SpannerSubClusterOverrides build(java.util.Map<String, ?> map) throws Exception {
        SpannerSubClusterOverrides self = new SpannerSubClusterOverrides();
        return TeaModel.build(map, self);
    }

    public SpannerSubClusterOverrides setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

    public SpannerSubClusterOverrides setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

}
