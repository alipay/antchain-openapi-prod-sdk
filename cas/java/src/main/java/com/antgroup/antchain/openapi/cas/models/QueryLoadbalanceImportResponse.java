// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryLoadbalanceImportResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public java.util.List<LoadBalancerImportVO> data;

    // total_count
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryLoadbalanceImportResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLoadbalanceImportResponse self = new QueryLoadbalanceImportResponse();
        return TeaModel.build(map, self);
    }

    public QueryLoadbalanceImportResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLoadbalanceImportResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLoadbalanceImportResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLoadbalanceImportResponse setData(java.util.List<LoadBalancerImportVO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<LoadBalancerImportVO> getData() {
        return this.data;
    }

    public QueryLoadbalanceImportResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
