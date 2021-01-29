// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SyncreateApplicationVersionRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 目标应用完整名称
    @NameInMap("application_name")
    @Validation(required = true)
    public String applicationName;

    // 应用部署包文件16字节md5值，以32位十六进制字符表示，不区分大小写。如果提供，将会以此md5值进行校验，检验不通过则认为创建失败
    //                                 
    @NameInMap("package_etag")
    public String packageEtag;

    // 应用发布包名称。长度不超过100个双字节字符
    @NameInMap("package_name")
    @Validation(required = true, maxLength = 100)
    public String packageName;

    // 应用发布包备注
    @NameInMap("version_memo")
    public String versionMemo;

    // 版本号。长度不超过50个单字节字符
    @NameInMap("version_no")
    @Validation(required = true, maxLength = 50)
    public String versionNo;

    // 目标工作空间名称
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static SyncreateApplicationVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncreateApplicationVersionRequest self = new SyncreateApplicationVersionRequest();
        return TeaModel.build(map, self);
    }

    public SyncreateApplicationVersionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncreateApplicationVersionRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public SyncreateApplicationVersionRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public SyncreateApplicationVersionRequest setPackageEtag(String packageEtag) {
        this.packageEtag = packageEtag;
        return this;
    }
    public String getPackageEtag() {
        return this.packageEtag;
    }

    public SyncreateApplicationVersionRequest setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public SyncreateApplicationVersionRequest setVersionMemo(String versionMemo) {
        this.versionMemo = versionMemo;
        return this;
    }
    public String getVersionMemo() {
        return this.versionMemo;
    }

    public SyncreateApplicationVersionRequest setVersionNo(String versionNo) {
        this.versionNo = versionNo;
        return this;
    }
    public String getVersionNo() {
        return this.versionNo;
    }

    public SyncreateApplicationVersionRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
