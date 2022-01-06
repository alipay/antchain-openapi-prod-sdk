// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ImportDrmDrmresourcesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 上传类型。
    // data 表示上传带有推送值，空表示只传元数据
    @NameInMap("upload_type")
    public String uploadType;

    // oss 上下载的地址
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    public static ImportDrmDrmresourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDrmDrmresourcesRequest self = new ImportDrmDrmresourcesRequest();
        return TeaModel.build(map, self);
    }

    public ImportDrmDrmresourcesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportDrmDrmresourcesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportDrmDrmresourcesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ImportDrmDrmresourcesRequest setUploadType(String uploadType) {
        this.uploadType = uploadType;
        return this;
    }
    public String getUploadType() {
        return this.uploadType;
    }

    public ImportDrmDrmresourcesRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
