// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class SidecarOpsMachine extends TeaModel {
    // 机器运维流程ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 运维机器名称
    @NameInMap("target")
    @Validation(required = true)
    public String target;

    // 执行状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 执行状态描述
    @NameInMap("status_desc")
    public String statusDesc;

    // 扩展属性
    @NameInMap("properties")
    public String properties;

    // 执行消息日志
    @NameInMap("message")
    public String message;

    // 机器sidecar运维任务列表
    @NameInMap("sub_targets")
    @Validation(required = true)
    public java.util.List<SidecarOpsMachineTask> subTargets;

    public static SidecarOpsMachine build(java.util.Map<String, ?> map) throws Exception {
        SidecarOpsMachine self = new SidecarOpsMachine();
        return TeaModel.build(map, self);
    }

    public SidecarOpsMachine setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SidecarOpsMachine setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public SidecarOpsMachine setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SidecarOpsMachine setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
        return this;
    }
    public String getStatusDesc() {
        return this.statusDesc;
    }

    public SidecarOpsMachine setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public SidecarOpsMachine setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SidecarOpsMachine setSubTargets(java.util.List<SidecarOpsMachineTask> subTargets) {
        this.subTargets = subTargets;
        return this;
    }
    public java.util.List<SidecarOpsMachineTask> getSubTargets() {
        return this.subTargets;
    }

}
