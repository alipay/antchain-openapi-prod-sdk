// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryApiAuthteplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 身份ID 身份证或者统一社会信用编码
    @NameInMap("identity_id")
    @Validation(required = true)
    public String identityId;

    // 名称
    @NameInMap("identity_name")
    @Validation(required = true)
    public String identityName;

    // 业务类型
    // 11 税
    // 12票
    // 13税+票
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 法人名称
    @NameInMap("cognizant_name")
    @Validation(required = true)
    public String cognizantName;

    // 法人证件号
    @NameInMap("coidentity_number")
    @Validation(required = true)
    public String coidentityNumber;

    // 法人手机号
    @NameInMap("cognizant_mobile")
    @Validation(required = true)
    public String cognizantMobile;

    public static QueryApiAuthteplateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApiAuthteplateRequest self = new QueryApiAuthteplateRequest();
        return TeaModel.build(map, self);
    }

    public QueryApiAuthteplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApiAuthteplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApiAuthteplateRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryApiAuthteplateRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public QueryApiAuthteplateRequest setIdentityName(String identityName) {
        this.identityName = identityName;
        return this;
    }
    public String getIdentityName() {
        return this.identityName;
    }

    public QueryApiAuthteplateRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public QueryApiAuthteplateRequest setCognizantName(String cognizantName) {
        this.cognizantName = cognizantName;
        return this;
    }
    public String getCognizantName() {
        return this.cognizantName;
    }

    public QueryApiAuthteplateRequest setCoidentityNumber(String coidentityNumber) {
        this.coidentityNumber = coidentityNumber;
        return this;
    }
    public String getCoidentityNumber() {
        return this.coidentityNumber;
    }

    public QueryApiAuthteplateRequest setCognizantMobile(String cognizantMobile) {
        this.cognizantMobile = cognizantMobile;
        return this;
    }
    public String getCognizantMobile() {
        return this.cognizantMobile;
    }

}
