// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class RegistryAccout extends TeaModel {
    // registry email url
    @NameInMap("email")
    public String email;

    // registry password
    @NameInMap("password")
    @Validation(required = true)
    public String password;

    // registry url
    @NameInMap("registry")
    @Validation(required = true)
    public String registry;

    // registry username
    @NameInMap("username")
    @Validation(required = true)
    public String username;

    public static RegistryAccout build(java.util.Map<String, ?> map) throws Exception {
        RegistryAccout self = new RegistryAccout();
        return TeaModel.build(map, self);
    }

    public RegistryAccout setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public RegistryAccout setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public RegistryAccout setRegistry(String registry) {
        this.registry = registry;
        return this;
    }
    public String getRegistry() {
        return this.registry;
    }

    public RegistryAccout setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
