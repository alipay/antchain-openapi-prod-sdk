// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateQuotaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 维度标记
    @NameInMap("dim_identity")
    @Validation(required = true)
    public String dimIdentity;

    // resource
    @NameInMap("resource")
    @Validation(required = true)
    public String resource;

    // 额度值，实际值还需要乘上quota_factor
    @NameInMap("hard_limit")
    @Validation(required = true)
    public Long hardLimit;

    // 同步资源用
    @NameInMap("sync_interface")
    public String syncInterface;

    // 关于配额的描述信息
    @NameInMap("quota_desc")
    public String quotaDesc;

    // 由于OP不支持浮点数，请用字符串表示浮点数，比如”0.1“-带双引号
    @NameInMap("quota_factor")
    public String quotaFactor;

    public static CreateQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaRequest self = new CreateQuotaRequest();
        return TeaModel.build(map, self);
    }

    public CreateQuotaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateQuotaRequest setDimIdentity(String dimIdentity) {
        this.dimIdentity = dimIdentity;
        return this;
    }
    public String getDimIdentity() {
        return this.dimIdentity;
    }

    public CreateQuotaRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public CreateQuotaRequest setHardLimit(Long hardLimit) {
        this.hardLimit = hardLimit;
        return this;
    }
    public Long getHardLimit() {
        return this.hardLimit;
    }

    public CreateQuotaRequest setSyncInterface(String syncInterface) {
        this.syncInterface = syncInterface;
        return this;
    }
    public String getSyncInterface() {
        return this.syncInterface;
    }

    public CreateQuotaRequest setQuotaDesc(String quotaDesc) {
        this.quotaDesc = quotaDesc;
        return this;
    }
    public String getQuotaDesc() {
        return this.quotaDesc;
    }

    public CreateQuotaRequest setQuotaFactor(String quotaFactor) {
        this.quotaFactor = quotaFactor;
        return this;
    }
    public String getQuotaFactor() {
        return this.quotaFactor;
    }

}
