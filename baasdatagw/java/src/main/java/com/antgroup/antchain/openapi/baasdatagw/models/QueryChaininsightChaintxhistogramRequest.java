// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class QueryChaininsightChaintxhistogramRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联盟ID
    @NameInMap("union_id")
    @Validation(required = true)
    public String unionId;

    // 链ID，可选；留空表示联盟内所有链
    @NameInMap("biz_id")
    public String bizId;

    // 开始时间戳
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    // 结束时间戳
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    // 点集类型，枚举：Amount、Increment、GrowthRate，默认Amount
    @NameInMap("type")
    public String type;

    public static QueryChaininsightChaintxhistogramRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChaininsightChaintxhistogramRequest self = new QueryChaininsightChaintxhistogramRequest();
        return TeaModel.build(map, self);
    }

    public QueryChaininsightChaintxhistogramRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryChaininsightChaintxhistogramRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryChaininsightChaintxhistogramRequest setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

    public QueryChaininsightChaintxhistogramRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryChaininsightChaintxhistogramRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryChaininsightChaintxhistogramRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryChaininsightChaintxhistogramRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
