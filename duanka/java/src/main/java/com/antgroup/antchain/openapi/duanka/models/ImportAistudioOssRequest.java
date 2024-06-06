// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class ImportAistudioOssRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 阿里云oss路径
    @NameInMap("aliyun_oss_path")
    @Validation(required = true)
    public String aliyunOssPath;

    // 主站oss路径
    @NameInMap("ant_oss_path")
    @Validation(required = true)
    public String antOssPath;

    public static ImportAistudioOssRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportAistudioOssRequest self = new ImportAistudioOssRequest();
        return TeaModel.build(map, self);
    }

    public ImportAistudioOssRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportAistudioOssRequest setAliyunOssPath(String aliyunOssPath) {
        this.aliyunOssPath = aliyunOssPath;
        return this;
    }
    public String getAliyunOssPath() {
        return this.aliyunOssPath;
    }

    public ImportAistudioOssRequest setAntOssPath(String antOssPath) {
        this.antOssPath = antOssPath;
        return this;
    }
    public String getAntOssPath() {
        return this.antOssPath;
    }

}
