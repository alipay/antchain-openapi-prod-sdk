// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetAftsUploadUrlResponse extends TeaModel {
    // 11121312
    @NameInMap("mass_token")
    @Validation(required = true)
    public String massToken;

    // 上传文件地址
    @NameInMap("upload_url")
    @Validation(required = true)
    public String uploadUrl;

    public static GetAftsUploadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAftsUploadUrlResponse self = new GetAftsUploadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetAftsUploadUrlResponse setMassToken(String massToken) {
        this.massToken = massToken;
        return this;
    }
    public String getMassToken() {
        return this.massToken;
    }

    public GetAftsUploadUrlResponse setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }
    public String getUploadUrl() {
        return this.uploadUrl;
    }

}
