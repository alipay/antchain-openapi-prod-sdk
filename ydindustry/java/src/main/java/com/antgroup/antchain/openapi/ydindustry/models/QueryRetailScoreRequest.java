// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ydindustry.models;

import com.aliyun.tea.*;

public class QueryRetailScoreRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 模型id
    @NameInMap("industry_id")
    @Validation(required = true)
    public String industryId;

    // 用户id（客户身份证号/手机号的md5/sha256散列值）
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
    @NameInMap("user_id_type")
    @Validation(required = true)
    public String userIdType;

    // user_id 散列类型: "MD5"：MD5（小写）, ...
    @NameInMap("encrypt_type")
    @Validation(required = true)
    public String encryptType;

    // 客户编码
    @NameInMap("customer_code")
    @Validation(required = true)
    public String customerCode;

    // 流水号，串联链路用，非必填
    @NameInMap("trans_no")
    @Validation(required = true)
    public String transNo;

    // encrypt_type类型的散列后的操作，默认为空不加密...
    @NameInMap("user_id_hash_encrypt")
    @Validation(required = true)
    public String userIdHashEncrypt;

    // 客户场景码
    @NameInMap("instance_code")
    public String instanceCode;

    public static QueryRetailScoreRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRetailScoreRequest self = new QueryRetailScoreRequest();
        return TeaModel.build(map, self);
    }

    public QueryRetailScoreRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRetailScoreRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRetailScoreRequest setIndustryId(String industryId) {
        this.industryId = industryId;
        return this;
    }
    public String getIndustryId() {
        return this.industryId;
    }

    public QueryRetailScoreRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryRetailScoreRequest setUserIdType(String userIdType) {
        this.userIdType = userIdType;
        return this;
    }
    public String getUserIdType() {
        return this.userIdType;
    }

    public QueryRetailScoreRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public QueryRetailScoreRequest setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
        return this;
    }
    public String getCustomerCode() {
        return this.customerCode;
    }

    public QueryRetailScoreRequest setTransNo(String transNo) {
        this.transNo = transNo;
        return this;
    }
    public String getTransNo() {
        return this.transNo;
    }

    public QueryRetailScoreRequest setUserIdHashEncrypt(String userIdHashEncrypt) {
        this.userIdHashEncrypt = userIdHashEncrypt;
        return this;
    }
    public String getUserIdHashEncrypt() {
        return this.userIdHashEncrypt;
    }

    public QueryRetailScoreRequest setInstanceCode(String instanceCode) {
        this.instanceCode = instanceCode;
        return this;
    }
    public String getInstanceCode() {
        return this.instanceCode;
    }

}
