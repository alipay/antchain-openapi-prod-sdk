// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class JudgeCodeFakescreenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备型号
    @NameInMap("device_type")
    public String deviceType;

    // 未闪光图片的fileId
    @NameInMap("unflashed_file_id")
    @Validation(required = true)
    public String unflashedFileId;

    // 闪光后图片fileId
    @NameInMap("flashed_file_id")
    @Validation(required = true)
    public String flashedFileId;

    // 上传文件类型，默认为id。
    // id标识通过网关上传，参数为网关的fileId。
    // url标识上传的为图片可访问链接。
    @NameInMap("file_type")
    public String fileType;

    public static JudgeCodeFakescreenRequest build(java.util.Map<String, ?> map) throws Exception {
        JudgeCodeFakescreenRequest self = new JudgeCodeFakescreenRequest();
        return TeaModel.build(map, self);
    }

    public JudgeCodeFakescreenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public JudgeCodeFakescreenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public JudgeCodeFakescreenRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public JudgeCodeFakescreenRequest setUnflashedFileId(String unflashedFileId) {
        this.unflashedFileId = unflashedFileId;
        return this;
    }
    public String getUnflashedFileId() {
        return this.unflashedFileId;
    }

    public JudgeCodeFakescreenRequest setFlashedFileId(String flashedFileId) {
        this.flashedFileId = flashedFileId;
        return this;
    }
    public String getFlashedFileId() {
        return this.flashedFileId;
    }

    public JudgeCodeFakescreenRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
