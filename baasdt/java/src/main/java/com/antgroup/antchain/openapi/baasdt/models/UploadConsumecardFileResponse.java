// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UploadConsumecardFileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 图片的不可访问url，发布商品时使用
    @NameInMap("url")
    public String url;

    // 临时可访问的url，过期时间2小时
    @NameInMap("temporary_url")
    public String temporaryUrl;

    public static UploadConsumecardFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadConsumecardFileResponse self = new UploadConsumecardFileResponse();
        return TeaModel.build(map, self);
    }

    public UploadConsumecardFileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadConsumecardFileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadConsumecardFileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadConsumecardFileResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public UploadConsumecardFileResponse setTemporaryUrl(String temporaryUrl) {
        this.temporaryUrl = temporaryUrl;
        return this;
    }
    public String getTemporaryUrl() {
        return this.temporaryUrl;
    }

}
