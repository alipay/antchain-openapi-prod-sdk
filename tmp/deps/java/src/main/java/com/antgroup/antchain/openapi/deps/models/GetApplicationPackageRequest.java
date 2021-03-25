// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetApplicationPackageRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 发布包所属的应用名称。最大60个UTF-8字符
    @NameInMap("application_name")
    @Validation(required = true)
    public String applicationName;

    // 版本号。长度不超过50个单字节字符
    @NameInMap("version_no")
    @Validation(required = true)
    public String versionNo;

    // 环境
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static GetApplicationPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationPackageRequest self = new GetApplicationPackageRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationPackageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetApplicationPackageRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public GetApplicationPackageRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public GetApplicationPackageRequest setVersionNo(String versionNo) {
        this.versionNo = versionNo;
        return this;
    }
    public String getVersionNo() {
        return this.versionNo;
    }

    public GetApplicationPackageRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
