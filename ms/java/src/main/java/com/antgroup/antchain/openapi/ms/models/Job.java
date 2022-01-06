// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class Job extends TeaModel {
    // 数据库ID
    @NameInMap("id")
    public Integer id;

    // 所属租户实例ID
    @NameInMap("instance_id")
    public String instanceId;

    // 任务所属APP
    @NameInMap("app")
    public String app;

    // 任务名字
    @NameInMap("name")
    public String name;

    // 任务CRON表达式
    @NameInMap("cron")
    public String cron;

    // 任务分片数量
    @NameInMap("sharding_count")
    public Integer shardingCount;

    // 任务自定义参数
    @NameInMap("custom_params")
    public java.util.List<String> customParams;

    // 任务状态
    @NameInMap("status")
    public String status;

    // 任务描述信息
    @NameInMap("des")
    public String des;

    // 任务创建时间
    @NameInMap("creation_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String creationTime;

    // 任务修改时间
    @NameInMap("update_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String updateTime;

    public static Job build(java.util.Map<String, ?> map) throws Exception {
        Job self = new Job();
        return TeaModel.build(map, self);
    }

    public Job setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public Job setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public Job setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public Job setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Job setCron(String cron) {
        this.cron = cron;
        return this;
    }
    public String getCron() {
        return this.cron;
    }

    public Job setShardingCount(Integer shardingCount) {
        this.shardingCount = shardingCount;
        return this;
    }
    public Integer getShardingCount() {
        return this.shardingCount;
    }

    public Job setCustomParams(java.util.List<String> customParams) {
        this.customParams = customParams;
        return this;
    }
    public java.util.List<String> getCustomParams() {
        return this.customParams;
    }

    public Job setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Job setDes(String des) {
        this.des = des;
        return this;
    }
    public String getDes() {
        return this.des;
    }

    public Job setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public Job setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
