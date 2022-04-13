// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ReleaseVersion extends TeaModel {
    // 镜像
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    public static ReleaseVersion build(java.util.Map<String, ?> map) throws Exception {
        ReleaseVersion self = new ReleaseVersion();
        return TeaModel.build(map, self);
    }

    public ReleaseVersion setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

}
