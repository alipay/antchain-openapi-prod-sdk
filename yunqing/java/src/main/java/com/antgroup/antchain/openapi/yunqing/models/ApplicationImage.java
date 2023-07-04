// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ApplicationImage extends TeaModel {
    // 架构:amd64，arm64
    @NameInMap("arch")
    @Validation(required = true)
    public String arch;

    // 镜像名称
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    public static ApplicationImage build(java.util.Map<String, ?> map) throws Exception {
        ApplicationImage self = new ApplicationImage();
        return TeaModel.build(map, self);
    }

    public ApplicationImage setArch(String arch) {
        this.arch = arch;
        return this;
    }
    public String getArch() {
        return this.arch;
    }

    public ApplicationImage setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

}
