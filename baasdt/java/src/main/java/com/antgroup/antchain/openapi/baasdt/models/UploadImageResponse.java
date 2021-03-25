// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UploadImageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 临时可访问的url，过期时间2小时
    @NameInMap("temporary_url")
    public String temporaryUrl;

    // 图片的不可访问url，发布权益时使用
    @NameInMap("url")
    public String url;

    public static UploadImageResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadImageResponse self = new UploadImageResponse();
        return TeaModel.build(map, self);
    }

    public UploadImageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadImageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadImageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadImageResponse setTemporaryUrl(String temporaryUrl) {
        this.temporaryUrl = temporaryUrl;
        return this;
    }
    public String getTemporaryUrl() {
        return this.temporaryUrl;
    }

    public UploadImageResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
