// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class QueryChaininsightStatistichistogramRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 自定义通知指标的ID
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 多个维度名称，空表示所有维度
    @NameInMap("dimensions")
    public java.util.List<String> dimensions;

    // 查询开始时间，毫秒时间戳
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    // 查询结束时间，毫秒时间戳
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    public static QueryChaininsightStatistichistogramRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChaininsightStatistichistogramRequest self = new QueryChaininsightStatistichistogramRequest();
        return TeaModel.build(map, self);
    }

    public QueryChaininsightStatistichistogramRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryChaininsightStatistichistogramRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryChaininsightStatistichistogramRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryChaininsightStatistichistogramRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryChaininsightStatistichistogramRequest setDimensions(java.util.List<String> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<String> getDimensions() {
        return this.dimensions;
    }

    public QueryChaininsightStatistichistogramRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryChaininsightStatistichistogramRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}
