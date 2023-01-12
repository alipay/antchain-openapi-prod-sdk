// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UploadApplicationPackageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 目标应用完整名称
    @NameInMap("application_name")
    @Validation(required = true)
    public String applicationName;

    // 应用发布包名称。长度不超过100个双字节字符
    @NameInMap("package_name")
    @Validation(required = true, maxLength = 100)
    public String packageName;

    // 版本号。长度不超过50个单字节字符
    @NameInMap("version_no")
    @Validation(required = true, maxLength = 50)
    public String versionNo;

    // 目标工作空间名称
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static UploadApplicationPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadApplicationPackageRequest self = new UploadApplicationPackageRequest();
        return TeaModel.build(map, self);
    }

    public UploadApplicationPackageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadApplicationPackageRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public UploadApplicationPackageRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public UploadApplicationPackageRequest setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public UploadApplicationPackageRequest setVersionNo(String versionNo) {
        this.versionNo = versionNo;
        return this;
    }
    public String getVersionNo() {
        return this.versionNo;
    }

    public UploadApplicationPackageRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
