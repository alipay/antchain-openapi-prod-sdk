// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeUserUpgradestatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户状态：0已升级，1未升级
    @NameInMap("status")
    public String status;

    public static QueryDubbridgeUserUpgradestatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeUserUpgradestatusResponse self = new QueryDubbridgeUserUpgradestatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeUserUpgradestatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeUserUpgradestatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeUserUpgradestatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeUserUpgradestatusResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
