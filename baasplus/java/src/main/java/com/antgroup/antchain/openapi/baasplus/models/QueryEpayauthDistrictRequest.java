// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryEpayauthDistrictRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 父级行政地区编码。 不填则默认查询省级行政地区编码，支持省市县三级查询。
    @NameInMap("parent_code")
    @Validation(required = true)
    public String parentCode;

    public static QueryEpayauthDistrictRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEpayauthDistrictRequest self = new QueryEpayauthDistrictRequest();
        return TeaModel.build(map, self);
    }

    public QueryEpayauthDistrictRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEpayauthDistrictRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEpayauthDistrictRequest setParentCode(String parentCode) {
        this.parentCode = parentCode;
        return this;
    }
    public String getParentCode() {
        return this.parentCode;
    }

}
