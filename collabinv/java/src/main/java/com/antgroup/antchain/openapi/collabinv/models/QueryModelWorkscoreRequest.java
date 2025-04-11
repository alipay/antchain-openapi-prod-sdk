// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class QueryModelWorkscoreRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 身份证号码
    @NameInMap("card_no")
    @Validation(required = true)
    public String cardNo;

    // 手机号
    @NameInMap("phone")
    @Validation(required = true)
    public String phone;

    // 单位名称，以个体工商户、人才市场等方式缴纳的属于灵活就业人员，单位名称请填：GR
    @NameInMap("enterprise_name")
    @Validation(required = true)
    public String enterpriseName;

    // 单位统一社会信用代码，
    // 单位名称为GR传空。
    @NameInMap("organization_code")
    public String organizationCode;

    public static QueryModelWorkscoreRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryModelWorkscoreRequest self = new QueryModelWorkscoreRequest();
        return TeaModel.build(map, self);
    }

    public QueryModelWorkscoreRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryModelWorkscoreRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryModelWorkscoreRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryModelWorkscoreRequest setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }
    public String getCardNo() {
        return this.cardNo;
    }

    public QueryModelWorkscoreRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public QueryModelWorkscoreRequest setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public QueryModelWorkscoreRequest setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
        return this;
    }
    public String getOrganizationCode() {
        return this.organizationCode;
    }

}
