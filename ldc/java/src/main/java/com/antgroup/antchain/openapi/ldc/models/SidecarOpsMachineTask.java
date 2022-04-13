// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class SidecarOpsMachineTask extends TeaModel {
    // 分组ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 执行状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 扩展属性 - JSON string
    @NameInMap("properties")
    public String properties;

    // 执行信息
    @NameInMap("message")
    public String message;

    // 任务名称
    @NameInMap("target")
    public String target;

    // 开始时间
    @NameInMap("start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 结束时间
    @NameInMap("end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // 任务描述
    @NameInMap("target_desc")
    public String targetDesc;

    // 状态描述
    @NameInMap("status_desc")
    public String statusDesc;

    public static SidecarOpsMachineTask build(java.util.Map<String, ?> map) throws Exception {
        SidecarOpsMachineTask self = new SidecarOpsMachineTask();
        return TeaModel.build(map, self);
    }

    public SidecarOpsMachineTask setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SidecarOpsMachineTask setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SidecarOpsMachineTask setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public SidecarOpsMachineTask setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SidecarOpsMachineTask setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public SidecarOpsMachineTask setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public SidecarOpsMachineTask setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public SidecarOpsMachineTask setTargetDesc(String targetDesc) {
        this.targetDesc = targetDesc;
        return this;
    }
    public String getTargetDesc() {
        return this.targetDesc;
    }

    public SidecarOpsMachineTask setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
        return this;
    }
    public String getStatusDesc() {
        return this.statusDesc;
    }

}
