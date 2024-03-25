// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class QueryCommonScoreRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 用户授权编码
    @NameInMap("auth_no")
    @Validation(required = true)
    public String authNo;

    // 模型id
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    // 用户id（客户身份证号/手机号的md5/sha256散列值）
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
    @NameInMap("user_id_type")
    @Validation(required = true)
    public String userIdType;

    // 加密类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
    @NameInMap("encrypt_type")
    @Validation(required = true)
    public String encryptType;

    // 客户编码
    @NameInMap("customer_code")
    @Validation(required = true)
    public String customerCode;

    // 流水号，串联链路用，非必填
    @NameInMap("trans_no")
    public String transNo;

    public static QueryCommonScoreRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCommonScoreRequest self = new QueryCommonScoreRequest();
        return TeaModel.build(map, self);
    }

    public QueryCommonScoreRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCommonScoreRequest setAuthNo(String authNo) {
        this.authNo = authNo;
        return this;
    }
    public String getAuthNo() {
        return this.authNo;
    }

    public QueryCommonScoreRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public QueryCommonScoreRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryCommonScoreRequest setUserIdType(String userIdType) {
        this.userIdType = userIdType;
        return this;
    }
    public String getUserIdType() {
        return this.userIdType;
    }

    public QueryCommonScoreRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public QueryCommonScoreRequest setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
        return this;
    }
    public String getCustomerCode() {
        return this.customerCode;
    }

    public QueryCommonScoreRequest setTransNo(String transNo) {
        this.transNo = transNo;
        return this;
    }
    public String getTransNo() {
        return this.transNo;
    }

}
