// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class CreateActivitychainrecordResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 上链成功后返回，链上hash值
    @NameInMap("chain_hash")
    public String chainHash;

    // true表示颁发了徽章，false表示未颁发徽章
    @NameInMap("award_badge_flag")
    public Boolean awardBadgeFlag;

    public static CreateActivitychainrecordResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateActivitychainrecordResponse self = new CreateActivitychainrecordResponse();
        return TeaModel.build(map, self);
    }

    public CreateActivitychainrecordResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateActivitychainrecordResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateActivitychainrecordResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateActivitychainrecordResponse setChainHash(String chainHash) {
        this.chainHash = chainHash;
        return this;
    }
    public String getChainHash() {
        return this.chainHash;
    }

    public CreateActivitychainrecordResponse setAwardBadgeFlag(Boolean awardBadgeFlag) {
        this.awardBadgeFlag = awardBadgeFlag;
        return this;
    }
    public Boolean getAwardBadgeFlag() {
        return this.awardBadgeFlag;
    }

}
