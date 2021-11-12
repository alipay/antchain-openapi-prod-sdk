// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ListProdinstanceDeployunitResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 部署单元列表。
    @NameInMap("deploy_units")
    public java.util.List<DeployUnit> deployUnits;

    public static ListProdinstanceDeployunitResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProdinstanceDeployunitResponse self = new ListProdinstanceDeployunitResponse();
        return TeaModel.build(map, self);
    }

    public ListProdinstanceDeployunitResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListProdinstanceDeployunitResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListProdinstanceDeployunitResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListProdinstanceDeployunitResponse setDeployUnits(java.util.List<DeployUnit> deployUnits) {
        this.deployUnits = deployUnits;
        return this;
    }
    public java.util.List<DeployUnit> getDeployUnits() {
        return this.deployUnits;
    }

}
