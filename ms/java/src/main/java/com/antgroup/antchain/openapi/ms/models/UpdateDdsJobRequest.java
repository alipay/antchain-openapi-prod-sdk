// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class UpdateDdsJobRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // job id
    @NameInMap("id")
    @Validation(required = true)
    public Integer id;

    // middleware instance id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

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

    // 任务描述信息
    @NameInMap("des")
    public String des;

    public static UpdateDdsJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDdsJobRequest self = new UpdateDdsJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDdsJobRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDdsJobRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDdsJobRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public UpdateDdsJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDdsJobRequest setCron(String cron) {
        this.cron = cron;
        return this;
    }
    public String getCron() {
        return this.cron;
    }

    public UpdateDdsJobRequest setShardingCount(Integer shardingCount) {
        this.shardingCount = shardingCount;
        return this;
    }
    public Integer getShardingCount() {
        return this.shardingCount;
    }

    public UpdateDdsJobRequest setCustomParams(java.util.List<String> customParams) {
        this.customParams = customParams;
        return this;
    }
    public java.util.List<String> getCustomParams() {
        return this.customParams;
    }

    public UpdateDdsJobRequest setDes(String des) {
        this.des = des;
        return this;
    }
    public String getDes() {
        return this.des;
    }

}
