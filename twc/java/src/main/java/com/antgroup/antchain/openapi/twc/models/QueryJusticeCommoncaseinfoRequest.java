// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryJusticeCommoncaseinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 案件号
    @NameInMap("case_no")
    @Validation(required = true)
    public String caseNo;

    // 用户幂等字段
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    public static QueryJusticeCommoncaseinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryJusticeCommoncaseinfoRequest self = new QueryJusticeCommoncaseinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryJusticeCommoncaseinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryJusticeCommoncaseinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryJusticeCommoncaseinfoRequest setCaseNo(String caseNo) {
        this.caseNo = caseNo;
        return this;
    }
    public String getCaseNo() {
        return this.caseNo;
    }

    public QueryJusticeCommoncaseinfoRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
