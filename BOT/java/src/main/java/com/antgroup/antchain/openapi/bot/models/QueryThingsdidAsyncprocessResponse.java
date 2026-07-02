// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryThingsdidAsyncprocessResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 需要查询的实体Did，可为空
    @NameInMap("thing_did")
    public String thingDid;

    // 随机数, 用以标识智能合约执行的索引，等于输入
    @NameInMap("nonce")
    public String nonce;

    // 交易执行当前状态，原始文本，和async_code, async_subcode匹配，将来可能会删除此字段
    @NameInMap("async_status")
    public String asyncStatus;

    // 从智能合约执行返回的结果编码，200成功，其他参考相应文档
    @NameInMap("async_code")
    public String asyncCode;

    // 可为空，代表async_code信息不能表示完整语义时的子结果码
    @NameInMap("async_subcode")
    public String asyncSubcode;

    public static QueryThingsdidAsyncprocessResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryThingsdidAsyncprocessResponse self = new QueryThingsdidAsyncprocessResponse();
        return TeaModel.build(map, self);
    }

    public QueryThingsdidAsyncprocessResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryThingsdidAsyncprocessResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryThingsdidAsyncprocessResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryThingsdidAsyncprocessResponse setThingDid(String thingDid) {
        this.thingDid = thingDid;
        return this;
    }
    public String getThingDid() {
        return this.thingDid;
    }

    public QueryThingsdidAsyncprocessResponse setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public QueryThingsdidAsyncprocessResponse setAsyncStatus(String asyncStatus) {
        this.asyncStatus = asyncStatus;
        return this;
    }
    public String getAsyncStatus() {
        return this.asyncStatus;
    }

    public QueryThingsdidAsyncprocessResponse setAsyncCode(String asyncCode) {
        this.asyncCode = asyncCode;
        return this;
    }
    public String getAsyncCode() {
        return this.asyncCode;
    }

    public QueryThingsdidAsyncprocessResponse setAsyncSubcode(String asyncSubcode) {
        this.asyncSubcode = asyncSubcode;
        return this;
    }
    public String getAsyncSubcode() {
        return this.asyncSubcode;
    }

}
