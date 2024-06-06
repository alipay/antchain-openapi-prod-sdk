// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class QueryBacktrackScoreRequest extends TeaModel {
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

    // 用户id（客户身份证号/手机号的md5/sha256/sm3散列值）
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
    @NameInMap("user_id_type")
    @Validation(required = true)
    public String userIdType;

    // user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
    @NameInMap("encrypt_type")
    @Validation(required = true)
    public String encryptType;

    // 	
    // 客户编码
    @NameInMap("customer_code")
    @Validation(required = true)
    public String customerCode;

    // 流水号，串联链路用，非必填
    @NameInMap("trans_no")
    public String transNo;

    // encrypt_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
    @NameInMap("user_id_hash_encrypt")
    public String userIdHashEncrypt;

    // 回溯采样日期
    @NameInMap("sample_date")
    @Validation(required = true)
    public String sampleDate;

    public static QueryBacktrackScoreRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBacktrackScoreRequest self = new QueryBacktrackScoreRequest();
        return TeaModel.build(map, self);
    }

    public QueryBacktrackScoreRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBacktrackScoreRequest setAuthNo(String authNo) {
        this.authNo = authNo;
        return this;
    }
    public String getAuthNo() {
        return this.authNo;
    }

    public QueryBacktrackScoreRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public QueryBacktrackScoreRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryBacktrackScoreRequest setUserIdType(String userIdType) {
        this.userIdType = userIdType;
        return this;
    }
    public String getUserIdType() {
        return this.userIdType;
    }

    public QueryBacktrackScoreRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public QueryBacktrackScoreRequest setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
        return this;
    }
    public String getCustomerCode() {
        return this.customerCode;
    }

    public QueryBacktrackScoreRequest setTransNo(String transNo) {
        this.transNo = transNo;
        return this;
    }
    public String getTransNo() {
        return this.transNo;
    }

    public QueryBacktrackScoreRequest setUserIdHashEncrypt(String userIdHashEncrypt) {
        this.userIdHashEncrypt = userIdHashEncrypt;
        return this;
    }
    public String getUserIdHashEncrypt() {
        return this.userIdHashEncrypt;
    }

    public QueryBacktrackScoreRequest setSampleDate(String sampleDate) {
        this.sampleDate = sampleDate;
        return this;
    }
    public String getSampleDate() {
        return this.sampleDate;
    }

}
