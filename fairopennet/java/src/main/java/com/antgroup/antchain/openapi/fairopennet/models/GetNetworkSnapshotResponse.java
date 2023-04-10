// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class GetNetworkSnapshotResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    //  
    @NameInMap("cnet")
    public Cnet cnet;

    public static GetNetworkSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkSnapshotResponse self = new GetNetworkSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public GetNetworkSnapshotResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetNetworkSnapshotResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetNetworkSnapshotResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetNetworkSnapshotResponse setCnet(Cnet cnet) {
        this.cnet = cnet;
        return this;
    }
    public Cnet getCnet() {
        return this.cnet;
    }

}
