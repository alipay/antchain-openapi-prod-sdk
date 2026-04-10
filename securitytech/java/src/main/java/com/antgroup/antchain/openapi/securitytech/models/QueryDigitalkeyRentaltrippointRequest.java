// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryDigitalkeyRentaltrippointRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 中控TUID
    @NameInMap("tuid")
    @Validation(required = true)
    public String tuid;

    // 行程ID
    @NameInMap("trip_id")
    @Validation(required = true)
    public String tripId;

    public static QueryDigitalkeyRentaltrippointRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalkeyRentaltrippointRequest self = new QueryDigitalkeyRentaltrippointRequest();
        return TeaModel.build(map, self);
    }

    public QueryDigitalkeyRentaltrippointRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDigitalkeyRentaltrippointRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDigitalkeyRentaltrippointRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public QueryDigitalkeyRentaltrippointRequest setTripId(String tripId) {
        this.tripId = tripId;
        return this;
    }
    public String getTripId() {
        return this.tripId;
    }

}
