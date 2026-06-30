// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytechpoi.models;

import com.aliyun.tea.*;

public class QueryAntsecuritytechGatewayPoiTerminationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 账户信息列表
    @NameInMap("account_info")
    public PoiAccountInfo accountInfo;

    public static QueryAntsecuritytechGatewayPoiTerminationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntsecuritytechGatewayPoiTerminationResponse self = new QueryAntsecuritytechGatewayPoiTerminationResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntsecuritytechGatewayPoiTerminationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntsecuritytechGatewayPoiTerminationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntsecuritytechGatewayPoiTerminationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntsecuritytechGatewayPoiTerminationResponse setAccountInfo(PoiAccountInfo accountInfo) {
        this.accountInfo = accountInfo;
        return this;
    }
    public PoiAccountInfo getAccountInfo() {
        return this.accountInfo;
    }

}
