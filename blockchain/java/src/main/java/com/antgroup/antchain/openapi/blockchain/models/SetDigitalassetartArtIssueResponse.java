// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SetDigitalassetartArtIssueResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 艺术品id
    @NameInMap("art_id")
    public String artId;

    // 艺术品状态信息，1表示发行成功
    @NameInMap("status")
    public Long status;

    public static SetDigitalassetartArtIssueResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDigitalassetartArtIssueResponse self = new SetDigitalassetartArtIssueResponse();
        return TeaModel.build(map, self);
    }

    public SetDigitalassetartArtIssueResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SetDigitalassetartArtIssueResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SetDigitalassetartArtIssueResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SetDigitalassetartArtIssueResponse setArtId(String artId) {
        this.artId = artId;
        return this;
    }
    public String getArtId() {
        return this.artId;
    }

    public SetDigitalassetartArtIssueResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
