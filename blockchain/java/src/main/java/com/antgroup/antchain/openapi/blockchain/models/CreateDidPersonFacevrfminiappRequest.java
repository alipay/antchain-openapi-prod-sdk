// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDidPersonFacevrfminiappRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码，通常针对性特别支持，或者防止多调用方使用相同租户身份的情况下用bizCode做区分。
    @NameInMap("biz_code")
    public String bizCode;

    // 请求的唯一标识，通常为32字符宽度的字符串内容，也可以只用UUID，此参数通常用来支持幂等，或者排查问题，调用方可以使用业务流水号。
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 姓名字段，真实姓名，不可包含空格等特殊字符。
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 证件号码，要求带有字母的情况使用大写字母。
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 身份信息来源类型，当前仅支持证件（CERT_INFO）
    @NameInMap("identity_type")
    @Validation(required = true)
    public String identityType;

    // 证件类型，当前仅支持身份证（IDENTITY_CARD）
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 认证结束回跳地址
    @NameInMap("return_url")
    @Validation(required = true)
    public String returnUrl;

    // DID未来创建锚定的用户身份唯一关联，如果不设置此参数则使用二要素拼接后的哈希值 SHA256("张三"+"210282*****X") 来进行关联创建DID，并且支持幂等。
    @NameInMap("uid")
    public String uid;

    // 刷脸类型，目前只支持FACE_SDK、FACE
    @NameInMap("face_type")
    public String faceType;

    public static CreateDidPersonFacevrfminiappRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDidPersonFacevrfminiappRequest self = new CreateDidPersonFacevrfminiappRequest();
        return TeaModel.build(map, self);
    }

    public CreateDidPersonFacevrfminiappRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDidPersonFacevrfminiappRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDidPersonFacevrfminiappRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public CreateDidPersonFacevrfminiappRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateDidPersonFacevrfminiappRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CreateDidPersonFacevrfminiappRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateDidPersonFacevrfminiappRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public CreateDidPersonFacevrfminiappRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CreateDidPersonFacevrfminiappRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public CreateDidPersonFacevrfminiappRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public CreateDidPersonFacevrfminiappRequest setFaceType(String faceType) {
        this.faceType = faceType;
        return this;
    }
    public String getFaceType() {
        return this.faceType;
    }

}
