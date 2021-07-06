// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gatewayx.models;

import com.aliyun.tea.*;

public class GetFileDownloadRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 文件唯一id
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    public static GetFileDownloadRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileDownloadRequest self = new GetFileDownloadRequest();
        return TeaModel.build(map, self);
    }

    public GetFileDownloadRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetFileDownloadRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
