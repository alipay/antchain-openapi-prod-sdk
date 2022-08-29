// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryContentStatisticsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 内容id
    @NameInMap("content_id")
    @Validation(required = true)
    public String contentId;

    // 起始日期时间戳
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    // 截止日期时间戳
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    public static QueryContentStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContentStatisticsRequest self = new QueryContentStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public QueryContentStatisticsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContentStatisticsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryContentStatisticsRequest setContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }
    public String getContentId() {
        return this.contentId;
    }

    public QueryContentStatisticsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryContentStatisticsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}
