// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class CreateAntcloudGatewayxFileUploadRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 上传文件作用的openapi method
    @NameInMap("api_code")
    @Validation(required = true)
    public String apiCode;

    // 文件标签，多个标签;分割
    @NameInMap("file_label")
    @Validation(maxLength = 100)
    public String fileLabel;

    // 自定义的文件元数据
    @NameInMap("file_metadata")
    @Validation(maxLength = 1000)
    public String fileMetadata;

    // 文件名，不传则随机生成文件名
    @NameInMap("file_name")
    @Validation(maxLength = 100)
    public String fileName;

    // 文件的多媒体类型
    @NameInMap("mime_type")
    public String mimeType;

    // 产品方的api归属集群，即productInstanceId
    @NameInMap("api_cluster")
    public String apiCluster;

    public static CreateAntcloudGatewayxFileUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntcloudGatewayxFileUploadRequest self = new CreateAntcloudGatewayxFileUploadRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntcloudGatewayxFileUploadRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAntcloudGatewayxFileUploadRequest setApiCode(String apiCode) {
        this.apiCode = apiCode;
        return this;
    }
    public String getApiCode() {
        return this.apiCode;
    }

    public CreateAntcloudGatewayxFileUploadRequest setFileLabel(String fileLabel) {
        this.fileLabel = fileLabel;
        return this;
    }
    public String getFileLabel() {
        return this.fileLabel;
    }

    public CreateAntcloudGatewayxFileUploadRequest setFileMetadata(String fileMetadata) {
        this.fileMetadata = fileMetadata;
        return this;
    }
    public String getFileMetadata() {
        return this.fileMetadata;
    }

    public CreateAntcloudGatewayxFileUploadRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateAntcloudGatewayxFileUploadRequest setMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }
    public String getMimeType() {
        return this.mimeType;
    }

    public CreateAntcloudGatewayxFileUploadRequest setApiCluster(String apiCluster) {
        this.apiCluster = apiCluster;
        return this;
    }
    public String getApiCluster() {
        return this.apiCluster;
    }

}
