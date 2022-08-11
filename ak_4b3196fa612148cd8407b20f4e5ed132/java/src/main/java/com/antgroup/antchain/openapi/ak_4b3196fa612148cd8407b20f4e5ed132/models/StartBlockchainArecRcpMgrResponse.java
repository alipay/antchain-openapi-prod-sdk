// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_4b3196fa612148cd8407b20f4e5ed132.models;

import com.aliyun.tea.*;

public class StartBlockchainArecRcpMgrResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 解抵押单号
    @NameInMap("mg_release_order_no")
    public String mgReleaseOrderNo;

    public static StartBlockchainArecRcpMgrResponse build(java.util.Map<String, ?> map) throws Exception {
        StartBlockchainArecRcpMgrResponse self = new StartBlockchainArecRcpMgrResponse();
        return TeaModel.build(map, self);
    }

    public StartBlockchainArecRcpMgrResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartBlockchainArecRcpMgrResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartBlockchainArecRcpMgrResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartBlockchainArecRcpMgrResponse setMgReleaseOrderNo(String mgReleaseOrderNo) {
        this.mgReleaseOrderNo = mgReleaseOrderNo;
        return this;
    }
    public String getMgReleaseOrderNo() {
        return this.mgReleaseOrderNo;
    }

}
