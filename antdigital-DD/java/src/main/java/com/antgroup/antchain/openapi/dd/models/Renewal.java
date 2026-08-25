// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class Renewal extends TeaModel {
    // 实例当前配置
    @NameInMap("components")
    public java.util.List<Component> components;

    // 续费订单截止时间
    /**
     * <strong>example:</strong>
     * <p>格式为ISO 8601格式，精确到秒，带时区信息，格式为YYYY-MM-DDThh:mm:ssZ</p>
     */
    @NameInMap("end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // 实例Id
    /**
     * <strong>example:</strong>
     * <p>A0CSCMAYIBANKPWBATNA4F</p>
     */
    @NameInMap("instance_id")
    public String instanceId;

    // 续费订单开始时间
    /**
     * <strong>example:</strong>
     * <p>格式为ISO 8601格式，精确到秒，带时区信息，格式为YYYY-MM-DDThh:mm:ssZ</p>
     */
    @NameInMap("start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    public static Renewal build(java.util.Map<String, ?> map) throws Exception {
        Renewal self = new Renewal();
        return TeaModel.build(map, self);
    }

    public Renewal setComponents(java.util.List<Component> components) {
        this.components = components;
        return this;
    }
    public java.util.List<Component> getComponents() {
        return this.components;
    }

    public Renewal setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public Renewal setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public Renewal setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
