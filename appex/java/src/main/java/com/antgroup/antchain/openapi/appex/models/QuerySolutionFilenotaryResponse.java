// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class QuerySolutionFilenotaryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 文件sha256哈希
    // 
    @NameInMap("file_content_hash")
    public String fileContentHash;

    // 小程序二维码对应的url
    // 
    @NameInMap("qr_code_url")
    public String qrCodeUrl;

    // 下载url
    @NameInMap("url")
    public String url;

    public static QuerySolutionFilenotaryResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySolutionFilenotaryResponse self = new QuerySolutionFilenotaryResponse();
        return TeaModel.build(map, self);
    }

    public QuerySolutionFilenotaryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySolutionFilenotaryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySolutionFilenotaryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySolutionFilenotaryResponse setFileContentHash(String fileContentHash) {
        this.fileContentHash = fileContentHash;
        return this;
    }
    public String getFileContentHash() {
        return this.fileContentHash;
    }

    public QuerySolutionFilenotaryResponse setQrCodeUrl(String qrCodeUrl) {
        this.qrCodeUrl = qrCodeUrl;
        return this;
    }
    public String getQrCodeUrl() {
        return this.qrCodeUrl;
    }

    public QuerySolutionFilenotaryResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
