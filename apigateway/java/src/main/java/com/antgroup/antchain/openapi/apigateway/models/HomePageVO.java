// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class HomePageVO extends TeaModel {
    // api分组数量
    @NameInMap("api_group_count")
    public Long apiGroupCount;

    // api数量
    @NameInMap("api_count")
    public Long apiCount;

    // app数量
    @NameInMap("app_count")
    public Long appCount;

    public static HomePageVO build(java.util.Map<String, ?> map) throws Exception {
        HomePageVO self = new HomePageVO();
        return TeaModel.build(map, self);
    }

    public HomePageVO setApiGroupCount(Long apiGroupCount) {
        this.apiGroupCount = apiGroupCount;
        return this;
    }
    public Long getApiGroupCount() {
        return this.apiGroupCount;
    }

    public HomePageVO setApiCount(Long apiCount) {
        this.apiCount = apiCount;
        return this;
    }
    public Long getApiCount() {
        return this.apiCount;
    }

    public HomePageVO setAppCount(Long appCount) {
        this.appCount = appCount;
        return this;
    }
    public Long getAppCount() {
        return this.appCount;
    }

}
