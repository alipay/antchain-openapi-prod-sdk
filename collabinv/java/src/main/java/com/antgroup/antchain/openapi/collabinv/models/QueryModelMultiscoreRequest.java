// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class QueryModelMultiscoreRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户授权编码（授权渠道）
    // 
    @NameInMap("auth_no")
    @Validation(required = true)
    public String authNo;

    // 规格编码(相应对接人负责)
    @NameInMap("spec_code")
    @Validation(required = true)
    public String specCode;

    // 用户id（客户身份证号/手机号的md5/sha256散列值）
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
    @NameInMap("user_id_type")
    @Validation(required = true)
    public String userIdType;

    // user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
    @NameInMap("hash_type")
    @Validation(required = true)
    public String hashType;

    // 客户编码
    // 
    @NameInMap("customer_code")
    @Validation(required = true)
    public String customerCode;

    // 流水号，串联链路用，非必填
    @NameInMap("trans_no")
    public String transNo;

    // hash_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
    @NameInMap("user_id_encrypt_type")
    public String userIdEncryptType;

    public static QueryModelMultiscoreRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryModelMultiscoreRequest self = new QueryModelMultiscoreRequest();
        return TeaModel.build(map, self);
    }

    public QueryModelMultiscoreRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryModelMultiscoreRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryModelMultiscoreRequest setAuthNo(String authNo) {
        this.authNo = authNo;
        return this;
    }
    public String getAuthNo() {
        return this.authNo;
    }

    public QueryModelMultiscoreRequest setSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }
    public String getSpecCode() {
        return this.specCode;
    }

    public QueryModelMultiscoreRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryModelMultiscoreRequest setUserIdType(String userIdType) {
        this.userIdType = userIdType;
        return this;
    }
    public String getUserIdType() {
        return this.userIdType;
    }

    public QueryModelMultiscoreRequest setHashType(String hashType) {
        this.hashType = hashType;
        return this;
    }
    public String getHashType() {
        return this.hashType;
    }

    public QueryModelMultiscoreRequest setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
        return this;
    }
    public String getCustomerCode() {
        return this.customerCode;
    }

    public QueryModelMultiscoreRequest setTransNo(String transNo) {
        this.transNo = transNo;
        return this;
    }
    public String getTransNo() {
        return this.transNo;
    }

    public QueryModelMultiscoreRequest setUserIdEncryptType(String userIdEncryptType) {
        this.userIdEncryptType = userIdEncryptType;
        return this;
    }
    public String getUserIdEncryptType() {
        return this.userIdEncryptType;
    }

}
