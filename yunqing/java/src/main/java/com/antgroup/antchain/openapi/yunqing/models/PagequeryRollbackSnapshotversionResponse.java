// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class PagequeryRollbackSnapshotversionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 共有多少天记录
    @NameInMap("total_count")
    public Long totalCount;

    // 快照版本
    @NameInMap("deployment_unit_snapshots")
    public java.util.List<DeploymentUnitSnapshotOP> deploymentUnitSnapshots;

    public static PagequeryRollbackSnapshotversionResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryRollbackSnapshotversionResponse self = new PagequeryRollbackSnapshotversionResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryRollbackSnapshotversionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryRollbackSnapshotversionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryRollbackSnapshotversionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryRollbackSnapshotversionResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryRollbackSnapshotversionResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public PagequeryRollbackSnapshotversionResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public PagequeryRollbackSnapshotversionResponse setDeploymentUnitSnapshots(java.util.List<DeploymentUnitSnapshotOP> deploymentUnitSnapshots) {
        this.deploymentUnitSnapshots = deploymentUnitSnapshots;
        return this;
    }
    public java.util.List<DeploymentUnitSnapshotOP> getDeploymentUnitSnapshots() {
        return this.deploymentUnitSnapshots;
    }

}
