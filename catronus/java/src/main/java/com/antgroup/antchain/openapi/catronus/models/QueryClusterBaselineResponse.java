// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class QueryClusterBaselineResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 扫描结果
    @NameInMap("result")
    public java.util.List<BaselineScanResult> result;

    // 结果条目总数
    @NameInMap("total_cnt")
    public Long totalCnt;

    public static QueryClusterBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterBaselineResponse self = new QueryClusterBaselineResponse();
        return TeaModel.build(map, self);
    }

    public QueryClusterBaselineResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryClusterBaselineResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryClusterBaselineResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryClusterBaselineResponse setResult(java.util.List<BaselineScanResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<BaselineScanResult> getResult() {
        return this.result;
    }

    public QueryClusterBaselineResponse setTotalCnt(Long totalCnt) {
        this.totalCnt = totalCnt;
        return this;
    }
    public Long getTotalCnt() {
        return this.totalCnt;
    }

}
