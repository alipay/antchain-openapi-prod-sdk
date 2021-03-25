// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class PullConfigTemplateRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // RELEAES：获取最新的、已经发布的参数模板；
    // DRAFT：获取最新的参数模板草稿；
    // 不指定：获取已存在的最新的参数模板，不区分已发布或者草稿态；
    @NameInMap("state")
    public String state;

    public static PullConfigTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        PullConfigTemplateRequest self = new PullConfigTemplateRequest();
        return TeaModel.build(map, self);
    }

    public PullConfigTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PullConfigTemplateRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public PullConfigTemplateRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public PullConfigTemplateRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
