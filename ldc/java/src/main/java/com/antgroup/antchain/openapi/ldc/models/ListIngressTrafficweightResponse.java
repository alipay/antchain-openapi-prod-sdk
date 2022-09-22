// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListIngressTrafficweightResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 流量权重列表
    @NameInMap("service_weights")
    public java.util.List<ServiceWeight> serviceWeights;

    // 流量权重列表蓝绿发布v2
    @NameInMap("cell_weights")
    public java.util.List<CellWeight> cellWeights;

    public static ListIngressTrafficweightResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIngressTrafficweightResponse self = new ListIngressTrafficweightResponse();
        return TeaModel.build(map, self);
    }

    public ListIngressTrafficweightResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListIngressTrafficweightResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListIngressTrafficweightResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListIngressTrafficweightResponse setServiceWeights(java.util.List<ServiceWeight> serviceWeights) {
        this.serviceWeights = serviceWeights;
        return this;
    }
    public java.util.List<ServiceWeight> getServiceWeights() {
        return this.serviceWeights;
    }

    public ListIngressTrafficweightResponse setCellWeights(java.util.List<CellWeight> cellWeights) {
        this.cellWeights = cellWeights;
        return this;
    }
    public java.util.List<CellWeight> getCellWeights() {
        return this.cellWeights;
    }

}
