// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBaseinfoDeploymentzonesResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 部署可用区列表
    @NameInMap("deployment_zones")
    public java.util.List<String> deploymentZones;

    public static QueryBaseinfoDeploymentzonesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBaseinfoDeploymentzonesResponse self = new QueryBaseinfoDeploymentzonesResponse();
        return TeaModel.build(map, self);
    }

    public QueryBaseinfoDeploymentzonesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBaseinfoDeploymentzonesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBaseinfoDeploymentzonesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBaseinfoDeploymentzonesResponse setDeploymentZones(java.util.List<String> deploymentZones) {
        this.deploymentZones = deploymentZones;
        return this;
    }
    public java.util.List<String> getDeploymentZones() {
        return this.deploymentZones;
    }

}
