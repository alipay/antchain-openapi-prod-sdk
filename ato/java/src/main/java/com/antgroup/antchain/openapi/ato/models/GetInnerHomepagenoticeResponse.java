// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class GetInnerHomepagenoticeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 通知id
    @NameInMap("notice_id")
    public Long noticeId;

    // 通知标题
    @NameInMap("title")
    public String title;

    // 未读数量
    @NameInMap("unread_count")
    public Long unreadCount;

    public static GetInnerHomepagenoticeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInnerHomepagenoticeResponse self = new GetInnerHomepagenoticeResponse();
        return TeaModel.build(map, self);
    }

    public GetInnerHomepagenoticeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetInnerHomepagenoticeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetInnerHomepagenoticeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetInnerHomepagenoticeResponse setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
        return this;
    }
    public Long getNoticeId() {
        return this.noticeId;
    }

    public GetInnerHomepagenoticeResponse setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public GetInnerHomepagenoticeResponse setUnreadCount(Long unreadCount) {
        this.unreadCount = unreadCount;
        return this;
    }
    public Long getUnreadCount() {
        return this.unreadCount;
    }

}
