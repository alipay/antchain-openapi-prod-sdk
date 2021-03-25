// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetMetaDeploymentcellResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // deployment cell
    @NameInMap("deployment_cell")
    public String deploymentCell;

    public static GetMetaDeploymentcellResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaDeploymentcellResponse self = new GetMetaDeploymentcellResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaDeploymentcellResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetMetaDeploymentcellResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMetaDeploymentcellResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetMetaDeploymentcellResponse setDeploymentCell(String deploymentCell) {
        this.deploymentCell = deploymentCell;
        return this;
    }
    public String getDeploymentCell() {
        return this.deploymentCell;
    }

}
