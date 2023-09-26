// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class QueryChaininsightPrivatechaintxhistogramRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联盟ID
    @NameInMap("union_id")
    @Validation(required = true)
    public String unionId;

    // 链ID列表
    @NameInMap("biz_ids")
    @Validation(required = true)
    public java.util.List<String> bizIds;

    // 开始时间戳
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    // 结束时间戳
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    // 点集类型，枚举：Amount、Increment、GrowthRate，默认为Amount
    @NameInMap("type")
    public String type;

    // 统计间隔
    @NameInMap("interval")
    public Long interval;

    // 枚举值，统计间隔的时间单位：Second / Hour / Day / Month / Year
    @NameInMap("interval_unit")
    public String intervalUnit;

    public static QueryChaininsightPrivatechaintxhistogramRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChaininsightPrivatechaintxhistogramRequest self = new QueryChaininsightPrivatechaintxhistogramRequest();
        return TeaModel.build(map, self);
    }

    public QueryChaininsightPrivatechaintxhistogramRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryChaininsightPrivatechaintxhistogramRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryChaininsightPrivatechaintxhistogramRequest setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

    public QueryChaininsightPrivatechaintxhistogramRequest setBizIds(java.util.List<String> bizIds) {
        this.bizIds = bizIds;
        return this;
    }
    public java.util.List<String> getBizIds() {
        return this.bizIds;
    }

    public QueryChaininsightPrivatechaintxhistogramRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryChaininsightPrivatechaintxhistogramRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryChaininsightPrivatechaintxhistogramRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryChaininsightPrivatechaintxhistogramRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public QueryChaininsightPrivatechaintxhistogramRequest setIntervalUnit(String intervalUnit) {
        this.intervalUnit = intervalUnit;
        return this;
    }
    public String getIntervalUnit() {
        return this.intervalUnit;
    }

}
