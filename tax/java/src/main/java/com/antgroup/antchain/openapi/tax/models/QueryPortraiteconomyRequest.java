// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryPortraiteconomyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // biz_id
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // cert_no
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    public static QueryPortraiteconomyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPortraiteconomyRequest self = new QueryPortraiteconomyRequest();
        return TeaModel.build(map, self);
    }

    public QueryPortraiteconomyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPortraiteconomyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPortraiteconomyRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryPortraiteconomyRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

}
