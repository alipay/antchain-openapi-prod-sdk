// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class CheckNftAssetbyskuResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否已拥有对应sku的nft
    @NameInMap("has_own")
    public Boolean hasOwn;

    public static CheckNftAssetbyskuResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckNftAssetbyskuResponse self = new CheckNftAssetbyskuResponse();
        return TeaModel.build(map, self);
    }

    public CheckNftAssetbyskuResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckNftAssetbyskuResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckNftAssetbyskuResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckNftAssetbyskuResponse setHasOwn(Boolean hasOwn) {
        this.hasOwn = hasOwn;
        return this;
    }
    public Boolean getHasOwn() {
        return this.hasOwn;
    }

}
