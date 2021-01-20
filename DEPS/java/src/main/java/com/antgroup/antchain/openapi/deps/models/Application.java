// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class Application extends TeaModel {
    // 应用部署时依赖的应用名称，只允许取此次调用参数中列出的应用。不允许形成循环依赖。
    @NameInMap("depends")
    public java.util.List<String> depends;

    // 执行部署操作的目标应用名称，应用名称最大60个UTF-8字符
    @NameInMap("name")
    public String name;

    // 执行部署操作的目标应用服务名称，应用服务名称最大60个UTF-8字符
    @NameInMap("service_name")
    public String serviceName;

    // 执行部署操作的目标应用版本。如果某个应用未指定版本，则使用最新版本部署。
    @NameInMap("version")
    public String version;

    // 自定义参数 jsonStr Map<String,List<String>>
    @NameInMap("custom_params_map")
    public String customParamsMap;

    public static Application build(java.util.Map<String, ?> map) throws Exception {
        Application self = new Application();
        return TeaModel.build(map, self);
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

    public Application setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public Application setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public Application setCustomParamsMap(String customParamsMap) {
        this.customParamsMap = customParamsMap;
        return this;
    }
    public String getCustomParamsMap() {
        return this.customParamsMap;
    }

}
