// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarDeviceinfosRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // tuid
    @NameInMap("tuid")
    @Validation(required = true)
    public String tuid;

    public static QueryElectrocarDeviceinfosRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarDeviceinfosRequest self = new QueryElectrocarDeviceinfosRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarDeviceinfosRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectrocarDeviceinfosRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryElectrocarDeviceinfosRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

}
