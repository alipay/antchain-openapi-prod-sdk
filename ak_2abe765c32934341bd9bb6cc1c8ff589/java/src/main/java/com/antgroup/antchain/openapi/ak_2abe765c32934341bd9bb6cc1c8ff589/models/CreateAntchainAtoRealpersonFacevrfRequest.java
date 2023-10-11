// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2abe765c32934341bd9bb6cc1c8ff589.models;

import com.aliyun.tea.*;

public class CreateAntchainAtoRealpersonFacevrfRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 真实姓名
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 证件号码
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

    // 商户请求的唯一标识。
    // 
    // 值为 32 位长度的字母数字组合。其中，前面几位字符是商户自定义的简称，中间几位可以使用一段时间，后段可以使用一个随机或递增序列。该值也可以使用 UUID。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 认证结束回跳地址
    @NameInMap("return_url")
    @Validation(required = true)
    public String returnUrl;

    // 订单id 长度不可超过50
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    public static CreateAntchainAtoRealpersonFacevrfRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntchainAtoRealpersonFacevrfRequest self = new CreateAntchainAtoRealpersonFacevrfRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntchainAtoRealpersonFacevrfRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAntchainAtoRealpersonFacevrfRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAntchainAtoRealpersonFacevrfRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CreateAntchainAtoRealpersonFacevrfRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateAntchainAtoRealpersonFacevrfRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public CreateAntchainAtoRealpersonFacevrfRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CreateAntchainAtoRealpersonFacevrfRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public CreateAntchainAtoRealpersonFacevrfRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public CreateAntchainAtoRealpersonFacevrfRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
