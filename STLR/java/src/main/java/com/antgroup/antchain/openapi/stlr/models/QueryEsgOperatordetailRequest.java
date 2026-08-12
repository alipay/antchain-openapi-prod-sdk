// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryEsgOperatordetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业编码
    @NameInMap("enterprise_no")
    @Validation(required = true)
    public String enterpriseNo;

    // 操作员 ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static QueryEsgOperatordetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEsgOperatordetailRequest self = new QueryEsgOperatordetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryEsgOperatordetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEsgOperatordetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEsgOperatordetailRequest setEnterpriseNo(String enterpriseNo) {
        this.enterpriseNo = enterpriseNo;
        return this;
    }
    public String getEnterpriseNo() {
        return this.enterpriseNo;
    }

    public QueryEsgOperatordetailRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
