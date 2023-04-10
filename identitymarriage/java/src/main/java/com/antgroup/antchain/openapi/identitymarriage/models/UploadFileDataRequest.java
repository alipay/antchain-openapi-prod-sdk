// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.identitymarriage.models;

import com.aliyun.tea.*;

public class UploadFileDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件名
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 文件流
    @NameInMap("file")
    @Validation(required = true)
    public String file;

    public static UploadFileDataRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadFileDataRequest self = new UploadFileDataRequest();
        return TeaModel.build(map, self);
    }

    public UploadFileDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadFileDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadFileDataRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadFileDataRequest setFile(String file) {
        this.file = file;
        return this;
    }
    public String getFile() {
        return this.file;
    }

}
