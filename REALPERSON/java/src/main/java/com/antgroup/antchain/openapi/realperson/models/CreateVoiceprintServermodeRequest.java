// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class CreateVoiceprintServermodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 商户自定义的用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 音频文件流
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

    // 音频元数据
    @NameInMap("audio_meta")
    @Validation(required = true)
    public AudioMeta audioMeta;

    // 音频文件集合
    @NameInMap("audios")
    @Validation(required = true)
    public java.util.List<Audio> audios;

    // 预留扩展参数
    @NameInMap("extern_param")
    public String externParam;

    public static CreateVoiceprintServermodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVoiceprintServermodeRequest self = new CreateVoiceprintServermodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateVoiceprintServermodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateVoiceprintServermodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateVoiceprintServermodeRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public CreateVoiceprintServermodeRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateVoiceprintServermodeRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public CreateVoiceprintServermodeRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public CreateVoiceprintServermodeRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CreateVoiceprintServermodeRequest setAudioMeta(AudioMeta audioMeta) {
        this.audioMeta = audioMeta;
        return this;
    }
    public AudioMeta getAudioMeta() {
        return this.audioMeta;
    }

    public CreateVoiceprintServermodeRequest setAudios(java.util.List<Audio> audios) {
        this.audios = audios;
        return this;
    }
    public java.util.List<Audio> getAudios() {
        return this.audios;
    }

    public CreateVoiceprintServermodeRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
