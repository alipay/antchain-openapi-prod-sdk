// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class Application extends TeaModel {
    // 应用部署时指定的自定义参数
    @NameInMap("custom_params")
    public java.util.List<OpsParam> customParams;

    // 应用部署时依赖的应用名称，只允许取此次调用参数中列出的应用。不允许形成循环依赖。
    @NameInMap("depends")
    public java.util.List<String> depends;

    // 应用名称
    @NameInMap("name")
    public String name;

    // 指定应用下的应用服务实例
    @NameInMap("services")
    public java.util.List<AppService> services;

    // 应用包版本
    @NameInMap("version")
    public String version;

    public static Application build(java.util.Map<String, ?> map) throws Exception {
        Application self = new Application();
        return TeaModel.build(map, self);
    }

    public Application setCustomParams(java.util.List<OpsParam> customParams) {
        this.customParams = customParams;
        return this;
    }
    public java.util.List<OpsParam> getCustomParams() {
        return this.customParams;
    }

    public Application setDepends(java.util.List<String> depends) {
        this.depends = depends;
        return this;
    }
    public java.util.List<String> getDepends() {
        return this.depends;
    }

    public Application setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Application setServices(java.util.List<AppService> services) {
        this.services = services;
        return this;
    }
    public java.util.List<AppService> getServices() {
        return this.services;
    }

    public Application setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
