// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryIotagentPlugincontractResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 签约状态：SIGNED（已签约）/ UNSIGNED（未签约）/ SIGNING（签约中）
    @NameInMap("contract_status")
    public String contractStatus;

    public static QueryIotagentPlugincontractResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIotagentPlugincontractResponse self = new QueryIotagentPlugincontractResponse();
        return TeaModel.build(map, self);
    }

    public QueryIotagentPlugincontractResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIotagentPlugincontractResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIotagentPlugincontractResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIotagentPlugincontractResponse setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus;
        return this;
    }
    public String getContractStatus() {
        return this.contractStatus;
    }

}
