// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryCreditshieldFixcontactRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 1-可信联系方式查询
    @NameInMap("query_code")
    @Validation(required = true)
    public String queryCode;

    // 可信联系方式查询入参，身份证号和手机号必填
    @NameInMap("query_infos")
    @Validation(required = true)
    public String queryInfos;

    public static QueryCreditshieldFixcontactRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditshieldFixcontactRequest self = new QueryCreditshieldFixcontactRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreditshieldFixcontactRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreditshieldFixcontactRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCreditshieldFixcontactRequest setQueryCode(String queryCode) {
        this.queryCode = queryCode;
        return this;
    }
    public String getQueryCode() {
        return this.queryCode;
    }

    public QueryCreditshieldFixcontactRequest setQueryInfos(String queryInfos) {
        this.queryInfos = queryInfos;
        return this;
    }
    public String getQueryInfos() {
        return this.queryInfos;
    }

}
