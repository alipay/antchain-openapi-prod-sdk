// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpGoodsupdateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // ip的更新数据
    @NameInMap("ip_list")
    public java.util.List<IpBasicInfo> ipList;

    public static QueryIpGoodsupdateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIpGoodsupdateResponse self = new QueryIpGoodsupdateResponse();
        return TeaModel.build(map, self);
    }

    public QueryIpGoodsupdateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIpGoodsupdateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIpGoodsupdateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIpGoodsupdateResponse setIpList(java.util.List<IpBasicInfo> ipList) {
        this.ipList = ipList;
        return this;
    }
    public java.util.List<IpBasicInfo> getIpList() {
        return this.ipList;
    }

}
