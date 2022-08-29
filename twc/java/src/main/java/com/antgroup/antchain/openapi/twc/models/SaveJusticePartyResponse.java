// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SaveJusticePartyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否保存成功,true,false
    @NameInMap("success")
    public Boolean success;

    // 委托申请方配置ID
    @NameInMap("party_id")
    public Long partyId;

    public static SaveJusticePartyResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveJusticePartyResponse self = new SaveJusticePartyResponse();
        return TeaModel.build(map, self);
    }

    public SaveJusticePartyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SaveJusticePartyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveJusticePartyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SaveJusticePartyResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SaveJusticePartyResponse setPartyId(Long partyId) {
        this.partyId = partyId;
        return this;
    }
    public Long getPartyId() {
        return this.partyId;
    }

}
