// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class QueryInquiryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 询价id
    @NameInMap("inquiry_no_inner")
    @Validation(required = true)
    public String inquiryNoInner;

    public static QueryInquiryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInquiryRequest self = new QueryInquiryRequest();
        return TeaModel.build(map, self);
    }

    public QueryInquiryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInquiryRequest setInquiryNoInner(String inquiryNoInner) {
        this.inquiryNoInner = inquiryNoInner;
        return this;
    }
    public String getInquiryNoInner() {
        return this.inquiryNoInner;
    }

}
