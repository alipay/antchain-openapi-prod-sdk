// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class ExecFaceverifyServermodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 真实姓名
    @NameInMap("cert_name")
    public String certName;

    // 证件号码
    @NameInMap("cert_no")
    public String certNo;

    // cert_name、cert_no两个字段的传入模式0：明文 1：密文
    @NameInMap("enc_type")
    public String encType;

    // 证件类型，如身份证
    @NameInMap("cert_type")
    public String certType;

    // 预留扩展参数
    @NameInMap("extern_param")
    public String externParam;

    // 自定义比对源人脸图像，base64编码格式
    @NameInMap("facial_picture_ref")
    public String facialPictureRef;

    // 身份信息来源类型，如证件
    @NameInMap("identity_type")
    @Validation(required = true)
    public String identityType;

    // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 场景ID
    @NameInMap("scene_id")
    @Validation(required = true)
    public String sceneId;

    // 商户自定义的用户ID
    @NameInMap("user_id")
    public String userId;

    // 用户的IP
    @NameInMap("user_ip")
    public String userIp;

    // 用户的手机号（或其哈希值）
    @NameInMap("user_mobile")
    public String userMobile;

    // 待认证的人脸图像，base64编码格式
    @NameInMap("facial_picture_auth")
    public String facialPictureAuth;

    // 视频文件
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
    public String fileId;

    // 图片的传入加密模式 0：明文 1：AES加密
    @NameInMap("material_enc_type")
    public String materialEncType;

    // 公钥加密后的密钥，用于传入的加密图片/视频
    @NameInMap("material_enc_token")
    public String materialEncToken;

    public static ExecFaceverifyServermodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecFaceverifyServermodeRequest self = new ExecFaceverifyServermodeRequest();
        return TeaModel.build(map, self);
    }

    public ExecFaceverifyServermodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecFaceverifyServermodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecFaceverifyServermodeRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public ExecFaceverifyServermodeRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public ExecFaceverifyServermodeRequest setEncType(String encType) {
        this.encType = encType;
        return this;
    }
    public String getEncType() {
        return this.encType;
    }

    public ExecFaceverifyServermodeRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public ExecFaceverifyServermodeRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

    public ExecFaceverifyServermodeRequest setFacialPictureRef(String facialPictureRef) {
        this.facialPictureRef = facialPictureRef;
        return this;
    }
    public String getFacialPictureRef() {
        return this.facialPictureRef;
    }

    public ExecFaceverifyServermodeRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public ExecFaceverifyServermodeRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public ExecFaceverifyServermodeRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public ExecFaceverifyServermodeRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ExecFaceverifyServermodeRequest setUserIp(String userIp) {
        this.userIp = userIp;
        return this;
    }
    public String getUserIp() {
        return this.userIp;
    }

    public ExecFaceverifyServermodeRequest setUserMobile(String userMobile) {
        this.userMobile = userMobile;
        return this;
    }
    public String getUserMobile() {
        return this.userMobile;
    }

    public ExecFaceverifyServermodeRequest setFacialPictureAuth(String facialPictureAuth) {
        this.facialPictureAuth = facialPictureAuth;
        return this;
    }
    public String getFacialPictureAuth() {
        return this.facialPictureAuth;
    }

    public ExecFaceverifyServermodeRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public ExecFaceverifyServermodeRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public ExecFaceverifyServermodeRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ExecFaceverifyServermodeRequest setMaterialEncType(String materialEncType) {
        this.materialEncType = materialEncType;
        return this;
    }
    public String getMaterialEncType() {
        return this.materialEncType;
    }

    public ExecFaceverifyServermodeRequest setMaterialEncToken(String materialEncToken) {
        this.materialEncToken = materialEncToken;
        return this;
    }
    public String getMaterialEncToken() {
        return this.materialEncToken;
    }

}
