// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqOutputtpsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    //  查询区间起始毫秒时间戳
    @NameInMap("begin_time")
    @Validation(required = true)
    public String beginTime;

    // 需要查询的Cell名
    @NameInMap("cell")
    public String cell;

    //  查询区间终止毫秒时间戳
    @NameInMap("end_time")
    @Validation(required = true)
    public String endTime;

    //  需要查询的 Group ID
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 需统计数据的 Group ID 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 采样周期，单位分钟，取值可为 1、5、10
    @NameInMap("period")
    public Long period;

    //  需要查询的 Topic 名称
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // 查询的类型。取值说明如下：
    // 
    // 0：查询消费消息总量的统计曲线
    // 1：查询消费消息 TPS 的统计曲线
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    public static QuerySofamqOutputtpsRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqOutputtpsRequest self = new QuerySofamqOutputtpsRequest();
        return TeaModel.build(map, self);
    }

    public QuerySofamqOutputtpsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySofamqOutputtpsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySofamqOutputtpsRequest setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public QuerySofamqOutputtpsRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public QuerySofamqOutputtpsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QuerySofamqOutputtpsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QuerySofamqOutputtpsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QuerySofamqOutputtpsRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public QuerySofamqOutputtpsRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public QuerySofamqOutputtpsRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
