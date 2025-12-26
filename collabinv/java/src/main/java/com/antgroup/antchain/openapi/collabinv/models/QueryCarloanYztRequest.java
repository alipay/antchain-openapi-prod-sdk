// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class QueryCarloanYztRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 车牌号
    @NameInMap("plate_no")
    @Validation(required = true)
    public String plateNo;

    public static QueryCarloanYztRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCarloanYztRequest self = new QueryCarloanYztRequest();
        return TeaModel.build(map, self);
    }

    public QueryCarloanYztRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCarloanYztRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCarloanYztRequest setPlateNo(String plateNo) {
        this.plateNo = plateNo;
        return this;
    }
    public String getPlateNo() {
        return this.plateNo;
    }

}
