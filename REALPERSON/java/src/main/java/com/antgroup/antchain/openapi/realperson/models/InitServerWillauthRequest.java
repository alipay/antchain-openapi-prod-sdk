// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class InitServerWillauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // string
    /**
     * <p>待上传文件</p>
     */
    @NameInMap("fileObject")
    public java.io.InputStream fileObject;

    /**
     * <p>待上传文件名</p>
     */
    @NameInMap("fileObjectName")
    public String fileObjectName;

    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 场景id
    @NameInMap("scene_id")
    @Validation(required = true)
    public String sceneId;

    // 身份证姓名
    @NameInMap("cert_name")
    public String certName;

    // 身份证号
    @NameInMap("cert_no")
    public String certNo;

    // 加密方式
    @NameInMap("enc_type")
    public String encType;

    // 无源比对图片base64
    @NameInMap("facial_picture_ref")
    public String facialPictureRef;

    // 业务回跳地址
    @NameInMap("return_url")
    public String returnUrl;

    // 业务请求唯一标识
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 扩展参数
    @NameInMap("extern_param")
    public String externParam;

    // 身份信息来源类型，当前仅支持证件（CERT_INFO）
    @NameInMap("identity_type")
    public String identityType;

    // 证件类型，当前仅支持身份证类型证件，包括：二代身份证、港澳居住证、台湾居住证（IDENTITY_CARD）
    @NameInMap("cert_type")
    public String certType;

    // 要进行活体检测的类型
    @NameInMap("model")
    public String model;

    // 图片/视频的传入加密模式
    @NameInMap("material_enc_type")
    public String materialEncType;

    // RSA/SM2公钥加密后的AES/SM4密钥（Base64编码），用于传入的加密图片/视频。
    @NameInMap("material_enc_token")
    public String materialEncToken;

    public static InitServerWillauthRequest build(java.util.Map<String, ?> map) throws Exception {
        InitServerWillauthRequest self = new InitServerWillauthRequest();
        return TeaModel.build(map, self);
    }

    public InitServerWillauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitServerWillauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitServerWillauthRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public InitServerWillauthRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public InitServerWillauthRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public InitServerWillauthRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public InitServerWillauthRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public InitServerWillauthRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public InitServerWillauthRequest setEncType(String encType) {
        this.encType = encType;
        return this;
    }
    public String getEncType() {
        return this.encType;
    }

    public InitServerWillauthRequest setFacialPictureRef(String facialPictureRef) {
        this.facialPictureRef = facialPictureRef;
        return this;
    }
    public String getFacialPictureRef() {
        return this.facialPictureRef;
    }

    public InitServerWillauthRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public InitServerWillauthRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public InitServerWillauthRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

    public InitServerWillauthRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public InitServerWillauthRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public InitServerWillauthRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public InitServerWillauthRequest setMaterialEncType(String materialEncType) {
        this.materialEncType = materialEncType;
        return this;
    }
    public String getMaterialEncType() {
        return this.materialEncType;
    }

    public InitServerWillauthRequest setMaterialEncToken(String materialEncToken) {
        this.materialEncToken = materialEncToken;
        return this;
    }
    public String getMaterialEncToken() {
        return this.materialEncToken;
    }

}
