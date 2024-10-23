// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class DetailInnerNoticeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 通知标题
    @NameInMap("title")
    public String title;

    // 通知内容
    @NameInMap("content")
    public String content;

    // 通知创建时间
    @NameInMap("notic_create_time")
    public String noticCreateTime;

    public static DetailInnerNoticeResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailInnerNoticeResponse self = new DetailInnerNoticeResponse();
        return TeaModel.build(map, self);
    }

    public DetailInnerNoticeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailInnerNoticeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailInnerNoticeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailInnerNoticeResponse setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public DetailInnerNoticeResponse setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DetailInnerNoticeResponse setNoticCreateTime(String noticCreateTime) {
        this.noticCreateTime = noticCreateTime;
        return this;
    }
    public String getNoticCreateTime() {
        return this.noticCreateTime;
    }

}
