// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateAppVersionRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 目标应用完整名称
    @NameInMap("application_name")
    public String applicationName;

    // 应用部署包文件16字节md5值，以32位十六进制字符表示，不区分大小写。如果提供，APPMS下载应用部署包完成后，将会以此md5值进行校验，检验不通过则认为下载失败
    //                         
    @NameInMap("file_md5")
    public String fileMd5;

    // 应用部署包文件路径。长度不超过1024个单字节字符
    @NameInMap("file_path")
    @Validation(maxLength = 1024)
    public String filePath;

    // 应用部署包文件大小，单位字节。取值范围[1,524288000]，即最大支持500M, 524288000 = 500 x 1024 x 1024
    //                         
    @NameInMap("file_size")
    public Integer fileSize;

    // 文件交换源id
    @NameInMap("file_source")
    public String fileSource;

    // 目标租户名称
    @NameInMap("tenant")
    public String tenant;

    // 版本备注。长度不超过100个双字节字符
    @NameInMap("version_memo")
    @Validation(maxLength = 100)
    public String versionMemo;

    // 版本号。长度不超过50个单字节字符
    @NameInMap("version_no")
    @Validation(maxLength = 50)
    public String versionNo;

    // 目标工作空间名称
    @NameInMap("workspace")
    public String workspace;

    public static CreateAppVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppVersionRequest self = new CreateAppVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppVersionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAppVersionRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public CreateAppVersionRequest setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
        return this;
    }
    public String getFileMd5() {
        return this.fileMd5;
    }

    public CreateAppVersionRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public CreateAppVersionRequest setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Integer getFileSize() {
        return this.fileSize;
    }

    public CreateAppVersionRequest setFileSource(String fileSource) {
        this.fileSource = fileSource;
        return this;
    }
    public String getFileSource() {
        return this.fileSource;
    }

    public CreateAppVersionRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateAppVersionRequest setVersionMemo(String versionMemo) {
        this.versionMemo = versionMemo;
        return this;
    }
    public String getVersionMemo() {
        return this.versionMemo;
    }

    public CreateAppVersionRequest setVersionNo(String versionNo) {
        this.versionNo = versionNo;
        return this;
    }
    public String getVersionNo() {
        return this.versionNo;
    }

    public CreateAppVersionRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
