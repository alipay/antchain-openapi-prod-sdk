// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddDdsJobRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // middleware instance id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 任务所属APP
    @NameInMap("app")
    @Validation(required = true)
    public String app;

    // 任务名字
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 任务CRON表达式
    @NameInMap("cron")
    @Validation(required = true)
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

    public static AddDdsJobRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDdsJobRequest self = new AddDdsJobRequest();
        return TeaModel.build(map, self);
    }

    public AddDdsJobRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddDdsJobRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddDdsJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddDdsJobRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public AddDdsJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddDdsJobRequest setCron(String cron) {
        this.cron = cron;
        return this;
    }
    public String getCron() {
        return this.cron;
    }

    public AddDdsJobRequest setShardingCount(Integer shardingCount) {
        this.shardingCount = shardingCount;
        return this;
    }
    public Integer getShardingCount() {
        return this.shardingCount;
    }

    public AddDdsJobRequest setCustomParams(java.util.List<String> customParams) {
        this.customParams = customParams;
        return this;
    }
    public java.util.List<String> getCustomParams() {
        return this.customParams;
    }

    public AddDdsJobRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AddDdsJobRequest setDes(String des) {
        this.des = des;
        return this;
    }
    public String getDes() {
        return this.des;
    }

}
