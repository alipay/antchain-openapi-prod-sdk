// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class QueryRisksResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 风险列表
    @NameInMap("risks")
    public java.util.List<Risk> risks;

    // 总数
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryRisksResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRisksResponse self = new QueryRisksResponse();
        return TeaModel.build(map, self);
    }

    public QueryRisksResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRisksResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRisksResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRisksResponse setRisks(java.util.List<Risk> risks) {
        this.risks = risks;
        return this;
    }
    public java.util.List<Risk> getRisks() {
        return this.risks;
    }

    public QueryRisksResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
