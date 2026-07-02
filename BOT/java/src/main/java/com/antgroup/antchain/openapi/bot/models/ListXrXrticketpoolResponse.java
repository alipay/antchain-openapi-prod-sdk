// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ListXrXrticketpoolResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    // 资源池列表
    @NameInMap("xr_ticket_pool_list")
    public java.util.List<IdListView> xrTicketPoolList;

    public static ListXrXrticketpoolResponse build(java.util.Map<String, ?> map) throws Exception {
        ListXrXrticketpoolResponse self = new ListXrXrticketpoolResponse();
        return TeaModel.build(map, self);
    }

    public ListXrXrticketpoolResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListXrXrticketpoolResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListXrXrticketpoolResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListXrXrticketpoolResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListXrXrticketpoolResponse setXrTicketPoolList(java.util.List<IdListView> xrTicketPoolList) {
        this.xrTicketPoolList = xrTicketPoolList;
        return this;
    }
    public java.util.List<IdListView> getXrTicketPoolList() {
        return this.xrTicketPoolList;
    }

}
