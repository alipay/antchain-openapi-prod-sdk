// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CreateSofamqWarnRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 报警时间范围
    @NameInMap("alert_time")
    @Validation(required = true)
    public String alertTime;

    // 报警通知人信息
    @NameInMap("contacts")
    @Validation(required = true)
    public String contacts;

    // 延迟多少秒报报警
    @NameInMap("delay_time")
    @Validation(required = true)
    public Long delayTime;

    // 报警频率
    @NameInMap("frequency")
    @Validation(required = true)
    public Long frequency;

    // 查询指定 Group 时设置
    @NameInMap("group_id")
    public String groupId;

    // 实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 堆积阈值
    @NameInMap("threshold")
    @Validation(required = true)
    public Long threshold;

    // 查询指定 Topic 时设置
    @NameInMap("topic")
    public String topic;

    public static CreateSofamqWarnRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSofamqWarnRequest self = new CreateSofamqWarnRequest();
        return TeaModel.build(map, self);
    }

    public CreateSofamqWarnRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSofamqWarnRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSofamqWarnRequest setAlertTime(String alertTime) {
        this.alertTime = alertTime;
        return this;
    }
    public String getAlertTime() {
        return this.alertTime;
    }

    public CreateSofamqWarnRequest setContacts(String contacts) {
        this.contacts = contacts;
        return this;
    }
    public String getContacts() {
        return this.contacts;
    }

    public CreateSofamqWarnRequest setDelayTime(Long delayTime) {
        this.delayTime = delayTime;
        return this;
    }
    public Long getDelayTime() {
        return this.delayTime;
    }

    public CreateSofamqWarnRequest setFrequency(Long frequency) {
        this.frequency = frequency;
        return this;
    }
    public Long getFrequency() {
        return this.frequency;
    }

    public CreateSofamqWarnRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateSofamqWarnRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSofamqWarnRequest setThreshold(Long threshold) {
        this.threshold = threshold;
        return this;
    }
    public Long getThreshold() {
        return this.threshold;
    }

    public CreateSofamqWarnRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
