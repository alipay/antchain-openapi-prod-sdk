// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class QueryResourcePatchlistResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 差量包生成状态，包括PATCHING（生成中）和FINISHED（生成完成）
    @NameInMap("patch_status")
    public String patchStatus;

    // 全量包下载地址
    @NameInMap("url")
    public String url;

    // 资源ID
    @NameInMap("resource_id")
    public String resourceId;

    // 全量包版本号
    @NameInMap("version")
    public Long version;

    // 全量包md5摘要值
    @NameInMap("md5")
    public String md5;

    // 全量包文件大小
    @NameInMap("size")
    public Long size;

    // 差量包文件信息列表
    @NameInMap("patch_list")
    public java.util.List<GeneralResourcePatch> patchList;

    public static QueryResourcePatchlistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryResourcePatchlistResponse self = new QueryResourcePatchlistResponse();
        return TeaModel.build(map, self);
    }

    public QueryResourcePatchlistResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryResourcePatchlistResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryResourcePatchlistResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryResourcePatchlistResponse setPatchStatus(String patchStatus) {
        this.patchStatus = patchStatus;
        return this;
    }
    public String getPatchStatus() {
        return this.patchStatus;
    }

    public QueryResourcePatchlistResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public QueryResourcePatchlistResponse setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public QueryResourcePatchlistResponse setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

    public QueryResourcePatchlistResponse setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public QueryResourcePatchlistResponse setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public QueryResourcePatchlistResponse setPatchList(java.util.List<GeneralResourcePatch> patchList) {
        this.patchList = patchList;
        return this;
    }
    public java.util.List<GeneralResourcePatch> getPatchList() {
        return this.patchList;
    }

}
