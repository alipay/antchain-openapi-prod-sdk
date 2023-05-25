// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class AntScanImage extends TeaModel {
    // 镜像名称
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    // app名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    public static AntScanImage build(java.util.Map<String, ?> map) throws Exception {
        AntScanImage self = new AntScanImage();
        return TeaModel.build(map, self);
    }

    public AntScanImage setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public AntScanImage setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
