// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UploadAuthCertPhotoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 图片文件类型
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    public static UploadAuthCertPhotoRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadAuthCertPhotoRequest self = new UploadAuthCertPhotoRequest();
        return TeaModel.build(map, self);
    }

    public UploadAuthCertPhotoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadAuthCertPhotoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadAuthCertPhotoRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
