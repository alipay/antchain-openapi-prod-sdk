// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class QueryAsoDistinctResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否激活
    // -1: 失败; 0: 未激活; 1:已激活
    @NameInMap("idfa")
    public String idfa;

    public static QueryAsoDistinctResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAsoDistinctResponse self = new QueryAsoDistinctResponse();
        return TeaModel.build(map, self);
    }

    public QueryAsoDistinctResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAsoDistinctResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAsoDistinctResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAsoDistinctResponse setIdfa(String idfa) {
        this.idfa = idfa;
        return this;
    }
    public String getIdfa() {
        return this.idfa;
    }

}
