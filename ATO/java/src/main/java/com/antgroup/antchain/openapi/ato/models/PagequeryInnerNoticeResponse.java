// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerNoticeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总量
    @NameInMap("total")
    public Long total;

    // 商户通知信息
    @NameInMap("notice_info_list")
    public java.util.List<NoticeInfo> noticeInfoList;

    public static PagequeryInnerNoticeResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerNoticeResponse self = new PagequeryInnerNoticeResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerNoticeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryInnerNoticeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryInnerNoticeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryInnerNoticeResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PagequeryInnerNoticeResponse setNoticeInfoList(java.util.List<NoticeInfo> noticeInfoList) {
        this.noticeInfoList = noticeInfoList;
        return this;
    }
    public java.util.List<NoticeInfo> getNoticeInfoList() {
        return this.noticeInfoList;
    }

}
