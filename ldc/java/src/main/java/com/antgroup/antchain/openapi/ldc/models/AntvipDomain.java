// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class AntvipDomain extends TeaModel {
    // 应用名称
    @NameInMap("application")
    @Validation(required = true)
    public String application;

    // 部署单元cell名称
    @NameInMap("cell")
    @Validation(required = true)
    public String cell;

    // 健康检查端口，非必填项
    @NameInMap("health_check_default_port")
    public Long healthCheckDefaultPort;

    // 健康检查类型，默认为TCP
    @NameInMap("health_check_type")
    public String healthCheckType;

    public static AntvipDomain build(java.util.Map<String, ?> map) throws Exception {
        AntvipDomain self = new AntvipDomain();
        return TeaModel.build(map, self);
    }

    public AntvipDomain setApplication(String application) {
        this.application = application;
        return this;
    }
    public String getApplication() {
        return this.application;
    }

    public AntvipDomain setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public AntvipDomain setHealthCheckDefaultPort(Long healthCheckDefaultPort) {
        this.healthCheckDefaultPort = healthCheckDefaultPort;
        return this;
    }
    public Long getHealthCheckDefaultPort() {
        return this.healthCheckDefaultPort;
    }

    public AntvipDomain setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }
    public String getHealthCheckType() {
        return this.healthCheckType;
    }

}
