// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.resolveservice.models;

import com.aliyun.tea.*;

public class QueryCustomerWxleadlinkRequest extends TeaModel {
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
    @Validation(required = true)
    public String caseCode;

    // AES加密手机号
    @NameInMap("phone")
    @Validation(required = true)
    public String phone;

    // 产品类型
    @NameInMap("product_type")
    @Validation(required = true)
    public String productType;

    // 约定固定值-一般是对应平台的缩写
    @NameInMap("create_by")
    @Validation(required = true)
    public String createBy;

    public static QueryCustomerWxleadlinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomerWxleadlinkRequest self = new QueryCustomerWxleadlinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryCustomerWxleadlinkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCustomerWxleadlinkRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCustomerWxleadlinkRequest setCustNo(String custNo) {
        this.custNo = custNo;
        return this;
    }
    public String getCustNo() {
        return this.custNo;
    }

    public QueryCustomerWxleadlinkRequest setCaseCode(String caseCode) {
        this.caseCode = caseCode;
        return this;
    }
    public String getCaseCode() {
        return this.caseCode;
    }

    public QueryCustomerWxleadlinkRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public QueryCustomerWxleadlinkRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public QueryCustomerWxleadlinkRequest setCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }
    public String getCreateBy() {
        return this.createBy;
    }

}
