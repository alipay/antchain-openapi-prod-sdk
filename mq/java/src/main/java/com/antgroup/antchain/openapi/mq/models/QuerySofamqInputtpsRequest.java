// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqInputtpsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询区间起始毫秒时间戳
    @NameInMap("begin_time")
    @Validation(required = true)
    public Long beginTime;

    // 需要查询的Cell名
    @NameInMap("cell")
    public String cell;

    // 查询区间终止毫秒时间戳
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    // 指定的 Topic 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 采样周期，单位分钟，取值可为 1、5、10
    @NameInMap("period")
    public Long period;

    // 需查询的 Topic 名称
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // 查询的类型。取值说明如下：
    // 
    // 0：查询指定时间段内 Topic 的写入量
    // 1：查询指定时间段内 Topic 的 TPS 曲线数据
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    public static QuerySofamqInputtpsRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqInputtpsRequest self = new QuerySofamqInputtpsRequest();
        return TeaModel.build(map, self);
    }

    public QuerySofamqInputtpsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySofamqInputtpsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySofamqInputtpsRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public QuerySofamqInputtpsRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public QuerySofamqInputtpsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QuerySofamqInputtpsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QuerySofamqInputtpsRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public QuerySofamqInputtpsRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public QuerySofamqInputtpsRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
