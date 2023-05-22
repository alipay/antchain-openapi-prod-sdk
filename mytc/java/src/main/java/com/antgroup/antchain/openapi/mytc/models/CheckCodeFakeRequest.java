// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class CheckCodeFakeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备型号
    @NameInMap("device_type")
    public String deviceType;

    // 图片文件id，通过小程序拍照，上传的二维码图片信息。	
    // 待上传文件
    @NameInMap("fileObject")
    public java.io.InputStream fileObject;

    // 待上传文件名
    @NameInMap("fileObjectName")
    public String fileObjectName;

    @NameInMap("file_id")
    public String fileId;

    // Base64格式的图片数据	
    // 
    @NameInMap("image_str")
    public String imageStr;

    public static CheckCodeFakeRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckCodeFakeRequest self = new CheckCodeFakeRequest();
        return TeaModel.build(map, self);
    }

    public CheckCodeFakeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckCodeFakeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckCodeFakeRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public CheckCodeFakeRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public CheckCodeFakeRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public CheckCodeFakeRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CheckCodeFakeRequest setImageStr(String imageStr) {
        this.imageStr = imageStr;
        return this;
    }
    public String getImageStr() {
        return this.imageStr;
    }

}
