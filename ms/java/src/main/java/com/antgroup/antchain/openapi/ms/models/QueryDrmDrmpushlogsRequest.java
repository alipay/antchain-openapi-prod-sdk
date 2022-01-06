// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryDrmDrmpushlogsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资源标识
    @NameInMap("data_id")
    public String dataId;

    // 时间结束
    @NameInMap("end_time")
    public Long endTime;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 操作人
    @NameInMap("operator")
    public String operator;

    // 页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 推送结果
    @NameInMap("push_result")
    public String pushResult;

    // 起始索引
    @NameInMap("start")
    @Validation(required = true)
    public Long start;

    // 开始时间
    @NameInMap("start_time")
    public Long startTime;

    public static QueryDrmDrmpushlogsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDrmDrmpushlogsRequest self = new QueryDrmDrmpushlogsRequest();
        return TeaModel.build(map, self);
    }

    public QueryDrmDrmpushlogsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDrmDrmpushlogsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDrmDrmpushlogsRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public QueryDrmDrmpushlogsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryDrmDrmpushlogsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryDrmDrmpushlogsRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public QueryDrmDrmpushlogsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDrmDrmpushlogsRequest setPushResult(String pushResult) {
        this.pushResult = pushResult;
        return this;
    }
    public String getPushResult() {
        return this.pushResult;
    }

    public QueryDrmDrmpushlogsRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public QueryDrmDrmpushlogsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
