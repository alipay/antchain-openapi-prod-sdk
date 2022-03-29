// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ConnectorJob extends TeaModel {
    // cron表达式描述任务的触发详情。
    @NameInMap("cron")
    public String cron;

    // sql过滤
    @NameInMap("filter")
    public String filter;

    // 任务名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 限流值
    @NameInMap("rate")
    public Long rate;

    // 描述这个任务的具体详情
    @NameInMap("remark")
    @Validation(maxLength = 128)
    public String remark;

    // 去向信息的配置
    @NameInMap("sink_configs")
    @Validation(required = true)
    public java.util.List<UIKeyVauleTemplate> sinkConfigs;

    // 去向类型
    @NameInMap("sink_type")
    @Validation(required = true)
    public String sinkType;

    // 数据源的配置项列表
    @NameInMap("source_configs")
    @Validation(required = true)
    public java.util.List<UIKeyVauleTemplate> sourceConfigs;

    // 来源类型
    @NameInMap("source_type")
    @Validation(required = true)
    public String sourceType;

    // 当任务类型选择为once时，会有本字段，表示具体执行的时间
    @NameInMap("time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String time;

    // 数据转化
    @NameInMap("transformation")
    public java.util.List<ColumnConfig> transformation;

    // 任务的调度类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 任务所有者
    @NameInMap("app")
    public String app;

    // stepflow平台的某个模板的编号
    @NameInMap("stepflow_template_id")
    public String stepflowTemplateId;

    // 单例模式
    @NameInMap("singleton")
    @Validation(required = true)
    public Boolean singleton;

    // 事件订阅是否开启
    @NameInMap("event_sub_enabled")
    public Boolean eventSubEnabled;

    // 事件订阅的配置集合
    @NameInMap("event_sub_configs")
    public java.util.List<EventSubConfig> eventSubConfigs;

    // 可接受延迟时间
    @NameInMap("acceptable_execution_interval")
    public Long acceptableExecutionInterval;

    // 状态
    @NameInMap("status")
    public String status;

    // 工单状态
    @NameInMap("process_status")
    public String processStatus;

    // 是否自动回收实例
    @NameInMap("auto_recycle_instance")
    @Validation(required = true)
    public Boolean autoRecycleInstance;

    public static ConnectorJob build(java.util.Map<String, ?> map) throws Exception {
        ConnectorJob self = new ConnectorJob();
        return TeaModel.build(map, self);
    }

    public ConnectorJob setCron(String cron) {
        this.cron = cron;
        return this;
    }
    public String getCron() {
        return this.cron;
    }

    public ConnectorJob setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ConnectorJob setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ConnectorJob setRate(Long rate) {
        this.rate = rate;
        return this;
    }
    public Long getRate() {
        return this.rate;
    }

    public ConnectorJob setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ConnectorJob setSinkConfigs(java.util.List<UIKeyVauleTemplate> sinkConfigs) {
        this.sinkConfigs = sinkConfigs;
        return this;
    }
    public java.util.List<UIKeyVauleTemplate> getSinkConfigs() {
        return this.sinkConfigs;
    }

    public ConnectorJob setSinkType(String sinkType) {
        this.sinkType = sinkType;
        return this;
    }
    public String getSinkType() {
        return this.sinkType;
    }

    public ConnectorJob setSourceConfigs(java.util.List<UIKeyVauleTemplate> sourceConfigs) {
        this.sourceConfigs = sourceConfigs;
        return this;
    }
    public java.util.List<UIKeyVauleTemplate> getSourceConfigs() {
        return this.sourceConfigs;
    }

    public ConnectorJob setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ConnectorJob setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public ConnectorJob setTransformation(java.util.List<ColumnConfig> transformation) {
        this.transformation = transformation;
        return this;
    }
    public java.util.List<ColumnConfig> getTransformation() {
        return this.transformation;
    }

    public ConnectorJob setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ConnectorJob setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ConnectorJob setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public ConnectorJob setStepflowTemplateId(String stepflowTemplateId) {
        this.stepflowTemplateId = stepflowTemplateId;
        return this;
    }
    public String getStepflowTemplateId() {
        return this.stepflowTemplateId;
    }

    public ConnectorJob setSingleton(Boolean singleton) {
        this.singleton = singleton;
        return this;
    }
    public Boolean getSingleton() {
        return this.singleton;
    }

    public ConnectorJob setEventSubEnabled(Boolean eventSubEnabled) {
        this.eventSubEnabled = eventSubEnabled;
        return this;
    }
    public Boolean getEventSubEnabled() {
        return this.eventSubEnabled;
    }

    public ConnectorJob setEventSubConfigs(java.util.List<EventSubConfig> eventSubConfigs) {
        this.eventSubConfigs = eventSubConfigs;
        return this;
    }
    public java.util.List<EventSubConfig> getEventSubConfigs() {
        return this.eventSubConfigs;
    }

    public ConnectorJob setAcceptableExecutionInterval(Long acceptableExecutionInterval) {
        this.acceptableExecutionInterval = acceptableExecutionInterval;
        return this;
    }
    public Long getAcceptableExecutionInterval() {
        return this.acceptableExecutionInterval;
    }

    public ConnectorJob setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ConnectorJob setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
        return this;
    }
    public String getProcessStatus() {
        return this.processStatus;
    }

    public ConnectorJob setAutoRecycleInstance(Boolean autoRecycleInstance) {
        this.autoRecycleInstance = autoRecycleInstance;
        return this;
    }
    public Boolean getAutoRecycleInstance() {
        return this.autoRecycleInstance;
    }

}
