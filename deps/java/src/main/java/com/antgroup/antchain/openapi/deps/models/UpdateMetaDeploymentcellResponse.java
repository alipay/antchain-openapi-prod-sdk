// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateMetaDeploymentcellResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // deployment cell
    @NameInMap("deployment_cell")
    public String deploymentCell;

    public static UpdateMetaDeploymentcellResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaDeploymentcellResponse self = new UpdateMetaDeploymentcellResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMetaDeploymentcellResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateMetaDeploymentcellResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateMetaDeploymentcellResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateMetaDeploymentcellResponse setDeploymentCell(String deploymentCell) {
        this.deploymentCell = deploymentCell;
        return this;
    }
    public String getDeploymentCell() {
        return this.deploymentCell;
    }

}
