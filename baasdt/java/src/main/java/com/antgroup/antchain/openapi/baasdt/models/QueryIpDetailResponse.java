// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpDetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // ip的信息列表
    @NameInMap("ips")
    public java.util.List<IpBasicInfoWithChannelInfo> ips;

    public static QueryIpDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIpDetailResponse self = new QueryIpDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryIpDetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIpDetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIpDetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIpDetailResponse setIps(java.util.List<IpBasicInfoWithChannelInfo> ips) {
        this.ips = ips;
        return this;
    }
    public java.util.List<IpBasicInfoWithChannelInfo> getIps() {
        return this.ips;
    }

}
