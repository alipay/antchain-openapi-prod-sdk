// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DetailXrXrticketpoolResponse extends TeaModel {
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

    // 通行证对象
    @NameInMap("xr_ticket_pool_detail")
    public XrTicketPoolItem xrTicketPoolDetail;

    public static DetailXrXrticketpoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailXrXrticketpoolResponse self = new DetailXrXrticketpoolResponse();
        return TeaModel.build(map, self);
    }

    public DetailXrXrticketpoolResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailXrXrticketpoolResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailXrXrticketpoolResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailXrXrticketpoolResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DetailXrXrticketpoolResponse setXrTicketPoolDetail(XrTicketPoolItem xrTicketPoolDetail) {
        this.xrTicketPoolDetail = xrTicketPoolDetail;
        return this;
    }
    public XrTicketPoolItem getXrTicketPoolDetail() {
        return this.xrTicketPoolDetail;
    }

}
