// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ApplicationServiceDTO extends TeaModel {
    // 应用服务id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 应用serviceid
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 应用服务名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 应用id
    @NameInMap("app_id")
    @Validation(required = true)
    public Long appId;

    // 区分客户端的serviceid和服务端的service_id
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static ApplicationServiceDTO build(java.util.Map<String, ?> map) throws Exception {
        ApplicationServiceDTO self = new ApplicationServiceDTO();
        return TeaModel.build(map, self);
    }

    public ApplicationServiceDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ApplicationServiceDTO setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ApplicationServiceDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApplicationServiceDTO setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public ApplicationServiceDTO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
