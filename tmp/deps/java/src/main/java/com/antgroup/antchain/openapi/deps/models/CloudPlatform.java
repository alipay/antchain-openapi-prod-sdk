// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CloudPlatform extends TeaModel {
    // name
    @NameInMap("name")
    public String name;

    // host
    @NameInMap("host")
    public String host;

    // loginName
    @NameInMap("login_name")
    public String loginName;

    // password
    @NameInMap("password")
    public String password;

    public static CloudPlatform build(java.util.Map<String, ?> map) throws Exception {
        CloudPlatform self = new CloudPlatform();
        return TeaModel.build(map, self);
    }

    public CloudPlatform setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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

    public CloudPlatform setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
