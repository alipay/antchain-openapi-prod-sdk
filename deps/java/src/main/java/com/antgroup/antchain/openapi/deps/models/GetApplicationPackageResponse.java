// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetApplicationPackageResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 应用发布包所属应用名字
    @NameInMap("app_name")
    public String appName;

    // 应用发布包创建时间
    @NameInMap("creation_time")
    public String creationTime;

    // 应用发布包下载地址
    @NameInMap("download_url")
    public String downloadUrl;

    // 应用发布包的校验码
    @NameInMap("etag")
    public String etag;

    // 应用发布包名称
    @NameInMap("name")
    public String name;

    // 应用发布包备注
    @NameInMap("version_memo")
    public String versionMemo;

    // 应用发布包版本
    @NameInMap("version_no")
    public String versionNo;

    // 应用发布包所属环境
    @NameInMap("workspace")
    public String workspace;

    public static GetApplicationPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationPackageResponse self = new GetApplicationPackageResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationPackageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetApplicationPackageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetApplicationPackageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetApplicationPackageResponse setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetApplicationPackageResponse setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public GetApplicationPackageResponse setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public GetApplicationPackageResponse setEtag(String etag) {
        this.etag = etag;
        return this;
    }
    public String getEtag() {
        return this.etag;
    }

    public GetApplicationPackageResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetApplicationPackageResponse setVersionMemo(String versionMemo) {
        this.versionMemo = versionMemo;
        return this;
    }
    public String getVersionMemo() {
        return this.versionMemo;
    }

    public GetApplicationPackageResponse setVersionNo(String versionNo) {
        this.versionNo = versionNo;
        return this;
    }
    public String getVersionNo() {
        return this.versionNo;
    }

    public GetApplicationPackageResponse setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
