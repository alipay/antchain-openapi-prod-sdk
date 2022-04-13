// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CountContainerserviceCellreplicasResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 应用服务当前的部署单元，及其部署副本数
    @NameInMap("cell_replicas_list")
    public java.util.List<ReplicaCount> cellReplicasList;

    public static CountContainerserviceCellreplicasResponse build(java.util.Map<String, ?> map) throws Exception {
        CountContainerserviceCellreplicasResponse self = new CountContainerserviceCellreplicasResponse();
        return TeaModel.build(map, self);
    }

    public CountContainerserviceCellreplicasResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CountContainerserviceCellreplicasResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CountContainerserviceCellreplicasResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CountContainerserviceCellreplicasResponse setCellReplicasList(java.util.List<ReplicaCount> cellReplicasList) {
        this.cellReplicasList = cellReplicasList;
        return this;
    }
    public java.util.List<ReplicaCount> getCellReplicasList() {
        return this.cellReplicasList;
    }

}
