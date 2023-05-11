// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryContentBatchstatisticsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 内容id列表
    @NameInMap("content_id_list")
    @Validation(required = true)
    public java.util.List<String> contentIdList;

    // 起始日期时间戳
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    // 截止日期时间戳
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    public static QueryContentBatchstatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContentBatchstatisticsRequest self = new QueryContentBatchstatisticsRequest();
        return TeaModel.build(map, self);
    }

    public QueryContentBatchstatisticsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContentBatchstatisticsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryContentBatchstatisticsRequest setContentIdList(java.util.List<String> contentIdList) {
        this.contentIdList = contentIdList;
        return this;
    }
    public java.util.List<String> getContentIdList() {
        return this.contentIdList;
    }

    public QueryContentBatchstatisticsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryContentBatchstatisticsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}
