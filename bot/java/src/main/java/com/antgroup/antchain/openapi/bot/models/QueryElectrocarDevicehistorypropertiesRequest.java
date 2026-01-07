// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarDevicehistorypropertiesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // tuid
    @NameInMap("tuid")
    @Validation(required = true)
    public String tuid;

    // 开始时间戳
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    // 结束时间戳
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    // 1
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 1
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static QueryElectrocarDevicehistorypropertiesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarDevicehistorypropertiesRequest self = new QueryElectrocarDevicehistorypropertiesRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarDevicehistorypropertiesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectrocarDevicehistorypropertiesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryElectrocarDevicehistorypropertiesRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public QueryElectrocarDevicehistorypropertiesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryElectrocarDevicehistorypropertiesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryElectrocarDevicehistorypropertiesRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryElectrocarDevicehistorypropertiesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
