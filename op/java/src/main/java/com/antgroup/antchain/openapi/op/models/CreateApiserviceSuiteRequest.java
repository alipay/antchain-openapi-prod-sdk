// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class CreateApiserviceSuiteRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 默认为1.0.0
    @NameInMap("suite_version")
    public String suiteVersion;

    // 所属产品名
    @NameInMap("provider_name")
    @Validation(required = true)
    public String providerName;

    // 是否已经发布
    @NameInMap("released")
    @Validation(required = true)
    public Boolean released;

    public static CreateApiserviceSuiteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApiserviceSuiteRequest self = new CreateApiserviceSuiteRequest();
        return TeaModel.build(map, self);
    }

    public CreateApiserviceSuiteRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateApiserviceSuiteRequest setSuiteVersion(String suiteVersion) {
        this.suiteVersion = suiteVersion;
        return this;
    }
    public String getSuiteVersion() {
        return this.suiteVersion;
    }

    public CreateApiserviceSuiteRequest setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }
    public String getProviderName() {
        return this.providerName;
    }

    public CreateApiserviceSuiteRequest setReleased(Boolean released) {
        this.released = released;
        return this;
    }
    public Boolean getReleased() {
        return this.released;
    }

}
