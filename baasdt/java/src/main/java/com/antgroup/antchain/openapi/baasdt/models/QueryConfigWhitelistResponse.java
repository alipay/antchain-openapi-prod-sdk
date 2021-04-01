// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryConfigWhitelistResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 接口白名单信息
    @NameInMap("white_list")
    public java.util.List<APIWhiteListInfo> whiteList;

    public static QueryConfigWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConfigWhitelistResponse self = new QueryConfigWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public QueryConfigWhitelistResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryConfigWhitelistResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryConfigWhitelistResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryConfigWhitelistResponse setWhiteList(java.util.List<APIWhiteListInfo> whiteList) {
        this.whiteList = whiteList;
        return this;
    }
    public java.util.List<APIWhiteListInfo> getWhiteList() {
        return this.whiteList;
    }

}
