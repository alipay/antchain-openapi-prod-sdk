// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UnfreezeDigitalassetartArtAccountResponse extends TeaModel {
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

    // 解冻是否成功，0表示成功
    @NameInMap("status")
    public Long status;

    public static UnfreezeDigitalassetartArtAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        UnfreezeDigitalassetartArtAccountResponse self = new UnfreezeDigitalassetartArtAccountResponse();
        return TeaModel.build(map, self);
    }

    public UnfreezeDigitalassetartArtAccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UnfreezeDigitalassetartArtAccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UnfreezeDigitalassetartArtAccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UnfreezeDigitalassetartArtAccountResponse setArtId(String artId) {
        this.artId = artId;
        return this;
    }
    public String getArtId() {
        return this.artId;
    }

    public UnfreezeDigitalassetartArtAccountResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
