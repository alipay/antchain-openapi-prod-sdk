// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateRealpersonFacevrfRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实人认证方案枚举
    // APP（客户端android/ios方案）
    // H5（网页）
    // ZFB（支付宝客户端H5方案）
    @NameInMap("solution_type")
    @Validation(required = true)
    public String solutionType;

    // 真实姓名
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 证件号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 身份信息来源类型
    // IDENTITY_CARD（身份证）
    // RESIDENCE_HK_MC（港澳居民居住证）
    // RESIDENCE_TAIWAN（台湾居民居住证）
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 【solution_type=ZFB使用】
    // reserve（保存活体人脸 默认值）
    // never（不保存活体人脸）
    @NameInMap("face_reserve_strategy")
    public String faceReserveStrategy;

    // 【solution_type=ZFB使用】
    // 认证成功后需要跳转的地址
    @NameInMap("return_url")
    public String returnUrl;

    public static CreateRealpersonFacevrfRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRealpersonFacevrfRequest self = new CreateRealpersonFacevrfRequest();
        return TeaModel.build(map, self);
    }

    public CreateRealpersonFacevrfRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateRealpersonFacevrfRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateRealpersonFacevrfRequest setSolutionType(String solutionType) {
        this.solutionType = solutionType;
        return this;
    }
    public String getSolutionType() {
        return this.solutionType;
    }

    public CreateRealpersonFacevrfRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CreateRealpersonFacevrfRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateRealpersonFacevrfRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CreateRealpersonFacevrfRequest setFaceReserveStrategy(String faceReserveStrategy) {
        this.faceReserveStrategy = faceReserveStrategy;
        return this;
    }
    public String getFaceReserveStrategy() {
        return this.faceReserveStrategy;
    }

    public CreateRealpersonFacevrfRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

}
