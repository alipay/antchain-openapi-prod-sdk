// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CloudPlatform extends TeaModel {
    // host
    @NameInMap("host")
    public String host;

    // login_name
    @NameInMap("login_name")
    public String loginName;

    // name
    @NameInMap("name")
    public String name;

    // password
    @NameInMap("password")
    public String password;

    public static CloudPlatform build(java.util.Map<String, ?> map) throws Exception {
        CloudPlatform self = new CloudPlatform();
        return TeaModel.build(map, self);
    }

    public CloudPlatform setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public CloudPlatform setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public CloudPlatform setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CloudPlatform setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
