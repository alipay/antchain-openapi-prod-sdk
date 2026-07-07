// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.resolveservice.models;

import com.aliyun.tea.*;

public class QueryCustomerTransartificialRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户号
    @NameInMap("cust_no")
    @Validation(required = true)
    public String custNo;

    // 案件号
    @NameInMap("case_code")
    public String caseCode;

    // 产品类型
    @NameInMap("product_type")
    public String productType;

    // 约定固定值-一般是对应平台的缩写
    @NameInMap("create_by")
    public String createBy;

    public static QueryCustomerTransartificialRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomerTransartificialRequest self = new QueryCustomerTransartificialRequest();
        return TeaModel.build(map, self);
    }

    public QueryCustomerTransartificialRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCustomerTransartificialRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCustomerTransartificialRequest setCustNo(String custNo) {
        this.custNo = custNo;
        return this;
    }
    public String getCustNo() {
        return this.custNo;
    }

    public QueryCustomerTransartificialRequest setCaseCode(String caseCode) {
        this.caseCode = caseCode;
        return this;
    }
    public String getCaseCode() {
        return this.caseCode;
    }

    public QueryCustomerTransartificialRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public QueryCustomerTransartificialRequest setCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }
    public String getCreateBy() {
        return this.createBy;
    }

}
