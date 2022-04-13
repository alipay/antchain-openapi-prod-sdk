// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetUnireleaseSolutionfileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // Sftp目录：/sftp/linkw/unionpay/date/id/prod/timestamp-solution.json
    // 
    @NameInMap("file_path")
    @Validation(required = true)
    public String filePath;

    public static GetUnireleaseSolutionfileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUnireleaseSolutionfileRequest self = new GetUnireleaseSolutionfileRequest();
        return TeaModel.build(map, self);
    }

    public GetUnireleaseSolutionfileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetUnireleaseSolutionfileRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

}
