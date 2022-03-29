// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class NavContent extends TeaModel {
    // hasw
    @NameInMap("hasw")
    @Validation(required = true)
    public Boolean hasw;

    // hast
    @NameInMap("hast")
    @Validation(required = true)
    public Boolean hast;

    // hasbiz
    @NameInMap("hasbiz")
    @Validation(required = true)
    public Boolean hasbiz;

    // nav_sites
    @NameInMap("nav_sites")
    @Validation(required = true)
    public java.util.List<NavSite> navSites;

    public static NavContent build(java.util.Map<String, ?> map) throws Exception {
        NavContent self = new NavContent();
        return TeaModel.build(map, self);
    }

    public NavContent setHasw(Boolean hasw) {
        this.hasw = hasw;
        return this;
    }
    public Boolean getHasw() {
        return this.hasw;
    }

    public NavContent setHast(Boolean hast) {
        this.hast = hast;
        return this;
    }
    public Boolean getHast() {
        return this.hast;
    }

    public NavContent setHasbiz(Boolean hasbiz) {
        this.hasbiz = hasbiz;
        return this;
    }
    public Boolean getHasbiz() {
        return this.hasbiz;
    }

    public NavContent setNavSites(java.util.List<NavSite> navSites) {
        this.navSites = navSites;
        return this;
    }
    public java.util.List<NavSite> getNavSites() {
        return this.navSites;
    }

}
