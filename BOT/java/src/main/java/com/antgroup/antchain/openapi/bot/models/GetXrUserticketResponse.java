// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GetXrUserticketResponse extends TeaModel {
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

    // 用户通行证详情
    @NameInMap("xr_user_ticket")
    public XrUserTicketDetail xrUserTicket;

    public static GetXrUserticketResponse build(java.util.Map<String, ?> map) throws Exception {
        GetXrUserticketResponse self = new GetXrUserticketResponse();
        return TeaModel.build(map, self);
    }

    public GetXrUserticketResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetXrUserticketResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetXrUserticketResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetXrUserticketResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetXrUserticketResponse setXrUserTicket(XrUserTicketDetail xrUserTicket) {
        this.xrUserTicket = xrUserTicket;
        return this;
    }
    public XrUserTicketDetail getXrUserTicket() {
        return this.xrUserTicket;
    }

}
