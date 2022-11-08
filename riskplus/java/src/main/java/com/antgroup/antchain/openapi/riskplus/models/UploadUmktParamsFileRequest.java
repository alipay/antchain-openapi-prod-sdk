// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class UploadUmktParamsFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // file_id
    // 待上传文件
    @NameInMap("fileObject")
    public java.io.InputStream fileObject;

    // 待上传文件名
    @NameInMap("fileObjectName")
    public String fileObjectName;

    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 场景策略id
    @NameInMap("scene_strategy_id")
    @Validation(required = true, minimum = 1)
    public Long sceneStrategyId;

    // 预计执行时间，不设置则为立即执行
    @NameInMap("exec_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String execTime;

    // 支持不同的文件模版：
    // MOBILE_MD5_WITH_MS_VARIABLE、MOBILE_MD5
    // 后续支持
    // DEVICE_MD5
    @NameInMap("file_template")
    @Validation(required = true)
    public String fileTemplate;

    // 外部流水号
    @NameInMap("out_serial_no")
    @Validation(required = true)
    public String outSerialNo;

    // 外部透传字段
    @NameInMap("out_info")
    public String outInfo;

    public static UploadUmktParamsFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadUmktParamsFileRequest self = new UploadUmktParamsFileRequest();
        return TeaModel.build(map, self);
    }

    public UploadUmktParamsFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadUmktParamsFileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadUmktParamsFileRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public UploadUmktParamsFileRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public UploadUmktParamsFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public UploadUmktParamsFileRequest setSceneStrategyId(Long sceneStrategyId) {
        this.sceneStrategyId = sceneStrategyId;
        return this;
    }
    public Long getSceneStrategyId() {
        return this.sceneStrategyId;
    }

    public UploadUmktParamsFileRequest setExecTime(String execTime) {
        this.execTime = execTime;
        return this;
    }
    public String getExecTime() {
        return this.execTime;
    }

    public UploadUmktParamsFileRequest setFileTemplate(String fileTemplate) {
        this.fileTemplate = fileTemplate;
        return this;
    }
    public String getFileTemplate() {
        return this.fileTemplate;
    }

    public UploadUmktParamsFileRequest setOutSerialNo(String outSerialNo) {
        this.outSerialNo = outSerialNo;
        return this;
    }
    public String getOutSerialNo() {
        return this.outSerialNo;
    }

    public UploadUmktParamsFileRequest setOutInfo(String outInfo) {
        this.outInfo = outInfo;
        return this;
    }
    public String getOutInfo() {
        return this.outInfo;
    }

}
