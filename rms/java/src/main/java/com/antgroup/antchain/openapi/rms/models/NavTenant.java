// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class NavTenant extends TeaModel {
    // tenant
    @NameInMap("tenant")
    @Validation(required = true)
    public Tenant tenant;

    // view_power
    @NameInMap("view_power")
    @Validation(required = true)
    public Boolean viewPower;

    // nav_workspaces
    @NameInMap("nav_workspaces")
    @Validation(required = true)
    public java.util.List<NavWorkspace> navWorkspaces;

    // nav_biz_domains
    @NameInMap("nav_biz_domains")
    @Validation(required = true)
    public java.util.List<NavBizDomain> navBizDomains;

    public static NavTenant build(java.util.Map<String, ?> map) throws Exception {
        NavTenant self = new NavTenant();
        return TeaModel.build(map, self);
    }

    public NavTenant setTenant(Tenant tenant) {
        this.tenant = tenant;
        return this;
    }
    public Tenant getTenant() {
        return this.tenant;
    }

    public NavTenant setViewPower(Boolean viewPower) {
        this.viewPower = viewPower;
        return this;
    }
    public Boolean getViewPower() {
        return this.viewPower;
    }

    public NavTenant setNavWorkspaces(java.util.List<NavWorkspace> navWorkspaces) {
        this.navWorkspaces = navWorkspaces;
        return this;
    }
    public java.util.List<NavWorkspace> getNavWorkspaces() {
        return this.navWorkspaces;
    }

    public NavTenant setNavBizDomains(java.util.List<NavBizDomain> navBizDomains) {
        this.navBizDomains = navBizDomains;
        return this;
    }
    public java.util.List<NavBizDomain> getNavBizDomains() {
        return this.navBizDomains;
    }

}
