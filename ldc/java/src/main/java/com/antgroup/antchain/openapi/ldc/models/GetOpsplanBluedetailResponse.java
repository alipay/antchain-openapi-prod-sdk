// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetOpsplanBluedetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // pod信息列表
    @NameInMap("pod_list")
    public java.util.List<PodInfo> podList;

    public static GetOpsplanBluedetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpsplanBluedetailResponse self = new GetOpsplanBluedetailResponse();
        return TeaModel.build(map, self);
    }

    public GetOpsplanBluedetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetOpsplanBluedetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetOpsplanBluedetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetOpsplanBluedetailResponse setPodList(java.util.List<PodInfo> podList) {
        this.podList = podList;
        return this;
    }
    public java.util.List<PodInfo> getPodList() {
        return this.podList;
    }

}
