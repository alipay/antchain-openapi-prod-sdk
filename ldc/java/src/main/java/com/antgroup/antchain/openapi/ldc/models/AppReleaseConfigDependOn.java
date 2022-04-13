// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class AppReleaseConfigDependOn extends TeaModel {
    // 类型
    @NameInMap("kind")
    @Validation(required = true)
    public String kind;

    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static AppReleaseConfigDependOn build(java.util.Map<String, ?> map) throws Exception {
        AppReleaseConfigDependOn self = new AppReleaseConfigDependOn();
        return TeaModel.build(map, self);
    }

    public AppReleaseConfigDependOn setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public AppReleaseConfigDependOn setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
