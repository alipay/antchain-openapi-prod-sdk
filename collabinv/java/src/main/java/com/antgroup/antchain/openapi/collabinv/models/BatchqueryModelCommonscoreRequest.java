// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class BatchqueryModelCommonscoreRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户ID
    @NameInMap("user_ids")
    @Validation(required = true)
    public java.util.List<String> userIds;

    // 用户授权编码
    @NameInMap("auth_nos")
    @Validation(required = true)
    public java.util.List<String> authNos;

    // 模型编码
    @NameInMap("model_code")
    @Validation(required = true)
    public String modelCode;

    // 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
    @NameInMap("user_id_type")
    @Validation(required = true)
    public String userIdType;

    // user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
    @NameInMap("hash_type")
    @Validation(required = true)
    public String hashType;

    // 客户编码
    @NameInMap("customer_code")
    @Validation(required = true)
    public String customerCode;

    // 流水号，串联链路用，非必填
    @NameInMap("trans_no")
    public String transNo;

    // hash_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
    @NameInMap("user_id_encrypt_type")
    public String userIdEncryptType;

    public static BatchqueryModelCommonscoreRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryModelCommonscoreRequest self = new BatchqueryModelCommonscoreRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryModelCommonscoreRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryModelCommonscoreRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryModelCommonscoreRequest setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

    public BatchqueryModelCommonscoreRequest setAuthNos(java.util.List<String> authNos) {
        this.authNos = authNos;
        return this;
    }
    public java.util.List<String> getAuthNos() {
        return this.authNos;
    }

    public BatchqueryModelCommonscoreRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public BatchqueryModelCommonscoreRequest setUserIdType(String userIdType) {
        this.userIdType = userIdType;
        return this;
    }
    public String getUserIdType() {
        return this.userIdType;
    }

    public BatchqueryModelCommonscoreRequest setHashType(String hashType) {
        this.hashType = hashType;
        return this;
    }
    public String getHashType() {
        return this.hashType;
    }

    public BatchqueryModelCommonscoreRequest setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
        return this;
    }
    public String getCustomerCode() {
        return this.customerCode;
    }

    public BatchqueryModelCommonscoreRequest setTransNo(String transNo) {
        this.transNo = transNo;
        return this;
    }
    public String getTransNo() {
        return this.transNo;
    }

    public BatchqueryModelCommonscoreRequest setUserIdEncryptType(String userIdEncryptType) {
        this.userIdEncryptType = userIdEncryptType;
        return this;
    }
    public String getUserIdEncryptType() {
        return this.userIdEncryptType;
    }

}
