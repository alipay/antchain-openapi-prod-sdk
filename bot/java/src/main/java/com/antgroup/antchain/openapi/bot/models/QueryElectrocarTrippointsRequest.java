// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarTrippointsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // tuid
    @NameInMap("tuid")
    @Validation(required = true)
    public String tuid;

    // 行程id
    @NameInMap("trip_id")
    @Validation(required = true)
    public String tripId;

    public static QueryElectrocarTrippointsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarTrippointsRequest self = new QueryElectrocarTrippointsRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarTrippointsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectrocarTrippointsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryElectrocarTrippointsRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public QueryElectrocarTrippointsRequest setTripId(String tripId) {
        this.tripId = tripId;
        return this;
    }
    public String getTripId() {
        return this.tripId;
    }

}
