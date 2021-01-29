// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AppServiceCount extends TeaModel {
    // 经典容器服务数量
    @NameInMap("classic_count")
    @Validation(required = true)
    public Long classicCount;

    // 容器应用服务数量
    @NameInMap("container_count")
    @Validation(required = true)
    public Long containerCount;

    // 无服务器应用服务数
    @NameInMap("serverless_count")
    @Validation(required = true)
    public Long serverlessCount;

    public static AppServiceCount build(java.util.Map<String, ?> map) throws Exception {
        AppServiceCount self = new AppServiceCount();
        return TeaModel.build(map, self);
    }

    public AppServiceCount setClassicCount(Long classicCount) {
        this.classicCount = classicCount;
        return this;
    }
    public Long getClassicCount() {
        return this.classicCount;
    }

    public AppServiceCount setContainerCount(Long containerCount) {
        this.containerCount = containerCount;
        return this;
    }
    public Long getContainerCount() {
        return this.containerCount;
    }

    public AppServiceCount setServerlessCount(Long serverlessCount) {
        this.serverlessCount = serverlessCount;
        return this;
    }
    public Long getServerlessCount() {
        return this.serverlessCount;
    }

}
