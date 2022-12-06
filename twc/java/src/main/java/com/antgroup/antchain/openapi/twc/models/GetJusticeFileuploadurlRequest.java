// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetJusticeFileuploadurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 上传文件全名
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 文件Md5值，用于上传后的文件校验
    @NameInMap("file_md5")
    @Validation(required = true)
    public String fileMd5;

    // 枚举值：案件证据文件：EVIDENCE
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    public static GetJusticeFileuploadurlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJusticeFileuploadurlRequest self = new GetJusticeFileuploadurlRequest();
        return TeaModel.build(map, self);
    }

    public GetJusticeFileuploadurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetJusticeFileuploadurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetJusticeFileuploadurlRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetJusticeFileuploadurlRequest setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
        return this;
    }
    public String getFileMd5() {
        return this.fileMd5;
    }

    public GetJusticeFileuploadurlRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
