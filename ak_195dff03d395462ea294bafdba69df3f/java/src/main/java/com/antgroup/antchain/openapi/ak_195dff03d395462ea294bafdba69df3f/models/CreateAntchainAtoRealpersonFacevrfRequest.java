// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class CreateAntchainAtoRealpersonFacevrfRequest extends TeaModel {
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

    public CreateAntchainAtoRealpersonFacevrfRequest setSolutionType(String solutionType) {
        this.solutionType = solutionType;
        return this;
    }
    public String getSolutionType() {
        return this.solutionType;
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

    public CreateAntchainAtoRealpersonFacevrfRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CreateAntchainAtoRealpersonFacevrfRequest setFaceReserveStrategy(String faceReserveStrategy) {
        this.faceReserveStrategy = faceReserveStrategy;
        return this;
    }
    public String getFaceReserveStrategy() {
        return this.faceReserveStrategy;
    }

    public CreateAntchainAtoRealpersonFacevrfRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

}
