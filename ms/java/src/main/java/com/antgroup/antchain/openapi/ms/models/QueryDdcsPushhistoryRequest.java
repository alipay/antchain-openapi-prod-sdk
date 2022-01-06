// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryDdcsPushhistoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需要查询的 dataId，可不填。
    @NameInMap("data_id")
    public String dataId;

    // 查询的推送记录的介绍时间，值为 1970到现在的毫秒数，用毫秒数为了避免时区问题
    @NameInMap("end_time")
    public Long endTime;

    // instance id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 限时返回条数
    @NameInMap("size")
    public Long size;

    // 从哪个id开始查询，不建议使用
    @NameInMap("start_id")
    public Long startId;

    // 查询的开始时间，值为 1970到现在的毫秒数，用毫秒数为了避免时区问题
    @NameInMap("start_time")
    public Long startTime;

    public static QueryDdcsPushhistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDdcsPushhistoryRequest self = new QueryDdcsPushhistoryRequest();
        return TeaModel.build(map, self);
    }

    public QueryDdcsPushhistoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDdcsPushhistoryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDdcsPushhistoryRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public QueryDdcsPushhistoryRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryDdcsPushhistoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryDdcsPushhistoryRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public QueryDdcsPushhistoryRequest setStartId(Long startId) {
        this.startId = startId;
        return this;
    }
    public Long getStartId() {
        return this.startId;
    }

    public QueryDdcsPushhistoryRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
