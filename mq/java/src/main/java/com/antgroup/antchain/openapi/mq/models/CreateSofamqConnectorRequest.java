// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CreateSofamqConnectorRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // cron表达式描述任务触发，如果类型是cron的话
    @NameInMap("cron")
    public String cron;

    // 数据过滤，支持SQL92过滤
    @NameInMap("filter")
    public String filter;

    // 实例编号
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 任务名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 限流值
    @NameInMap("rate")
    public Long rate;

    // 描述任务
    @NameInMap("remark")
    public String remark;

    // 去向信息的配置, kv结构的数组 的 JSON String
    @NameInMap("sink_configs")
    @Validation(required = true)
    public String sinkConfigs;

    // 去向类型
    @NameInMap("sink_type")
    @Validation(required = true)
    public String sinkType;

    // 来源的配置项列表， kv结构数组 的 JSON String
    @NameInMap("source_configs")
    @Validation(required = true)
    public String sourceConfigs;

    // 来源类型
    @NameInMap("source_type")
    @Validation(required = true)
    public String sourceType;

    // 如果类型是once的话，给定一个unix时间戳
    @NameInMap("time")
    public Long time;

    // 数据转化配置。数据转化配置的数组 的JSON String
    @NameInMap("transformation")
    public String transformation;

    // 任务调度类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 任务所有者，一般是app维度
    @NameInMap("app")
    @Validation(required = true)
    public String app;

    // stepflow平台上的某个 模板编号
    @NameInMap("stepflow_template_id")
    public String stepflowTemplateId;

    // 时间订阅的配置，json格式
    @NameInMap("event_sub_configs")
    public String eventSubConfigs;

    // 事件订阅是否开启
    @NameInMap("event_sub_enabled")
    @Validation(required = true)
    public Boolean eventSubEnabled;

    // 预期完成时间(s)
    @NameInMap("acceptable_execution_interval")
    public Long acceptableExecutionInterval;

    // 是否自动回收实例
    @NameInMap("auto_recycle_instance")
    public Boolean autoRecycleInstance;

    public static CreateSofamqConnectorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSofamqConnectorRequest self = new CreateSofamqConnectorRequest();
        return TeaModel.build(map, self);
    }

    public CreateSofamqConnectorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSofamqConnectorRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSofamqConnectorRequest setCron(String cron) {
        this.cron = cron;
        return this;
    }
    public String getCron() {
        return this.cron;
    }

    public CreateSofamqConnectorRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public CreateSofamqConnectorRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSofamqConnectorRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSofamqConnectorRequest setRate(Long rate) {
        this.rate = rate;
        return this;
    }
    public Long getRate() {
        return this.rate;
    }

    public CreateSofamqConnectorRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateSofamqConnectorRequest setSinkConfigs(String sinkConfigs) {
        this.sinkConfigs = sinkConfigs;
        return this;
    }
    public String getSinkConfigs() {
        return this.sinkConfigs;
    }

    public CreateSofamqConnectorRequest setSinkType(String sinkType) {
        this.sinkType = sinkType;
        return this;
    }
    public String getSinkType() {
        return this.sinkType;
    }

    public CreateSofamqConnectorRequest setSourceConfigs(String sourceConfigs) {
        this.sourceConfigs = sourceConfigs;
        return this;
    }
    public String getSourceConfigs() {
        return this.sourceConfigs;
    }

    public CreateSofamqConnectorRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateSofamqConnectorRequest setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public CreateSofamqConnectorRequest setTransformation(String transformation) {
        this.transformation = transformation;
        return this;
    }
    public String getTransformation() {
        return this.transformation;
    }

    public CreateSofamqConnectorRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateSofamqConnectorRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public CreateSofamqConnectorRequest setStepflowTemplateId(String stepflowTemplateId) {
        this.stepflowTemplateId = stepflowTemplateId;
        return this;
    }
    public String getStepflowTemplateId() {
        return this.stepflowTemplateId;
    }

    public CreateSofamqConnectorRequest setEventSubConfigs(String eventSubConfigs) {
        this.eventSubConfigs = eventSubConfigs;
        return this;
    }
    public String getEventSubConfigs() {
        return this.eventSubConfigs;
    }

    public CreateSofamqConnectorRequest setEventSubEnabled(Boolean eventSubEnabled) {
        this.eventSubEnabled = eventSubEnabled;
        return this;
    }
    public Boolean getEventSubEnabled() {
        return this.eventSubEnabled;
    }

    public CreateSofamqConnectorRequest setAcceptableExecutionInterval(Long acceptableExecutionInterval) {
        this.acceptableExecutionInterval = acceptableExecutionInterval;
        return this;
    }
    public Long getAcceptableExecutionInterval() {
        return this.acceptableExecutionInterval;
    }

    public CreateSofamqConnectorRequest setAutoRecycleInstance(Boolean autoRecycleInstance) {
        this.autoRecycleInstance = autoRecycleInstance;
        return this;
    }
    public Boolean getAutoRecycleInstance() {
        return this.autoRecycleInstance;
    }

}
