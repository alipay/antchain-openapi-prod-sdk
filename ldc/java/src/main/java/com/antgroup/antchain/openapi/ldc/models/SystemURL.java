// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class SystemURL extends TeaModel {
    // 平台名称
    @NameInMap("platform_name")
    @Validation(required = true)
    public String platformName;

    // url
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // 上线问配置
    @NameInMap("context")
    public String context;

    public static SystemURL build(java.util.Map<String, ?> map) throws Exception {
        SystemURL self = new SystemURL();
        return TeaModel.build(map, self);
    }

    public SystemURL setPlatformName(String platformName) {
        this.platformName = platformName;
        return this;
    }
    public String getPlatformName() {
        return this.platformName;
    }

    public SystemURL setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public SystemURL setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

}
