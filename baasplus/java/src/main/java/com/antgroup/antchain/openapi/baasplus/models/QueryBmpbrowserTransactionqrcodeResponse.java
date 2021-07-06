// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryBmpbrowserTransactionqrcodeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 交易二维码二进制内容的Base64编码
    @NameInMap("qr_code_download_url")
    public String qrCodeDownloadUrl;

    public static QueryBmpbrowserTransactionqrcodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBmpbrowserTransactionqrcodeResponse self = new QueryBmpbrowserTransactionqrcodeResponse();
        return TeaModel.build(map, self);
    }

    public QueryBmpbrowserTransactionqrcodeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBmpbrowserTransactionqrcodeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBmpbrowserTransactionqrcodeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBmpbrowserTransactionqrcodeResponse setQrCodeDownloadUrl(String qrCodeDownloadUrl) {
        this.qrCodeDownloadUrl = qrCodeDownloadUrl;
        return this;
    }
    public String getQrCodeDownloadUrl() {
        return this.qrCodeDownloadUrl;
    }

}
