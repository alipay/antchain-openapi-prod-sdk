// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class NavSite extends TeaModel {
    // site
    @NameInMap("site")
    @Validation(required = true)
    public Site site;

    // nav_tenants
    @NameInMap("nav_tenants")
    @Validation(required = true)
    public java.util.List<NavTenant> navTenants;

    public static NavSite build(java.util.Map<String, ?> map) throws Exception {
        NavSite self = new NavSite();
        return TeaModel.build(map, self);
    }

    public NavSite setSite(Site site) {
        this.site = site;
        return this;
    }
    public Site getSite() {
        return this.site;
    }

    public NavSite setNavTenants(java.util.List<NavTenant> navTenants) {
        this.navTenants = navTenants;
        return this;
    }
    public java.util.List<NavTenant> getNavTenants() {
        return this.navTenants;
    }

}
