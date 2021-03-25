// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryMetaDeploymentcellResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // deployment cells
    @NameInMap("deployment_cells")
    public java.util.List<String> deploymentCells;

    public static QueryMetaDeploymentcellResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMetaDeploymentcellResponse self = new QueryMetaDeploymentcellResponse();
        return TeaModel.build(map, self);
    }

    public QueryMetaDeploymentcellResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMetaDeploymentcellResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMetaDeploymentcellResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMetaDeploymentcellResponse setDeploymentCells(java.util.List<String> deploymentCells) {
        this.deploymentCells = deploymentCells;
        return this;
    }
    public java.util.List<String> getDeploymentCells() {
        return this.deploymentCells;
    }

}
