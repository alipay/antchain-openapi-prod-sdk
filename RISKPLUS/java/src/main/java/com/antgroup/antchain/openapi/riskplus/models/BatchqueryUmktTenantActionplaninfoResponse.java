// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BatchqueryUmktTenantActionplaninfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 触达策略信息
    @NameInMap("query_result")
    public java.util.List<ActionPlanDetailInfo> queryResult;

    // 总数
    @NameInMap("total_count")
    public Long totalCount;

    public static BatchqueryUmktTenantActionplaninfoResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryUmktTenantActionplaninfoResponse self = new BatchqueryUmktTenantActionplaninfoResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryUmktTenantActionplaninfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryUmktTenantActionplaninfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryUmktTenantActionplaninfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryUmktTenantActionplaninfoResponse setQueryResult(java.util.List<ActionPlanDetailInfo> queryResult) {
        this.queryResult = queryResult;
        return this;
    }
    public java.util.List<ActionPlanDetailInfo> getQueryResult() {
        return this.queryResult;
    }

    public BatchqueryUmktTenantActionplaninfoResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
