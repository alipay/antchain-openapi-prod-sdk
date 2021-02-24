// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QuerySecurityDataRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("req_info")
    @Validation(required = true)
    public java.util.List<SecurityDataQueryStruct> reqInfo;

    public static QuerySecurityDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySecurityDataRequest self = new QuerySecurityDataRequest();
        return TeaModel.build(map, self);
    }

    public QuerySecurityDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySecurityDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySecurityDataRequest setReqInfo(java.util.List<SecurityDataQueryStruct> reqInfo) {
        this.reqInfo = reqInfo;
        return this;
    }
    public java.util.List<SecurityDataQueryStruct> getReqInfo() {
        return this.reqInfo;
    }

}
