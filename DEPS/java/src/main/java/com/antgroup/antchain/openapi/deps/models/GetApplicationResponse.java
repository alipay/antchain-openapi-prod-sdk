// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetApplicationResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 应用别名
    @NameInMap("alias")
    public String alias;

    // 应用名称
    @NameInMap("application_name")
    public String applicationName;

    // 应用额外元数据信息
    @NameInMap("app_extra_infos")
    public java.util.List<AppExtraInfo> appExtraInfos;

    // 应用所属分组名
    @NameInMap("app_group_name")
    public String appGroupName;

    // 应用等级名称
    @NameInMap("app_level")
    public String appLevel;

    // 技术栈名称
    @NameInMap("buildpack_name")
    public String buildpackName;

    // 应用创建时间
    @NameInMap("creation_time")
    public String creationTime;

    // 应用描述
    @NameInMap("description")
    public String description;

    // 应用负责人登录名
    @NameInMap("owner_login_name")
    public String ownerLoginName;

    // 应用状态。取值列表：
    //                             CREATING：应用创建中；
    //                             CREATED：应用成功创建，可正常使用；
    //                             CREATE_FAILED：应用创建失败
    //                         
    @NameInMap("status")
    public String status;

    // 发布模式， package，image，mixed
    @NameInMap("deploy_type")
    public String deployType;

    // 全局唯一名字
    @NameInMap("global_name")
    public String globalName;

    public static GetApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationResponse self = new GetApplicationResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetApplicationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetApplicationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetApplicationResponse setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public GetApplicationResponse setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public GetApplicationResponse setAppExtraInfos(java.util.List<AppExtraInfo> appExtraInfos) {
        this.appExtraInfos = appExtraInfos;
        return this;
    }
    public java.util.List<AppExtraInfo> getAppExtraInfos() {
        return this.appExtraInfos;
    }

    public GetApplicationResponse setAppGroupName(String appGroupName) {
        this.appGroupName = appGroupName;
        return this;
    }
    public String getAppGroupName() {
        return this.appGroupName;
    }

    public GetApplicationResponse setAppLevel(String appLevel) {
        this.appLevel = appLevel;
        return this;
    }
    public String getAppLevel() {
        return this.appLevel;
    }

    public GetApplicationResponse setBuildpackName(String buildpackName) {
        this.buildpackName = buildpackName;
        return this;
    }
    public String getBuildpackName() {
        return this.buildpackName;
    }

    public GetApplicationResponse setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public GetApplicationResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetApplicationResponse setOwnerLoginName(String ownerLoginName) {
        this.ownerLoginName = ownerLoginName;
        return this;
    }
    public String getOwnerLoginName() {
        return this.ownerLoginName;
    }

    public GetApplicationResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetApplicationResponse setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

    public GetApplicationResponse setGlobalName(String globalName) {
        this.globalName = globalName;
        return this;
    }
    public String getGlobalName() {
        return this.globalName;
    }

}
