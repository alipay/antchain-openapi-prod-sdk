// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryDeploymentResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 批量查询部署单结果，以操作链的形式体现
    @NameInMap("deployments")
    @Validation(required = true)
    public java.util.List<OpsDeployment> deployments;

    // 当前页码
    @NameInMap("page_num")
    public Integer pageNum;

    // 分页大小
    @NameInMap("page_size")
    public Integer pageSize;

    // 发布单总数
    @NameInMap("total_count")
    public Integer totalCount;

    public static QueryDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeploymentResponse self = new QueryDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeploymentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDeploymentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDeploymentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDeploymentResponse setDeployments(java.util.List<OpsDeployment> deployments) {
        this.deployments = deployments;
        return this;
    }
    public java.util.List<OpsDeployment> getDeployments() {
        return this.deployments;
    }

    public QueryDeploymentResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryDeploymentResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeploymentResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
