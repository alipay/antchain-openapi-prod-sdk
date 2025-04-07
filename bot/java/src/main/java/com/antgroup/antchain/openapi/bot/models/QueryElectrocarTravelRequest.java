// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarTravelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // iffaa 硬件唯一ID
    @NameInMap("tuid")
    @Validation(required = true)
    public String tuid;

    // 行程数据查询模式
    @NameInMap("trip_data_model")
    @Validation(required = true)
    public Long tripDataModel;

    // 注：trip_data_model = 3 必传
    @NameInMap("trip_id")
    public String tripId;

    // 时间范围
    // 注：trip_data_model = 3 不需要传
    @NameInMap("time_range")
    public String timeRange;

    public static QueryElectrocarTravelRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarTravelRequest self = new QueryElectrocarTravelRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarTravelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectrocarTravelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryElectrocarTravelRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public QueryElectrocarTravelRequest setTripDataModel(Long tripDataModel) {
        this.tripDataModel = tripDataModel;
        return this;
    }
    public Long getTripDataModel() {
        return this.tripDataModel;
    }

    public QueryElectrocarTravelRequest setTripId(String tripId) {
        this.tripId = tripId;
        return this;
    }
    public String getTripId() {
        return this.tripId;
    }

    public QueryElectrocarTravelRequest setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

}
