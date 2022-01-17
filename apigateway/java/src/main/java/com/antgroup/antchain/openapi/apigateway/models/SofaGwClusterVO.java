// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class SofaGwClusterVO extends TeaModel {
    // app name
    @NameInMap("app_name")
    public String appName;

    // hosts
    @NameInMap("hosts")
    public java.util.List<SofaGwHostVO> hosts;

    // id
    @NameInMap("id")
    public Long id;

    // 实例标识
    @NameInMap("instance_id")
    public String instanceId;

    // 集群名
    @NameInMap("name")
    public String name;

    public static SofaGwClusterVO build(java.util.Map<String, ?> map) throws Exception {
        SofaGwClusterVO self = new SofaGwClusterVO();
        return TeaModel.build(map, self);
    }

    public SofaGwClusterVO setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SofaGwClusterVO setHosts(java.util.List<SofaGwHostVO> hosts) {
        this.hosts = hosts;
        return this;
    }
    public java.util.List<SofaGwHostVO> getHosts() {
        return this.hosts;
    }

    public SofaGwClusterVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SofaGwClusterVO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SofaGwClusterVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
