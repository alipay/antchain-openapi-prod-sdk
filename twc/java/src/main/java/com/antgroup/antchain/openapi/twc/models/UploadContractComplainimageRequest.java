// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class UploadContractComplainimageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 图片名称，支持后缀格式：jpg、jpeg、png
    @NameInMap("file_name")
    @Validation(required = true, maxLength = 32)
    public String fileName;

    // 图片二进制字节流
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static UploadContractComplainimageRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadContractComplainimageRequest self = new UploadContractComplainimageRequest();
        return TeaModel.build(map, self);
    }

    public UploadContractComplainimageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadContractComplainimageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadContractComplainimageRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadContractComplainimageRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
