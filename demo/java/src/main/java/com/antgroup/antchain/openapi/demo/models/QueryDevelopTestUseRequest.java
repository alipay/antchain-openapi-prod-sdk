// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryDevelopTestUseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 入参1
    @NameInMap("stringparameter")
    @Validation(required = true)
    public String stringparameter;

    // 数字入参
    @NameInMap("numberparameter")
    @Validation(required = true)
    public Long numberparameter;

    public static QueryDevelopTestUseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDevelopTestUseRequest self = new QueryDevelopTestUseRequest();
        return TeaModel.build(map, self);
    }

    public QueryDevelopTestUseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDevelopTestUseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDevelopTestUseRequest setStringparameter(String stringparameter) {
        this.stringparameter = stringparameter;
        return this;
    }
    public String getStringparameter() {
        return this.stringparameter;
    }

    public QueryDevelopTestUseRequest setNumberparameter(Long numberparameter) {
        this.numberparameter = numberparameter;
        return this;
    }
    public Long getNumberparameter() {
        return this.numberparameter;
    }

}
