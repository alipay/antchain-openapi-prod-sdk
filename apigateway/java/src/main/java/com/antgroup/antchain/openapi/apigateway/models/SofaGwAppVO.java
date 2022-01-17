// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class SofaGwAppVO extends TeaModel {
    // 应用认证信息
    @NameInMap("authentications")
    public java.util.List<SofaGwAuthenticationVO> authentications;

    // 应用描述信息
    @NameInMap("description")
    public String description;

    // 实例标识
    @NameInMap("id")
    public Long id;

    // 实例标识
    @NameInMap("instance_id")
    public String instanceId;

    // 名称
    @NameInMap("name")
    public String name;

    // services
    @NameInMap("services")
    public java.util.List<String> services;

    // api分组(服务提供方)用 PUBLISHER，应用(服务使用方)用 SUBSCRIBER
    @NameInMap("type")
    public String type;

    public static SofaGwAppVO build(java.util.Map<String, ?> map) throws Exception {
        SofaGwAppVO self = new SofaGwAppVO();
        return TeaModel.build(map, self);
    }

    public SofaGwAppVO setAuthentications(java.util.List<SofaGwAuthenticationVO> authentications) {
        this.authentications = authentications;
        return this;
    }
    public java.util.List<SofaGwAuthenticationVO> getAuthentications() {
        return this.authentications;
    }

    public SofaGwAppVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SofaGwAppVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SofaGwAppVO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SofaGwAppVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SofaGwAppVO setServices(java.util.List<String> services) {
        this.services = services;
        return this;
    }
    public java.util.List<String> getServices() {
        return this.services;
    }

    public SofaGwAppVO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
