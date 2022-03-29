// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class RunSofamqConnectorjobRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 期望任务执行时间的unix 时间戳，精度是毫秒
    @NameInMap("execution_time")
    public Long executionTime;

    // 任务名
    @NameInMap("job")
    @Validation(required = true)
    public String job;

    // 分区描述
    @NameInMap("partition")
    public String partition;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // Sink开发分组
    @NameInMap("sink_dev_group")
    public String sinkDevGroup;

    // dt=20210910
    @NameInMap("source_partition")
    public String sourcePartition;

    // 目标分组
    @NameInMap("sink_partition")
    public String sinkPartition;

    // Source开发分组
    @NameInMap("source_dev_group")
    public String sourceDevGroup;

    public static RunSofamqConnectorjobRequest build(java.util.Map<String, ?> map) throws Exception {
        RunSofamqConnectorjobRequest self = new RunSofamqConnectorjobRequest();
        return TeaModel.build(map, self);
    }

    public RunSofamqConnectorjobRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RunSofamqConnectorjobRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RunSofamqConnectorjobRequest setExecutionTime(Long executionTime) {
        this.executionTime = executionTime;
        return this;
    }
    public Long getExecutionTime() {
        return this.executionTime;
    }

    public RunSofamqConnectorjobRequest setJob(String job) {
        this.job = job;
        return this;
    }
    public String getJob() {
        return this.job;
    }

    public RunSofamqConnectorjobRequest setPartition(String partition) {
        this.partition = partition;
        return this;
    }
    public String getPartition() {
        return this.partition;
    }

    public RunSofamqConnectorjobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RunSofamqConnectorjobRequest setSinkDevGroup(String sinkDevGroup) {
        this.sinkDevGroup = sinkDevGroup;
        return this;
    }
    public String getSinkDevGroup() {
        return this.sinkDevGroup;
    }

    public RunSofamqConnectorjobRequest setSourcePartition(String sourcePartition) {
        this.sourcePartition = sourcePartition;
        return this;
    }
    public String getSourcePartition() {
        return this.sourcePartition;
    }

    public RunSofamqConnectorjobRequest setSinkPartition(String sinkPartition) {
        this.sinkPartition = sinkPartition;
        return this;
    }
    public String getSinkPartition() {
        return this.sinkPartition;
    }

    public RunSofamqConnectorjobRequest setSourceDevGroup(String sourceDevGroup) {
        this.sourceDevGroup = sourceDevGroup;
        return this;
    }
    public String getSourceDevGroup() {
        return this.sourceDevGroup;
    }

}
