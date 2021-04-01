// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class FreezeDigitalassetartArtAccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 艺术品id
    @NameInMap("art_id")
    public String artId;

    // 艺术品冻结是否成功，0表示成功
    @NameInMap("status")
    public Long status;

    public static FreezeDigitalassetartArtAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        FreezeDigitalassetartArtAccountResponse self = new FreezeDigitalassetartArtAccountResponse();
        return TeaModel.build(map, self);
    }

    public FreezeDigitalassetartArtAccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public FreezeDigitalassetartArtAccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public FreezeDigitalassetartArtAccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public FreezeDigitalassetartArtAccountResponse setArtId(String artId) {
        this.artId = artId;
        return this;
    }
    public String getArtId() {
        return this.artId;
    }

    public FreezeDigitalassetartArtAccountResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
