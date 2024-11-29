// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class DescribeExtendTxqrcodeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // Base64编码的二维码 png 图片
    @NameInMap("base64_qr_code_png")
    public String base64QrCodePng;

    // 二维码内容
    @NameInMap("qr_code_content")
    public String qrCodeContent;

    // ac73c8fa158436513e0b398632d9a082e04cee3eac6f9fb50087a46d801bdfd1
    @NameInMap("tx_hash")
    public String txHash;

    public static DescribeExtendTxqrcodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExtendTxqrcodeResponse self = new DescribeExtendTxqrcodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExtendTxqrcodeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DescribeExtendTxqrcodeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeExtendTxqrcodeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DescribeExtendTxqrcodeResponse setBase64QrCodePng(String base64QrCodePng) {
        this.base64QrCodePng = base64QrCodePng;
        return this;
    }
    public String getBase64QrCodePng() {
        return this.base64QrCodePng;
    }

    public DescribeExtendTxqrcodeResponse setQrCodeContent(String qrCodeContent) {
        this.qrCodeContent = qrCodeContent;
        return this;
    }
    public String getQrCodeContent() {
        return this.qrCodeContent;
    }

    public DescribeExtendTxqrcodeResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
