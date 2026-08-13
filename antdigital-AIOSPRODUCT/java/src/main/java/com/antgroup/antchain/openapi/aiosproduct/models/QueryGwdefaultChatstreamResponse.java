// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiosproduct.models;

import com.aliyun.tea.*;

public class QueryGwdefaultChatstreamResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 会话id
    @NameInMap("session_id")
    public String sessionId;

    // 整体成功标志，默认 true
    @NameInMap("success")
    public Boolean success;

    // 固定 "chat_result"（由输出层注入，不在信封 dataclass 内）
    @NameInMap("type")
    public String type;

    // 查询 ID；多为空串
    @NameInMap("query_id")
    public String queryId;

    // true=流式中间批次；false=收尾批次
    @NameInMap("has_stream")
    public Boolean hasStream;

    // 正文流（TEXT/CARD/COT_*/CONTENT_*/HORSE_RIDE_*/CUSTOM_CARD_*/WITHDRAW/FORBIDDEN/TASK）
    @NameInMap("chat_list")
    public String chatList;

    // 推荐问题（SUG），仅收尾批次非空
    @NameInMap("sug_list")
    public String sugList;

    // 全量引用（REF），仅收尾批次非空
    @NameInMap("ref_list")
    public String refList;

    // 页脚卡片（FOOTER_CARD 已改写为 CARD），仅收尾批次非空
    @NameInMap("footer_list")
    public String footerList;

    // token/耗时信息；仅携带 callbackInfo 的批次才有
    @NameInMap("call_back_info")
    public String callBackInfo;

    public static QueryGwdefaultChatstreamResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGwdefaultChatstreamResponse self = new QueryGwdefaultChatstreamResponse();
        return TeaModel.build(map, self);
    }

    public QueryGwdefaultChatstreamResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryGwdefaultChatstreamResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryGwdefaultChatstreamResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryGwdefaultChatstreamResponse setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public QueryGwdefaultChatstreamResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryGwdefaultChatstreamResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryGwdefaultChatstreamResponse setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public QueryGwdefaultChatstreamResponse setHasStream(Boolean hasStream) {
        this.hasStream = hasStream;
        return this;
    }
    public Boolean getHasStream() {
        return this.hasStream;
    }

    public QueryGwdefaultChatstreamResponse setChatList(String chatList) {
        this.chatList = chatList;
        return this;
    }
    public String getChatList() {
        return this.chatList;
    }

    public QueryGwdefaultChatstreamResponse setSugList(String sugList) {
        this.sugList = sugList;
        return this;
    }
    public String getSugList() {
        return this.sugList;
    }

    public QueryGwdefaultChatstreamResponse setRefList(String refList) {
        this.refList = refList;
        return this;
    }
    public String getRefList() {
        return this.refList;
    }

    public QueryGwdefaultChatstreamResponse setFooterList(String footerList) {
        this.footerList = footerList;
        return this;
    }
    public String getFooterList() {
        return this.footerList;
    }

    public QueryGwdefaultChatstreamResponse setCallBackInfo(String callBackInfo) {
        this.callBackInfo = callBackInfo;
        return this;
    }
    public String getCallBackInfo() {
        return this.callBackInfo;
    }

}
