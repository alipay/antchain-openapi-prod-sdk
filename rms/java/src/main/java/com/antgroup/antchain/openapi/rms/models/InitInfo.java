// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class InitInfo extends TeaModel {
    // auth_url
    @NameInMap("auth_url")
    @Validation(required = true)
    public String authUrl;

    // user
    @NameInMap("user")
    @Validation(required = true)
    public MonitorUser user;

    // nav_head
    @NameInMap("nav_head")
    @Validation(required = true)
    public NavContent navHead;

    public static InitInfo build(java.util.Map<String, ?> map) throws Exception {
        InitInfo self = new InitInfo();
        return TeaModel.build(map, self);
    }

    public InitInfo setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
        return this;
    }
    public String getAuthUrl() {
        return this.authUrl;
    }

    public InitInfo setUser(MonitorUser user) {
        this.user = user;
        return this;
    }
    public MonitorUser getUser() {
        return this.user;
    }

    public InitInfo setNavHead(NavContent navHead) {
        this.navHead = navHead;
        return this;
    }
    public NavContent getNavHead() {
        return this.navHead;
    }

}
