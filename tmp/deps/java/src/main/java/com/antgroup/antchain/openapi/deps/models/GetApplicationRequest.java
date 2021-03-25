// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetApplicationRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 待查询的应用名称。最大60个UTF-8字符
    @NameInMap("application_name")
    @Validation(required = true)
    public String applicationName;

    // 查询结果是否返回应用额外元数据信息。默认为 false
    @NameInMap("query_extra_info")
    public Boolean queryExtraInfo;

    public static GetApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationRequest self = new GetApplicationRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetApplicationRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public GetApplicationRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public GetApplicationRequest setQueryExtraInfo(Boolean queryExtraInfo) {
        this.queryExtraInfo = queryExtraInfo;
        return this;
    }
    public Boolean getQueryExtraInfo() {
        return this.queryExtraInfo;
    }

}
