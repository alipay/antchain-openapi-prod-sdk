// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryDomesticTrademarkResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商标信息列表
    @NameInMap("tm_infos")
    public java.util.List<DomesticTmInfo> tmInfos;

    // 商标总数
    @NameInMap("tm_total")
    public Long tmTotal;

    public static QueryDomesticTrademarkResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDomesticTrademarkResponse self = new QueryDomesticTrademarkResponse();
        return TeaModel.build(map, self);
    }

    public QueryDomesticTrademarkResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDomesticTrademarkResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDomesticTrademarkResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDomesticTrademarkResponse setTmInfos(java.util.List<DomesticTmInfo> tmInfos) {
        this.tmInfos = tmInfos;
        return this;
    }
    public java.util.List<DomesticTmInfo> getTmInfos() {
        return this.tmInfos;
    }

    public QueryDomesticTrademarkResponse setTmTotal(Long tmTotal) {
        this.tmTotal = tmTotal;
        return this;
    }
    public Long getTmTotal() {
        return this.tmTotal;
    }

}
