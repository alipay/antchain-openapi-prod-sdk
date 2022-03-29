// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ExecSofamqDailycheckRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 单元名
    @NameInMap("cell")
    public String cell;

    // group名
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 实例ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 日切时间点
    @NameInMap("check_time")
    @Validation(required = true)
    public Long checkTime;

    // topic名
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    public static ExecSofamqDailycheckRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecSofamqDailycheckRequest self = new ExecSofamqDailycheckRequest();
        return TeaModel.build(map, self);
    }

    public ExecSofamqDailycheckRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecSofamqDailycheckRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecSofamqDailycheckRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public ExecSofamqDailycheckRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ExecSofamqDailycheckRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExecSofamqDailycheckRequest setCheckTime(Long checkTime) {
        this.checkTime = checkTime;
        return this;
    }
    public Long getCheckTime() {
        return this.checkTime;
    }

    public ExecSofamqDailycheckRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
