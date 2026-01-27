// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryRiskServerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备信息
    @NameInMap("device_info")
    @Validation(required = true)
    public DeviceInfo deviceInfo;

    // 设备风险信息
    @NameInMap("device_risk_info")
    @Validation(required = true)
    public DeviceRiskInfo deviceRiskInfo;

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

    // base64编码最佳人脸图，可加密
    @NameInMap("face_image")
    @Validation(required = true)
    public String faceImage;

    // 唯一标识业务请求
    @NameInMap("unique_id")
    @Validation(required = true)
    public String uniqueId;

    // 标识应用程序名称
    @NameInMap("app_name")
    public String appName;

    // 标识应用程序版本
    @NameInMap("app_version")
    public String appVersion;

    // 标识业务场景
    @NameInMap("scene_id")
    public String sceneId;

    // 姓名，可加密
    @NameInMap("cert_name")
    public String certName;

    // 身份证号，可加密
    @NameInMap("cert_no")
    public String certNo;

    // 表示用户唯一id
    @NameInMap("uid")
    public String uid;

    // cert_name、cert_no两个字段的传入模式0：明文 1：密文
    @NameInMap("enc_type")
    public String encType;

    // 图片的传入加密模式 0：明文 1：AES加密
    @NameInMap("material_enc_type")
    public String materialEncType;

    // 公钥加密后的密钥，用于传入的加密图片/视频
    @NameInMap("material_enc_token")
    public String materialEncToken;

    public static QueryRiskServerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskServerRequest self = new QueryRiskServerRequest();
        return TeaModel.build(map, self);
    }

    public QueryRiskServerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRiskServerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRiskServerRequest setDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public QueryRiskServerRequest setDeviceRiskInfo(DeviceRiskInfo deviceRiskInfo) {
        this.deviceRiskInfo = deviceRiskInfo;
        return this;
    }
    public DeviceRiskInfo getDeviceRiskInfo() {
        return this.deviceRiskInfo;
    }

    public QueryRiskServerRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public QueryRiskServerRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public QueryRiskServerRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public QueryRiskServerRequest setFaceImage(String faceImage) {
        this.faceImage = faceImage;
        return this;
    }
    public String getFaceImage() {
        return this.faceImage;
    }

    public QueryRiskServerRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public QueryRiskServerRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryRiskServerRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public QueryRiskServerRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public QueryRiskServerRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public QueryRiskServerRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryRiskServerRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public QueryRiskServerRequest setEncType(String encType) {
        this.encType = encType;
        return this;
    }
    public String getEncType() {
        return this.encType;
    }

    public QueryRiskServerRequest setMaterialEncType(String materialEncType) {
        this.materialEncType = materialEncType;
        return this;
    }
    public String getMaterialEncType() {
        return this.materialEncType;
    }

    public QueryRiskServerRequest setMaterialEncToken(String materialEncToken) {
        this.materialEncToken = materialEncToken;
        return this;
    }
    public String getMaterialEncToken() {
        return this.materialEncToken;
    }

}
