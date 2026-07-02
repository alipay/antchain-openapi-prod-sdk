// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateXrUserticketResponse extends TeaModel {
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

    // 成功列表
    @NameInMap("success_list")
    public java.util.List<XrUserTicketResultInfo> successList;

    // 失败列表
    @NameInMap("fail_list")
    public java.util.List<XrUserTicketResultInfo> failList;

    public static CreateXrUserticketResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateXrUserticketResponse self = new CreateXrUserticketResponse();
        return TeaModel.build(map, self);
    }

    public CreateXrUserticketResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateXrUserticketResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateXrUserticketResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateXrUserticketResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateXrUserticketResponse setSuccessList(java.util.List<XrUserTicketResultInfo> successList) {
        this.successList = successList;
        return this;
    }
    public java.util.List<XrUserTicketResultInfo> getSuccessList() {
        return this.successList;
    }

    public CreateXrUserticketResponse setFailList(java.util.List<XrUserTicketResultInfo> failList) {
        this.failList = failList;
        return this;
    }
    public java.util.List<XrUserTicketResultInfo> getFailList() {
        return this.failList;
    }

}
