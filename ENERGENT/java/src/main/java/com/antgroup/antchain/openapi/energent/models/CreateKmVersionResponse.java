// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class CreateKmVersionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 版本ID
    @NameInMap("version_id")
    public String versionId;

    // 知识库ID
    @NameInMap("tree_id")
    public String treeId;

    // 版本号
    @NameInMap("version")
    public String version;

    // 版本状态
    @NameInMap("status")
    public String status;

    // 发布任务总数
    @NameInMap("total_task_count")
    public Long totalTaskCount;

    // 已完成任务数
    @NameInMap("completed_count")
    public Long completedCount;

    public static CreateKmVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKmVersionResponse self = new CreateKmVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateKmVersionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateKmVersionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateKmVersionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateKmVersionResponse setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public CreateKmVersionResponse setTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }
    public String getTreeId() {
        return this.treeId;
    }

    public CreateKmVersionResponse setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public CreateKmVersionResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateKmVersionResponse setTotalTaskCount(Long totalTaskCount) {
        this.totalTaskCount = totalTaskCount;
        return this;
    }
    public Long getTotalTaskCount() {
        return this.totalTaskCount;
    }

    public CreateKmVersionResponse setCompletedCount(Long completedCount) {
        this.completedCount = completedCount;
        return this;
    }
    public Long getCompletedCount() {
        return this.completedCount;
    }

}
