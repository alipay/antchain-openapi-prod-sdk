// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetBlockchainMiniprogramResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 交易二维码
    @NameInMap("qrcode")
    public String qrcode;

    public static GetBlockchainMiniprogramResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBlockchainMiniprogramResponse self = new GetBlockchainMiniprogramResponse();
        return TeaModel.build(map, self);
    }

    public GetBlockchainMiniprogramResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetBlockchainMiniprogramResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetBlockchainMiniprogramResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetBlockchainMiniprogramResponse setQrcode(String qrcode) {
        this.qrcode = qrcode;
        return this;
    }
    public String getQrcode() {
        return this.qrcode;
    }

}
