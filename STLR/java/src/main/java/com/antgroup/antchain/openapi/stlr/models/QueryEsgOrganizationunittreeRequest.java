// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryEsgOrganizationunittreeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // verifyToken中的企业编码
    @NameInMap("enterprise_no")
    @Validation(required = true)
    public String enterpriseNo;

    public static QueryEsgOrganizationunittreeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEsgOrganizationunittreeRequest self = new QueryEsgOrganizationunittreeRequest();
        return TeaModel.build(map, self);
    }

    public QueryEsgOrganizationunittreeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEsgOrganizationunittreeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEsgOrganizationunittreeRequest setEnterpriseNo(String enterpriseNo) {
        this.enterpriseNo = enterpriseNo;
        return this;
    }
    public String getEnterpriseNo() {
        return this.enterpriseNo;
    }

}
