// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryDeploymentCellResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 部署单元列表
    @NameInMap("data")
    public java.util.List<DeployCell> data;

    public static QueryDeploymentCellResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeploymentCellResponse self = new QueryDeploymentCellResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeploymentCellResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDeploymentCellResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDeploymentCellResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDeploymentCellResponse setData(java.util.List<DeployCell> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DeployCell> getData() {
        return this.data;
    }

}
