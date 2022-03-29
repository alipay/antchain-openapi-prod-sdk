// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ApiSuite extends TeaModel {
    // 产品码
    @NameInMap("provider_id")
    @Validation(required = true)
    public String providerId;

    // 套件版本
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    // 是否发布
    @NameInMap("released")
    @Validation(required = true)
    public Boolean released;

    // 版本号
    @NameInMap("version_alias")
    @Validation(required = true)
    public String versionAlias;

    public static ApiSuite build(java.util.Map<String, ?> map) throws Exception {
        ApiSuite self = new ApiSuite();
        return TeaModel.build(map, self);
    }

    public ApiSuite setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public ApiSuite setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ApiSuite setReleased(Boolean released) {
        this.released = released;
        return this;
    }
    public Boolean getReleased() {
        return this.released;
    }

    public ApiSuite setVersionAlias(String versionAlias) {
        this.versionAlias = versionAlias;
        return this;
    }
    public String getVersionAlias() {
        return this.versionAlias;
    }

}
