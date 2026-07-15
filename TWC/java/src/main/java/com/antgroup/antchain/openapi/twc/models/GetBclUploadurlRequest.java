// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetBclUploadurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件名称（最长128个字符，需要带文件后缀，不包含中文）
    @NameInMap("file_name")
    @Validation(required = true, maxLength = 128)
    public String fileName;

    public static GetBclUploadurlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBclUploadurlRequest self = new GetBclUploadurlRequest();
        return TeaModel.build(map, self);
    }

    public GetBclUploadurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetBclUploadurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetBclUploadurlRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
