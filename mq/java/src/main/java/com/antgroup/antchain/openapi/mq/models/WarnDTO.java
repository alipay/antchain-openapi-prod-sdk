// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class WarnDTO extends TeaModel {
    // 报警时间段
    @NameInMap("alert_time")
    @Validation(required = true)
    public String alertTime;

    // 属性字符串
    @NameInMap("attribute")
    @Validation(required = true)
    public String attribute;

    // 消息阻塞时间
    @NameInMap("block_time")
    @Validation(required = true)
    public Long blockTime;

    // 联系人列表
    @NameInMap("contacts")
    @Validation(required = true)
    public String contacts;

    // 延迟时间
    @NameInMap("delay_time")
    @Validation(required = true)
    public Long delayTime;

    // 报警频率，单位分钟
    @NameInMap("frequency")
    @Validation(required = true)
    public Long frequency;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public Long gmtModified;

    // 消费组 ID
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 报警 ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 操作者
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 阈值
    @NameInMap("threshold")
    @Validation(required = true)
    public Long threshold;

    // 报警的 Topic
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // 报警级别
    @NameInMap("warn_level")
    @Validation(required = true)
    public Long warnLevel;

    // 报警状态
    @NameInMap("warn_status")
    @Validation(required = true)
    public Long warnStatus;

    // 报警类型
    @NameInMap("warn_type")
    @Validation(required = true)
    public Long warnType;

    public static WarnDTO build(java.util.Map<String, ?> map) throws Exception {
        WarnDTO self = new WarnDTO();
        return TeaModel.build(map, self);
    }

    public WarnDTO setAlertTime(String alertTime) {
        this.alertTime = alertTime;
        return this;
    }
    public String getAlertTime() {
        return this.alertTime;
    }

    public WarnDTO setAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }
    public String getAttribute() {
        return this.attribute;
    }

    public WarnDTO setBlockTime(Long blockTime) {
        this.blockTime = blockTime;
        return this;
    }
    public Long getBlockTime() {
        return this.blockTime;
    }

    public WarnDTO setContacts(String contacts) {
        this.contacts = contacts;
        return this;
    }
    public String getContacts() {
        return this.contacts;
    }

    public WarnDTO setDelayTime(Long delayTime) {
        this.delayTime = delayTime;
        return this;
    }
    public Long getDelayTime() {
        return this.delayTime;
    }

    public WarnDTO setFrequency(Long frequency) {
        this.frequency = frequency;
        return this;
    }
    public Long getFrequency() {
        return this.frequency;
    }

    public WarnDTO setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public WarnDTO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public WarnDTO setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public WarnDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public WarnDTO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public WarnDTO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public WarnDTO setThreshold(Long threshold) {
        this.threshold = threshold;
        return this;
    }
    public Long getThreshold() {
        return this.threshold;
    }

    public WarnDTO setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public WarnDTO setWarnLevel(Long warnLevel) {
        this.warnLevel = warnLevel;
        return this;
    }
    public Long getWarnLevel() {
        return this.warnLevel;
    }

    public WarnDTO setWarnStatus(Long warnStatus) {
        this.warnStatus = warnStatus;
        return this;
    }
    public Long getWarnStatus() {
        return this.warnStatus;
    }

    public WarnDTO setWarnType(Long warnType) {
        this.warnType = warnType;
        return this;
    }
    public Long getWarnType() {
        return this.warnType;
    }

}
