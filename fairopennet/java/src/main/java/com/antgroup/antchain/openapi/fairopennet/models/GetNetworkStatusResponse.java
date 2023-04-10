// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class GetNetworkStatusResponse extends TeaModel {
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
    @NameInMap("network_status_info")
    public NetworkStatusInfo networkStatusInfo;

    public static GetNetworkStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkStatusResponse self = new GetNetworkStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetNetworkStatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetNetworkStatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetNetworkStatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetNetworkStatusResponse setNetworkStatusInfo(NetworkStatusInfo networkStatusInfo) {
        this.networkStatusInfo = networkStatusInfo;
        return this;
    }
    public NetworkStatusInfo getNetworkStatusInfo() {
        return this.networkStatusInfo;
    }

}
