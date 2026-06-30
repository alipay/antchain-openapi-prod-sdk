// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryDigitalkeyRentalcarRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备TUID
    @NameInMap("tuid")
    @Validation(required = true)
    public String tuid;

    public static QueryDigitalkeyRentalcarRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalkeyRentalcarRequest self = new QueryDigitalkeyRentalcarRequest();
        return TeaModel.build(map, self);
    }

    public QueryDigitalkeyRentalcarRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDigitalkeyRentalcarRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDigitalkeyRentalcarRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

}
