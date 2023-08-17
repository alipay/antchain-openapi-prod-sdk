// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryBclMerchantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 入驻编号
    @NameInMap("enrollment_no")
    @Validation(required = true)
    public String enrollmentNo;

    public static QueryBclMerchantRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBclMerchantRequest self = new QueryBclMerchantRequest();
        return TeaModel.build(map, self);
    }

    public QueryBclMerchantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBclMerchantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBclMerchantRequest setEnrollmentNo(String enrollmentNo) {
        this.enrollmentNo = enrollmentNo;
        return this;
    }
    public String getEnrollmentNo() {
        return this.enrollmentNo;
    }

}
