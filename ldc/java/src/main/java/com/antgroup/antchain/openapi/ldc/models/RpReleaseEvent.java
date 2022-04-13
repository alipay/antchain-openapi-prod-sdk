// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class RpReleaseEvent extends TeaModel {
    // 集群名
    @NameInMap("cluster")
    @Validation(required = true)
    public String cluster;

    // 结束时间
    @NameInMap("end_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // 事件关联的对象类型
    // 
    @NameInMap("inv_obj_kind")
    @Validation(required = true)
    public String invObjKind;

    // 事件关联对象名字
    // 
    @NameInMap("inv_obj_name")
    @Validation(required = true)
    public String invObjName;

    // 事件关联对象的namespace
    // 
    @NameInMap("inv_obj_namespace")
    @Validation(required = true)
    public String invObjNamespace;

    // 事件关联对象版本
    // 
    @NameInMap("inv_obj_version")
    @Validation(required = true)
    public String invObjVersion;

    // 事件详情
    // 
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    // 事件原因
    // 
    @NameInMap("reason")
    @Validation(required = true)
    public String reason;

    // 事件来源组件
    // 
    @NameInMap("source_comp")
    @Validation(required = true)
    public String sourceComp;

    // start_time
    @NameInMap("start_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    public static RpReleaseEvent build(java.util.Map<String, ?> map) throws Exception {
        RpReleaseEvent self = new RpReleaseEvent();
        return TeaModel.build(map, self);
    }

    public RpReleaseEvent setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public RpReleaseEvent setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public RpReleaseEvent setInvObjKind(String invObjKind) {
        this.invObjKind = invObjKind;
        return this;
    }
    public String getInvObjKind() {
        return this.invObjKind;
    }

    public RpReleaseEvent setInvObjName(String invObjName) {
        this.invObjName = invObjName;
        return this;
    }
    public String getInvObjName() {
        return this.invObjName;
    }

    public RpReleaseEvent setInvObjNamespace(String invObjNamespace) {
        this.invObjNamespace = invObjNamespace;
        return this;
    }
    public String getInvObjNamespace() {
        return this.invObjNamespace;
    }

    public RpReleaseEvent setInvObjVersion(String invObjVersion) {
        this.invObjVersion = invObjVersion;
        return this;
    }
    public String getInvObjVersion() {
        return this.invObjVersion;
    }

    public RpReleaseEvent setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RpReleaseEvent setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public RpReleaseEvent setSourceComp(String sourceComp) {
        this.sourceComp = sourceComp;
        return this;
    }
    public String getSourceComp() {
        return this.sourceComp;
    }

    public RpReleaseEvent setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
