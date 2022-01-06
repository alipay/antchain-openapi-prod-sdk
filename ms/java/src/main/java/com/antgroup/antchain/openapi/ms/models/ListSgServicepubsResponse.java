// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListSgServicepubsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // List<Publisher>
    @NameInMap("publishers")
    public java.util.List<Publisher> publishers;

    public static ListSgServicepubsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSgServicepubsResponse self = new ListSgServicepubsResponse();
        return TeaModel.build(map, self);
    }

    public ListSgServicepubsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSgServicepubsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSgServicepubsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSgServicepubsResponse setPublishers(java.util.List<Publisher> publishers) {
        this.publishers = publishers;
        return this;
    }
    public java.util.List<Publisher> getPublishers() {
        return this.publishers;
    }

}
