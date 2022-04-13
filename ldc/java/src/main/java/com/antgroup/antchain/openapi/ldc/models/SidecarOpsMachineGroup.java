// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class SidecarOpsMachineGroup extends TeaModel {
    // 分组ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 分组名称
    @NameInMap("target")
    public String target;

    // 状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 扩展属性
    @NameInMap("properties")
    public String properties;

    // 执行日志
    @NameInMap("messages")
    public String messages;

    // sidecar 运维机器列表
    @NameInMap("sub_targets")
    @Validation(required = true)
    public java.util.List<SidecarOpsMachine> subTargets;

    public static SidecarOpsMachineGroup build(java.util.Map<String, ?> map) throws Exception {
        SidecarOpsMachineGroup self = new SidecarOpsMachineGroup();
        return TeaModel.build(map, self);
    }

    public SidecarOpsMachineGroup setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SidecarOpsMachineGroup setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public SidecarOpsMachineGroup setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SidecarOpsMachineGroup setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public SidecarOpsMachineGroup setMessages(String messages) {
        this.messages = messages;
        return this;
    }
    public String getMessages() {
        return this.messages;
    }

    public SidecarOpsMachineGroup setSubTargets(java.util.List<SidecarOpsMachine> subTargets) {
        this.subTargets = subTargets;
        return this;
    }
    public java.util.List<SidecarOpsMachine> getSubTargets() {
        return this.subTargets;
    }

}
