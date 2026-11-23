// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.eraprod.models;

import com.aliyun.tea.*;

public class ImportKnowledgeTempfileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // acsellcore OSS 签名下载地址（有效期 ≥30 分钟）
    @NameInMap("oss_url")
    @Validation(required = true)
    public String ossUrl;

    // BUC 账号体系传员工工号
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 百灵租户空间唯一标识
    @NameInMap("space_id")
    @Validation(required = true)
    public String spaceId;

    // 上传后文件地址是否公网可访问，默认 "false"
    @NameInMap("public_access")
    public String publicAccess;

    // 解析超时（秒），默认 "60"
    @NameInMap("timeout")
    public String timeout;

    public static ImportKnowledgeTempfileRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportKnowledgeTempfileRequest self = new ImportKnowledgeTempfileRequest();
        return TeaModel.build(map, self);
    }

    public ImportKnowledgeTempfileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportKnowledgeTempfileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportKnowledgeTempfileRequest setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

    public ImportKnowledgeTempfileRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ImportKnowledgeTempfileRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public ImportKnowledgeTempfileRequest setPublicAccess(String publicAccess) {
        this.publicAccess = publicAccess;
        return this;
    }
    public String getPublicAccess() {
        return this.publicAccess;
    }

    public ImportKnowledgeTempfileRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}
