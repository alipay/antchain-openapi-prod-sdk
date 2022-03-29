// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class Site extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // display_name
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // local
    @NameInMap("local")
    @Validation(required = true)
    public String local;

    // domain
    @NameInMap("domain")
    @Validation(required = true)
    public String domain;

    // token
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    // config
    @NameInMap("config")
    @Validation(required = true)
    public String config;

    // url_preffix
    @NameInMap("url_preffix")
    @Validation(required = true)
    public String urlPreffix;

    // readonly
    @NameInMap("readonly")
    @Validation(required = true)
    public String readonly;

    public static Site build(java.util.Map<String, ?> map) throws Exception {
        Site self = new Site();
        return TeaModel.build(map, self);
    }

    public Site setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Site setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Site setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public Site setLocal(String local) {
        this.local = local;
        return this;
    }
    public String getLocal() {
        return this.local;
    }

    public Site setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public Site setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public Site setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public Site setUrlPreffix(String urlPreffix) {
        this.urlPreffix = urlPreffix;
        return this;
    }
    public String getUrlPreffix() {
        return this.urlPreffix;
    }

    public Site setReadonly(String readonly) {
        this.readonly = readonly;
        return this;
    }
    public String getReadonly() {
        return this.readonly;
    }

}
