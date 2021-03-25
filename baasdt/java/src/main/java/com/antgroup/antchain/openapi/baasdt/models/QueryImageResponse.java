// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryImageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 临时可访问的oss图片链接，每张图片会返回四个url，对应原图和不同的比例缩小，每一张图片的四个url用;隔开。
    @NameInMap("urls")
    public java.util.List<MultiURL> urls;

    public static QueryImageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryImageResponse self = new QueryImageResponse();
        return TeaModel.build(map, self);
    }

    public QueryImageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryImageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryImageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryImageResponse setUrls(java.util.List<MultiURL> urls) {
        this.urls = urls;
        return this;
    }
    public java.util.List<MultiURL> getUrls() {
        return this.urls;
    }

}
