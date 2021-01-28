// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseIotinfoRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询截止时间
    @NameInMap("end_time")
    @Validation(required = true)
    public String endTime;

    // 设备唯一id imei id
    @NameInMap("product_imei_id")
    @Validation(required = true)
    public String productImeiId;

    // 查询开启时间
    @NameInMap("start_time")
    @Validation(required = true)
    public String startTime;

    public static QueryLeaseIotinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseIotinfoRequest self = new QueryLeaseIotinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryLeaseIotinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLeaseIotinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryLeaseIotinfoRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryLeaseIotinfoRequest setProductImeiId(String productImeiId) {
        this.productImeiId = productImeiId;
        return this;
    }
    public String getProductImeiId() {
        return this.productImeiId;
    }

    public QueryLeaseIotinfoRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
