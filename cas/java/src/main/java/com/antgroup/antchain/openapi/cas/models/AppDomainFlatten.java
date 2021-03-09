// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppDomainFlatten extends TeaModel {
    // 一组具有依赖关系的 AppDomain
    @NameInMap("app_domains")
    public java.util.List<AppDomain> appDomains;

    public static AppDomainFlatten build(java.util.Map<String, ?> map) throws Exception {
        AppDomainFlatten self = new AppDomainFlatten();
        return TeaModel.build(map, self);
    }

    public AppDomainFlatten setAppDomains(java.util.List<AppDomain> appDomains) {
        this.appDomains = appDomains;
        return this;
    }
    public java.util.List<AppDomain> getAppDomains() {
        return this.appDomains;
    }

}
