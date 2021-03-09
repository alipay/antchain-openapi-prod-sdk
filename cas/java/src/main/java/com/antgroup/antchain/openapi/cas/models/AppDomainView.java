// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppDomainView extends TeaModel {
    // ownerName
    @NameInMap("owner_name")
    public String ownerName;

    // fatherDomainName
    @NameInMap("father_domain_name")
    public String fatherDomainName;

    // 应用列表
    @NameInMap("apps")
    public java.util.List<AppView> apps;

    // AppDomainView 的父类 AppDomain
    @NameInMap("base_app_domain")
    public java.util.List<AppDomain> baseAppDomain;

    public static AppDomainView build(java.util.Map<String, ?> map) throws Exception {
        AppDomainView self = new AppDomainView();
        return TeaModel.build(map, self);
    }

    public AppDomainView setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public AppDomainView setFatherDomainName(String fatherDomainName) {
        this.fatherDomainName = fatherDomainName;
        return this;
    }
    public String getFatherDomainName() {
        return this.fatherDomainName;
    }

    public AppDomainView setApps(java.util.List<AppView> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<AppView> getApps() {
        return this.apps;
    }

    public AppDomainView setBaseAppDomain(java.util.List<AppDomain> baseAppDomain) {
        this.baseAppDomain = baseAppDomain;
        return this;
    }
    public java.util.List<AppDomain> getBaseAppDomain() {
        return this.baseAppDomain;
    }

}
