// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class UploadSilentauthFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件名称，必须带真实扩展名，不含特殊字符及 emoji
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 文件大小，单位 byte，不超过 20MB
    @NameInMap("file_size")
    @Validation(required = true)
    public Long fileSize;

    // 文件 MD5 的 base64 编码，PUT 直传请求头须一致
    @NameInMap("content_md5")
    @Validation(required = true)
    public String contentMd5;

    // 文件 MIME 类型，与 PUT 直传请求头一致
    @NameInMap("content_type")
    @Validation(required = true)
    public String contentType;

    // 是否转 PDF，默认 false，建议本地预转 PDF
    @NameInMap("convert2_pdf")
    public Boolean convert2Pdf;

    public static UploadSilentauthFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadSilentauthFileRequest self = new UploadSilentauthFileRequest();
        return TeaModel.build(map, self);
    }

    public UploadSilentauthFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadSilentauthFileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadSilentauthFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadSilentauthFileRequest setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public UploadSilentauthFileRequest setContentMd5(String contentMd5) {
        this.contentMd5 = contentMd5;
        return this;
    }
    public String getContentMd5() {
        return this.contentMd5;
    }

    public UploadSilentauthFileRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public UploadSilentauthFileRequest setConvert2Pdf(Boolean convert2Pdf) {
        this.convert2Pdf = convert2Pdf;
        return this;
    }
    public Boolean getConvert2Pdf() {
        return this.convert2Pdf;
    }

}
