// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AppVersion extends TeaModel {
    // 所属应用id `内部id对用户无用，不应返回，应使用应用名称`
    @NameInMap("app_id")
    public String appId;

    // 从源代码构建时标识代码分支，上传新版本时为空 `混淆了应用版本和编译任务；目前没必要返回`
    @NameInMap("branch")
    public String branch;

    // 应用发布包构建类型:**scm**(源代码构建)，**upload_file**(发布包上传包括本地上传和从某个文件交换源上传) `混淆了应用版本和编译任务；目前没必要返回`
    //                 
    @NameInMap("build_type")
    public String buildType;

    // 从源代码构建时标识代码版本，上传新版本时为空 `混淆了应用版本和编译任务；目前没必要返回`
    @NameInMap("code_version")
    public String codeVersion;

    // 版本描述
    @NameInMap("description")
    public String description;

    // 新版本构建的错误码，成功则为空 `混淆了应用版本和编译任务`
    @NameInMap("error_code")
    public String errorCode;

    // 新版本构建的错误提示信息，成功则为空 `混淆了应用版本和编译任务`
    @NameInMap("error_msg")
    public String errorMsg;

    // 构建成功后标识应用发布包的md5
    @NameInMap("etag")
    public String etag;

    // 应用版本id `内部id对用户无用，不应返回`
    @NameInMap("id")
    public String id;

    // 应用构建状态:**doing**(进行中),**success**(成功),**failed**(失败)
    @NameInMap("status")
    public String status;

    // 本次应用发布包构建后台任务的id `混淆了应用版本和构建任务，应使用2个不同的模型`
    @NameInMap("task_id")
    public String taskId;

    // 创建时间 `命名建议为create_time`
    @NameInMap("utc_create")
    public String utcCreate;

    // 应用版本号
    @NameInMap("version")
    public String version;

    // 所属工作空间 `内部id对用户无用，不应返回，应使用workspace unique名称`
    @NameInMap("workspace_id")
    public String workspaceId;

    public static AppVersion build(java.util.Map<String, ?> map) throws Exception {
        AppVersion self = new AppVersion();
        return TeaModel.build(map, self);
    }

    public AppVersion setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AppVersion setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public AppVersion setBuildType(String buildType) {
        this.buildType = buildType;
        return this;
    }
    public String getBuildType() {
        return this.buildType;
    }

    public AppVersion setCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }
    public String getCodeVersion() {
        return this.codeVersion;
    }

    public AppVersion setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AppVersion setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AppVersion setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public AppVersion setEtag(String etag) {
        this.etag = etag;
        return this;
    }
    public String getEtag() {
        return this.etag;
    }

    public AppVersion setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppVersion setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AppVersion setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public AppVersion setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public AppVersion setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public AppVersion setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
